package com.myersbriggs.model;

import javax.persistence.*;

/**
* Created with IntelliJ IDEA.
* User: stantonbohmbach
* Date: 1/1/14
* Time: 3:01 PM
* To change this template use File | Settings | File Templates.
*/

@Entity
@Table(name = "Person")
public class Person {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name="age")
    private String age;

    @Column(name = "origin")
    private String origin;

    @Column(name = "race")
    private String race;

    @Column(name = "country")
    private String country;

    @Column(name="extravert_introvert")
    private char extravertIntorvert;

    @Column(name = "extravert_intervert_percent")
    private int extravertIntravertPercent;

    @Column(name = "sensing_intuition")
    private char sensingIntuition;

    @Column(name = "sensing_intuition_percent")
    private int sensingIntuitionPercent;

    @Column(name = "feeling_thinking")
    private char feelingThinking;

    @Column(name = "feeling_thinking_percent")
    private int feelingThinkingPercent;

    @Column(name = "judging_percieving")
    private char judgingPercieving;

    @Column(name = "judging_percieving_percent")
    private int judgingPercievingPercent;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public char getExtravertIntorvert() {
        return extravertIntorvert;
    }

    public void setExtravertIntorvert(char extravertIntorvert) {
        this.extravertIntorvert = extravertIntorvert;
    }

    public int getExtravertIntravertPercent() {
        return extravertIntravertPercent;
    }

    public void setExtravertIntravertPercent(int extravertIntravertPercent) {
        this.extravertIntravertPercent = extravertIntravertPercent;
    }

    public char getSensingIntuition() {
        return sensingIntuition;
    }

    public void setSensingIntuition(char sensingIntuition) {
        this.sensingIntuition = sensingIntuition;
    }

    public int getSensingIntuitionPercent() {
        return sensingIntuitionPercent;
    }

    public void setSensingIntuitionPercent(int sensingIntuitionPercent) {
        this.sensingIntuitionPercent = sensingIntuitionPercent;
    }

    public char getFeelingThinking() {
        return feelingThinking;
    }

    public void setFeelingThinking(char feelingThinking) {
        this.feelingThinking = feelingThinking;
    }

    public int getFeelingThinkingPercent() {
        return feelingThinkingPercent;
    }

    public void setFeelingThinkingPercent(int feelingThinkingPercent) {
        this.feelingThinkingPercent = feelingThinkingPercent;
    }

    public char getJudgingPercieving() {
        return judgingPercieving;
    }

    public void setJudgingPercieving(char judgingPercieving) {
        this.judgingPercieving = judgingPercieving;
    }

    public int getJudgingPercievingPercent() {
        return judgingPercievingPercent;
    }

    public void setJudgingPercievingPercent(int judgingPercievingPercent) {
        this.judgingPercievingPercent = judgingPercievingPercent;
    }
}
