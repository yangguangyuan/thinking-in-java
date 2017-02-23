package top.ygy.chapter5.initialization;

/**
 * @ClassName: Exercise21 
 * @Description: TODO(创建一个enum，它包含纸币中最小面值的6种类型。
 * 通过values()循环并打印每一个值及其ordinal（）) 
 * @author yangguangyuan
 * @date 2017年2月22日 上午7:54:08 
 *
 */
public class Exercise21 {
	enum Money{
		ONE,TWO,THREE
	}
	public static void main(String[] args) {
		Money[] values = Money.values();
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
	}
}

