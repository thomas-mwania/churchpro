package com.churchpro.domain;

import java.util.Collection;
import java.util.Date;
import javax.persistence.*;

/**
 * @author tom9b
 * @version 1.0.0
 * @Date 12/21/2020 Date file was Created
 * @package com.churchpro.domain
 * @project churchpro
 */
@Entity
@Table(name = "cms_members", catalog = "")
public class CmsMembers {
    private Integer id;
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

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "mem_no", nullable = false, length = 45)
    public String getMemNo() {
        return memNo;
    }

    public void setMemNo(String memNo) {
        this.memNo = memNo;
    }

    @Basic
    @Column(name = "first_name", nullable = false, length = 45)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "last_name", nullable = false, length = 45)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "member_since", nullable = true)
    public Date getMemberSince() {
        return memberSince;
    }

    public void setMemberSince(Date memberSince) {
        this.memberSince = memberSince;
    }

    @Basic
    @Column(name = "other_names", nullable = true, length = 45)
    public String getOtherNames() {
        return otherNames;
    }

    public void setOtherNames(String otherNames) {
        this.otherNames = otherNames;
    }

    @Basic
    @Column(name = "dob", nullable = true)
    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Basic
    @Column(name = "password", nullable = true, length = 60)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 191)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "activated", nullable = true)
    public boolean getActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    @Basic
    @Column(name = "image_url", nullable = true, length = -1)
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Basic
    @Column(name = "lang_key", nullable = true, length = 60)
    public String getLangKey() {
        return langKey;
    }

    public void setLangKey(String langKey) {
        this.langKey = langKey;
    }

    @Basic
    @Column(name = "reset_key", nullable = true, length = 100)
    public String getResetKey() {
        return resetKey;
    }

    public void setResetKey(String resetKey) {
        this.resetKey = resetKey;
    }

    @Basic
    @Column(name = "created_by", nullable = true)
    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "created_date", nullable = true)
    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Basic
    @Column(name = "reset_date", nullable = true)
    public Date getResetDate() {
        return resetDate;
    }

    public void setResetDate(Date resetDate) {
        this.resetDate = resetDate;
    }

    @Basic
    @Column(name = "last_modified_by", nullable = true)
    public Integer getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(Integer lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    @Basic
    @Column(name = "last_modified_date", nullable = true)
    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @Basic
    @Column(name = "church_id", nullable = false)
    public Integer getChurchId() {
        return churchId;
    }

    public void setChurchId(Integer churchId) {
        this.churchId = churchId;
    }

    @Basic
    @Column(name = "district_id", nullable = true)
    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (memNo != null ? memNo.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (memberSince != null ? memberSince.hashCode() : 0);
        result = 31 * result + (otherNames != null ? otherNames.hashCode() : 0);
        result = 31 * result + (dob != null ? dob.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (activated != null ? activated.hashCode() : 0);
        result = 31 * result + (imageUrl != null ? imageUrl.hashCode() : 0);
        result = 31 * result + (langKey != null ? langKey.hashCode() : 0);
        result = 31 * result + (resetKey != null ? resetKey.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (resetDate != null ? resetDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (churchId != null ? churchId.hashCode() : 0);
        result = 31 * result + (districtId != null ? districtId.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CmsMembers that = (CmsMembers) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (memNo != null ? !memNo.equals(that.memNo) : that.memNo != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (memberSince != null ? !memberSince.equals(that.memberSince) : that.memberSince != null) return false;
        if (otherNames != null ? !otherNames.equals(that.otherNames) : that.otherNames != null) return false;
        if (dob != null ? !dob.equals(that.dob) : that.dob != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (activated != null ? !activated.equals(that.activated) : that.activated != null) return false;
        if (imageUrl != null ? !imageUrl.equals(that.imageUrl) : that.imageUrl != null) return false;
        if (langKey != null ? !langKey.equals(that.langKey) : that.langKey != null) return false;
        if (resetKey != null ? !resetKey.equals(that.resetKey) : that.resetKey != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (resetDate != null ? !resetDate.equals(that.resetDate) : that.resetDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(that.lastModifiedBy) : that.lastModifiedBy != null) return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(that.lastModifiedDate) : that.lastModifiedDate != null) return false;
        if (churchId != null ? !churchId.equals(that.churchId) : that.churchId != null) return false;
        return districtId != null ? districtId.equals(that.districtId) : that.districtId == null;
    }

    @OneToMany(mappedBy = "cmsMembersByMemId", fetch = FetchType.LAZY)
    public Collection<CmsMemberDesignations> getCmsMemberDesignationsById() {
        return cmsMemberDesignationsById;
    }

    public void setCmsMemberDesignationsById(Collection<CmsMemberDesignations> cmsMemberDesignationsById) {
        this.cmsMemberDesignationsById = cmsMemberDesignationsById;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "church_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public CmsLocalChurch getCmsLocalChurchByChurchId() {
        return cmsLocalChurchByChurchId;
    }

    public void setCmsLocalChurchByChurchId(CmsLocalChurch cmsLocalChurchByChurchId) {
        this.cmsLocalChurchByChurchId = cmsLocalChurchByChurchId;
    }
}
