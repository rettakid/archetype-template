package za.co.rettakid.meds.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.util.List;

import za.co.rettakid.meds.common.error.MedsError;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(method = RequestMethod.POST)
    public UserDto postLogin(@RequestBody LoginDto loginDto) {
        return loginService.login(loginDto);
    }

}