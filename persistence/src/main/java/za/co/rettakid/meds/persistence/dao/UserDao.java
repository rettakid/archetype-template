package za.co.rettakid.meds.persistence.dao;

import java.util.List;
import za.co.rettakid.meds.persistence.entity.*;

public interface UserDao extends BaseDao<UserEntity,Long>    {

    UserEntity getUser(String email);

    UserEntity getUser(String email, String password);

    List<UserEntity> getMatches(UserEntity userEntity);
}