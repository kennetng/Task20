package no.noroff.models;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Advice implements Serializable
{

    @SerializedName("slip")
    @Expose
    private Slip slip;
    private final static long serialVersionUID = 5862540730540708864L;

    public Slip getSlip() {
        return slip;
    }

    public void setSlip(Slip slip) {
        this.slip = slip;
    }

}