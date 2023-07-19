package contextDemo;

import contextDemo.config.AppConfig;
import contextDemo.services.AdminService;
import contextDemo.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        System.out.println(userService);

        AdminService adminService = context.getBean(AdminService.class);
        System.out.println(adminService);
    }
}
