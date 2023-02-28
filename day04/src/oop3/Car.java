package oop3;

import java.util.Scanner;

public class Car {

	// 속성
	public String name;
	public String color;
	public int size;
	public int fsize;
	public int cfsize;

	// 생성자(constructor)

	public Car() {
	}

	public Car(String name, String color, int size, int fsize) {
		this.name = name;
		this.color = color;
		this.size = size;
		this.fsize = fsize;
	}

	public Car(String name, String color, int size, int fsize, int cfsize) {
		this(name, color, size, fsize);
		this.cfsize = cfsize;
	}

	// getter setter 필요 시 선언해라...!---------------------------------

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", size=" + size + ", fsize=" + fsize + ", cfsize=" + cfsize
				+ "]";
	}

	// 기능
	/*
	 * 기름을 넣는다. 넣기만 하면 되니까 void!! 기름통 보다 많이 넣으면 다시 주유 하세요 음수 값이 들어가면 다시 주유하세요. else
	 * if 는 흐름을 제어한다.. 쓰지말고 해봐라!
	 */
	public void setCfsize(int size) {
		if (size <= 0) {
			System.out.println("주유량이 잘못 입력되었습니다. 다시 주유하세요");
			return;
		}
		if ((size + cfsize) > fsize) {
			System.out.println("주유량을 초과하였습니다. 다시 주유하세요");
			return;
		}
		cfsize += size;
	}

	// 주행을 한다.
	// 1리터당 10km를 주행 할 수 있다
	public void go(int distance) {
		if (cfsize <= 0 || cfsize < (distance / 10)) {
			System.out.println("기름이 없습니다. 주유해주세요.");
			return;
		}
		System.out.printf("현재 %s %d km 주행 가능합니다", this.name, distance);
		System.out.println("현재 총 주행 가능한 거리는" + (cfsize * 10) + "km 입니다");
		cfsize -= (distance / 10); // 소수점이 안나오기에 원래는 int말고 double 쓰는게 맞다... 우선은 진행하자!
	}

	// 멈춘다.
	public void stop() {
		if (cfsize == 0) {
			System.out.printf("%s Stop...", this.name);
		}

	}

}