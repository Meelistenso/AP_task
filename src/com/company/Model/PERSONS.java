package com.company.Model;

import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class PERSONS {

    @SerializedName("PERSON")
    @Expose
    @Valid
    private PERSON pERSON;
    @SerializedName("PAYMENTS")
    @Expose
    @Valid
    private PAYMENTS pAYMENTS;
    @SerializedName("SERVICES")
    @Expose
    @Valid
    private SERVICES sERVICES;
    @SerializedName("SWITCHES_IN_HOUSE")
    @Expose
    @Valid
    private SWITCHESINHOUSE sWITCHESINHOUSE;
    @SerializedName("COMMENTS")
    @Expose
    @Valid
    private COMMENTS cOMMENTS;
    @SerializedName("LASTSEENS")
    @Expose
    @Valid
    private LASTSEENS lASTSEENS;
    @SerializedName("REASONS")
    @Expose
    @Valid
    private REASONS rEASONS;
    @SerializedName("TASKS")
    @Expose
    @Valid
    private TASKS tASKS;

    public PERSON getPERSON() {
        return pERSON;
    }

    public void setPERSON(PERSON pERSON) {
        this.pERSON = pERSON;
    }

    public PAYMENTS getPAYMENTS() {
        return pAYMENTS;
    }

    public void setPAYMENTS(PAYMENTS pAYMENTS) {
        this.pAYMENTS = pAYMENTS;
    }

    public SERVICES getSERVICES() {
        return sERVICES;
    }

    public void setSERVICES(SERVICES sERVICES) {
        this.sERVICES = sERVICES;
    }

    public SWITCHESINHOUSE getSWITCHESINHOUSE() {
        return sWITCHESINHOUSE;
    }

    public void setSWITCHESINHOUSE(SWITCHESINHOUSE sWITCHESINHOUSE) {
        this.sWITCHESINHOUSE = sWITCHESINHOUSE;
    }

    public COMMENTS getCOMMENTS() {
        return cOMMENTS;
    }

    public void setCOMMENTS(COMMENTS cOMMENTS) {
        this.cOMMENTS = cOMMENTS;
    }

    public LASTSEENS getLASTSEENS() {
        return lASTSEENS;
    }

    public void setLASTSEENS(LASTSEENS lASTSEENS) {
        this.lASTSEENS = lASTSEENS;
    }

    public REASONS getREASONS() {
        return rEASONS;
    }

    public void setREASONS(REASONS rEASONS) {
        this.rEASONS = rEASONS;
    }

    public TASKS getTASKS() {
        return tASKS;
    }

    public void setTASKS(TASKS tASKS) {
        this.tASKS = tASKS;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}