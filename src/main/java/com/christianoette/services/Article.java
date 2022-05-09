package com.christianoette.services;

public enum Article {
    TSHIRT("A nice shirt in XL"),
    JEANS("Blue jeans"),
    SHOE("Sneakers");

    private final String defaultDescription;

    Article(String defaultDescription) {
        this.defaultDescription = defaultDescription;
    }

    public String getDefaultDescription() {
        return defaultDescription;
    }
}
