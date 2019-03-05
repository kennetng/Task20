package no.noroff.models;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class DadJoke implements Serializable
{

    @SerializedName("attachments")
    @Expose
    private List<Attachment> attachments = null;
    @SerializedName("response_type")
    @Expose
    private String responseType;
    @SerializedName("username")
    @Expose
    private String username;
    private final static long serialVersionUID = -7828917437133466494L;

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public String getResponseType() {
        return responseType;
    }

    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}