package test5;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

//다음 코드를 수정하여 프로그램을 완성하시오
class Student {
	// private name,kor,eng,math 변수, 생성자, set/get
	private String name;
	private int kor;
	private int eng;
	private int math;

	public Student() {
		super();
	}

	public Student(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
}

public class StudentTest {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("경로/student.dat");
		FileWriter fw = new FileWriter("경로/backup.dat", true);
		Scanner sfi = new Scanner(fr);

		List<Student> list = new ArrayList<Student>();

		while (sfi.hasNextLine() == true) { // End of File
			// StringTokenizer로 분리하여 list객체에 추가하기
			

		}
		// -------------------------------------------------------------------------
		// list 각 객체의 국어 점수 총합/평균구하기
		int sumOfKor = 0, sumOfEng = 0, sumOfMath = 0;
		int avgOfKor = 0, avgOfEng = 0, avgOfMath = 0;
		for (int i = 0; i < list.size(); i++) {
			Student st = list.get(i);
			sumOfKor += st.getKor();
			sumOfEng += st.getEng();
			sumOfMath += st.getMath();
		}
		avgOfKor = sumOfKor / list.size();
		avgOfEng = sumOfEng / list.size();
		avgOfMath = sumOfMath / list.size();

		// -------------------------------------------------------------------------
		// backup.dat파일
		// 총학생수 파일로 출력하기
		// 각 과목별 총합/평균로 출력하기
		fw.write("총학생수 =" + list.size() + "명" + "\n");
		fw.write("국어 총합 = " + sumOfKor + " 국어 평균= " + avgOfKor + "\n");
		fw.write("영어 총합 = " + sumOfEng + " 영어 평균= " + avgOfEng + "\n");
		fw.write("수학 총합 = " + sumOfMath + " 수학 평균= " + avgOfMath + "\n");
		fw.write("========================\n");

		fr.close();
		sfi.close();
		fw.close();
		System.out.println("backup.txt 파일이 생성되었습니다");
	}
}
