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
@Table(name = "cms_ministry_groups", catalog = "")
public class CmsMinistryGroups {
    private Integer id;
    private String ministryName;
    private Integer description;

    @Basic
    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ministry_name", nullable = false, length = 60)
    public String getMinistryName() {
        return ministryName;
    }

    public void setMinistryName(String ministryName) {
        this.ministryName = ministryName;
    }

    @Basic
    @Column(name = "description", nullable = true)
    public Integer getDescription() {
        return description;
    }

    public void setDescription(Integer description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (ministryName != null ? ministryName.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CmsMinistryGroups that = (CmsMinistryGroups) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (ministryName != null ? !ministryName.equals(that.ministryName) : that.ministryName != null) return false;
        return description != null ? description.equals(that.description) : that.description == null;
    }
}
