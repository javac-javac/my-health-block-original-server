package com.example.myhealthblock.doctor;

import com.example.myhealthblock.doctor.dto.DoctorSignUpDTO;
import com.example.myhealthblock.user.dto.UserSignUpDTO;
import com.example.myhealthblock.user.UserService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class DoctorService {
    private final DoctorAdapter outport;
    private final UserService userInport;

    public String signUp(DoctorSignUpDTO dto) {
        UserSignUpDTO user = new UserSignUpDTO();
        user.setId(dto.getId());
        user.setPw(dto.getPw());
        user.setRole(dto.getRole());
        System.out.println(123);
        userInport.signUp(user);
        System.out.println(123);
        boolean result = outport.create(dto.getId(), dto.getName(), dto.getField(), dto.getHospital(), dto.getIntroduction());
        System.out.println(123);
        return result ? "success" : "fail";
    }
}