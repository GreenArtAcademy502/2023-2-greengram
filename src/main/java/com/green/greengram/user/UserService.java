package com.green.greengram.user;

import com.green.greengram.ResVo;
import com.green.greengram.user.model.UserInsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper mapper;
    //
    public ResVo insUser(UserInsDto udto){
        int result = mapper.insUser(udto);
        return new ResVo(result);
    }
}
