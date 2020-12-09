# 计192
# EXP4
# 阅读程序

## 实验目的
### 1.掌握字符串String及其方法的使用
### 2.掌握文件的读取/写入方法
### 3.掌握异常处理结构
## 实验内容
*在某课上,学生要提交实验结果，该结果存储在一个文本文件A中。
文件A包括两部分内容：
一是学生的基本信息；
二是学生处理后的作业信息，该作业的业务逻辑内容是：利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能方法，实现如下功能：

*每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
允许提供输入参数，统计古诗中某个字或词出现的次数
输入的文本来源于文本文件B读取，把处理好的结果写入到文本文件A
考虑操作中可能出现的异常，在程序中设计异常处理程序

*输入：汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行<未完，待续>

*输出：
汉皇重色思倾国，御宇多年求不得。
杨家有女初长成，养在深闺人未识。
天生丽质难自弃，一朝选在君王侧。
回眸一笑百媚生，六宫粉黛无颜色。
春寒赐浴华清池，温泉水滑洗凝脂。
侍儿扶起娇无力，始是新承恩泽时。
云鬓花颜金步摇，芙蓉帐暖度春宵。
春宵苦短日高起，从此君王不早朝。
…………
## 实验要求
设计学生类（可利用之前的）；  
采用交互式方式实例化某学生；   
设计程序完成上述的业务逻辑处理，并且把“古诗处理后的输出”结果存储到学生基本信息所在的文本文件A中。  

## 实验过程
### 1.分出四个类分别作为异常处理、文件的读取与写入、测试类、以及学生系统的录入
### 2.利用数组与循环构建文件读取与写入
### 3.在学生系统的录入中加入判断语句与异常处理
### 4.将数据通过import导入测试类
## 核心方法
### 1.文件的存储
public String readFile() {  
		String original = null;  
		int n=-1;  
		char[] a = new char[100];//缓存，  
		try {  
			File file = new File("E:\\文本.txt");  
			InputStream fli = new FileInputStream(file);  
			InputStreamReader in = new InputStreamReader(fli, "UTF-8");  
		while((n=in.read(a,0,100))!=-1) {  
		String s = new String(a,0,n);  
		this.n=n;  
		if(original!=null)  
		original = original+s;  
		else original=s;  
		}	  
        in.close();  
      	}  
		catch (IOException e) {  
			System.out.println("File read erroe:"+e);  
		}  
		return original;  
	}  
  ### 2.录入系统
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
  ### 3.异常处理
  public String JudgeException(String input) {  
		message = "您输入的“"+input+"”不正确，请输入正确性别！";  
		return message;  
	}  
### 4.记录重复字数
while (true) {  
                System.out.println("输入功能编号:" + "\n" + "1:查询古诗中的字或词"+" \n"+ "2:退出程序"+"\n");  
                Scanner o = new Scanner(System.in);  
                int m = o.nextInt();  
                switch (m) {  
                    case 1:  
                        System.out.println("输入你想要查询的字或词");  
                        Scanner scanner1 = new Scanner(System.in);  
                        String s1 = scanner1.nextLine();  
                        Pattern pattern = Pattern.compile(s1);  
                        Matcher matcher = pattern.matcher(s);  
                        if (matcher.find()) {  
                            int num = 1;  
                            while (matcher.find()) {  
                                num++;  
                            }  
                            System.out.println("次数为" + num);  
                        } else {  
                            System.out.println("文本中没有该字符");  
                        }  
                        break;  
                    case 2:  
                        break a;  
                    default:  
                        System.out.println("您输入的编号有误，请重新输入");  
                }  
            }  

 }  
## 实验结果
![1](https://github.com/Wangjiazeng123/4/blob/main/0e50010d656ebde092147b82c9a5623.png)
![1](https://github.com/Wangjiazeng123/4/blob/main/e12e3f8c55dfdb7e4e5368b8a5cd3b8.png)
## 实验感
通过这次实验更深一步的体会到了异常处理的使用以及bufferreader与scanner的利弊和区别。激发了对java的兴趣，是我对java逻辑结构更加了解了。
