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
@Table(name = "cms_designations", catalog = "")
public class CmsDesignations {
    private Integer id;
    private String desName;
    private String desDescription;
    private Collection<CmsMemberDesignations> cmsMemberDesignationsById;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "des_name", nullable = true, length = 30)
    public String getDesName() {
        return desName;
    }

    public void setDesName(String desName) {
        this.desName = desName;
    }

    @Basic
    @Column(name = "des_description", nullable = true, length = 100)
    public String getDesDescription() {
        return desDescription;
    }

    public void setDesDescription(String desDescription) {
        this.desDescription = desDescription;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (desName != null ? desName.hashCode() : 0);
        result = 31 * result + (desDescription != null ? desDescription.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CmsDesignations that = (CmsDesignations) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (desName != null ? !desName.equals(that.desName) : that.desName != null) return false;
        return desDescription != null ? desDescription.equals(that.desDescription) : that.desDescription == null;
    }

    @OneToMany(mappedBy = "cmsDesignationsByDesId", fetch = FetchType.LAZY)
    public Collection<CmsMemberDesignations> getCmsMemberDesignationsById() {
        return cmsMemberDesignationsById;
    }

    public void setCmsMemberDesignationsById(Collection<CmsMemberDesignations> cmsMemberDesignationsById) {
        this.cmsMemberDesignationsById = cmsMemberDesignationsById;
    }
}
