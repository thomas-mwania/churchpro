package com.churchpro.domain;

import javax.persistence.*;

/**
 * @author tom9b
 * @version 1.0.0
 * @Date 12/21/2020 Date file was Created
 * @package com.churchpro.domain
 * @project churchpro
 */
@Entity
@Table(name = "cms_member_designations", catalog = "")
@IdClass(CmsMemberDesignationsPK.class)
public class CmsMemberDesignations {
    private Integer memId;
    private Integer desId;
    private CmsMembers cmsMembersByMemId;
    private CmsDesignations cmsDesignationsByDesId;

    @Id
    @Column(name = "mem_id", nullable = false)
    public Integer getMemId() {
        return memId;
    }

    public void setMemId(Integer memId) {
        this.memId = memId;
    }

    @Id
    @Column(name = "des_id", nullable = false)
    public Integer getDesId() {
        return desId;
    }

    public void setDesId(Integer desId) {
        this.desId = desId;
    }

    @Override
    public int hashCode() {
        int result = memId != null ? memId.hashCode() : 0;
        result = 31 * result + (desId != null ? desId.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CmsMemberDesignations that = (CmsMemberDesignations) o;

        if (memId != null ? !memId.equals(that.memId) : that.memId != null) return false;
        return desId != null ? desId.equals(that.desId) : that.desId == null;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mem_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public CmsMembers getCmsMembersByMemId() {
        return cmsMembersByMemId;
    }

    public void setCmsMembersByMemId(CmsMembers cmsMembersByMemId) {
        this.cmsMembersByMemId = cmsMembersByMemId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "des_id", referencedColumnName = "id", nullable = false, updatable = false, insertable = false)
    public CmsDesignations getCmsDesignationsByDesId() {
        return cmsDesignationsByDesId;
    }

    public void setCmsDesignationsByDesId(CmsDesignations cmsDesignationsByDesId) {
        this.cmsDesignationsByDesId = cmsDesignationsByDesId;
    }
}
