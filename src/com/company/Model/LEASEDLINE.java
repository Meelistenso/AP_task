package com.company.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.validation.Valid;

public class LEASEDLINE {

    @SerializedName("SERVICE_TYPE")
    @Expose
    private String sERVICETYPE;
    @SerializedName("LOGIN")
    @Expose
    private String lOGIN;
    @SerializedName("PASSWORD")
    @Expose
    private String pASSWORD;
    @SerializedName("SID")
    @Expose
    private String sID;
    @SerializedName("PRICE_NAME")
    @Expose
    private String pRICENAME;
    @SerializedName("MONEY_ABON")
    @Expose
    private String mONEYABON;
    @SerializedName("MONEY_OVERFLOW")
    @Expose
    private String mONEYOVERFLOW;
    @SerializedName("TRAFFIC_IN_OUT")
    @Expose
    private String tRAFFICINOUT;
    @SerializedName("BLOCKS_ALL_WORLD_OVERFLOW")
    @Expose
    private String bLOCKSALLWORLDOVERFLOW;
    @SerializedName("TRAFFICURL")
    @Expose
    private String tRAFFICURL;
    @SerializedName("GRAPHURL_D")
    @Expose
    private String gRAPHURLD;
    @SerializedName("GRAPHURL_W")
    @Expose
    private String gRAPHURLW;
    @SerializedName("MAC")
    @Expose
    private String mAC;
    @SerializedName("IP")
    @Expose
    private String iP;
    @SerializedName("MASK")
    @Expose
    private String mASK;
    @SerializedName("GATEWAY")
    @Expose
    private String gATEWAY;
    @SerializedName("VLAN")
    @Expose
    private String vLAN;
    @SerializedName("DHCP")
    @Expose
    private String dHCP;
    @SerializedName("DHCPSTATUS")
    @Expose
    private String dHCPSTATUS;
    @SerializedName("BINDS")
    @Expose
    @Valid
    private BINDS bINDS;
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
    @SerializedName("NOTE")
    @Expose
    private String nOTE;
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

    public String getPASSWORD() {
        return pASSWORD;
    }

    public void setPASSWORD(String pASSWORD) {
        this.pASSWORD = pASSWORD;
    }

    public String getSID() {
        return sID;
    }

    public void setSID(String sID) {
        this.sID = sID;
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

    public String getMONEYOVERFLOW() {
        return mONEYOVERFLOW;
    }

    public void setMONEYOVERFLOW(String mONEYOVERFLOW) {
        this.mONEYOVERFLOW = mONEYOVERFLOW;
    }

    public String getTRAFFICINOUT() {
        return tRAFFICINOUT;
    }

    public void setTRAFFICINOUT(String tRAFFICINOUT) {
        this.tRAFFICINOUT = tRAFFICINOUT;
    }

    public String getBLOCKSALLWORLDOVERFLOW() {
        return bLOCKSALLWORLDOVERFLOW;
    }

    public void setBLOCKSALLWORLDOVERFLOW(String bLOCKSALLWORLDOVERFLOW) {
        this.bLOCKSALLWORLDOVERFLOW = bLOCKSALLWORLDOVERFLOW;
    }

    public String getTRAFFICURL() {
        return tRAFFICURL;
    }

    public void setTRAFFICURL(String tRAFFICURL) {
        this.tRAFFICURL = tRAFFICURL;
    }

    public String getGRAPHURLD() {
        return gRAPHURLD;
    }

    public void setGRAPHURLD(String gRAPHURLD) {
        this.gRAPHURLD = gRAPHURLD;
    }

    public String getGRAPHURLW() {
        return gRAPHURLW;
    }

    public void setGRAPHURLW(String gRAPHURLW) {
        this.gRAPHURLW = gRAPHURLW;
    }

    public String getMAC() {
        return mAC;
    }

    public void setMAC(String mAC) {
        this.mAC = mAC;
    }

    public String getIP() {
        return iP;
    }

    public void setIP(String iP) {
        this.iP = iP;
    }

    public String getMASK() {
        return mASK;
    }

    public void setMASK(String mASK) {
        this.mASK = mASK;
    }

    public String getGATEWAY() {
        return gATEWAY;
    }

    public void setGATEWAY(String gATEWAY) {
        this.gATEWAY = gATEWAY;
    }

    public String getVLAN() {
        return vLAN;
    }

    public void setVLAN(String vLAN) {
        this.vLAN = vLAN;
    }

    public String getDHCP() {
        return dHCP;
    }

    public void setDHCP(String dHCP) {
        this.dHCP = dHCP;
    }

    public String getDHCPSTATUS() {
        return dHCPSTATUS;
    }

    public void setDHCPSTATUS(String dHCPSTATUS) {
        this.dHCPSTATUS = dHCPSTATUS;
    }

    public BINDS getBINDS() {
        return bINDS;
    }

    public void setBINDS(BINDS bINDS) {
        this.bINDS = bINDS;
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

    public String getNOTE() {
        return nOTE;
    }

    public void setNOTE(String nOTE) {
        this.nOTE = nOTE;
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