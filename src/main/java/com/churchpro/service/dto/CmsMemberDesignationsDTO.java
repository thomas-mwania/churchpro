package com.churchpro.service.dto;

import com.churchpro.domain.CmsDesignations;
import com.churchpro.domain.CmsMembers;

public class CmsMemberDesignationsDTO {
    private Integer memId;
    private Integer desId;
    private CmsMembers cmsMembersByMemId;
    private CmsDesignations cmsDesignationsByDesId;

    public CmsMemberDesignationsDTO() {}

    public Integer getMemId() {
        return this.memId;
    }

    public void setMemId(Integer memId) {
        this.memId = memId;
    }

    public Integer getDesId() {
        return this.desId;
    }

    public void setDesId(Integer desId) {
        this.desId = desId;
    }

    public CmsMembers getCmsMembersByMemId() {
        return this.cmsMembersByMemId;
    }

    public void setCmsMembersByMemId(CmsMembers cmsMembersByMemId) {
        this.cmsMembersByMemId = cmsMembersByMemId;
    }

    public CmsDesignations getCmsDesignationsByDesId() {
        return this.cmsDesignationsByDesId;
    }

    public void setCmsDesignationsByDesId(CmsDesignations cmsDesignationsByDesId) {
        this.cmsDesignationsByDesId = cmsDesignationsByDesId;
    }
}
