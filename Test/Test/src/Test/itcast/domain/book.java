package Test.itcast.domain;

import java.util.Date;

public class book {
    private int id;
    private String name;
    private String author;
    private Date time;
    private int type;

    public book() {
    }

    public book(int id, String name, String author, Date time, int type) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.time = time;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "book{" +
                "id=" + id +
                ", book='" + name + '\'' +
                ", name='" + author + '\'' +
                ", time=" + time +
                ", type=" + type +
                '}';
    }

}