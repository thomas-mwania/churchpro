package com.churchpro.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Id;

/**
 * @author tom9b
 * @version 1.0.0
 * @Date 12/21/2020 Date file was Created
 * @package com.churchpro.domain
 * @project churchpro
 */
public class CmsMemberDesignationsPK implements Serializable {
    private Integer memId;
    private Integer desId;

    @Column(name = "mem_id", nullable = false)
    @Id
    public Integer getMemId() {
        return memId;
    }

    public void setMemId(Integer memId) {
        this.memId = memId;
    }

    @Column(name = "des_id", nullable = false)
    @Id
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

        CmsMemberDesignationsPK that = (CmsMemberDesignationsPK) o;

        if (memId != null ? !memId.equals(that.memId) : that.memId != null) return false;
        return desId != null ? desId.equals(that.desId) : that.desId == null;
    }
}
