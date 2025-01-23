package j0123;

import java.util.ArrayList;
import java.util.List;

public class Ja0123_07 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		for(int i=0; i<10; i++) {
			list.add(i+1); 	// 값 입력
		}

		list.add(4,100);	// 위치값 입력

		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));	// 값 출력
		}

		list.remove(2);
		System.out.println("--------");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));	// 값 출력
		}

		for(int i=list.size()-1; i>=0; i--) {
			list.remove(i);
		}

		System.out.println("----전체 삭제 후 출력----");
		for(int i=0; i<list.size(); i++	) {
			System.out.println(list.get(i));	// 값출력
		}







//		List list2 = new ArrayList();

//		Integer i1 = new Integer(1);
//		Integer i2 = new Integer(2);
//		Integer i3 = new Integer(3);
//		Integer i4 = new Integer(4);
//
//		list.add(i1);	// 1-> 기본타입, list-> 객체타입
//		list.add(i2);	// 1-> 기본타입, list-> 객체타입
//		list.add(i3);	// 1-> 기본타입, list-> 객체타입
//		list.add(i4);	// 1-> 기본타입, list-> 객체타입
//		System.out.println(i1);

//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));	// 해당번호 출력
//		}
//
//		list.remove(3);
//		System.out.println("--------");
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}


	}

}
