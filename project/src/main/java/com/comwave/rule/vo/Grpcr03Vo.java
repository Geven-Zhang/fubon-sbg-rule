package com.comwave.rule.vo;

/**
 * 主經營者從業經驗評分規則数据对象
 */
public class Grpcr03Vo {

    private int workingYears = 0;  //主要經營者本葉經驗

    private String ruleId;  //規則ID
    private String ruleName;    //規則描述
    private int scoring = 0;    //主經營者從業經驗評分

    public Grpcr03Vo() {
    }

    public Grpcr03Vo(int workingYears) {
        this.workingYears = workingYears;
    }

    public int getWorkingYears() {
        return workingYears;
    }

    public void setWorkingYears(int workingYears) {
        this.workingYears = workingYears;
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
        return "Grpcr03Vo{" +
                "workingYears=" + workingYears +
                ", ruleId='" + ruleId + '\'' +
                ", ruleName='" + ruleName + '\'' +
                ", scoring=" + scoring +
                '}';
    }
}
