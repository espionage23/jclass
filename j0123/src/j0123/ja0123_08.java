package j0123;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ja0123_08 {

	public static void main(String[] args) {

		HashSet	set = new HashSet();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);	// 순서x, 중복 x
		set.add(4);

		System.out.println("개수 : "+set.size());

		Iterator i = set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

//		ArrayList list = new ArrayList();
//
//		for(int i=0; i<10; i++) {
//			list.add(i+1);	//값입력
//		}
//
//		// 기본형태 - 데이터 불러오기
//		Iterator i1 = list.iterator();
//
//		for(int i=0; i<set.size(); i++) {
//			System.out.println(set.get(i));	//값출력
//		}

	}

}
