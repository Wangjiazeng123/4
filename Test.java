package run;
import opreation.Student;

public class Test {
	static Student student0=new Student();
	static WenjianDuandXie file = new WenjianDuandXie();
	public static void main(String[] args) {
		
		  System.out.println("���Ĵ�ʵ�飺�ļ�����");
		  System.out.println("**********ѧ����Ϣ¼��**********");
		  student0.inputInformation(); 
		  System.out.println("\n\n������Ϣ��");
		  System.out.println("���� �Ա� ����       ѧ��    ");
		  System.out.println(student0.name+"   "+student0.sex+"    "+student0.age+"    "+student0.ID);
		
		String a=file.readFile();
		String b = file.operationFile(a);
		if(file.outFile(addNewInformation(student0)))
		System.out.println("��Ϣ����ɹ���");
		if(file.outFile(b))
			System.out.println("��ҵ����ɹ���");

	}
	public static String addNewInformation(Student student) {
		String information = null;
		information="������Ϣ��\n���� �Ա� ����       ѧ��    \n"+student0.name+"   "+student0.sex+"    "+student0.age+"    "+student0.ID+"\n�����ҵ��\n";
		 return information;
	}
}
