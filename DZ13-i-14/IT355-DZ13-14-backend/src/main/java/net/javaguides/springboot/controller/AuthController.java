package net.javaguides.springboot.controller;

import net.javaguides.springboot.model.Admin;
import net.javaguides.springboot.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class AuthController {

    @Autowired
    private AdminRepository adminRepository;

    @PostMapping("/login")
    public ResponseEntity<Admin> login(@RequestBody Admin admin) {
        Admin foundAdmin = adminRepository.findByEmailAndPassword(admin.getEmail(), admin.getPassword());
        if (foundAdmin != null) {
            return ResponseEntity.ok(foundAdmin);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }
}
