package com.churchpro.service.dto;

public class CmsMinistryGroupsDTO {
    private String ministryName;
    private Integer description;

    public CmsMinistryGroupsDTO() {}

    public String getMinistryName() {
        return this.ministryName;
    }

    public void setMinistryName(String ministryName) {
        this.ministryName = ministryName;
    }

    public Integer getDescription() {
        return this.description;
    }

    public void setDescription(Integer description) {
        this.description = description;
    }
}
