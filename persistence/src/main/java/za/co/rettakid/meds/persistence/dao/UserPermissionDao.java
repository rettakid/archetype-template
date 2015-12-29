package za.co.rettakid.meds.persistence.dao;

import java.util.List;
import za.co.rettakid.meds.persistence.entity.*;

public interface UserPermissionDao extends BaseDao<UserPermissionEntity,Long>    {

    List<PermissionEntity> getPermissionsForUser(UserEntity userEntity);
}