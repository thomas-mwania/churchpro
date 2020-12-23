package com.churchpro.domain;

import java.util.Collection;
import javax.persistence.*;

/**
 * @author tom9b
 * @version 1.0.0
 * @Date 12/21/2020 Date file was Created
 * @package com.churchpro.domain
 * @project churchpro
 */
@Entity
@Table(name = "cms_local_church", catalog = "")
public class CmsLocalChurch {
    private Integer id;
    private String churchName;
    private String physicalAddress;
    private String postalAddress;
    private String telephoneNumber;
    private Integer parishId;
    private CmsParishes cmsParishesByParishId;
    private Collection<CmsMembers> cmsMembersById;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "church_name", nullable = false, length = 200)
    public String getChurchName() {
        return churchName;
    }

    public void setChurchName(String churchName) {
        this.churchName = churchName;
    }

    @Basic
    @Column(name = "physical_address", nullable = false, length = 200)
    public String getPhysicalAddress() {
        return physicalAddress;
    }

    public void setPhysicalAddress(String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }

    @Basic
    @Column(name = "postal_address", nullable = false, length = 100)
    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    @Basic
    @Column(name = "telephone_number", nullable = true, length = 100)
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Basic
    @Column(name = "parish_id", nullable = true)
    public Integer getParishId() {
        return parishId;
    }

    public void setParishId(Integer parishId) {
        this.parishId = parishId;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (churchName != null ? churchName.hashCode() : 0);
        result = 31 * result + (physicalAddress != null ? physicalAddress.hashCode() : 0);
        result = 31 * result + (postalAddress != null ? postalAddress.hashCode() : 0);
        result = 31 * result + (telephoneNumber != null ? telephoneNumber.hashCode() : 0);
        result = 31 * result + (parishId != null ? parishId.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CmsLocalChurch that = (CmsLocalChurch) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (churchName != null ? !churchName.equals(that.churchName) : that.churchName != null) return false;
        if (physicalAddress != null ? !physicalAddress.equals(that.physicalAddress) : that.physicalAddress != null) return false;
        if (postalAddress != null ? !postalAddress.equals(that.postalAddress) : that.postalAddress != null) return false;
        if (telephoneNumber != null ? !telephoneNumber.equals(that.telephoneNumber) : that.telephoneNumber != null) return false;
        return parishId != null ? parishId.equals(that.parishId) : that.parishId == null;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parish_id", referencedColumnName = "id", insertable = false, updatable = false)
    public CmsParishes getCmsParishesByParishId() {
        return cmsParishesByParishId;
    }

    public void setCmsParishesByParishId(CmsParishes cmsParishesByParishId) {
        this.cmsParishesByParishId = cmsParishesByParishId;
    }

    @OneToMany(mappedBy = "cmsLocalChurchByChurchId")
    public Collection<CmsMembers> getCmsMembersById() {
        return cmsMembersById;
    }

    public void setCmsMembersById(Collection<CmsMembers> cmsMembersById) {
        this.cmsMembersById = cmsMembersById;
    }
}
