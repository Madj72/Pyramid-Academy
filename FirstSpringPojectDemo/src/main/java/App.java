import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext();
        Student obj = (Student) applicationContext.getBean("Phone");
        Student obja = (Student)applicationContext.getBean("Addesse");


    }
}
