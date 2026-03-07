class point {
		int x;
		int y;
	
		point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	 }
public class Closest_Distance_Pairs {
    public static long closestPair(point coordinates[], int n) {
		long mindist=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                long x1=coordinates[i].x;
                long y1=coordinates[i].y;

                long x2=coordinates[j].x;
                long y2=coordinates[j].y;

                long dist=(x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);

                mindist=Math.min(mindist,dist);
            }
        }
        return mindist;
		
		
	}
}
