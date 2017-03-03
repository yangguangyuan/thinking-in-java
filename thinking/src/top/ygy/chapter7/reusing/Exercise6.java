package top.ygy.chapter7.reusing;

/**
 * @ClassName: Exercise6 
 * @Description: TODO(用Chess证明前面两名话) 
 * 如果不在BoardGame()中调用基类构造器，编译器将“抱怨”无法找到符合Game形式的构造器。
 * 而且调用基类构造器必须是你在导出类构造器中要做的第一件事
 * @author yangguangyuan
 * @date 2017年3月2日 下午5:07:08 
 *
 */
public class Exercise6 {
	 public static void main(String args[]){  
	        new LearnigAndroid("a");  
	    } 
}


class LearnigEnglish {
    LearnigEnglish(String name){
        System.out.println(name + " are learning english");
        System.out.println(name + " finished learning english and passed CET_4");
    }
}
class LearningJava extends LearnigEnglish{
    LearningJava(String name){
        super(name);
        System.out.println(name + " are learning java");
        System.out.println(name + " can make some small java project");
    }
}
class LearnigAndroid extends LearningJava{
    public LearnigAndroid(String name){
        super(name);
        System.out.println(name + " are learning android");
        System.out.println(name + " can make an APP");
    }
}

/**
 * super语句可以理解为把参数传给基类构造器使用。 
 * 当我们注释掉子类的super语句时，编译器报错：there is no default constructor available inxxx. 
 * 当我们将super语句移动到构造器最后一行时，编译器报错：Call to super() must be first statement in constructor body. 
 * super语句必须是构造器中的第一个。 
 * 从逻辑上也很好理解这两个。 
 * 我们把name看成一个人,要想LearningEnglish,必须要有一个人，而LearningJava继承自LearningEnglish，
 * 所以也需要一个人，但这个人传进来的时候不是天生就会English的，这个人是空白的。
 * 所以需要super调用一下父类的构造方法，先让这个人学会English，然后才能学java。
 */
