package com.churchpro.domain;

import java.util.Date;
import java.util.Objects;
import javax.persistence.*;

/**
 * @author tom9b
 * @version 1.0.0
 * @Date 12/21/2020 Date file was Created
 * @package com.churchpro.domain
 * @project churchpro
 */
@Entity
@Table(name = "cms_church_activities", catalog = "")
public class CmsChurchActivities {
    private Integer id;
    private String activityName;
    private String description;
    private Boolean notifyMembers;
    private Date startDate;
    private Date endDate;
    private Integer churchId;
    private Boolean sendEmailNotifications;
    private Boolean sendSmsNotifications;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "activity_name", nullable = false, length = 100)
    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 200)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "notify_members", nullable = true)
    public boolean getNotifyMembers() {
        return notifyMembers;
    }

    public void setNotifyMembers(boolean notifyMembers) {
        this.notifyMembers = notifyMembers;
    }

    @Basic
    @Column(name = "start_date", nullable = false)
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "end_date", nullable = true)
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "church_id", nullable = false)
    public Integer getChurchId() {
        return churchId;
    }

    public void setChurchId(Integer churchId) {
        this.churchId = churchId;
    }

    @Basic
    @Column(name = "send_email_notifications", nullable = true)
    public boolean getSendEmailNotifications() {
        return sendEmailNotifications;
    }

    public void setSendEmailNotifications(boolean sendEmailNotifications) {
        this.sendEmailNotifications = sendEmailNotifications;
    }

    @Basic
    @Column(name = "send_sms_notifications", nullable = true)
    public boolean getSendSmsNotifications() {
        return sendSmsNotifications;
    }

    public void setSendSmsNotifications(boolean sendSmsNotifications) {
        this.sendSmsNotifications = sendSmsNotifications;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CmsChurchActivities that = (CmsChurchActivities) o;

        if (!Objects.equals(id, that.id)) return false;
        if (!Objects.equals(activityName, that.activityName)) return false;
        if (!Objects.equals(description, that.description)) return false;
        if (!Objects.equals(notifyMembers, that.notifyMembers)) return false;
        if (!Objects.equals(startDate, that.startDate)) return false;
        if (!Objects.equals(endDate, that.endDate)) return false;
        if (!Objects.equals(churchId, that.churchId)) return false;
        if (!Objects.equals(sendEmailNotifications, that.sendEmailNotifications)) return false;
        return Objects.equals(sendSmsNotifications, that.sendSmsNotifications);
    }
}
