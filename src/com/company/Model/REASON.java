package com.company.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class REASON {

    @SerializedName("Св. down")
    @Expose
    private String swDown;
    @SerializedName("Пропл.")
    @Expose
    private String propl;
    @SerializedName("Настройки")
    @Expose
    private String settings;
    @SerializedName("Скорость")
    @Expose
    private String speed;
    @SerializedName("ТВ")
    @Expose
    private String tv;
    @SerializedName("Заявка")
    @Expose
    private String zayavka;
    @SerializedName("Др. отдел")
    @Expose
    private String drOtdel;
    @SerializedName("У абона")
    @Expose
    private String uAbona;
    @SerializedName("Pазделение(РК)")
    @Expose
    private String razdeleniye;
    @SerializedName("По просьбе")
    @Expose
    private String poProsbe;
    @SerializedName("Сорвался")
    @Expose
    private String sorvalsya;
    @SerializedName("Реквизиты")
    @Expose
    private String rekvizity;
    @SerializedName("Другое")
    @Expose
    private String drugoye;
    @SerializedName("Call Back")
    @Expose
    private String callBack;
    @SerializedName("mail")
    @Expose
    private String mail;
    @SerializedName("Гарант-й. сервис")
    @Expose
    private String garantService;
    @SerializedName("Тариф Oll_TV")
    @Expose
    private String tarifOllTV;
    @SerializedName("Должники")
    @Expose
    private String dolzhnyki;
    @SerializedName("Заявление")
    @Expose
    private String zayava;
    @SerializedName("На грани отк. ")
    @Expose
    private String naGraniOtk;
    @SerializedName("Жалоба")
    @Expose
    private String zhaloba;
    @SerializedName("АО")
    @Expose
    private String ao;

    public String getSwDown() {
        return swDown;
    }

    public void setSwDown(String swDown) {
        this.swDown = swDown;
    }

    public String getPropl() {
        return propl;
    }

    public void setPropl(String propl) {
        this.propl = propl;
    }

    public String getSettings() {
        return settings;
    }

    public void setSettings(String settings) {
        this.settings = settings;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    public String getZayavka() {
        return zayavka;
    }

    public void setZayavka(String zayavka) {
        this.zayavka = zayavka;
    }

    public String getDrOtdel() {
        return drOtdel;
    }

    public void setDrOtdel(String drOtdel) {
        this.drOtdel = drOtdel;
    }

    public String getUAbona() {
        return uAbona;
    }

    public void setUAbona(String uAbona) {
        this.uAbona = uAbona;
    }

    public String getRazdeleniye() {
        return razdeleniye;
    }

    public void setRazdeleniye(String razdeleniye) {
        this.razdeleniye = razdeleniye;
    }

    public String getPoProsbe() {
        return poProsbe;
    }

    public void setPoProsbe(String poProsbe) {
        this.poProsbe = poProsbe;
    }

    public String getSorvalsya() {
        return sorvalsya;
    }

    public void setSorvalsya(String sorvalsya) {
        this.sorvalsya = sorvalsya;
    }

    public String getRekvizity() {
        return rekvizity;
    }

    public void setRekvizity(String rekvizity) {
        this.rekvizity = rekvizity;
    }

    public String getDrugoye() {
        return drugoye;
    }

    public void setDrugoye(String drugoye) {
        this.drugoye = drugoye;
    }

    public String getCallBack() {
        return callBack;
    }

    public void setCallBack(String callBack) {
        this.callBack = callBack;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getGarantService() {
        return garantService;
    }

    public void setGarantService(String garantService) {
        this.garantService = garantService;
    }

    public String getTarifOllTV() {
        return tarifOllTV;
    }

    public void setTarifOllTV(String tarifOllTV) {
        this.tarifOllTV = tarifOllTV;
    }

    public String getDolzhnyki() {
        return dolzhnyki;
    }

    public void setDolzhnyki(String dolzhnyki) {
        this.dolzhnyki = dolzhnyki;
    }

    public String getZayava() {
        return zayava;
    }

    public void setZayava(String zayava) {
        this.zayava = zayava;
    }

    public String getNaGraniOtk() {
        return naGraniOtk;
    }

    public void setNaGraniOtk(String naGraniOtk) {
        this.naGraniOtk = naGraniOtk;
    }

    public String getZhaloba() {
        return zhaloba;
    }

    public void setZhaloba(String zhaloba) {
        this.zhaloba = zhaloba;
    }

    public String getAo() {
        return ao;
    }

    public void setAo(String ao) {
        this.ao = ao;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}