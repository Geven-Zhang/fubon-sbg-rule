package com.comwave.rule.vo;

/**
 * 實收資本額評分規則数据对象
 */
public class Grpcr02Vo {

    private String creditIndustry;  //授信戶產業別
    private Double overseasReceived = 0.0;    //大陸/海外實收資本額
    private Double taiwanReceived = 0.0;  //台灣母公司實收資本額

    private String ruleId;  //規則ID
    private String ruleName;    //規則描述
    private int scoring = 0;    //實收資本額評分

    public Grpcr02Vo() {
    }

    public Grpcr02Vo(String creditIndustry, Double overseasReceived, Double taiwanReceived) {
        this.creditIndustry = creditIndustry;
        this.overseasReceived = overseasReceived;
        this.taiwanReceived = taiwanReceived;
    }

    public String getCreditIndustry() {
        return creditIndustry;
    }

    public void setCreditIndustry(String creditIndustry) {
        this.creditIndustry = creditIndustry;
    }

    public Double getOverseasReceived() {
        return overseasReceived;
    }

    public void setOverseasReceived(Double overseasReceived) {
        this.overseasReceived = overseasReceived;
    }

    public Double getTaiwanReceived() {
        return taiwanReceived;
    }

    public void setTaiwanReceived(Double taiwanReceived) {
        this.taiwanReceived = taiwanReceived;
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
        return "Grpcr02Vo{" +
                "creditIndustry='" + creditIndustry + '\'' +
                ", overseasReceived=" + overseasReceived +
                ", taiwanReceived=" + taiwanReceived +
                ", ruleId='" + ruleId + '\'' +
                ", ruleName='" + ruleName + '\'' +
                ", scoring=" + scoring +
                '}';
    }
}
