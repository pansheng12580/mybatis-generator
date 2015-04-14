package model;

import java.util.Date;

public class User {
    private Integer suId;

    private String suPhone;

    private String suNickname;

    private String suPassword;

    private String suIcon;

    private String suSign;

    private Boolean suSex;

    private Byte suAge;

    private String suSport;

    private String suIndustry;

    private Date suCreateTime;

    private Boolean suState;

    public Integer getSuId() {
        return suId;
    }

    public void setSuId(Integer suId) {
        this.suId = suId;
    }

    public String getSuPhone() {
        return suPhone;
    }

    public void setSuPhone(String suPhone) {
        this.suPhone = suPhone;
    }

    public String getSuNickname() {
        return suNickname;
    }

    public void setSuNickname(String suNickname) {
        this.suNickname = suNickname;
    }

    public String getSuPassword() {
        return suPassword;
    }

    public void setSuPassword(String suPassword) {
        this.suPassword = suPassword;
    }

    public String getSuIcon() {
        return suIcon;
    }

    public void setSuIcon(String suIcon) {
        this.suIcon = suIcon;
    }

    public String getSuSign() {
        return suSign;
    }

    public void setSuSign(String suSign) {
        this.suSign = suSign;
    }

    public Boolean getSuSex() {
        return suSex;
    }

    public void setSuSex(Boolean suSex) {
        this.suSex = suSex;
    }

    public Byte getSuAge() {
        return suAge;
    }

    public void setSuAge(Byte suAge) {
        this.suAge = suAge;
    }

    public String getSuSport() {
        return suSport;
    }

    public void setSuSport(String suSport) {
        this.suSport = suSport;
    }

    public String getSuIndustry() {
        return suIndustry;
    }

    public void setSuIndustry(String suIndustry) {
        this.suIndustry = suIndustry;
    }

    public Date getSuCreateTime() {
        return suCreateTime;
    }

    public void setSuCreateTime(Date suCreateTime) {
        this.suCreateTime = suCreateTime;
    }

    public Boolean getSuState() {
        return suState;
    }

    public void setSuState(Boolean suState) {
        this.suState = suState;
    }
}