package opreation;

import java.util.Scanner;

import run.JudgeException;
public class Student {
	
	public String name;
	 public String sex;
	 public int age;
	 public String ID;

public void inputInformation() {
	Scanner reader = new Scanner(System.in);
	a:for(;;) {
		try {
			System.out.println("����������");
	        name=reader.nextLine();
	        System.out.println("¼��ɹ�");
	        break a;
		}
		catch(Exception e) {
			System.out.println("������� ��"+name+"�� ��ʽ����ȷ�����������룡");
		}
	}
	b:for(;;) {
	try{
	System.out.println("�������Ա����ģ�");
	sex=reader.nextLine();
	sexJudge(sex);
	break b;
	}
	catch(JudgeException e) {
		System.out.println(e.JudgeException(sex));
	}
	}
	c:for(;;) {
		try{
			System.out.println("���������䣨10-30�꣩");
			age=reader.nextInt();
		    ageJudge(age);
		    break c;
		}
		catch(JudgeException e) {
			System.out.println(e.JudgeException(age));
		}
		}
	d:for(;;) {
		try {
			Scanner reader0 = new Scanner(System.in);
			System.out.println("������ѧ��");
			ID=reader0.nextLine();
	        System.out.println("¼��ɹ�");
	        break d;
		}
		catch(Exception e) {
			System.out.println("������ġ�"+ID+"����ʽ����ȷ�����������룡");
		}
	}
	
}
public void sexJudge(String sex) throws JudgeException{
	String x="��";
	String y="Ů";
	if (sex.equals(x)||sex.equals(y)){
		System.out.println("¼��ɹ�");
		}
	else throw new JudgeException();
}
public void ageJudge(int age) throws JudgeException{
	int x=10;
	int y=30;
	if (age>=x&&age<=y){
		System.out.println("¼��ɹ�");
		}
	else throw new JudgeException();
}

}
//import java.io.*;
//import java.util.Scanner;
//import open.JudgeException;
//public class Student {
//	public static  String name;
//	public static int age;
//	public static String sex;
//	public static int number;
//
//public static void main(String[] a)throws IOException{
//	BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
//	a:for(;;){
//		try{
//	
//	System.out.print("����������:");
//	 name=buf.readLine();
//	break a;
//}
//		catch(Exception e){
//			System.out.println("�������������ʽ����ȷ�����������룡");
//		}
//}
//b:for(;;){
//	try{
//
//System.out.print("�������Ա�:");
// sex=buf.readLine();
//
//break b;
//}
//	catch(Exception e){
//		System.out.println("��������Ա��ʽ����ȷ�����������룡");
//	}
//}
//}
//public void inputInformation(){
//Scanner reader=new Scanner(System.in);
//c:for(;;){
//	try{
//System.out.print("����������:");
//age=reader.nextInt();
//ageJudge(age);
//break c;
//}
//	catch(JudgeException e){
//		System.out.println(e.JudgeException(age));
//}
//}
//d:for(;;){
//	try{
//
//System.out.print("������ѧ��:");
// number=reader.nextInt();
//
//break d;
//}
//	catch(Exception e){
//		System.out.println("�������ѧ�Ÿ�ʽ����ȷ�����������룡");
//}
//}
//}
//public void ageJudge(int age)throws JudgeException{
//	int x=10;
//	int y=30;
//	if(age>=10&&age<=30){
//System.out.println("¼��ɹ�");
//	}
//else throw new
//JudgeException();
//}
//}