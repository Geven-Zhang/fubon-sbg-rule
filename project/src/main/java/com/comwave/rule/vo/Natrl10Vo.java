package com.comwave.rule.vo;

/**
 * 信用卡循環借款評分規則
 */
public class Natrl10Vo {

    private Integer paymentCodeIs2N = 0;  //信用卡最近一年上期繳款代號為2N之月份數
    private Integer paymentCodeIs20 = 0;  //信用卡最近一年上期繳款代號為20之月份數
    private Integer paymentCodeFirstIs3 = 0;  //信用卡最近一年上期繳款代號第一碼為3之月份數
    private Integer paymentCodeFirstIs4 = 0;  //信用卡最近一年上期繳款代號第一碼為4之月份數

    private String ruleId;  //規則ID
    private String ruleName;    //規則描述
    private int scoring = 0;    //信用卡循環借款評分

    public Natrl10Vo() {
    }

    public Natrl10Vo(Integer paymentCodeIs2N, Integer paymentCodeIs20, Integer paymentCodeFirstIs3, Integer paymentCodeFirstIs4) {
        this.paymentCodeIs2N = paymentCodeIs2N;
        this.paymentCodeIs20 = paymentCodeIs20;
        this.paymentCodeFirstIs3 = paymentCodeFirstIs3;
        this.paymentCodeFirstIs4 = paymentCodeFirstIs4;
    }

    public Integer getPaymentCodeIs2N() {
        return paymentCodeIs2N;
    }

    public void setPaymentCodeIs2N(Integer paymentCodeIs2N) {
        this.paymentCodeIs2N = paymentCodeIs2N;
    }

    public Integer getPaymentCodeIs20() {
        return paymentCodeIs20;
    }

    public void setPaymentCodeIs20(Integer paymentCodeIs20) {
        this.paymentCodeIs20 = paymentCodeIs20;
    }

    public Integer getPaymentCodeFirstIs3() {
        return paymentCodeFirstIs3;
    }

    public void setPaymentCodeFirstIs3(Integer paymentCodeFirstIs3) {
        this.paymentCodeFirstIs3 = paymentCodeFirstIs3;
    }

    public Integer getPaymentCodeFirstIs4() {
        return paymentCodeFirstIs4;
    }

    public void setPaymentCodeFirstIs4(Integer paymentCodeFirstIs4) {
        this.paymentCodeFirstIs4 = paymentCodeFirstIs4;
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

    /**
     * 是否動用循環借款
     * @param natrl10Vo
     * @return
     */
    public String revolvingLoan(Natrl10Vo natrl10Vo) {
        //(信用卡最近一年上期繳款代號為2N之月份數+信用卡最近一年上期繳款代號為20之月份數+信用卡最近一年上期繳款代號第一碼為3之月份數+信用卡最近一年上期繳款代號第一碼為4之月份數) > 0，則[是否動用循環借款]=Y，否則為N
        String result = (natrl10Vo.getPaymentCodeIs2N() + natrl10Vo.getPaymentCodeIs20() + natrl10Vo.getPaymentCodeFirstIs3() + natrl10Vo.getPaymentCodeFirstIs4()) > 0 ? "Y" : "N";
        return result;
    }
}
