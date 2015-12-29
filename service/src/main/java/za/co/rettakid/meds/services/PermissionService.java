package za.co.rettakid.meds.services;

import za.co.rettakid.meds.common.dto.*;

public interface PermissionService    {

    PermissionListDto getPermissions();
    PermissionDto getPermissions(Long permissionId);
    PermissionDto postPermissions(PermissionDto permissionDto);
    void putPermissions(PermissionDto permissionDto);
    void deletePermissions(Long permissionId);

}