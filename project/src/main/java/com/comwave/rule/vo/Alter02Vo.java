package com.comwave.rule.vo;


public class Alter02Vo {

    private Double incomeTotalAmount = 0.0;  //家庭/個人收入總額
    private Double synthesisIncomeTotalAmount = 0.0;  //家庭/個人綜合所得總額

    private String ruleId;  //規則ID
    private String ruleName;    //規則描述
    private int scoring = 0;    //收入門檻評等

    public Alter02Vo() {
    }

    public Alter02Vo(Double incomeTotalAmount, Double synthesisIncomeTotalAmount) {
        this.incomeTotalAmount = incomeTotalAmount;
        this.synthesisIncomeTotalAmount = synthesisIncomeTotalAmount;
    }

    public Double getIncomeTotalAmount() {
        return incomeTotalAmount;
    }

    public void setIncomeTotalAmount(Double incomeTotalAmount) {
        this.incomeTotalAmount = incomeTotalAmount;
    }

    public Double getSynthesisIncomeTotalAmount() {
        return synthesisIncomeTotalAmount;
    }

    public void setSynthesisIncomeTotalAmount(Double synthesisIncomeTotalAmount) {
        this.synthesisIncomeTotalAmount = synthesisIncomeTotalAmount;
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

    public double calculateIncome(Alter02Vo alter02Vo){
        double incomeTotalAmount = alter02Vo.getIncomeTotalAmount() == null ? 0 : alter02Vo.getIncomeTotalAmount();
        double synthesisIncomeTotalAmount = alter02Vo.getSynthesisIncomeTotalAmount() == null ? 0 : alter02Vo.getSynthesisIncomeTotalAmount();
        return Math.max(incomeTotalAmount,synthesisIncomeTotalAmount)/10;
    }

    @Override
    public String toString() {
        return "Alter02Vo{" +
                "incomeTotalAmount=" + incomeTotalAmount +
                ", synthesisIncomeTotalAmount=" + synthesisIncomeTotalAmount +
                ", ruleId='" + ruleId + '\'' +
                ", ruleName='" + ruleName + '\'' +
                ", scoring=" + scoring +
                '}';
    }
}
