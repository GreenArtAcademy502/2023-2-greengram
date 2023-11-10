package com.green.greengram.user;

import com.green.greengram.ResVo;
import com.green.greengram.user.model.UserInsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {
    private final UserService service;

    @PostMapping
    public ResVo insUser(@RequestBody UserInsDto dto) {
        return service.insUser(dto);
    }
}
