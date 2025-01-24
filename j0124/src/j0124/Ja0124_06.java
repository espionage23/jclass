package j0124;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Ja0124_06 {

	public static void main(String[] args) {
		ArrayList<Stu> list = new ArrayList<Stu>();
		list.add(new Stu("홍길동",100,100,99));
		list.add(new Stu("유관순",90,90,99));
		list.add(new Stu("이순신",80,80,89));

		// list 파일에 들어있는 내용을 stu.txt
		// 1. 홍길동,100,100,100,300,100.0,0
		// 들어가 있는 3명의 학생성적을 stu.txt 파일에 저장하시오.

		try {
			FileWriter fw = new FileWriter("c:/save/stu.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			for(int i=0; i<list.size(); i++) {
				list.get(i);	// Stu 1개 객체
				String str = String.format("%d,%s,%d,%d,%d,%d,%.2f,%d", list.get(i).getNo(),list.get(i).getName(),list.get(i).getKor(),list.get(i).getEng(),list.get(i).getMath(),list.get(i).getTotal(),list.get(i).getAvg(),list.get(i).getRank());
				bw.write(str + "\r\n");
			}
			bw.close();
			fw.close();

		} catch (IOException e) {e.printStackTrace();}

		System.out.println("프로그램 종료");





		// save2 폴더에 stu.txt.로 아래의 글을 저장하고 출력.
		// 저장
//		String[] str = new String[3];
//		str[0] = "1, 홍길동, 100,100,99";
//		str[1] = "2, 유관순, 90,90,99";
//		str[2] = "3, 이순신, 80,80,8 9";
//
//		try {
//			FileWriter fw = new FileWriter("c:/save2/stu.txt");
//			BufferedWriter bw = new BufferedWriter(fw);
//			for(int i=0; i<str.length; i++) {
//				bw.write(str[i]+"\r\n");
//			}
//			bw.close();
//		} catch (IOException e) {e.printStackTrace();}
//
//		str[3] = "4, 강감찬, 80,80,89";
//		try {
//		    FileWriter fw = new FileWriter("c:/save2/stu.txt",true);  // true로 이어쓰기
//		    BufferedWriter bw = new BufferedWriter(fw);
//		    bw.write(str[3]+"\r\n");  // 4번째 항목만 추가
//		    bw.close();
//		} catch (IOException e) {e.printStackTrace();}
//
//		System.out.println("프로그램 종료");
//
//		// 출력
//		try {
//			FileReader fr = new FileReader("c:/save2/stu.txt");
//			BufferedReader br = new BufferedReader(fr);
//			while(true) {
//				try {
//					String line = br.readLine();
//					if(line == null) break;
//					System.out.println(line);
//				} catch (Exception e) {e.printStackTrace();}
//			}
//		} catch (FileNotFoundException e) {e.printStackTrace();}


	}

}
