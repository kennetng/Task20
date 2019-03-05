package no.noroff.models;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Slip implements Serializable
{

    @SerializedName("advice")
    @Expose
    private String advice;
    @SerializedName("slip_id")
    @Expose
    private String slipId;
    private final static long serialVersionUID = -8253579942425262766L;

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public String getSlipId() {
        return slipId;
    }

    public void setSlipId(String slipId) {
        this.slipId = slipId;
    }

}