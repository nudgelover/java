package ifcontrol;

public class maxmin {

	public static void main(String[] args) {

		int arr[] = { 3, 10, 40, 2, 5, 237, 4 };

//	for를 이용한 방법
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		int min = arr[0];
		for(int i=1; i <arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		
		System.out.printf("MAX : %d , MIN : %d", max, min);
	}

}
