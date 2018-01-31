package com.collisionarts.charruacon.charruacon;

import android.graphics.drawable.Drawable;

/**
 * Created by Diego on 31/1/2018.
 */

public class Talk {
    private String title;
    private String talkId;
    private String name;
    private String job;
    private String description;
    private Drawable imagen;
    private String location;
    private String time;
    private String country;

    public Talk(){
        super();
    }
    public Talk(String talkId, String title, String description, Drawable imagen,String location,String time,String country, String name, String job) {
        super();
        this.title = title;
        this.description = description;
        this.imagen = imagen;
        this.talkId = talkId;
        this.time = time;
        this.location = location;
        this.country = country;
        this.name = name;
        this.job = job;
    }

    public String getTitle() {
        return title;
    }

    public void setTittle(String title) {
        this.title = title;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }
    public String getJob() {
        return job;
    }
    public String getTime() {
        return time;
    }
    public String getLocation() {
        return location;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setJob(String job) {
        this.job = job;
    }

    public Drawable getImage() {
        return imagen;
    }

    public void setImagen(Drawable imagen) {
        this.imagen = imagen;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getTalkId(){return talkId;}

    public void setTalkId(String talkId){this.talkId = talkId;}
}
