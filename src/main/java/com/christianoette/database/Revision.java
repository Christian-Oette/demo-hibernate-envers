package com.christianoette.database;

import org.hibernate.envers.DefaultRevisionEntity;
import org.hibernate.envers.RevisionEntity;

import javax.persistence.Entity;

// inspired by https://thorben-janssen.com/hibernate-envers-extend-standard-revision/
@Entity
@RevisionEntity(MyRevisionListener.class)
public class Revision extends DefaultRevisionEntity {

    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
