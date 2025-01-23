package j0123;

import java.util.Scanner;

public class Ja0123_06 {

	public static void main(String[] args) throws CloneNotSupportedException {

		Scanner scan = new Scanner(System.in);

		String a = new String("a");
		StringBuffer str = new StringBuffer("aaa");
		System.out.println(a+1);
		System.out.println(str);



		// indexOf 2
//		String str = "aabbccAABBCCaaddeeffAAaa";
//		System.out.println(str.indexOf("aa",0));
//		System.out.println(str.indexOf("aa",3));
//		System.out.println(str.indexOf("aa",13));
//		System.out.println(str.indexOf("aa",23));
//		int count = 0;
//		for(int i=0; i<str.length(); i++) {	//aa가 있을때
//			if(str.indexOf("aa",i)!=1) {
//				i = str.indexOf("aa",i);
//				System.out.println("aa가 존재하는 위치 : "+i);
//				count++;
//			}else {	//aa가 없을때
//				break;
//			}
//		}



		// valueOf
//		int a = 10;
//		double b = 3.14;
//		String a1 = String.valueOf(a);	// 문자열
//		String a2 = String.valueOf(b);	// 문자열
//		String a3 = ""+a;
//		String a4 = ""+b;


//		String[] arr = {"홍길동임","유관순입니다.","이순신이다","강감찬일까요?","김구","홍길순","홍길자"};
		// 첫글자만 빼고, 마지막 글자 빼고 출력하시오.
		// 길동임, 관순입니다., 순신이다...
//		System.out.println(arr[0].substring(1,3));
//		System.out.println(arr[1].substring(1,7));



//		String str = "1조1234567";
//		// 1234만 출력
//		System.out.println(str.substring(2));
//		System.out.println(str.substring(2,6));
//		System.out.println(str.substring(0,2));



		//length() : 문자의 길이
//		String str = "안녕하세요. 반갑습니다. 홍길동입니다.";
//		System.out.println("10자 이내로 글자를 입력하세요.");
//		// 10자 이상이면 글자를 다시 입력하세요.
//		System.out.println(str.length());
//
//		while(true) {
//			System.out.println("글자를 입력하세요 (10자 이내) >>");
//			String input = scan.next();
//			if (input.length()<10) {
//				System.out.println(input);
//				break;
//			}else {
//				System.out.println("10글자를 초과");
//			}
//		}


		// replace 빈공백 제거
//		String str = "      안녕    하세    요";
//		System.out.println(str.replace(" ", ""));





		// replace : 문자를 다른문자로 대체
//		String str = "안녕하세요 .홍길동입니다. 성은 홍입니다.";
//		String input = "김";
//		str.replace("홍", "김");
//		System.out.println(str.replace("홍", "김"));
//		System.out.println(str);		// 원본은 변경되지 않는다.



		// trim : 빈공백 제거
//		String str = "      안녕    하세    요";
//		System.out.println(str);
//		System.out.println(str.trim());



		//indexOf
//		String str = "안녕하세요. 성은 홍입니다.";
//		String input = "홍";
//		System.out.println("있는 위치 : " + str.indexOf(input));
//		int no = str.indexOf(input);



		// contains : 문자열 포함되어 있는지 확인
//		String[] arr = {"홍길동","유관순","이순신","강감찬","김구","홍길순","홍길자"};
//		String str = "안녕하세요 성은 홍입니다.";
//		String input = "홍";
//
//		// arr의 배열에서 홍 있는 이름을 출력하시오.
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i].contains(input)) {
//				System.out.println(arr[i]);
//			}
//		}




//		if(str.contains(input)) {
//			System.out.println("홍이라는 글자가 있습니다.");
//		}else {
//			System.out.println("홍이라는 글자는 없습니다.");
//		}


//		String str = "1,홍길동,100,100,100,300,100.0,0";
		// 학번 : 1 이름 .... 출력		// 틀렸음 확인해보셈

//		String[] arr = str.split(",");
//		int no = Integer.parseInt(arr[0]);
//		String name = arr[1];
//		int kor = Integer.parseInt(arr[2]);
//		int eng = Integer.parseInt(arr[3]);
//		int math = Integer.parseInt(arr[4]);
//		int total = Integer.parseInt(arr[5]);
//		double avg = Integer.parseInt(arr[6]);
//		System.out.println("번호 : "+arr[0]);
//		System.out.println("이름 : "+arr[1]);
//		System.out.println("국어 : "+arr[2]);
//		System.out.println("영어 : "+arr[3]);
//		System.out.println("수학 : "+arr[4]);
//		System.out.println("합계 : "+kor+eng+math);
//		System.out.println("평균 : "+total/3.0);
//		System.out.println("등수 : "+arr[7]);



//		String str = "5";
//		int n = Integer.parseInt(str);	// 문자열 숫자로 변경

//		System.out.println("숫자를 입력하세요 >> 10,9");
//		// 두수의 합, 곱을 구하시오.
//		String str = scan.next();
//		String[] arr = str.split(",");
//		int n1 = Integer.parseInt(arr[0]);
//		int n2 = Integer.parseInt(arr[1]);
//		System.out.println(n1+n2);
//		System.out.println(n1*n2);


		// split : 특정 분리자로 분리
//		String str = "100,100,100";
//		String[] arr = str.split(",");
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}

		// concat : 문자여 합치기
//		String str = "안녕";
//		String str2 = "반가워";
//		System.out.println(str.concat(str2));


		// charAt : 지정된 위치의 문자 반환
//		String str = "abcdef";
//		System.out.println(str.charAt(0));
//		System.out.println(str.charAt(1));


		// equals : 대소문자 구분 비교, equalsIgnoreCase : 대소문자 구분없이 비교
//		String str1 = "aBc";
//		String str2 = "abc";
//		String str3 = "abc";
//
//		if(str1.equals(str2)) {
//
//		}else {
//
//		}


//		Point p1 = new Point(3,5);
//		Point p2 = (Point)p1.clone();	// 객체 복사
//		Point p3 = new Point(p1);		// 객체 복사
//
//		// 값을 변경
//		p1.x = 10;
//
//		System.out.println(p1);
//		System.out.println(p2);
//
//		Stu s = new Stu();
//		System.out.println(s);
//
//		Class s2 = Stu.class;
//		System.out.println(s2.getName());
//
//		int a = 10;
//		int b = 1;
//		a += b;
//
//		for(int i=0; i<100; i++) {
//			a += i;
//		}
//		System.out.println(a);


//		String str1 = new String("abc");
//		String str2 = new String("abc");
//		String str3 = new String("aac");
//		str2 = str1;
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
//		System.out.println(str3.hashCode());


//		Stu s1 = new Stu("홍길동",100,90,90);
//		Stu s2 = new Stu("홍길동",70,70,70);
//
//		if(s1.equals(s2)) {
//			System.out.println("같은 사람");
//		}else {
//			System.out.println("다른 사람");
//		}


//		Person p1 = new Person(010101-1111111);
//		Person p2 = new Person(010101-1111111);
//
//		if(p1==p2) {
//			System.out.println("같은 사람입니다.");
//		}else {
//			System.out.println("다른 사람입니다.");
//		}

	}

}
