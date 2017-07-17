package com.birjot.news;

/**
 * Created by birjot on 12/7/17.
 */

public class countryobject {

    int icon;
    String name;

    public countryobject(){}

    public countryobject(int icon, String name) {
        this.icon = icon;
        this.name = name;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
