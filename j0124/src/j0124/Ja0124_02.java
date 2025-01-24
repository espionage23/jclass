package j0124;

import java.util.ArrayList;
import java.util.Comparator;

public class Ja0124_02 {

	public static void main(String[] args) {



		// Annotaion
		//구문: '@' 기호로 시작하며, 클래스, 메서드, 변수, 매개변수, 패키지 등에 적용할 수 있습니다.

		// Generic
		ArrayList<Stu> list = new ArrayList();
		list.add(new Stu("홍길동",100,100,99)); 	// 1명 입력
//		list.add(1);
//		list.add(new Card());


		for(int i=0; i<list.size(); i++) {
//			Stu s = (Stu)list.get(i);
			System.out.printf("[%d,%s,%d]\n",list.get(i).getNo(),list.get(i).getName(),list.get(i).getTotal());
		}


//		ArrayList list = new ArrayList();
//		list.add(new Stu("홍길동",100,100,99)); 	// 1명 입력
//		list.add(new Stu("유관순",90,90,99)); 	// 1명 입력
//		list.add(new Stu("이순신",95,91,95)); 	// 1명 입력
//		list.add(new Stu("강감찬",85,93,93)); 	// 1명 입력
//		list.add(new Stu("김구",80,80,80)); 	// 1명 입력
//		list.add(new Stu("홍길자",70,70,70)); 	// 1명 입력
//		list.add(new Stu("홍길순",60,60,60)); 	// 1명 입력

//		for(int i=0; i<list.size(); i++) {
//			Stu s = (Stu)list.get(i);
//			System.out.printf("[%d,%s,%d]\n",s.getNo(),s.getName(),s.getTotal());
//		}


		// 문자열 정렬
//		list.sort(new Comparator<Stu>() {
//			@Override
//			public int compare(Stu s1, Stu s2) {
////				return s1.getName().compareTo(s2.getName());	// 순차정렬
//				return s2.getName().compareTo(s1.getName());	// 역순정렬
//			}
//
//		});

		// 숫자정렬
//		list.sort(new Comparator<Stu>() {
//			@Override // 숫자비교, 문자열 비교
//			public int compare(Stu s1, Stu s2) {
////				return s1.getTotal()-s2.getTotal();	// 정렬
//				return s2.getTotal()-s1.getTotal();	// 역순정렬
//			}
//		});

//		System.out.println("--------순차정렬------------");
//		for(int i=0; i<list.size(); i++) {
//			Stu s = (Stu)list.get(i);
//			System.out.printf("[%d,%s,%d]\n",s.getNo(),s.getName(),s.getTotal());
//		}
	}

}
