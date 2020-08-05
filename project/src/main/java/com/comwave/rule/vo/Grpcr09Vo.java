package com.comwave.rule.vo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Grpcr09Vo {

    /**
     * 輸入參數
     */
    private String creditIndustry; // 授信戶產業別
    private Double enterpriseTurnover; // 企業團營業額

    /**
     * 輸出參數
     */
    private String ruleId; // 規則ID
    private String ruleName; // 規則描述
    private int scoring = 0; // 評分

    public Grpcr09Vo() {
        super();
    }

    public Grpcr09Vo(String creditIndustry, Double enterpriseTurnover) {
        this.creditIndustry = creditIndustry;
        this.enterpriseTurnover = enterpriseTurnover;
    }

    public String getCreditIndustry() {
        return creditIndustry;
    }

    public void setCreditIndustry(String creditIndustry) {
        this.creditIndustry = creditIndustry;
    }

    public Double getEnterpriseTurnover() {
        return enterpriseTurnover;
    }

    public void setEnterpriseTurnover(Double enterpriseTurnover) {
        this.enterpriseTurnover = enterpriseTurnover;
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
        return "Grpcr09Vo{" +
                "creditIndustry='" + creditIndustry + '\'' +
                ", enterpriseTurnover=" + enterpriseTurnover +
                ", ruleId='" + ruleId + '\'' +
                ", ruleName='" + ruleName + '\'' +
                ", scoring=" + scoring +
                '}';
    }
}
