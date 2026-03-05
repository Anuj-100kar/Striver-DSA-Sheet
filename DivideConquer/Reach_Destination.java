import java.util.*;

public class Reach_Destination{
    public static boolean reachDestination(int sx, int sy, int dx, int dy) {
		while(dx>=sx && dy>=sy){
			if(dx==sx && dy==sy)return true;

			if(dx>dy){
				if(dy>sy){
					dx%=dy;
				}else{
					return (dx-sx)%dy==0;
				}
			}else{
				if(dx>sx){
					dy%=dx;
				}else{
					return (dy-sy)%dx==0;
				}
			}
		}
		return false;
	}
}