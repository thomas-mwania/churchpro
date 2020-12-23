package com.churchpro.service.dto;

import com.churchpro.domain.CmsLocalChurch;
import java.util.Collection;

public class CmsParishesDTO {
    private String parishName;
    private String headquartersLocation;
    private Collection<CmsLocalChurch> cmsLocalChurchesById;

    public CmsParishesDTO() {}

    public String getParishName() {
        return this.parishName;
    }

    public void setParishName(String parishName) {
        this.parishName = parishName;
    }

    public String getHeadquartersLocation() {
        return this.headquartersLocation;
    }

    public void setHeadquartersLocation(String headquartersLocation) {
        this.headquartersLocation = headquartersLocation;
    }

    public java.util.Collection<com.churchpro.domain.CmsLocalChurch> getCmsLocalChurchesById() {
        return this.cmsLocalChurchesById;
    }

    public void setCmsLocalChurchesById(java.util.Collection<com.churchpro.domain.CmsLocalChurch> cmsLocalChurchesById) {
        this.cmsLocalChurchesById = cmsLocalChurchesById;
    }
}
