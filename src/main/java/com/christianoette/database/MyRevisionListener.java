package com.christianoette.database;

import org.hibernate.Hibernate;
import org.hibernate.envers.RevisionListener;

public class MyRevisionListener implements RevisionListener {

    @Override
    public void newRevision(Object revisionEntity) {
        Revision revision = (Revision) Hibernate.unproxy(revisionEntity);
        revision.setUserName(getUserName());
    }

    private String getUserName() {
        return "system"; // example value
    }
}
