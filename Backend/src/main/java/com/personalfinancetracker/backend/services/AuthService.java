package com.personalfinancetracker.backend.services;

import com.personalfinancetracker.backend.dto.SignupRequest;

public interface AuthService {

    boolean createCustomer(SignupRequest signupRequest);

}
