package top.ygy.chapter7.reusing;

import top.ygy.chapter7.reusing.test.print;

/**
 * @ClassName: Exercise2 
 * @Description: TODO(从Detergent中继承产生一个新的类。覆盖scrub()并添加一个名为sterilize()的新方法。) 
 * @author yangguangyuan
 * @date 2017年3月2日 下午4:05:51 
 *
 */
public class Exercise2 {
	public static void main(String args[]){  
        Sub s=new Sub();  
        s.apply();
        s.dilute();
        s.foam();
        s.scrub();
        s.sterilize();  
        new print(s);  
    }  
}


class Cleanser{  
    private String s="Cleanser";  
    public void append(String a){  
        s+=a;
    }     
    public void dilute(){  
        append(" dilute()");  
    }  
    public void apply(){  
        append(" apply()");  
    }  
    public void scrub(){  
        append(" scrub() ");  
    }  
    public String toString(){  
        return s;  
    }  
//    public static void main(String[] args){  
//        Cleanser x=new Cleanser();  
//        x.dilute();x.apply();x.scrub();  
//        new print(x);  
//    }  
}  
class Detergent extends Cleanser{  
    public void scrub(){  
        append(" Detergent.scrub()");  
    }  
    public void foam(){  
        append(" foam()");  
    }  
      
}  
class Sub extends Detergent{  
    public void scrub(){  
        append(" sub.scrub");  
        super.scrub();  
    }  
    public void sterilize(){  
        append("sub.sterilize()");  
    }  
}  