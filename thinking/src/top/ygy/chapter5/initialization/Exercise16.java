package top.ygy.chapter5.initialization;
/**
 * @ClassName: Exercise16 
 * @Description: TODO(创建一个String对象数据，并为每一个元素都赋值一个String。用for循环来打印该数组。) 
 * @author yangguangyuan
 * @date 2017年2月21日 上午7:38:29 
 *
 */
public class Exercise16 {
	static String a[]={"a","b","c","d"};
	
	public static void main(String[] args) {
		for(int i = 0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	
}
