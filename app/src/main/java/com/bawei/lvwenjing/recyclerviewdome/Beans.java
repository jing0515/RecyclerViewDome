package com.bawei.lvwenjing.recyclerviewdome;

/**
 * Created by lenovo-pc on 2017/5/24.
 */

public class Beans {
    private String date;
    private int id;
    private String pic;
    private String title;
    private int type;

    public Beans(String date, int id, String pic, String title, int type) {
        this.date = date;
        this.id = id;
        this.pic = pic;
        this.title = title;
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}

