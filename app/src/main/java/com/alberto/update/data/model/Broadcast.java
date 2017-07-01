
package com.alberto.update.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Broadcast {

    @SerializedName("away")
    @Expose
    private Away away;
    @SerializedName("home")
    @Expose
    private Home home;

    public Away getAway() {
        return away;
    }

    public void setAway(Away away) {
        this.away = away;
    }

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }

}
