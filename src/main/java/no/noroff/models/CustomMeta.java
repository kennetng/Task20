package no.noroff.models;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CustomMeta implements Serializable
{

    @SerializedName("Source")
    @Expose
    private String source;
    private final static long serialVersionUID = 8876943742138770985L;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

}

