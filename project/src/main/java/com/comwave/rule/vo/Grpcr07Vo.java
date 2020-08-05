package com.comwave.rule.vo;

import java.math.BigDecimal;

public class Grpcr07Vo {

    /**
     * 輸入參數
     */
    private Double internalTotalLoanAmount = 0.0; // 企業團國內金融機構總借款金額
    private Double internalFolkTotalLoanAmount = 0.0; // 企業團國內民間借貸總金額
    private Double overseasTotalLoanAmount = 0.0; // 企業團海外總借款金額
    private Double totalContractAmount = 0.0; // 企業團總訂約金額


    /**
     * 輸出參數
     */
    private String ruleId; // 規則ID
    private String ruleName; // 規則描述
    private int scoring = 0; // 評分

    public Grpcr07Vo(){ super(); }

    public Grpcr07Vo(Double internalTotalLoanAmount, Double internalFolkTotalLoanAmount, Double overseasTotalLoanAmount, Double totalContractAmount) {
        this.internalTotalLoanAmount = internalTotalLoanAmount;
        this.internalFolkTotalLoanAmount = internalFolkTotalLoanAmount;
        this.overseasTotalLoanAmount = overseasTotalLoanAmount;
        this.totalContractAmount = totalContractAmount;
    }

    public Double getInternalTotalLoanAmount() {
        return internalTotalLoanAmount;
    }

    public void setInternalTotalLoanAmount(Double internalTotalLoanAmount) {
        this.internalTotalLoanAmount = internalTotalLoanAmount;
    }

    public Double getInternalFolkTotalLoanAmount() {
        return internalFolkTotalLoanAmount;
    }

    public void setInternalFolkTotalLoanAmount(Double internalFolkTotalLoanAmount) {
        this.internalFolkTotalLoanAmount = internalFolkTotalLoanAmount;
    }

    public Double getOverseasTotalLoanAmount() {
        return overseasTotalLoanAmount;
    }

    public void setOverseasTotalLoanAmount(Double overseasTotalLoanAmount) {
        this.overseasTotalLoanAmount = overseasTotalLoanAmount;
    }

    public Double getTotalContractAmount() {
        return totalContractAmount;
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

    public void setTotalContractAmount(Double totalContractAmount) {
        this.totalContractAmount = totalContractAmount;
    }

    public Integer calculateDebtRate(Grpcr07Vo grpcr07Vo){
        BigDecimal internalTotalLoanAmount = new BigDecimal(0);
        if(grpcr07Vo.getInternalTotalLoanAmount()!=null){
            internalTotalLoanAmount = new BigDecimal(grpcr07Vo.getInternalTotalLoanAmount().toString());
        }
        BigDecimal internalFolkTotalLoanAmount = new BigDecimal(0);
        if (grpcr07Vo.getInternalFolkTotalLoanAmount()!=null){
            internalFolkTotalLoanAmount = new BigDecimal(grpcr07Vo.getInternalFolkTotalLoanAmount().toString());
        }
        BigDecimal overseasTotalLoanAmount = new BigDecimal(0);
        if (grpcr07Vo.getOverseasTotalLoanAmount()!=null){
            overseasTotalLoanAmount = new BigDecimal(grpcr07Vo.getOverseasTotalLoanAmount().toString());
        }
        BigDecimal totalContractAmount = new BigDecimal(0);
        if(grpcr07Vo.getTotalContractAmount()!=null){
            totalContractAmount = new BigDecimal(grpcr07Vo.getTotalContractAmount().toString());
        }

        BigDecimal totalDebtAmount = internalTotalLoanAmount.add(internalFolkTotalLoanAmount).add(overseasTotalLoanAmount);

        if (internalTotalLoanAmount.doubleValue()==0 && internalFolkTotalLoanAmount.doubleValue()==0 && overseasTotalLoanAmount.doubleValue()==0){
            return 0;
        }else if (totalDebtAmount.doubleValue()>0 && totalContractAmount.doubleValue()>0){
            return (int)(totalDebtAmount.divide(totalContractAmount).doubleValue() * 100);
        }else{
            return null;
        }
    }

    @Override
    public String toString(){
        return "Grpcr07Vo{" +
                "internalTotalLoanAmount=" + internalTotalLoanAmount +
                ", internalFolkTotalLoanAmount=" + internalFolkTotalLoanAmount +
                ", overseasTotalLoanAmount=" + overseasTotalLoanAmount +
                ", totalContractAmount=" + totalContractAmount +
                ", ruleId='" + ruleId + '\'' +
                ", ruleName='" + ruleName + '\'' +
                ", scoring=" + scoring +
                '}';
    }
}
