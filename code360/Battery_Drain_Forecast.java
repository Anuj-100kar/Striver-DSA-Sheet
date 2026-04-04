import java.util.List;

public class Battery_Drain_Forecast {
    public static double forecast(long b, int n, List<long[]> events) {
        
        double battery=b;

        for(int i=0;i<n-1;i++){
            long currtime=events.get(i)[0];
            long nexttime=events.get(i+1)[0];
            long rate=events.get(i)[1];

            long duration=nexttime-currtime;
            
            if(rate==0)continue;
            double used=(double)duration*rate;
            if(battery<=(double)used){
                double timeneeded=battery/rate;
                return currtime+timeneeded;
            }
            battery-=used;
        }
        long lasttime=events.get(n-1)[0];
        long lastrate=events.get(n-1)[1];

        if(lastrate==0)return -1;
        double timeneeded=battery/lastrate;
        return lasttime+timeneeded;
    }
}