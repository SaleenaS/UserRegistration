package com.example.userlogin.userlogin;

import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoginDao extends JpaRepository<LoginDetails,Integer>
{





 Optional<LoginDetails> findByEmail(String email);
}
