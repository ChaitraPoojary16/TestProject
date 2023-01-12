package practice_java;

public class StudentDetail {
	 int roll_no ;
	 String name ;

void getDetail(int x,String s) {
	roll_no=x;
	name=s;
}
void showDetail() {
	System.out.println("roll no "+roll_no);
	System.out.println("Name of student "+name);
}
}
