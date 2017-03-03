package top.ygy.chapter7.reusing;

import top.ygy.chapter7.reusing.test.print;

/**
 * @ClassName: Exercise11 
 * @Description: TODO(修改Detergent1.java。让它使用代理。) 
 * @author yangguangyuan
 * @date 2017年3月3日 上午9:15:29 
 *
 */
public class Exercise11 {

}

class Cleanser1{  
    private String s="Cleanser1";  
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
    public static void main(String[] args){  
        Cleanser1 x=new Cleanser1();  
        x.dilute();x.apply();x.scrub();  
        new print(x);  
    }  
}  
class Detergent1{  
      
    Cleanser1 Cleanser1=new Cleanser1();  
      
    public void append(String str){  
        Cleanser1.append(str);  
    }  
  
    public void dilute(){  
        append(" dilute()");  
    }  
    public void apply(){  
        append(" apply()");  
    }  
    public String toString(){  
        return Cleanser1.toString();  
    }  
      
    public void scrub(){  
        append(" Detergent1.scrub()");  
    }  
    public void foam(){  
        append(" foam()");  
    }  
      
}  
class Sub1 extends Detergent1{  
    public void scrub(){  
        append(" Sub1.scrub");  
        super.scrub();  
    }  
    public void sterilize(){  
        append("Sub1.sterilize()");  
    }  
} 