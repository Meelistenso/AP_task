package com.company.Model;

import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Model {

    @SerializedName("RESULT")
    @Expose
    private String rESULT;
    @SerializedName("PERSONS")
    @Expose
    @Valid
    private PERSONS pERSONS;
    @SerializedName("ELAPSED_TIME")
    @Expose
    private String eLAPSEDTIME;

    public String getRESULT() {
        return rESULT;
    }

    public void setRESULT(String rESULT) {
        this.rESULT = rESULT;
    }

    public PERSONS getPERSONS() {
        return pERSONS;
    }

    public void setPERSONS(PERSONS pERSONS) {
        this.pERSONS = pERSONS;
    }

    public String getELAPSEDTIME() {
        return eLAPSEDTIME;
    }

    public void setELAPSEDTIME(String eLAPSEDTIME) {
        this.eLAPSEDTIME = eLAPSEDTIME;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}