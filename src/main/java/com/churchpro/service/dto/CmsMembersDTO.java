package com.churchpro.service.dto;

import com.churchpro.domain.CmsLocalChurch;
import com.churchpro.domain.CmsMemberDesignations;
import java.util.Collection;
import java.util.Date;

public class CmsMembersDTO {
    private String memNo;
    private String firstName;
    private String lastName;
    private Date memberSince;
    private String otherNames;
    private Date dob;
    private String password;
    private String email;
    private Boolean activated;
    private String imageUrl;
    private String langKey;
    private String resetKey;
    private Integer createdBy;
    private Date createdDate;
    private Date resetDate;
    private Integer lastModifiedBy;
    private Date lastModifiedDate;
    private Integer churchId;
    private Integer districtId;
    private Collection<CmsMemberDesignations> cmsMemberDesignationsById;
    private CmsLocalChurch cmsLocalChurchByChurchId;

    public CmsMembersDTO() {}

    public String getMemNo() {
        return this.memNo;
    }

    public void setMemNo(String memNo) {
        this.memNo = memNo;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getMemberSince() {
        return this.memberSince;
    }

    public void setMemberSince(Date memberSince) {
        this.memberSince = memberSince;
    }

    public String getOtherNames() {
        return this.otherNames;
    }

    public void setOtherNames(String otherNames) {
        this.otherNames = otherNames;
    }

    public Date getDob() {
        return this.dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getActivated() {
        return this.activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getLangKey() {
        return this.langKey;
    }

    public void setLangKey(String langKey) {
        this.langKey = langKey;
    }

    public String getResetKey() {
        return this.resetKey;
    }

    public void setResetKey(String resetKey) {
        this.resetKey = resetKey;
    }

    public Integer getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getResetDate() {
        return this.resetDate;
    }

    public void setResetDate(Date resetDate) {
        this.resetDate = resetDate;
    }

    public Integer getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    public void setLastModifiedBy(Integer lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Integer getChurchId() {
        return this.churchId;
    }

    public void setChurchId(Integer churchId) {
        this.churchId = churchId;
    }

    public Integer getDistrictId() {
        return this.districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public java.util.Collection<com.churchpro.domain.CmsMemberDesignations> getCmsMemberDesignationsById() {
        return this.cmsMemberDesignationsById;
    }

    public void setCmsMemberDesignationsById(java.util.Collection<com.churchpro.domain.CmsMemberDesignations> cmsMemberDesignationsById) {
        this.cmsMemberDesignationsById = cmsMemberDesignationsById;
    }

    public CmsLocalChurch getCmsLocalChurchByChurchId() {
        return this.cmsLocalChurchByChurchId;
    }

    public void setCmsLocalChurchByChurchId(CmsLocalChurch cmsLocalChurchByChurchId) {
        this.cmsLocalChurchByChurchId = cmsLocalChurchByChurchId;
    }
}
