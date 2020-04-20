package M3LabbookSpring13.M3LabbookSpring13;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.bean.Employee;
import com.cg.bean.SBU;

/**
 * Hello world!
 *run
 */
public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context=
    			new ClassPathXmlApplicationContext("myBean.xml");
    	//Employee e=(Employee)context.getBean("emp");
    	SBU sb=(SBU)context.getBean("sb");
    	System.out.println("SBU Details");
    	System.out.println("--------------------");
    	System.out.println(sb);
    	//System.out.println(e);
    	context.close();
    }
}
