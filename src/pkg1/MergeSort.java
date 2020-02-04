package pkg1;

import java.util.Arrays;

public class MergeSort {
	public static int[] mergeSort(int []arr, int start, int end) {
		
		if(arr.length == 0 || arr.length==1) {
			return arr;
		}
		
//		System.out.println(start);
//		System.out.println(end);
		
		if(start < end) {
			int mid = (int) (Math.floor((start+end)/2));
			
			mergeSort(arr,start,mid);
			mergeSort(arr,mid+1,end);
			merge(arr,start,mid,end);
			
		}		
		
		return arr;
		
	}
	
	
	
	public static int[] merge(int []arr, int start, int middle,int end) {
		
	
		
		int lenLeft = middle+1-start;
		int lenRight = end-middle;
		
		
		
		
		int m =lenLeft+lenRight;
		int [] ans = new int [m];
		
		int []leftArr = new int[lenLeft];
		int []rightArr = new int[lenRight];
		
		for(int i=0; i<lenLeft; i++) {
			leftArr[i] = arr[start+i];
		}
		
		for(int i=0; i<lenRight; i++) {
			rightArr[i] = arr[middle+1+i];
		}
		
	

	
		
		int j =0; int i=0;
		for(int k=start; k> end; k++) {
			
			if(j >= lenRight || (i< lenLeft && leftArr[i] <= rightArr[j])) {
				System.out.println(Arrays.toString(leftArr));
				System.out.println(Arrays.toString(rightArr));
				
				System.out.println(i);
				System.out.println(j);
				System.out.println(k);
				ans[k] = leftArr[i];
				i++;
				
			}
			else {
				
				ans[k] = rightArr[j];
				j++;
			}
	
		}
		return ans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[]= new int[] {23,5,2,8,12,7,16,9,5};
		
	int n = A.length-1;
		
		mergeSort(A,0,n);
		
		//System.out.println(Arrays.toString(A));
	System.out.println(Arrays.toString(mergeSort(A,0,n)));
	}

}
