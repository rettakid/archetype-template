package za.co.rettakid.meds.persistence.dao.impl;

import org.springframework.stereotype.Service;
import za.co.rettakid.meds.persistence.dao.*;
import za.co.rettakid.meds.persistence.entity.*;

@Service
public class PermissionDaoImpl extends BaseDaoImpl<PermissionEntity,Long> implements PermissionDao   {

    public Class getEntityClass() {
        return PermissionEntity.class;
    }

}