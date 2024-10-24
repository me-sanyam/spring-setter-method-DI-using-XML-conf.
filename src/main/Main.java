package main;

import com.secondsession.beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        String location = "resources/ApplicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(location);

        Employee empObj1 = (Employee) context.getBean("emp1");
        empObj1.display();

        Employee empObj2 = (Employee) context.getBean("emp2");
        empObj2.display();
    }
}