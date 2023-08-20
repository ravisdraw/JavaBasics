package PractisePrograms;

public class GreatestOfAdjacentElement {

	public static void main(String[] args) {
		int arr[] = {2, 3, 1, 5, 4, 9, 8, 7, 5};
		for(int i=1;i<arr.length-1;i++) {
			if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}
