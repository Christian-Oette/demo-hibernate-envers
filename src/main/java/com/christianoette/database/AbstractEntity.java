package com.christianoette.database;

import javax.persistence.Version;

public abstract class AbstractEntity {

    @Version
    private Short version;

    public Short getVersion() {
        return version;
    }
}
