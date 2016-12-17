package com.company.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.validation.Valid;
import java.util.List;

public class PERSON {

    @SerializedName("PID")
    @Expose
    private String pID;
    @SerializedName("CARD")
    @Expose
    private String cARD;
    @SerializedName("CARD_TYPE")
    @Expose
    private String cARDTYPE;
    @SerializedName("NAME")
    @Expose
    private String nAME;
    @SerializedName("URSTATUS")
    @Expose
    private String uRSTATUS;
    @SerializedName("LENGHTIN")
    @Expose
    private String lENGHTIN;
    @SerializedName("LENGHTOUT")
    @Expose
    private String lENGHTOUT;
    @SerializedName("CABLEJOIN")
    @Expose
    private String cABLEJOIN;
    @SerializedName("CABLENOTES")
    @Expose
    @Valid
    private List<Object> cABLENOTES = null;
    @SerializedName("VIPSTATUS")
    @Expose
    private String vIPSTATUS;
    @SerializedName("OLDP")
    @Expose
    private String oLDP;
    @SerializedName("ADDR")
    @Expose
    private String aDDR;
    @SerializedName("ADDR_DISTRICT_NAME")
    @Expose
    private String aDDRDISTRICTNAME;
    @SerializedName("ADDR_HOUSE_ID")
    @Expose
    private String aDDRHOUSEID;
    @SerializedName("ADDR_HOUSE_TYPE")
    @Expose
    private String aDDRHOUSETYPE;
    @SerializedName("ADDR_FLAT_NAME")
    @Expose
    private String aDDRFLATNAME;
    @SerializedName("PHONE")
    @Expose
    private String pHONE;
    @SerializedName("EMAIL")
    @Expose
    private String eMAIL;
    @SerializedName("NOTE")
    @Expose
    private String nOTE;
    @SerializedName("CURRENT")
    @Expose
    private String cURRENT;
    @SerializedName("KREDIT")
    @Expose
    private String kREDIT;
    @SerializedName("KREDIT_STATUS")
    @Expose
    private String kREDITSTATUS;
    @SerializedName("KREDIT_PENATY")
    @Expose
    private String kREDITPENATY;
    @SerializedName("CREATED")
    @Expose
    private String cREATED;
    @SerializedName("CITY")
    @Expose
    private String cITY;
    @SerializedName("BILLURL")
    @Expose
    private String bILLURL;
    @SerializedName("TASKNOCURL")
    @Expose
    private String tASKNOCURL;

    public String getPID() {
        return pID;
    }

    public void setPID(String pID) {
        this.pID = pID;
    }

    public String getCARD() {
        return cARD;
    }

    public void setCARD(String cARD) {
        this.cARD = cARD;
    }

    public String getCARDTYPE() {
        return cARDTYPE;
    }

    public void setCARDTYPE(String cARDTYPE) {
        this.cARDTYPE = cARDTYPE;
    }

    public String getNAME() {
        return nAME;
    }

    public void setNAME(String nAME) {
        this.nAME = nAME;
    }

    public String getURSTATUS() {
        return uRSTATUS;
    }

    public void setURSTATUS(String uRSTATUS) {
        this.uRSTATUS = uRSTATUS;
    }

    public String getLENGHTIN() {
        return lENGHTIN;
    }

    public void setLENGHTIN(String lENGHTIN) {
        this.lENGHTIN = lENGHTIN;
    }

    public String getLENGHTOUT() {
        return lENGHTOUT;
    }

    public void setLENGHTOUT(String lENGHTOUT) {
        this.lENGHTOUT = lENGHTOUT;
    }

    public String getCABLEJOIN() {
        return cABLEJOIN;
    }

    public void setCABLEJOIN(String cABLEJOIN) {
        this.cABLEJOIN = cABLEJOIN;
    }

    public List<Object> getCABLENOTES() {
        return cABLENOTES;
    }

    public void setCABLENOTES(List<Object> cABLENOTES) {
        this.cABLENOTES = cABLENOTES;
    }

    public String getVIPSTATUS() {
        return vIPSTATUS;
    }

    public void setVIPSTATUS(String vIPSTATUS) {
        this.vIPSTATUS = vIPSTATUS;
    }

    public String getOLDP() {
        return oLDP;
    }

    public void setOLDP(String oLDP) {
        this.oLDP = oLDP;
    }

    public String getADDR() {
        return aDDR;
    }

    public void setADDR(String aDDR) {
        this.aDDR = aDDR;
    }

    public String getADDRDISTRICTNAME() {
        return aDDRDISTRICTNAME;
    }

    public void setADDRDISTRICTNAME(String aDDRDISTRICTNAME) {
        this.aDDRDISTRICTNAME = aDDRDISTRICTNAME;
    }

    public String getADDRHOUSEID() {
        return aDDRHOUSEID;
    }

    public void setADDRHOUSEID(String aDDRHOUSEID) {
        this.aDDRHOUSEID = aDDRHOUSEID;
    }

    public String getADDRHOUSETYPE() {
        return aDDRHOUSETYPE;
    }

    public void setADDRHOUSETYPE(String aDDRHOUSETYPE) {
        this.aDDRHOUSETYPE = aDDRHOUSETYPE;
    }

    public String getADDRFLATNAME() {
        return aDDRFLATNAME;
    }

    public void setADDRFLATNAME(String aDDRFLATNAME) {
        this.aDDRFLATNAME = aDDRFLATNAME;
    }

    public String getPHONE() {
        return pHONE;
    }

    public void setPHONE(String pHONE) {
        this.pHONE = pHONE;
    }

    public String getEMAIL() {
        return eMAIL;
    }

    public void setEMAIL(String eMAIL) {
        this.eMAIL = eMAIL;
    }

    public String getNOTE() {
        return nOTE;
    }

    public void setNOTE(String nOTE) {
        this.nOTE = nOTE;
    }

    public String getCURRENT() {
        return cURRENT;
    }

    public void setCURRENT(String cURRENT) {
        this.cURRENT = cURRENT;
    }

    public String getKREDIT() {
        return kREDIT;
    }

    public void setKREDIT(String kREDIT) {
        this.kREDIT = kREDIT;
    }

    public String getKREDITSTATUS() {
        return kREDITSTATUS;
    }

    public void setKREDITSTATUS(String kREDITSTATUS) {
        this.kREDITSTATUS = kREDITSTATUS;
    }

    public String getKREDITPENATY() {
        return kREDITPENATY;
    }

    public void setKREDITPENATY(String kREDITPENATY) {
        this.kREDITPENATY = kREDITPENATY;
    }

    public String getCREATED() {
        return cREATED;
    }

    public void setCREATED(String cREATED) {
        this.cREATED = cREATED;
    }

    public String getCITY() {
        return cITY;
    }

    public void setCITY(String cITY) {
        this.cITY = cITY;
    }

    public String getBILLURL() {
        return bILLURL;
    }

    public void setBILLURL(String bILLURL) {
        this.bILLURL = bILLURL;
    }

    public String getTASKNOCURL() {
        return tASKNOCURL;
    }

    public void setTASKNOCURL(String tASKNOCURL) {
        this.tASKNOCURL = tASKNOCURL;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}