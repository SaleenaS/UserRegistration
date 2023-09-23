package com.example.userlogin.userlogin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class LoginServer {
    @Autowired
    LoginDao loginDao;


    public List<LoginDetails> getAllDetails() {
        return loginDao.findAll();
    }

    public LoginDetails addDetails(LoginDetails login) {
        return loginDao.save(login);
    }


    public LoginDetails updateDetail(LoginDetails login) {
        LoginDetails updateLogin = loginDao.findById(login.getId()).orElse(null);
        if (updateLogin != null) {
            updateLogin.setId((login.getId()));
            updateLogin.setUsername(login.getUsername());
            updateLogin.setEmail(login.getEmail());
            updateLogin.setMobileNumber(login.getMobileNumber());
            updateLogin.setPassword(login.getPassword());
            loginDao.save(updateLogin);
            return login;
        }
        return null;
    }


    public String checkDetails(LoginDetails login) throws UserNotFoundException
    {
        Optional<LoginDetails> opLogin = loginDao.findByEmail(login.getEmail());
        if (opLogin.isPresent()) {
            LoginDetails dbLogin = opLogin.get();
            if (login.getPassword().equals(dbLogin.getPassword()))

                return "Authenticated login";
            else

                return "incorrect password";
        }
            throw new UserNotFoundException("No user is not found");


    }

    public ResponseEntity<LoginUserMobile> loginDetail(LoginDetails login) throws UserNotFoundException
    {
        Optional<LoginDetails> opDetails=loginDao.findByEmail(login.getEmail());
        if(opDetails.isPresent())
        {
            LoginDetails dbDetails = opDetails.get();
            LoginUserMobile response = new LoginUserMobile();
            if (login.getPassword().equals(dbDetails.getPassword()))
            {

                response.setUsername(dbDetails.getUsername());
                response.setMobileNumber(dbDetails.getMobileNumber());
                return ResponseEntity.ok().body(response);
            }
            else
            {
                  throw new UserNotFoundException("Incorrect password");
            }
        }

            throw   new UserNotFoundException("no user found");



        }
//    public LoginDetails uploadImage(Integer userId, MultipartFile file) throws IOException {
//        Optional<LoginDetails> opLogin = loginDao.findById(userId);
//        if (opLogin.isPresent()) {
//            LoginDetails loginDetails = opLogin.get();
//            loginDetails.setProfileImage(file.getBytes());
//            return loginDao.save(loginDetails);
//        } else {
//            throw new UserNotFoundException("User not found");
//        }
}











