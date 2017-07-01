
package com.alberto.update.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Game {

    @SerializedName("game_type")
    @Expose
    private String gameType;
    @SerializedName("double_header_sw")
    @Expose
    private String doubleHeaderSw;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("away_time")
    @Expose
    private String awayTime;
    @SerializedName("broadcast")
    @Expose
    private Broadcast broadcast;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("home_time")
    @Expose
    private String homeTime;
    @SerializedName("home_team_name")
    @Expose
    private String homeTeamName;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("original_date")
    @Expose
    private String originalDate;
    @SerializedName("home_team_city")
    @Expose
    private String homeTeamCity;
    @SerializedName("venue_id")
    @Expose
    private String venueId;
    @SerializedName("gameday_sw")
    @Expose
    private String gamedaySw;
    @SerializedName("away_win")
    @Expose
    private String awayWin;
    @SerializedName("home_games_back_wildcard")
    @Expose
    private String homeGamesBackWildcard;
    @SerializedName("away_probable_pitcher")
    @Expose
    private AwayProbablePitcher awayProbablePitcher;
    @SerializedName("away_team_id")
    @Expose
    private String awayTeamId;
    @SerializedName("tz_hm_lg_gen")
    @Expose
    private String tzHmLgGen;
    @SerializedName("status")
    @Expose
    private Status status;
    @SerializedName("home_loss")
    @Expose
    private String homeLoss;
    @SerializedName("home_games_back")
    @Expose
    private String homeGamesBack;
    @SerializedName("home_code")
    @Expose
    private String homeCode;
    @SerializedName("away_sport_code")
    @Expose
    private String awaySportCode;
    @SerializedName("home_win")
    @Expose
    private String homeWin;
    @SerializedName("time_hm_lg")
    @Expose
    private String timeHmLg;
    @SerializedName("away_name_abbrev")
    @Expose
    private String awayNameAbbrev;
    @SerializedName("league")
    @Expose
    private String league;
    @SerializedName("time_zone_aw_lg")
    @Expose
    private String timeZoneAwLg;
    @SerializedName("away_games_back")
    @Expose
    private String awayGamesBack;
    @SerializedName("home_file_code")
    @Expose
    private String homeFileCode;
    @SerializedName("game_data_directory")
    @Expose
    private String gameDataDirectory;
    @SerializedName("time_zone")
    @Expose
    private String timeZone;
    @SerializedName("away_league_id")
    @Expose
    private String awayLeagueId;
    @SerializedName("home_team_id")
    @Expose
    private String homeTeamId;
    @SerializedName("day")
    @Expose
    private String day;
    @SerializedName("time_aw_lg")
    @Expose
    private String timeAwLg;
    @SerializedName("away_team_city")
    @Expose
    private String awayTeamCity;
    @SerializedName("tbd_flag")
    @Expose
    private String tbdFlag;
    @SerializedName("tz_aw_lg_gen")
    @Expose
    private String tzAwLgGen;
    @SerializedName("away_code")
    @Expose
    private String awayCode;
    @SerializedName("game_media")
    @Expose
    private GameMedia gameMedia;
    @SerializedName("game_nbr")
    @Expose
    private String gameNbr;
    @SerializedName("time_date_aw_lg")
    @Expose
    private String timeDateAwLg;
    @SerializedName("away_games_back_wildcard")
    @Expose
    private String awayGamesBackWildcard;
    @SerializedName("scheduled_innings")
    @Expose
    private String scheduledInnings;
    @SerializedName("venue_w_chan_loc")
    @Expose
    private String venueWChanLoc;
    @SerializedName("first_pitch_et")
    @Expose
    private String firstPitchEt;
    @SerializedName("away_team_name")
    @Expose
    private String awayTeamName;
    @SerializedName("time_date_hm_lg")
    @Expose
    private String timeDateHmLg;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("home_name_abbrev")
    @Expose
    private String homeNameAbbrev;
    @SerializedName("tiebreaker_sw")
    @Expose
    private String tiebreakerSw;
    @SerializedName("ampm")
    @Expose
    private String ampm;
    @SerializedName("home_division")
    @Expose
    private String homeDivision;
    @SerializedName("home_time_zone")
    @Expose
    private String homeTimeZone;
    @SerializedName("away_time_zone")
    @Expose
    private String awayTimeZone;
    @SerializedName("hm_lg_ampm")
    @Expose
    private String hmLgAmpm;
    @SerializedName("home_sport_code")
    @Expose
    private String homeSportCode;
    @SerializedName("time_date")
    @Expose
    private String timeDate;
    @SerializedName("links")
    @Expose
    private Links links;
    @SerializedName("home_ampm")
    @Expose
    private String homeAmpm;
    @SerializedName("game_pk")
    @Expose
    private String gamePk;
    @SerializedName("venue")
    @Expose
    private String venue;
    @SerializedName("home_probable_pitcher")
    @Expose
    private HomeProbablePitcher homeProbablePitcher;
    @SerializedName("home_league_id")
    @Expose
    private String homeLeagueId;
    @SerializedName("video_thumbnail")
    @Expose
    private String videoThumbnail;
    @SerializedName("away_loss")
    @Expose
    private String awayLoss;
    @SerializedName("resume_date")
    @Expose
    private String resumeDate;
    @SerializedName("away_file_code")
    @Expose
    private String awayFileCode;
    @SerializedName("aw_lg_ampm")
    @Expose
    private String awLgAmpm;
    @SerializedName("video_thumbnails")
    @Expose
    private VideoThumbnails videoThumbnails;
    @SerializedName("time_zone_hm_lg")
    @Expose
    private String timeZoneHmLg;
    @SerializedName("away_ampm")
    @Expose
    private String awayAmpm;
    @SerializedName("gameday")
    @Expose
    private String gameday;
    @SerializedName("away_division")
    @Expose
    private String awayDivision;

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public String getDoubleHeaderSw() {
        return doubleHeaderSw;
    }

    public void setDoubleHeaderSw(String doubleHeaderSw) {
        this.doubleHeaderSw = doubleHeaderSw;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAwayTime() {
        return awayTime;
    }

    public void setAwayTime(String awayTime) {
        this.awayTime = awayTime;
    }

    public Broadcast getBroadcast() {
        return broadcast;
    }

    public void setBroadcast(Broadcast broadcast) {
        this.broadcast = broadcast;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getHomeTime() {
        return homeTime;
    }

    public void setHomeTime(String homeTime) {
        this.homeTime = homeTime;
    }

    public String getHomeTeamName() {
        return homeTeamName;
    }

    public void setHomeTeamName(String homeTeamName) {
        this.homeTeamName = homeTeamName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOriginalDate() {
        return originalDate;
    }

    public void setOriginalDate(String originalDate) {
        this.originalDate = originalDate;
    }

    public String getHomeTeamCity() {
        return homeTeamCity;
    }

    public void setHomeTeamCity(String homeTeamCity) {
        this.homeTeamCity = homeTeamCity;
    }

    public String getVenueId() {
        return venueId;
    }

    public void setVenueId(String venueId) {
        this.venueId = venueId;
    }

    public String getGamedaySw() {
        return gamedaySw;
    }

    public void setGamedaySw(String gamedaySw) {
        this.gamedaySw = gamedaySw;
    }

    public String getAwayWin() {
        return awayWin;
    }

    public void setAwayWin(String awayWin) {
        this.awayWin = awayWin;
    }

    public String getHomeGamesBackWildcard() {
        return homeGamesBackWildcard;
    }

    public void setHomeGamesBackWildcard(String homeGamesBackWildcard) {
        this.homeGamesBackWildcard = homeGamesBackWildcard;
    }

    public AwayProbablePitcher getAwayProbablePitcher() {
        return awayProbablePitcher;
    }

    public void setAwayProbablePitcher(AwayProbablePitcher awayProbablePitcher) {
        this.awayProbablePitcher = awayProbablePitcher;
    }

    public String getAwayTeamId() {
        return awayTeamId;
    }

    public void setAwayTeamId(String awayTeamId) {
        this.awayTeamId = awayTeamId;
    }

    public String getTzHmLgGen() {
        return tzHmLgGen;
    }

    public void setTzHmLgGen(String tzHmLgGen) {
        this.tzHmLgGen = tzHmLgGen;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getHomeLoss() {
        return homeLoss;
    }

    public void setHomeLoss(String homeLoss) {
        this.homeLoss = homeLoss;
    }

    public String getHomeGamesBack() {
        return homeGamesBack;
    }

    public void setHomeGamesBack(String homeGamesBack) {
        this.homeGamesBack = homeGamesBack;
    }

    public String getHomeCode() {
        return homeCode;
    }

    public void setHomeCode(String homeCode) {
        this.homeCode = homeCode;
    }

    public String getAwaySportCode() {
        return awaySportCode;
    }

    public void setAwaySportCode(String awaySportCode) {
        this.awaySportCode = awaySportCode;
    }

    public String getHomeWin() {
        return homeWin;
    }

    public void setHomeWin(String homeWin) {
        this.homeWin = homeWin;
    }

    public String getTimeHmLg() {
        return timeHmLg;
    }

    public void setTimeHmLg(String timeHmLg) {
        this.timeHmLg = timeHmLg;
    }

    public String getAwayNameAbbrev() {
        return awayNameAbbrev;
    }

    public void setAwayNameAbbrev(String awayNameAbbrev) {
        this.awayNameAbbrev = awayNameAbbrev;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getTimeZoneAwLg() {
        return timeZoneAwLg;
    }

    public void setTimeZoneAwLg(String timeZoneAwLg) {
        this.timeZoneAwLg = timeZoneAwLg;
    }

    public String getAwayGamesBack() {
        return awayGamesBack;
    }

    public void setAwayGamesBack(String awayGamesBack) {
        this.awayGamesBack = awayGamesBack;
    }

    public String getHomeFileCode() {
        return homeFileCode;
    }

    public void setHomeFileCode(String homeFileCode) {
        this.homeFileCode = homeFileCode;
    }

    public String getGameDataDirectory() {
        return gameDataDirectory;
    }

    public void setGameDataDirectory(String gameDataDirectory) {
        this.gameDataDirectory = gameDataDirectory;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getAwayLeagueId() {
        return awayLeagueId;
    }

    public void setAwayLeagueId(String awayLeagueId) {
        this.awayLeagueId = awayLeagueId;
    }

    public String getHomeTeamId() {
        return homeTeamId;
    }

    public void setHomeTeamId(String homeTeamId) {
        this.homeTeamId = homeTeamId;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTimeAwLg() {
        return timeAwLg;
    }

    public void setTimeAwLg(String timeAwLg) {
        this.timeAwLg = timeAwLg;
    }

    public String getAwayTeamCity() {
        return awayTeamCity;
    }

    public void setAwayTeamCity(String awayTeamCity) {
        this.awayTeamCity = awayTeamCity;
    }

    public String getTbdFlag() {
        return tbdFlag;
    }

    public void setTbdFlag(String tbdFlag) {
        this.tbdFlag = tbdFlag;
    }

    public String getTzAwLgGen() {
        return tzAwLgGen;
    }

    public void setTzAwLgGen(String tzAwLgGen) {
        this.tzAwLgGen = tzAwLgGen;
    }

    public String getAwayCode() {
        return awayCode;
    }

    public void setAwayCode(String awayCode) {
        this.awayCode = awayCode;
    }

    public GameMedia getGameMedia() {
        return gameMedia;
    }

    public void setGameMedia(GameMedia gameMedia) {
        this.gameMedia = gameMedia;
    }

    public String getGameNbr() {
        return gameNbr;
    }

    public void setGameNbr(String gameNbr) {
        this.gameNbr = gameNbr;
    }

    public String getTimeDateAwLg() {
        return timeDateAwLg;
    }

    public void setTimeDateAwLg(String timeDateAwLg) {
        this.timeDateAwLg = timeDateAwLg;
    }

    public String getAwayGamesBackWildcard() {
        return awayGamesBackWildcard;
    }

    public void setAwayGamesBackWildcard(String awayGamesBackWildcard) {
        this.awayGamesBackWildcard = awayGamesBackWildcard;
    }

    public String getScheduledInnings() {
        return scheduledInnings;
    }

    public void setScheduledInnings(String scheduledInnings) {
        this.scheduledInnings = scheduledInnings;
    }

    public String getVenueWChanLoc() {
        return venueWChanLoc;
    }

    public void setVenueWChanLoc(String venueWChanLoc) {
        this.venueWChanLoc = venueWChanLoc;
    }

    public String getFirstPitchEt() {
        return firstPitchEt;
    }

    public void setFirstPitchEt(String firstPitchEt) {
        this.firstPitchEt = firstPitchEt;
    }

    public String getAwayTeamName() {
        return awayTeamName;
    }

    public void setAwayTeamName(String awayTeamName) {
        this.awayTeamName = awayTeamName;
    }

    public String getTimeDateHmLg() {
        return timeDateHmLg;
    }

    public void setTimeDateHmLg(String timeDateHmLg) {
        this.timeDateHmLg = timeDateHmLg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHomeNameAbbrev() {
        return homeNameAbbrev;
    }

    public void setHomeNameAbbrev(String homeNameAbbrev) {
        this.homeNameAbbrev = homeNameAbbrev;
    }

    public String getTiebreakerSw() {
        return tiebreakerSw;
    }

    public void setTiebreakerSw(String tiebreakerSw) {
        this.tiebreakerSw = tiebreakerSw;
    }

    public String getAmpm() {
        return ampm;
    }

    public void setAmpm(String ampm) {
        this.ampm = ampm;
    }

    public String getHomeDivision() {
        return homeDivision;
    }

    public void setHomeDivision(String homeDivision) {
        this.homeDivision = homeDivision;
    }

    public String getHomeTimeZone() {
        return homeTimeZone;
    }

    public void setHomeTimeZone(String homeTimeZone) {
        this.homeTimeZone = homeTimeZone;
    }

    public String getAwayTimeZone() {
        return awayTimeZone;
    }

    public void setAwayTimeZone(String awayTimeZone) {
        this.awayTimeZone = awayTimeZone;
    }

    public String getHmLgAmpm() {
        return hmLgAmpm;
    }

    public void setHmLgAmpm(String hmLgAmpm) {
        this.hmLgAmpm = hmLgAmpm;
    }

    public String getHomeSportCode() {
        return homeSportCode;
    }

    public void setHomeSportCode(String homeSportCode) {
        this.homeSportCode = homeSportCode;
    }

    public String getTimeDate() {
        return timeDate;
    }

    public void setTimeDate(String timeDate) {
        this.timeDate = timeDate;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public String getHomeAmpm() {
        return homeAmpm;
    }

    public void setHomeAmpm(String homeAmpm) {
        this.homeAmpm = homeAmpm;
    }

    public String getGamePk() {
        return gamePk;
    }

    public void setGamePk(String gamePk) {
        this.gamePk = gamePk;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public HomeProbablePitcher getHomeProbablePitcher() {
        return homeProbablePitcher;
    }

    public void setHomeProbablePitcher(HomeProbablePitcher homeProbablePitcher) {
        this.homeProbablePitcher = homeProbablePitcher;
    }

    public String getHomeLeagueId() {
        return homeLeagueId;
    }

    public void setHomeLeagueId(String homeLeagueId) {
        this.homeLeagueId = homeLeagueId;
    }

    public String getVideoThumbnail() {
        return videoThumbnail;
    }

    public void setVideoThumbnail(String videoThumbnail) {
        this.videoThumbnail = videoThumbnail;
    }

    public String getAwayLoss() {
        return awayLoss;
    }

    public void setAwayLoss(String awayLoss) {
        this.awayLoss = awayLoss;
    }

    public String getResumeDate() {
        return resumeDate;
    }

    public void setResumeDate(String resumeDate) {
        this.resumeDate = resumeDate;
    }

    public String getAwayFileCode() {
        return awayFileCode;
    }

    public void setAwayFileCode(String awayFileCode) {
        this.awayFileCode = awayFileCode;
    }

    public String getAwLgAmpm() {
        return awLgAmpm;
    }

    public void setAwLgAmpm(String awLgAmpm) {
        this.awLgAmpm = awLgAmpm;
    }

    public VideoThumbnails getVideoThumbnails() {
        return videoThumbnails;
    }

    public void setVideoThumbnails(VideoThumbnails videoThumbnails) {
        this.videoThumbnails = videoThumbnails;
    }

    public String getTimeZoneHmLg() {
        return timeZoneHmLg;
    }

    public void setTimeZoneHmLg(String timeZoneHmLg) {
        this.timeZoneHmLg = timeZoneHmLg;
    }

    public String getAwayAmpm() {
        return awayAmpm;
    }

    public void setAwayAmpm(String awayAmpm) {
        this.awayAmpm = awayAmpm;
    }

    public String getGameday() {
        return gameday;
    }

    public void setGameday(String gameday) {
        this.gameday = gameday;
    }

    public String getAwayDivision() {
        return awayDivision;
    }

    public void setAwayDivision(String awayDivision) {
        this.awayDivision = awayDivision;
    }

}
