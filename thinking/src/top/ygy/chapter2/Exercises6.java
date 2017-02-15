package top.ygy.chapter2;

/**
 * @ClassName: Exercises6 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author yangguangyuan
 * @date 2017年2月15日 上午8:35:12 
 *
 */
public class Exercises6 {
	int storage(String s) {
		return s.length() * 2;
		}

	public static void main(String[] args) {
		Exercises6 exercises6 = new Exercises6();
		int storage = exercises6.storage(" sd");
		System.out.println(storage);
	}
}
