package com.example.demo.domain;

public class Illness {
    private String name;
    private String brief;
    private String reason;
    private String behave;
    private String cure;
    private String prevend;

    public String getBehave() {
        return behave;
    }

    public void setBehave(String behave) {
        this.behave = behave;
    }

    public String getCure() {
        return cure;
    }

    public void setCure(String cure) {
        this.cure = cure;
    }

    public String getPrevend() {
        return prevend;
    }

    public void setPrevend(String prevend) {
        this.prevend = prevend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }


}
