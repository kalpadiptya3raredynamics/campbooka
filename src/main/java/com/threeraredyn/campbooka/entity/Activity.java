package com.threeraredyn.campbooka.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="activity")
public class Activity {
   @Id
    private int id;
    private String activityName;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getActivityName() {
        return activityName;
    }
    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }
}
