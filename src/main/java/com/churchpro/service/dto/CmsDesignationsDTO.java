package com.churchpro.service.dto;

import com.churchpro.domain.CmsMemberDesignations;
import java.util.Collection;

public class CmsDesignationsDTO {
    private String desName;
    private String desDescription;
    private Collection<CmsMemberDesignations> cmsMemberDesignationsById;

    public CmsDesignationsDTO() {}

    public String getDesName() {
        return this.desName;
    }

    public void setDesName(String desName) {
        this.desName = desName;
    }

    public String getDesDescription() {
        return this.desDescription;
    }

    public void setDesDescription(String desDescription) {
        this.desDescription = desDescription;
    }

    public java.util.Collection<com.churchpro.domain.CmsMemberDesignations> getCmsMemberDesignationsById() {
        return this.cmsMemberDesignationsById;
    }

    public void setCmsMemberDesignationsById(java.util.Collection<com.churchpro.domain.CmsMemberDesignations> cmsMemberDesignationsById) {
        this.cmsMemberDesignationsById = cmsMemberDesignationsById;
    }
}
