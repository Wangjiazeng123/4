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
			System.out.println("请输入姓名");
	        name=reader.nextLine();
	        System.out.println("录入成功");
	        break a;
		}
		catch(Exception e) {
			System.out.println("您输入的 “"+name+"” 格式不正确，请重新输入！");
		}
	}
	b:for(;;) {
	try{
	System.out.println("请输入性别（中文）");
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
			System.out.println("请输入年龄（10-30岁）");
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
			System.out.println("请输入学号");
			ID=reader0.nextLine();
	        System.out.println("录入成功");
	        break d;
		}
		catch(Exception e) {
			System.out.println("您输入的“"+ID+"”格式不正确，请重新输入！");
		}
	}
	
}
public void sexJudge(String sex) throws JudgeException{
	String x="男";
	String y="女";
	if (sex.equals(x)||sex.equals(y)){
		System.out.println("录入成功");
		}
	else throw new JudgeException();
}
public void ageJudge(int age) throws JudgeException{
	int x=10;
	int y=30;
	if (age>=x&&age<=y){
		System.out.println("录入成功");
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
//	System.out.print("请输入姓名:");
//	 name=buf.readLine();
//	break a;
//}
//		catch(Exception e){
//			System.out.println("您输入的姓名格式不正确，请重新输入！");
//		}
//}
//b:for(;;){
//	try{
//
//System.out.print("请输入性别:");
// sex=buf.readLine();
//
//break b;
//}
//	catch(Exception e){
//		System.out.println("您输入的性别格式不正确，请重新输入！");
//	}
//}
//}
//public void inputInformation(){
//Scanner reader=new Scanner(System.in);
//c:for(;;){
//	try{
//System.out.print("请输入年龄:");
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
//System.out.print("请输入学号:");
// number=reader.nextInt();
//
//break d;
//}
//	catch(Exception e){
//		System.out.println("您输入的学号格式不正确，请重新输入！");
//}
//}
//}
//public void ageJudge(int age)throws JudgeException{
//	int x=10;
//	int y=30;
//	if(age>=10&&age<=30){
//System.out.println("录入成功");
//	}
//else throw new
//JudgeException();
//}
//}