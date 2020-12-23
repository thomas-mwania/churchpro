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
@Table(name = "cms_parishes", catalog = "")
public class CmsParishes {
    private Integer id;
    private String parishName;
    private String headquartersLocation;
    private Collection<CmsLocalChurch> cmsLocalChurchesById;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "parish_name", nullable = false, length = 100)
    public String getParishName() {
        return parishName;
    }

    public void setParishName(String parishName) {
        this.parishName = parishName;
    }

    @Basic
    @Column(name = "headquarters_location", nullable = true, length = 100)
    public String getHeadquartersLocation() {
        return headquartersLocation;
    }

    public void setHeadquartersLocation(String headquartersLocation) {
        this.headquartersLocation = headquartersLocation;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (parishName != null ? parishName.hashCode() : 0);
        result = 31 * result + (headquartersLocation != null ? headquartersLocation.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CmsParishes that = (CmsParishes) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (parishName != null ? !parishName.equals(that.parishName) : that.parishName != null) return false;
        return headquartersLocation != null ? headquartersLocation.equals(that.headquartersLocation) : that.headquartersLocation == null;
    }

    @OneToMany(mappedBy = "cmsParishesByParishId", fetch = FetchType.LAZY)
    public Collection<CmsLocalChurch> getCmsLocalChurchesById() {
        return cmsLocalChurchesById;
    }

    public void setCmsLocalChurchesById(Collection<CmsLocalChurch> cmsLocalChurchesById) {
        this.cmsLocalChurchesById = cmsLocalChurchesById;
    }
}
