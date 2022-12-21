package com.service;
import com.example.*;
import com.model.*;
import com.security.*;
import com.service.*;
import com.web.*;
import com.web.dto.*;

import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserService extends UserDetailsService{
 User save(UserRegistrationDto registrationDto);
}