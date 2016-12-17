package com.company.Model;

import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class LASTSEENS {

    @SerializedName("VIEW")
    @Expose
    @Valid
    private List<VIEW> vIEW = null;

    public List<VIEW> getVIEW() {
        return vIEW;
    }

    public void setVIEW(List<VIEW> vIEW) {
        this.vIEW = vIEW;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}