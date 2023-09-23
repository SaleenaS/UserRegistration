package com.example.userlogin.userlogin;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="login")
public class LoginDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "name")
    private String username;
    @Column(name="Email_ID")
    private String email;
    @Column(name = "Mobile_number")
    private long mobileNumber;
    @Column(name ="Password")
    private String password;
//    @Lob
//    @Column(name = "profile_image", columnDefinition = "BLOB")
//    private byte[] profileImage;
}
