package com.company.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.validation.Valid;
import java.util.List;

public class BIND {

    @SerializedName("SWITCH")
    @Expose
    private String sWITCH;
    @SerializedName("SWITCH_IP")
    @Expose
    private String sWITCHIP;
    @SerializedName("SWITCH_PORT")
    @Expose
    private String sWITCHPORT;
    @SerializedName("IPNOTES")
    @Expose
    @Valid
    private List<Object> iPNOTES = null;
    @SerializedName("BIND_IP")
    @Expose
    private String bINDIP;
    @SerializedName("BIND_MAC")
    @Expose
    private String bINDMAC;
    @SerializedName("BIND_DATE_CHANGE")
    @Expose
    private String bINDDATECHANGE;
    @SerializedName("BIND_STATE")
    @Expose
    private String bINDSTATE;

    public String getSWITCH() {
        return sWITCH;
    }

    public void setSWITCH(String sWITCH) {
        this.sWITCH = sWITCH;
    }

    public String getSWITCHIP() {
        return sWITCHIP;
    }

    public void setSWITCHIP(String sWITCHIP) {
        this.sWITCHIP = sWITCHIP;
    }

    public String getSWITCHPORT() {
        return sWITCHPORT;
    }

    public void setSWITCHPORT(String sWITCHPORT) {
        this.sWITCHPORT = sWITCHPORT;
    }

    public List<Object> getIPNOTES() {
        return iPNOTES;
    }

    public void setIPNOTES(List<Object> iPNOTES) {
        this.iPNOTES = iPNOTES;
    }

    public String getBINDIP() {
        return bINDIP;
    }

    public void setBINDIP(String bINDIP) {
        this.bINDIP = bINDIP;
    }

    public String getBINDMAC() {
        return bINDMAC;
    }

    public void setBINDMAC(String bINDMAC) {
        this.bINDMAC = bINDMAC;
    }

    public String getBINDDATECHANGE() {
        return bINDDATECHANGE;
    }

    public void setBINDDATECHANGE(String bINDDATECHANGE) {
        this.bINDDATECHANGE = bINDDATECHANGE;
    }

    public String getBINDSTATE() {
        return bINDSTATE;
    }

    public void setBINDSTATE(String bINDSTATE) {
        this.bINDSTATE = bINDSTATE;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}