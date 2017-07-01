
package com.alberto.update.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Media {

    @SerializedName("free")
    @Expose
    private String free;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;
    @SerializedName("media_state")
    @Expose
    private String mediaState;
    @SerializedName("start")
    @Expose
    private String start;
    @SerializedName("has_mlbtv")
    @Expose
    private String hasMlbtv;
    @SerializedName("calendar_event_id")
    @Expose
    private String calendarEventId;
    @SerializedName("enhanced")
    @Expose
    private String enhanced;
    @SerializedName("type")
    @Expose
    private String type;

    public String getFree() {
        return free;
    }

    public void setFree(String free) {
        this.free = free;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getMediaState() {
        return mediaState;
    }

    public void setMediaState(String mediaState) {
        this.mediaState = mediaState;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getHasMlbtv() {
        return hasMlbtv;
    }

    public void setHasMlbtv(String hasMlbtv) {
        this.hasMlbtv = hasMlbtv;
    }

    public String getCalendarEventId() {
        return calendarEventId;
    }

    public void setCalendarEventId(String calendarEventId) {
        this.calendarEventId = calendarEventId;
    }

    public String getEnhanced() {
        return enhanced;
    }

    public void setEnhanced(String enhanced) {
        this.enhanced = enhanced;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
