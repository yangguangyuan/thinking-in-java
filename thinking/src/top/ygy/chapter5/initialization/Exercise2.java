package top.ygy.chapter5.initialization;

/**
 * 
 * @ClassName: exercise2 
 * @Description: TODO(练习2:创建一个类,它包含一个在定义时就被初始化的string域,
 * 以及另一个通过构造器初始化的string域,这两种方式有何差异?) 
 * @author yangguangyuan
 * @date 2017年2月13日 下午6:27:56 
 * 区别:str1被初始化为"测试1",
 * 	   str2先被初始化为null,第二次被初始化"测试2"
 */
public class Exercise2 {
	public static void main(String[] args) {
		StringTest stringTest = new StringTest();
		System.out.println(stringTest.str1);
		System.out.println(stringTest.str2);
	}
}

/**
 * @ClassName: StringTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author yangguangyuan
 * @date 2017年2月13日 下午6:41:45 
 */
class StringTest{
	String str1 = "测试1";  //这就叫定义时初始化
	String str2;
	public StringTest(){
		str2 = "测试2";
	}
}