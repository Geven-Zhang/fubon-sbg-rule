package com.comwave.rule.vo;


public class Grpcr08Vo {

    /**
     * 輸入參數
     */
    private double  netInterestRate = 0; // 企業團稅後淨利率


    /**
     * 輸出參數
     */
    private String ruleId; // 規則ID
    private String ruleName; // 規則描述
    private int scoring = 0; // 評分

    public Grpcr08Vo(){ super(); }

    public Grpcr08Vo(double netInterestRate) {
        this.netInterestRate = netInterestRate;
    }

    public double getNetInterestRate() {
        return netInterestRate;
    }

    public void setNetInterestRate(double netInterestRate) {
        this.netInterestRate = netInterestRate;
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
    public String toString(){
        return "Grpcr08Vo{" +
                "netInterestRate=" + netInterestRate +
                ", ruleId='" + ruleId + '\'' +
                ", ruleName='" + ruleName + '\'' +
                ", scoring=" + scoring +
                '}';
    }
}
