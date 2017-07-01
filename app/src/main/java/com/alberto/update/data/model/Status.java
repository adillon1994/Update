
package com.alberto.update.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Status {

    @SerializedName("ind")
    @Expose
    private String ind;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("inning_state")
    @Expose
    private String inningState;
    @SerializedName("note")
    @Expose
    private String note;

    public String getInd() {
        return ind;
    }

    public void setInd(String ind) {
        this.ind = ind;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInningState() {
        return inningState;
    }

    public void setInningState(String inningState) {
        this.inningState = inningState;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}
