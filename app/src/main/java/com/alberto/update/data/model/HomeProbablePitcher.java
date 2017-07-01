
package com.alberto.update.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HomeProbablePitcher {

    @SerializedName("last")
    @Expose
    private String last;
    @SerializedName("stats_type")
    @Expose
    private String statsType;
    @SerializedName("name_display_roster")
    @Expose
    private String nameDisplayRoster;
    @SerializedName("number")
    @Expose
    private String number;
    @SerializedName("era")
    @Expose
    private String era;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("throwinghand")
    @Expose
    private String throwinghand;
    @SerializedName("s_losses")
    @Expose
    private String sLosses;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("s_era")
    @Expose
    private String sEra;
    @SerializedName("stats_season")
    @Expose
    private String statsSeason;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("losses")
    @Expose
    private String losses;
    @SerializedName("first")
    @Expose
    private String first;
    @SerializedName("s_wins")
    @Expose
    private String sWins;
    @SerializedName("wins")
    @Expose
    private String wins;

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getStatsType() {
        return statsType;
    }

    public void setStatsType(String statsType) {
        this.statsType = statsType;
    }

    public String getNameDisplayRoster() {
        return nameDisplayRoster;
    }

    public void setNameDisplayRoster(String nameDisplayRoster) {
        this.nameDisplayRoster = nameDisplayRoster;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEra() {
        return era;
    }

    public void setEra(String era) {
        this.era = era;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getThrowinghand() {
        return throwinghand;
    }

    public void setThrowinghand(String throwinghand) {
        this.throwinghand = throwinghand;
    }

    public String getSLosses() {
        return sLosses;
    }

    public void setSLosses(String sLosses) {
        this.sLosses = sLosses;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSEra() {
        return sEra;
    }

    public void setSEra(String sEra) {
        this.sEra = sEra;
    }

    public String getStatsSeason() {
        return statsSeason;
    }

    public void setStatsSeason(String statsSeason) {
        this.statsSeason = statsSeason;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLosses() {
        return losses;
    }

    public void setLosses(String losses) {
        this.losses = losses;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSWins() {
        return sWins;
    }

    public void setSWins(String sWins) {
        this.sWins = sWins;
    }

    public String getWins() {
        return wins;
    }

    public void setWins(String wins) {
        this.wins = wins;
    }

}
