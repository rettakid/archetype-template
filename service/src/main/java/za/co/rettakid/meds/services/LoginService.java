package za.co.rettakid.meds.services;

import org.springframework.transaction.annotation.Transactional;
import za.co.rettakid.meds.common.dto.LoginDto;
import za.co.rettakid.meds.common.dto.UserDto;
import za.co.rettakid.meds.common.enums.PermissionSet;
import za.co.rettakid.meds.common.error.MedsErrorException;

/**
 * Created by Lwazi Prusent on 2015/10/31.
 */
public interface LoginService {
    UserDto login(LoginDto loginDto);

    @Transactional
    void resister(UserDto userDto,PermissionSet permissionSet) throws MedsErrorException;
}
