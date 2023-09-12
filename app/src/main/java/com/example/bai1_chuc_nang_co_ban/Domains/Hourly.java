package com.example.bai1_chuc_nang_co_ban.Domains;

public class Hourly {
    private String hour;
    private int temp;
    private String picPath;

    public Hourly(String hour, int temp, String picPath) {
        this.hour = hour;
        this.temp = temp;
        this.picPath = picPath;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }
}
