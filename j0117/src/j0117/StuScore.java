package j0117;

public class StuScore {
	int no;
	String name;
	int kor;
	int eng;
	int total;
	double avg;

	void cal_total() {
		total = kor+eng;
	}

	void cal_avg() {
		avg = total/2.0;
	}



}
