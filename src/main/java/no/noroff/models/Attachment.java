package no.noroff.models;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Attachment implements Serializable
{

    @SerializedName("fallback")
    @Expose
    private String fallback;
    @SerializedName("footer")
    @Expose
    private String footer;
    @SerializedName("text")
    @Expose
    private String text;
    private final static long serialVersionUID = -1545166174652178725L;

    public String getFallback() {
        return fallback;
    }

    public void setFallback(String fallback) {
        this.fallback = fallback;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
