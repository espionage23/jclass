package j0124;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Ja0124_01 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add(new Stu("홍길동",100,100,99)); 	// 1명 입력
		list.add(new Stu("유관순",90,90,99)); 	// 1명 입력

		//Map
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("userId", "aaa");	// map 저장
		map.put("userPw", "1111");
		map.put("userName", "홍길동");
//		map.put("list", list);

//		System.out.println(map.containsKey("userId"));	// key 값이 존재하는지 확인
//		System.out.println(map.containsValue("1111"));	// value 값이 존재하는 확인

		if(map.containsKey("userId")==true) {
			System.out.println(map.get("userId"));	// map에서 key에 해당되는 값 출력
		}



//		System.out.println("id : "+map.get("userId"));
//		System.out.println("id : "+map.get("userId2"));
//		System.out.println("Pw : "+map.get("userPw"));
//		System.out.println("list : "+map.get("list"));	// 주소값이 나옴

		// 전체출력 - Iterator 활용
//		Iterator i = map.entrySet()	.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}


		// map에 들어간 list 컬렉션을 어떻게 하면 출력할 수 있을것인가?
//		ArrayList list2 = (ArrayList)map.get("list");
//
//		for(int i=0; i<list2.size(); i++) {
//			Stu s = (Stu)list2.get(i);
//			System.out.println(s.getNo()+","+s.getName());
//		}



		// Set
//		HashSet set = new HashSet();
//		set.add(1);
//		set.add(2);
//		set.add(3);
//		set.add(2);
//
//		Iterator i = set. iterator();
//		while(i.hasNext()) {	// set 인터페이스는 for문을 사용못한다.
//			System.out.println(i.next());
//		}
//		i = set. iterator();	// 출력은 무조건 1번더 사용해야 한다.
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}

		// List
//		ArrayList list = new ArrayList();
//		list.add(new Stu("홍길동",100,100,99)); 	// 1명 입력
//		list.add(new Stu("유관순",90,90,99)); 	// 1명 입력
//		list.add(new Stu("이순신",80,80,99)); 	// 1명 입력
//
//		Stu s1 = new Stu();
//		s1.setName("강감찬");
//		s1.setKor(70);
//		s1.setEng(80);
//		s1.setMath(88);
//		list.add(s1);
//
//		for(int i=0; i<list.size(); i++) {
//			Stu s = (Stu)list.get(i);
//			System.out.println(s.getNo()+","+s.getName());
//		}



		// 컬렉션 프레임워크의 핵심 인터페이서
		// List, Set, Map

		// List - 순서가 있는 데이터의 집합, 데이터의 중복을 허용한다.
		// Set - 순서를 유지하지 않는 데이터의 집합, 데이터의 중복을 허용하지 않는다.
		// Map - 키와 벨류의 쌍으로 이루어진 데이터의 집합, 순서는 유지되지 않으며, 키는 중복을 허용하지 않고, 값은 중복을 허용한다.

	}

}
