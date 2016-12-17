package com.company.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class PAYMENT {

    @SerializedName("NUM")
    @Expose
    private String nUM;
    @SerializedName("PAYDATE")
    @Expose
    private String pAYDATE;
    @SerializedName("MANAGER")
    @Expose
    private String mANAGER;
    @SerializedName("NOTE")
    @Expose
    private String nOTE;
    @SerializedName("MONEY")
    @Expose
    private String mONEY;

    public String getNUM() {
        return nUM;
    }

    public void setNUM(String nUM) {
        this.nUM = nUM;
    }

    public String getPAYDATE() {
        return pAYDATE;
    }

    public void setPAYDATE(String pAYDATE) {
        this.pAYDATE = pAYDATE;
    }

    public String getMANAGER() {
        return mANAGER;
    }

    public void setMANAGER(String mANAGER) {
        this.mANAGER = mANAGER;
    }

    public String getNOTE() {
        return nOTE;
    }

    public void setNOTE(String nOTE) {
        this.nOTE = nOTE;
    }

    public String getMONEY() {
        return mONEY;
    }

    public void setMONEY(String mONEY) {
        this.mONEY = mONEY;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}