package com.comwave.rule.vo;

/**
 * 財務能力計算規則数据对象
 */
public class Natrl02Vo {

    private Double incomeTotalAmount = 0.0;  //家庭/個人收入總額
    private Double synthesisIncomeTotalAmount = 0.0;  //家庭/個人綜合所得總額
    private Double guaranteeBalanceAmount = 0.0;  //聯徵擔保科目餘額合計
    private Double nonGuaranteeBalanceAmount = 0.0;  //聯徵非擔保科目餘額合計

    private String ruleId;  //規則ID
    private String ruleName;    //規則描述
    private int scoring = 0;    //財務能力評分

    public Natrl02Vo() {
    }

    public Natrl02Vo(Double incomeTotalAmount, Double synthesisIncomeTotalAmount, Double guaranteeBalanceAmount, Double nonGuaranteeBalanceAmount) {
        this.incomeTotalAmount = incomeTotalAmount;
        this.synthesisIncomeTotalAmount = synthesisIncomeTotalAmount;
        this.guaranteeBalanceAmount = guaranteeBalanceAmount;
        this.nonGuaranteeBalanceAmount = nonGuaranteeBalanceAmount;
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

    public Double getGuaranteeBalanceAmount() {
        return guaranteeBalanceAmount;
    }

    public void setGuaranteeBalanceAmount(Double guaranteeBalanceAmount) {
        this.guaranteeBalanceAmount = guaranteeBalanceAmount;
    }

    public Double getNonGuaranteeBalanceAmount() {
        return nonGuaranteeBalanceAmount;
    }

    public void setNonGuaranteeBalanceAmount(Double nonGuaranteeBalanceAmount) {
        this.nonGuaranteeBalanceAmount = nonGuaranteeBalanceAmount;
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
        return "Natrl02Vo{" +
                "incomeTotalAmount=" + incomeTotalAmount +
                ", synthesisIncomeTotalAmount=" + synthesisIncomeTotalAmount +
                ", guaranteeBalanceAmount=" + guaranteeBalanceAmount +
                ", nonGuaranteeBalanceAmount=" + nonGuaranteeBalanceAmount + "\n" +
                ", ruleId='" + ruleId + '\'' +
                ", ruleName='" + ruleName + '\'' +
                ", scoring=" + scoring +
                '}';
    }

    /**
     * 計算財務能力資料值
     *
     * @param natrl02Vo
     * @return
     */
    public Double getFinancialValue(Natrl02Vo natrl02Vo) {
        if (natrl02Vo.getGuaranteeBalanceAmount() == null || natrl02Vo.getNonGuaranteeBalanceAmount() == null || natrl02Vo.getIncomeTotalAmount() == null || natrl02Vo.getSynthesisIncomeTotalAmount() == null) {
            return null;
        } else {

            //聯徵餘額合計=聯徵擔保科目餘額合計+聯徵非擔保科目餘額合計
            Double BalanceAmount = natrl02Vo.getGuaranteeBalanceAmount() + natrl02Vo.getNonGuaranteeBalanceAmount();
            //收入總額=MAX(家庭/個人收入總額,家庭/個人綜合所得總額)
            Double totalAmount = natrl02Vo.getIncomeTotalAmount() > natrl02Vo.getSynthesisIncomeTotalAmount() ?
                    natrl02Vo.getIncomeTotalAmount() : natrl02Vo.getSynthesisIncomeTotalAmount();
            //財務能力資料值
            Double financialValue = 0.0;
            if (totalAmount != 0.0 && BalanceAmount == 0.0) {
                financialValue = 9999.0;
            }
            if (totalAmount != 0.0 && BalanceAmount != 0.0) {
                financialValue = Math.floor((totalAmount / BalanceAmount) * 100);
            }
            return financialValue;
        }
    }
}
