package com.example.userlogin.userlogin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("login")
public class LoginController {
    @Autowired

    LoginServer loginServer;
    @GetMapping("log")
    public List<LoginDetails> getAllDetails()
    {

        return loginServer.getAllDetails();
    }

    @PostMapping("add")

    public LoginDetails addDetails(@RequestBody LoginDetails login)
    {

        return loginServer.addDetails(login);
    }
    @PutMapping("update")
    public  LoginDetails updateDetails(@RequestBody LoginDetails login)
    {
        return  loginServer.updateDetail(login);
    }

    @PostMapping("check")
    public String checkDetail(@RequestBody LoginDetails login)
    {
        return  loginServer.checkDetails(login);
    }

    @PostMapping("Login")
    public ResponseEntity<LoginUserMobile> loginDetail(@RequestBody LoginDetails login)
    {

        return loginServer.loginDetail(login);

    }
//    @PostMapping("upload")
//    public String uploadImage(@RequestParam("file") MultipartFile file) {
//
//        return "Image uploaded successfully!";
//    }
//    @GetMapping("image")
//    public ResponseEntity<byte[]> getImage(@PathVariable("userId") Integer userId) {
//
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.IMAGE_JPEG);
//
//
//        return null;
//    }
//
//    // ...
}


