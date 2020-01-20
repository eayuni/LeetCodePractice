package pkg1;
//1184. Distance Between Bus Stops

public class DistanceBetweenBusStops {
	
public static int distanceBetweenBusStops(int[] distance, int start, int destination) {
	int finalDistance= 0;
	int startDistance= 0;
	
	for(int i = (distance.length-1-start); i<destination; i++) {
		finalDistance=finalDistance+ distance[i];
	
	}
	
	for(int j = 0; j<destination; j++) {
		startDistance= finalDistance +distance[j];
		
	}
	
	
	
	return Math.min(finalDistance, startDistance);
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] distance = new int[] {1,2,3,4};
		System.out.println(distanceBetweenBusStops(distance,0,3));

	}

}
