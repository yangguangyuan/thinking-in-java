package top.ygy.chapter5.initialization;

/**
 * @ClassName: Exercise20 
 * @Description: TODO(创建一个使用可变参数列表而不是普通的main()
 * 语法的main()。打印所产生的args数组的所有元素，并用各种不同数量的命令行参数来测试它) 
 * @author yangguangyuan
 * @date 2017年2月22日 上午7:46:14 
 */
public class Exercise20 {
	static void printString(String... args){
		for (String string : args) {
			System.out.println(string);
		}
	}
	
	public static void main(String[] args) {
		printString("a","b","c");
		printString(new String[]{"d","e","f"});
	}
}
