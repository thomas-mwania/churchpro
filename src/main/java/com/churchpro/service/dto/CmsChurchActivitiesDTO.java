package com.churchpro.service.dto;

import java.util.Date;

public class CmsChurchActivitiesDTO {
    private String activityName;
    private String description;
    private Boolean notifyMembers;
    private Date startDate;
    private Date endDate;
    private Integer churchId;
    private Boolean sendEmailNotifications;
    private Boolean sendSmsNotifications;

    public CmsChurchActivitiesDTO() {}

    public String getActivityName() {
        return this.activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getNotifyMembers() {
        return this.notifyMembers;
    }

    public void setNotifyMembers(boolean notifyMembers) {
        this.notifyMembers = notifyMembers;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getChurchId() {
        return this.churchId;
    }

    public void setChurchId(Integer churchId) {
        this.churchId = churchId;
    }

    public boolean getSendEmailNotifications() {
        return this.sendEmailNotifications;
    }

    public void setSendEmailNotifications(boolean sendEmailNotifications) {
        this.sendEmailNotifications = sendEmailNotifications;
    }

    public boolean getSendSmsNotifications() {
        return this.sendSmsNotifications;
    }

    public void setSendSmsNotifications(boolean sendSmsNotifications) {
        this.sendSmsNotifications = sendSmsNotifications;
    }
}
