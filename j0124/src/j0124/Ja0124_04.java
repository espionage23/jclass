package j0124;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ja0124_04 {

	public static void main(String[] args) throws Exception {



		//--------------- 글을 파일에 저장 -----------------------
//		FileInputStream
//		FileOutputStream

		File f = new File("c:/save2");
		if(!f.exists()) {
			f.mkdirs();  	//c:/save2/aaa/		mkdir : c:/save2/aaa/는 에러
		}

		FileInputStream fls = new FileInputStream("c:/save/rose.jpg");
		FileOutputStream fos = new FileOutputStream("c:/save2/rose2.jpg");

		while(true) {
			int read = fls.read();
			if(read == 1) break;
			fos.write(read);
		}
		fls.close();
		fos.close();

		System.out.println("이미지 복사 프로그램 종료");


		//--------------- 파일에 있는 글자를 읽어서 출력---------------------
		// 파일을 읽어서 데이터 출력
//		byte[] b = new byte[1024];
//		FileInputStream fls = new FileInputStream("c:/save/aaa.txt");
//		fls.read(b);
//		System.out.println(new String(b));


		// 글을 가져와서 출력하는 기본형태
//		try {
//			FileInputStream fls = new FileInputStream("c:/save/aaa.txt");
//			int read = 0;
//			while((read=fls.read()) != -1) {	//읽을 데이터 있으면
//				System.out.print((char)read);
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}


	}

}
