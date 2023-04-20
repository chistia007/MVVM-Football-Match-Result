package com.example.mvvmproject.Service.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieModel {


    @SerializedName("Tournament")
    @Expose
    private String tournament;
    @SerializedName("Match_Id")
    @Expose
    private Integer matchId;
    @SerializedName("Match_name")
    @Expose
    private String matchName;
    @SerializedName("TeamA")
    @Expose
    private String teamA;
    @SerializedName("TeamB")
    @Expose
    private String teamB;
    @SerializedName("Score")
    @Expose
    private String score;

    public String getTournament() {
        return tournament;
    }

    public void setTournament(String tournament) {
        this.tournament = tournament;
    }

    public Integer getMatchId() {
        return matchId;
    }

    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }

    public String getMatchName() {
        return matchName;
    }

    public void setMatchName(String matchName) {
        this.matchName = matchName;
    }

    public String getTeamA() {
        return teamA;
    }

    public void setTeamA(String teamA) {
        this.teamA = teamA;
    }

    public String getTeamB() {
        return teamB;
    }

    public void setTeamB(String teamB) {
        this.teamB = teamB;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }




}
