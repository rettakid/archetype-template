package za.co.rettakid.meds.services;

import za.co.rettakid.meds.common.dto.*;

public interface UserPermissionService    {

    UserPermissionListDto getUserPermissions();
    UserPermissionDto getUserPermissions(Long userPermissionId);

    PermissionListDto getPermissionsForUser(Long userId);

    UserPermissionDto postUserPermissions(UserPermissionDto userPermissionDto);
    void putUserPermissions(UserPermissionDto userPermissionDto);
    void deleteUserPermissions(Long userPermissionId);

}