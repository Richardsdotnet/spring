package contextDemo.repositories;

import contextDemo.Admin;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository

public class AdminRepository {
    public Optional<Admin> findByEmail(String email) {
        return Optional.empty();
    }
}
