package com.comwave.rule.vo;

/**
 * 金融負債净額與營業額比率評分規則数据对象
 */
public class Grpcr06Vo {

    private Double internalTotalLoanAmount = 0.0;  //企業團國內金融機構總借款金額
    private Double internalFolkTotalLoanAmount = 0.0;  //企業團國內民間借貸總金額
    private Double overseasTotalLoanAmount = 0.0;  //企業團海外總借款金額
    private Double guaranteeLoanAmount = 0.0;  //企業團定存單十足擔保之借款金額
    private Double turnoverAmount = 0.0;  //企業團營業額

    private String ruleId;  //規則ID
    private String ruleName;    //規則描述
    private int scoring = 0;    //金融負債淨額與營業額比率評分

    public Grpcr06Vo() {
    }

    public Grpcr06Vo(Double internalTotalLoanAmount, Double internalFolkTotalLoanAmount, Double overseasTotalLoanAmount, Double guaranteeLoanAmount, Double turnoverAmount) {
        this.internalTotalLoanAmount = (internalTotalLoanAmount == null ? 0.0 : internalTotalLoanAmount); //若無則建入0
        this.internalFolkTotalLoanAmount = (internalFolkTotalLoanAmount == null ? 0.0 : internalFolkTotalLoanAmount);
        //若無則建入0
        this.overseasTotalLoanAmount = (overseasTotalLoanAmount == null ? 0.0 : overseasTotalLoanAmount); //若無則建入0
        this.guaranteeLoanAmount = (guaranteeLoanAmount == null ? 0.0 : guaranteeLoanAmount); //若無則建入0
        this.turnoverAmount = turnoverAmount;
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

    public Double getGuaranteeLoanAmount() {
        return guaranteeLoanAmount;
    }

    public void setGuaranteeLoanAmount(Double guaranteeLoanAmount) {
        this.guaranteeLoanAmount = guaranteeLoanAmount;
    }

    public Double getTurnoverAmount() {
        return turnoverAmount;
    }

    public void setTurnoverAmount(Double turnoverAmount) {
        this.turnoverAmount = turnoverAmount;
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
        return "Grpcr06Vo{" +
                "internalTotalLoanAmount=" + internalTotalLoanAmount +
                ", internalFolkTotalLoanAmount=" + internalFolkTotalLoanAmount +
                ", overseasTotalLoanAmount=" + overseasTotalLoanAmount +
                ", guaranteeLoanAmount=" + guaranteeLoanAmount +
                ", turnoverAmount=" + turnoverAmount + "\n" +
                ", ruleId='" + ruleId + '\'' +
                ", ruleName='" + ruleName + '\'' +
                ", scoring=" + scoring +
                '}';
    }

    /**
     * 計算金融負債淨額與營業額[比率(%)]
     *
     * @param grpcr06Vo
     * @return
     */
    public Double getRatio(Grpcr06Vo grpcr06Vo) {
        return Math.floor((grpcr06Vo.getInternalTotalLoanAmount() + grpcr06Vo.getInternalFolkTotalLoanAmount() + grpcr06Vo.getOverseasTotalLoanAmount() - grpcr06Vo.getGuaranteeLoanAmount()) / (grpcr06Vo.getTurnoverAmount() * 1000) * 100);
    }

}
