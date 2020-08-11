package com.comwave.rule.vo;

/**
 * 他行往來家數評分規則数据对象
 */
public class Grpcr05Vo {

    private Double enterprisesTurnover = 0.0;  //企業團營業額(該欄位大於零且不爲空)
    private Integer banksNumber = 0;  //他行授信往來家數

    private String ruleId;  //規則ID
    private String ruleName;    //規則描述
    private int scoring = 0;    //他行往來家數評分

    public Grpcr05Vo() {
    }

    public Grpcr05Vo(Double enterprisesTurnover, Integer banksNumber) {
        this.enterprisesTurnover = enterprisesTurnover;
        this.banksNumber = (banksNumber == null ? 0 : banksNumber); //若無則建入0
    }

    public Double getEnterprisesTurnover() {
        return enterprisesTurnover;
    }

    public void setEnterprisesTurnover(Double enterprisesTurnover) {
        this.enterprisesTurnover = enterprisesTurnover;
    }

    public Integer getBanksNumber() {
        return banksNumber;
    }

    public void setBanksNumber(Integer banksNumber) {
        this.banksNumber = banksNumber;
    }

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public int getScoring() {
        return scoring;
    }

    public void setScoring(int scoring) {
        this.scoring = scoring;
    }

    @Override
    public String toString() {
        return "Grpcr05Vo{" +
                "enterprisesTurnover=" + enterprisesTurnover +
                ", banksNumber=" + banksNumber +
                ", ruleId='" + ruleId + '\'' +
                ", ruleName='" + ruleName + '\'' +
                ", scoring=" + scoring +
                '}';
    }
}
