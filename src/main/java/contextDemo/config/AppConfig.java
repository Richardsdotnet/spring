package contextDemo.config;

import contextDemo.repositories.AdminRepository;
import contextDemo.repositories.UserRepository;
import contextDemo.services.AdminService;
import contextDemo.services.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public UserService userService(){
        UserService userService = new UserService();
        System.out.println("UserService created" + userService);
        return userService;
    }

    @Bean
    public AdminRepository adminRepository(){
        AdminRepository adminRepository = new AdminRepository();
        System.out.println("AdminRepository created::" + adminRepository);
        return adminRepository;
    }

    @Bean
     public AdminService adminService(AdminRepository adminRepository){
        AdminService adminService = new AdminService(adminRepository);
        System.out.println("AdminService created::" + adminService);
        return adminService;
    }
}
