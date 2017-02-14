package top.ygy.chapter5.initialization;

/**
 * @ClassName: exercise1 
 * @Description: TODO(练习1:创建一个类,它包含一个未初始化的引用.验证该引用被java初始化为null) 
 * @author yangguangyuan
 * @date 2017年2月13日 下午6:19:31 
 */
public class Exercise1 {
	public static void main(String[] args) {
		nullTest nullTest = new nullTest();
		System.out.println(nullTest.name);
	}
}

class nullTest{
	public String name; 
} 
