package top.ygy.chapter8.exception;

/**
* @ClassName: Exercise2 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author yangguangyuan
* @date 2017年6月17日 下午5:42:29 
*
 */
public class Exercise2 {
	public static String a=null;
	
	public static void main(String[] args) {
		try {
			a.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
