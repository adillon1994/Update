
package com.alberto.update.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Links {

    @SerializedName("wrapup")
    @Expose
    private String wrapup;
    @SerializedName("preview")
    @Expose
    private String preview;
    @SerializedName("home_preview")
    @Expose
    private String homePreview;
    @SerializedName("away_preview")
    @Expose
    private String awayPreview;
    @SerializedName("tv_station")
    @Expose
    private String tvStation;

    public String getWrapup() {
        return wrapup;
    }

    public void setWrapup(String wrapup) {
        this.wrapup = wrapup;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public String getHomePreview() {
        return homePreview;
    }

    public void setHomePreview(String homePreview) {
        this.homePreview = homePreview;
    }

    public String getAwayPreview() {
        return awayPreview;
    }

    public void setAwayPreview(String awayPreview) {
        this.awayPreview = awayPreview;
    }

    public String getTvStation() {
        return tvStation;
    }

    public void setTvStation(String tvStation) {
        this.tvStation = tvStation;
    }

}
