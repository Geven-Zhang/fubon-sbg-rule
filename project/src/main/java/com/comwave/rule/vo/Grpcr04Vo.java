package com.comwave.rule.vo;

/**
 * 廠房或辦公室是否自有評分規則数据对象
 */
public class Grpcr04Vo {

    private String creditIndustry;  //授信戶產業別
    private String plantType;  //廠房為自有或承租
    private String plantMortgage;  //廠房是否有抵押借款
    private String officeType;  //辦公室為自有或承租
    private String officeMortgage;  //辦公室是否有抵押借款

    private String ruleId;  //規則ID
    private String ruleName;    //規則描述
    private int scoring = 0;    //廠房或辦公室是否自有評分

    public Grpcr04Vo() {
    }

    public Grpcr04Vo(String creditIndustry, String plantType, String plantMortgage, String officeType, String officeMortgage) {
        this.creditIndustry = creditIndustry;
        this.plantType = plantType;
        this.plantMortgage = plantMortgage;
        this.officeType = officeType;
        this.officeMortgage = officeMortgage;
    }

    public String getCreditIndustry() {
        return creditIndustry;
    }

    public void setCreditIndustry(String creditIndustry) {
        this.creditIndustry = creditIndustry;
    }

    public String getPlantType() {
        return plantType;
    }

    public void setPlantType(String plantType) {
        this.plantType = plantType;
    }

    public String getPlantMortgage() {
        return plantMortgage;
    }

    public void setPlantMortgage(String plantMortgage) {
        this.plantMortgage = plantMortgage;
    }

    public String getOfficeType() {
        return officeType;
    }

    public void setOfficeType(String officeType) {
        this.officeType = officeType;
    }

    public String getOfficeMortgage() {
        return officeMortgage;
    }

    public void setOfficeMortgage(String officeMortgage) {
        this.officeMortgage = officeMortgage;
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
        return "Grpcr04Vo{" +
                "creditIndustry='" + creditIndustry + '\'' +
                ", plantType='" + plantType + '\'' +
                ", plantMortgage='" + plantMortgage + '\'' +
                ", officeType='" + officeType + '\'' +
                ", officeMortgage='" + officeMortgage + '\'' +"\n"+
                ", ruleId='" + ruleId + '\'' +
                ", ruleName='" + ruleName + '\'' +
                ", scoring=" + scoring +
                '}';
    }
}
