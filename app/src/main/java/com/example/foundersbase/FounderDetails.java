package com.example.foundersbase;

import java.io.Serializable;

public class FounderDetails implements Serializable {

    private String name;
    private String desc;
    private int imgId;
    public FounderDetails(String name, String desc, int imgId){
        this.name = name;
        this.desc = desc;
        this.imgId = imgId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDesc(){
        return desc;
    }

    public void setDesc(String desc){
        this.desc = desc;
    }

    public int getImgId(){
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}
