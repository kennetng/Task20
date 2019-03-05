package no.noroff.models;
//https://official-joke-api.appspot.com/jokes/random

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.StringJoiner;

public class RandomJoke {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("setup")
    @Expose
    private String setup;
    @SerializedName("punchline")
    @Expose
    private String punchline;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSetup() {
        return setup;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }

    public String getPunchline() {
        return punchline;
    }

    public void setPunchline(String punchline) {
        this.punchline = punchline;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", RandomJoke.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("type='" + type + "'")
                .add("setup='" + setup + "'")
                .add("punchline='" + punchline + "'")
                .toString();
    }
}