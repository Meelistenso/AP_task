package com.company.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.validation.Valid;
import java.util.List;

public class TASKS {

    @SerializedName("TASK")
    @Expose
    @Valid
    private List<TASK> tASK = null;

    public List<TASK> getTASK() {
        return tASK;
    }

    public void setTASK(List<TASK> tASK) {
        this.tASK = tASK;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}