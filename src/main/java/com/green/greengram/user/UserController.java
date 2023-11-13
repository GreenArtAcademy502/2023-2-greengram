package com.green.greengram.user;

import com.green.greengram.ResVo;
import com.green.greengram.user.model.UserInsDto;
import com.green.greengram.user.model.UserSigninDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    private final UserService service;

    @PostMapping
    public ResVo insUser(@RequestBody UserInsDto dto) {
        ResVo rv = service.insUser(dto);
        return rv;
    }

    @PostMapping("/signin")
    public ResVo login(@RequestBody UserSigninDto dto) {
        return service.signin(dto);
    }
}
