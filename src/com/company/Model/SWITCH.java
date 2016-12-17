package com.company.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.validation.Valid;
import java.util.List;

public class SWITCH {

    @SerializedName("MODEL")
    @Expose
    private String mODEL;
    @SerializedName("IP")
    @Expose
    private String iP;
    @SerializedName("IPNOTES")
    @Expose
    @Valid
    private List<Object> iPNOTES = null;
    @SerializedName("SWURL")
    @Expose
    private String sWURL;

    public String getMODEL() {
        return mODEL;
    }

    public void setMODEL(String mODEL) {
        this.mODEL = mODEL;
    }

    public String getIP() {
        return iP;
    }

    public void setIP(String iP) {
        this.iP = iP;
    }

    public List<Object> getIPNOTES() {
        return iPNOTES;
    }

    public void setIPNOTES(List<Object> iPNOTES) {
        this.iPNOTES = iPNOTES;
    }

    public String getSWURL() {
        return sWURL;
    }

    public void setSWURL(String sWURL) {
        this.sWURL = sWURL;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}