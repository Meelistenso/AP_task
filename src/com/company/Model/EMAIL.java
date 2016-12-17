package com.company.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class EMAIL {

    @SerializedName("SERVICE_TYPE")
    @Expose
    private String sERVICETYPE;
    @SerializedName("LOGIN")
    @Expose
    private String lOGIN;
    @SerializedName("QUOTA")
    @Expose
    private String qUOTA;
    @SerializedName("PRICE_NAME")
    @Expose
    private String pRICENAME;
    @SerializedName("MONEY_ABON")
    @Expose
    private String mONEYABON;
    @SerializedName("OLD")
    @Expose
    private String oLD;
    @SerializedName("PERIOD_START")
    @Expose
    private String pERIODSTART;
    @SerializedName("PERIOD_END")
    @Expose
    private String pERIODEND;
    @SerializedName("CHANGED")
    @Expose
    private String cHANGED;
    @SerializedName("MANAGER")
    @Expose
    private String mANAGER;
    @SerializedName("BILLURL")
    @Expose
    private String bILLURL;

    public String getSERVICETYPE() {
        return sERVICETYPE;
    }

    public void setSERVICETYPE(String sERVICETYPE) {
        this.sERVICETYPE = sERVICETYPE;
    }

    public String getLOGIN() {
        return lOGIN;
    }

    public void setLOGIN(String lOGIN) {
        this.lOGIN = lOGIN;
    }

    public String getQUOTA() {
        return qUOTA;
    }

    public void setQUOTA(String qUOTA) {
        this.qUOTA = qUOTA;
    }

    public String getPRICENAME() {
        return pRICENAME;
    }

    public void setPRICENAME(String pRICENAME) {
        this.pRICENAME = pRICENAME;
    }

    public String getMONEYABON() {
        return mONEYABON;
    }

    public void setMONEYABON(String mONEYABON) {
        this.mONEYABON = mONEYABON;
    }

    public String getOLD() {
        return oLD;
    }

    public void setOLD(String oLD) {
        this.oLD = oLD;
    }

    public String getPERIODSTART() {
        return pERIODSTART;
    }

    public void setPERIODSTART(String pERIODSTART) {
        this.pERIODSTART = pERIODSTART;
    }

    public String getPERIODEND() {
        return pERIODEND;
    }

    public void setPERIODEND(String pERIODEND) {
        this.pERIODEND = pERIODEND;
    }

    public String getCHANGED() {
        return cHANGED;
    }

    public void setCHANGED(String cHANGED) {
        this.cHANGED = cHANGED;
    }

    public String getMANAGER() {
        return mANAGER;
    }

    public void setMANAGER(String mANAGER) {
        this.mANAGER = mANAGER;
    }

    public String getBILLURL() {
        return bILLURL;
    }

    public void setBILLURL(String bILLURL) {
        this.bILLURL = bILLURL;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}