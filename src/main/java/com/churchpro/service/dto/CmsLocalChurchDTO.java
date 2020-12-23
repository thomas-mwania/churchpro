package com.churchpro.service.dto;

import com.churchpro.domain.CmsMembers;
import com.churchpro.domain.CmsParishes;
import java.util.Collection;

public class CmsLocalChurchDTO {
    private String churchName;
    private String physicalAddress;
    private String postalAddress;
    private String telephoneNumber;
    private Integer parishId;
    private CmsParishes cmsParishesByParishId;
    private Collection<CmsMembers> cmsMembersById;

    public CmsLocalChurchDTO() {}

    public String getChurchName() {
        return this.churchName;
    }

    public void setChurchName(String churchName) {
        this.churchName = churchName;
    }

    public String getPhysicalAddress() {
        return this.physicalAddress;
    }

    public void setPhysicalAddress(String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }

    public String getPostalAddress() {
        return this.postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public String getTelephoneNumber() {
        return this.telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public Integer getParishId() {
        return this.parishId;
    }

    public void setParishId(Integer parishId) {
        this.parishId = parishId;
    }

    public CmsParishes getCmsParishesByParishId() {
        return this.cmsParishesByParishId;
    }

    public void setCmsParishesByParishId(CmsParishes cmsParishesByParishId) {
        this.cmsParishesByParishId = cmsParishesByParishId;
    }

    public java.util.Collection<com.churchpro.domain.CmsMembers> getCmsMembersById() {
        return this.cmsMembersById;
    }

    public void setCmsMembersById(java.util.Collection<com.churchpro.domain.CmsMembers> cmsMembersById) {
        this.cmsMembersById = cmsMembersById;
    }
}
