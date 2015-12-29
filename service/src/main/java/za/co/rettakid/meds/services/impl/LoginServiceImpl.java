package za.co.rettakid.meds.services.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import za.co.rettakid.meds.common.dto.LoginDto;
import za.co.rettakid.meds.common.dto.UserDto;
import za.co.rettakid.meds.common.Utilz;
import za.co.rettakid.meds.common.enums.PermissionEnum;
import za.co.rettakid.meds.common.enums.PermissionSet;
import za.co.rettakid.meds.common.error.MedsError;
import za.co.rettakid.meds.common.error.MedsErrorException;
import za.co.rettakid.meds.persistence.dao.PermissionDao;
import za.co.rettakid.meds.persistence.dao.UserDao;
import za.co.rettakid.meds.persistence.dao.UserPermissionDao;
import za.co.rettakid.meds.persistence.entity.UserEntity;
import za.co.rettakid.meds.persistence.entity.UserPermissionEntity;
import za.co.rettakid.meds.services.LoginService;
import za.co.rettakid.meds.services.binding.BindUser;

/**
 * Created by Lwazi Prusent on 2015/10/31.
 */
@Service
public class LoginServiceImpl implements LoginService {

    private static final Logger LOGGER = Logger.getLogger(LoginServiceImpl.class);

    @Autowired
    private UserDao userDao;
    @Autowired
    private UserPermissionDao userPermissionDao;
    @Autowired
    private PermissionDao permissionDao;

    @Override
    public UserDto login(LoginDto loginDto) {
        LOGGER.info("login user");
        UserEntity userEntity = userDao.getUser(loginDto.getEmail(), Utilz.CRYPT(loginDto.getPassword()));
        return BindUser.bindUser(userEntity);
    }

    @Transactional
    @Override
    public void resister(UserDto userDto,PermissionSet permissionSet) throws MedsErrorException{
        LOGGER.info("register user");
        if (userDao.getUser(userDto.getEmail()) != null)    {
            throw new MedsErrorException(MedsError.USER_ALREADY_EXIST);
        } else  {
            UserEntity userEntity = BindUser.bindUser(userDto);
            userEntity.setPassword(Utilz.CRYPT(userDto.getPassword()));
            userEntity.setUserAllowPush(true);
            userDao.createOrUpdate(userEntity);
        }

        UserEntity userEntity = userDao.getUser(userDto.getEmail());

        for (PermissionEnum permissionEnum : permissionSet.getPermission()) {
            UserPermissionEntity userPermissionEntity = new UserPermissionEntity();
            userPermissionEntity.setPermission(permissionDao.read(permissionEnum.getId()));
            userPermissionEntity.setUser(userEntity);
            userPermissionDao.createOrUpdate(userPermissionEntity);
        }
    }

}
