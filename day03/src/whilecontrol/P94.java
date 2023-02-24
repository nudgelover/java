package whilecontrol;

public class P94 {

	public static void main(String[] args) {
		System.out.println("start...");

		int i = 0; // int를 밖에서 선언!
		while (i < 10) {
			//i++;  여기서 실행시키면 i가 1~10으로 찍힘
			System.out.println(i);
			i++;
		}
		System.out.println(i-1); //여기서도 i 가 찍힘. for구분에서는 밖에서 i 못찍음.
		System.out.println("end...");
	}

}
