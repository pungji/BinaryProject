package Finaltermexam;


import java.util.Scanner;

	class Student{

		public String Belong(String a) {
			return a;
		}
		public String Name(String b) {
			return b;
		}
		public int Score(int a) {
			return a;
		}
		
		public void ComputeGrade(int a) {
			String compute=null;
			if(a>70) {
				compute ="���";
			}
			else {
				compute ="���հ�";
			}
		}
	}

	class UGstudent2 extends Student {
		
		public void Belong() {
			
		}
		public String Name(String b) {
			return b;
		}
		public int Score(int a) {
			return a;
		}
		
		public void ComputeGrade(int a) {
			String compute=null;
			if(a>70) {
				compute ="���";
			}
			else {
				compute ="���հ�";
			}
		}
	}
/*
	class PGstudent extends Student{

			public void Belong() {	
				belong ="���п���";
				
				
			}
			public void Name(String b) {
				name =b;
			}
			public void Score(int c) {
				score =c;
			}
			
			public void ComputeGrade() {
				//compute =d;
				if(score>80) {
					compute ="���";
				}
				else {
					compute ="���հ�";
				}
			}
			}

*/



	public class FinaltermExam2 {
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		UGstudent2 sc2 = new UGstudent2();
		//PGstudent2 sc3 = new PGstudent2();
		System.out.println("���� �Է��ϼ���");
		int a =sc.nextInt();
		String b =sc.next();
		int c =sc.nextInt();
		//String d =sc.next();
		if(a==1) {
			sc2.Belong();
		}
	
			System.out.println("�Ҽ�  �̸�  ����  ����");
			System.out.println("   "+sc2.Name(b));

		}	
}