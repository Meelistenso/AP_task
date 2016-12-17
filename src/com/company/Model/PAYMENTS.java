package com.company.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.validation.Valid;
import java.util.List;

public class PAYMENTS {

    @SerializedName("PAYMENT")
    @Expose
    @Valid
    private List<PAYMENT> pAYMENT = null;

    public List<PAYMENT> getPAYMENT() {
        return pAYMENT;
    }

    public void setPAYMENT(List<PAYMENT> pAYMENT) {
        this.pAYMENT = pAYMENT;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}