package no.noroff.models;

import java.io.Serializable;
import java.util.StringJoiner;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Quote implements Serializable
{

    @SerializedName("ID")
    @Expose
    private Integer iD;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("link")
    @Expose
    private String link;
    private final static long serialVersionUID = -4102686784795936034L;

    public Integer getID() {
        return iD;
    }

    public void setID(Integer iD) {
        this.iD = iD;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Quote.class.getSimpleName() + "[", "]")
                .add("iD=" + iD)
                .add("title='" + title + "'")
                .add("content='" + content + "'")
                .add("link='" + link + "'")
                .toString();
    }
}