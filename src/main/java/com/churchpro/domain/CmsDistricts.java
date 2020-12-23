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
@Table(name = "cms_districts", catalog = "")
public class CmsDistricts {
    private Integer id;
    private String districtName;
    private String description;

    @Basic
    @Column(name = "id", nullable = false)
    @Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "district_name", nullable = false, length = 45)
    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 100)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (districtName != null ? districtName.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CmsDistricts that = (CmsDistricts) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (districtName != null ? !districtName.equals(that.districtName) : that.districtName != null) return false;
        return description != null ? description.equals(that.description) : that.description == null;
    }
}
