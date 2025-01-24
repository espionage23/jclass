package j0124;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Ja0124_07 {

	public static void main(String[] args) {
		// c:/save/stu.txt 파일을 읽어와서
		// list 컬렉션에 데이터를 입력하시오.
		ArrayList<Stu> list = new ArrayList<Stu>();

		int no = 0, kor=0, eng=0, math=0, total=0, rank=0;
		String name = "";
		double avg = 0;


		try (FileReader fr = new FileReader("c:/save/stu.txt");
			    BufferedReader br = new BufferedReader(fr)) {
			    String line;
			    while ((line = br.readLine()) != null) {
		            String[] str = line.split(",");
		            no = Integer.parseInt(str[0]);
		            name = str[1];
		            kor = Integer.parseInt(str[2]);
		            eng = Integer.parseInt(str[3]);
		            math = Integer.parseInt(str[4]);
		            total = Integer.parseInt(str[5]);
		            avg = Double.parseDouble(str[6]);
		            rank = Integer.parseInt(str[7]);
		            list.add(new Stu(no, name, kor, eng, math, total, avg, rank));
			    }
			    fr.close();
			    br.close();
		} catch (IOException e) {e.printStackTrace();}


		// list 출력
		for(int i=0; i<list.size(); i++) {
			System.out.printf("[ %d,%s,%d,%d,%d,%d,%.2f,%d ]\n",list.get(i).getNo(),list.get(i).getName(),list.get(i).getKor(),list.get(i).getEng(),list.get(i).getMath(),list.get(i).getTotal(),list.get(i).getAvg(),list.get(i).getRank());
		}



		// split


	}

}
