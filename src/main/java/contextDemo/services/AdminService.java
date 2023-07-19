package contextDemo.services;

import contextDemo.Admin;
import contextDemo.repositories.AdminRepository;

import java.util.Optional;

public class AdminService {
    private AdminRepository adminRepository;


    public AdminService(AdminRepository adminRepository){
        System.out.println(adminRepository);
        this.adminRepository = adminRepository;
    }

    public Admin getAdminByEmail(String email){
        Optional<Admin> foundAdmin = adminRepository.findByEmail(email);

        Admin admin = foundAdmin.orElseThrow(() -> new IllegalStateException());
        return admin;
    }

}
