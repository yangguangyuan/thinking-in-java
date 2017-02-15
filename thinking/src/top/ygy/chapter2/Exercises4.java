package top.ygy.chapter2;

/**
 * @ClassName: Exercises4 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author yangguangyuan
 * @date 2017年2月15日 上午8:30:02 
 *
 */
public class Exercises4 {
	public static void main(String[] args) {
		DataOnly dataOnly = new DataOnly();
		dataOnly.i = 1;
		dataOnly.f = 1;
		dataOnly.b = true;
		System.out.println(dataOnly.i);
		System.out.println(dataOnly.f);
		System.out.println(dataOnly.b);
	}
}

class DataOnly {
	  int i;
	  float f;
	  boolean b;
	}


