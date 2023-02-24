package ifcontrol;

public class P91 {

	public static void main(String[] args) {

		int a = 10;
		int b = 5;
		int c = 20;

		int max = 0;
		int min = 0;

// 우리가 풀은 방법

//		if (a > b && a > c && a > d) {
//			max = a;
//		} else if (b > a && b > c && b > d) {
//			max = b;
//		} else if (c > a && c > b && c > d) {
//			max = c;
//		} else {
//			max = d;
//		}
//
//		if (a < b && a < c && a < d) {
//			min = a;
//		} else if (b < a && b < c && b < d) {
//			min = b;
//		} else if (c < a && c < b && c < d) {
//			min = c;
//		} else {
//			min = d;
//		}

// 강사님이 푸신 방법

//		if (a > b) {
//			max = a;
//			min = b;
//			if (a < c) {
//				max = c;
//			} else {
//				if (b > c) {
//					min = c;
//				}
//			}
//
//		} else {
//			max = b;
//			min = a;
//			if (b < c) {
//				max = c;
//			} else {
//				if (a > c) {
//					min = c;
//				}
//			}
//		}

//강사님이 푸신방법 2

//		max = (a > b) ? ((a > c) ? a : c) : (b > c) ? b : c;
//		min = (a < b) ? ((a < c) ? a : c) : (b < c) ? b : c;

//강사님이 푸신방법 3

		if (a > b) {
			max = Math.max(a, c);
			min = Math.min(b, c);
		} else {
			max = Math.max(b, c);
			min = Math.min(a, c);
		}

		System.out.printf("MAX : %d , MIN : %d", max, min);
	}

}
