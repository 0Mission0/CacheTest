package idv.mission.example.CacheTest.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-cache.xml");

        AccountService service = (AccountService) context.getBean("accountServiceBean");
        Account account1 = service.getFromCache("Mission");
        Account account2 = service.getFromCache("Mission");
        System.out.println("account1 = " + account1);
        System.out.println("account2 = " + account2);

        Account account3 = service.getFromDB("Mission");
        System.out.println("account3 = " + account3);

        // System.out.println("Before refresh the cache起");
        // System.out.println("After refresh the cache起");
    }
}
