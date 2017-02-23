package top.ygy.chapter5.initialization;

/**
 * @ClassName: Exercise19 
 * @Description: TODO(写一个类，他接受一个可变参数的String数组，
 * 验证你可以向该方法传递一个用逗号分隔的String列表，或是一个String[]) 
 * @author yangguangyuan
 * @date 2017年2月22日 上午7:37:09 
 *
 */
public class Exercise19 {
	public static void main(String[] args) {
		Test2 test1 = new Test2();
		test1.testString("a","b","c");
	}
}

class Test2 {
	public void testString(String... args){
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]+"");
		}
	}
}
