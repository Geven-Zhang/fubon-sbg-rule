package com.comwave.rule.vo;

public class Grpcr10Vo {

    /**
     * 輸入參數
     */
    private Double  firstSupplierRatio ; // 第一大供應商佔總採購額之比重 (%)
    private Double  secondSupplierRatio ; // 第二大供應商佔總採購額之比重 (%)
    private Double  thirdSupplierRatio ; // 第三大供應商佔總採購額之比重 (%)
    private Double  firstSupplierYearNum ; // 第一大供應商往來年數
    private Double  secondSupplierYearNum ; // 第二大供應商往來年數
    private Double  thirdSupplierYearNum ; // 第三大供應商往來年數
    private Double  averageYearNum ; // 採購比重累積(由大至小)超過30%的供應商之平均往來年數


    /**
     * 輸出參數
     */
    private String ruleId; // 規則ID
    private String ruleName; // 規則描述
    private int scoring = 0; // 主要供應商往來評分

    public Grpcr10Vo(){ super(); }

    public Grpcr10Vo(Double firstSupplierRatio, Double secondSupplierRatio, Double thirdSupplierRatio, Double firstSupplierYearNum, Double secondSupplierYearNum, Double thirdSupplierYearNum, Double averageYearNum) {
        this.firstSupplierRatio = firstSupplierRatio;
        this.secondSupplierRatio = secondSupplierRatio;
        this.thirdSupplierRatio = thirdSupplierRatio;
        this.firstSupplierYearNum = firstSupplierYearNum;
        this.secondSupplierYearNum = secondSupplierYearNum;
        this.thirdSupplierYearNum = thirdSupplierYearNum;
        this.averageYearNum = averageYearNum;
    }

    public Double getFirstSupplierRatio() {
        return firstSupplierRatio;
    }

    public void setFirstSupplierRatio(Double firstSupplierRatio) {
        this.firstSupplierRatio = firstSupplierRatio;
    }

    public Double getSecondSupplierRatio() {
        return secondSupplierRatio;
    }

    public void setSecondSupplierRatio(Double secondSupplierRatio) {
        this.secondSupplierRatio = secondSupplierRatio;
    }

    public Double getThirdSupplierRatio() {
        return thirdSupplierRatio;
    }

    public void setThirdSupplierRatio(Double thirdSupplierRatio) {
        this.thirdSupplierRatio = thirdSupplierRatio;
    }

    public Double getFirstSupplierYearNum() {
        return firstSupplierYearNum;
    }

    public void setFirstSupplierYearNum(Double firstSupplierYearNum) {
        this.firstSupplierYearNum = firstSupplierYearNum;
    }

    public Double getSecondSupplierYearNum() {
        return secondSupplierYearNum;
    }

    public void setSecondSupplierYearNum(Double secondSupplierYearNum) {
        this.secondSupplierYearNum = secondSupplierYearNum;
    }

    public Double getThirdSupplierYearNum() {
        return thirdSupplierYearNum;
    }

    public void setThirdSupplierYearNum(Double thirdSupplierYearNum) {
        this.thirdSupplierYearNum = thirdSupplierYearNum;
    }

    public Double getAverageYearNum() {
        return averageYearNum;
    }

    public void setAverageYearNum(Double averageYearNum) {
        this.averageYearNum = averageYearNum;
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

    public double calculateYear(Grpcr10Vo grpcr10Vo){
        int count = 0;
        double totalYear = 0;
        if(grpcr10Vo.getFirstSupplierYearNum()!=null){
            count++;
            totalYear = totalYear + grpcr10Vo.getFirstSupplierYearNum();
        }
        if(grpcr10Vo.getSecondSupplierYearNum()!=null){
            count++;
            totalYear = totalYear + grpcr10Vo.getSecondSupplierYearNum();
        }
        if(grpcr10Vo.getThirdSupplierYearNum()!=null){
            count++;
            totalYear = totalYear + grpcr10Vo.getThirdSupplierYearNum();
        }
        double tatalRatio = 0;
        if(grpcr10Vo.getFirstSupplierRatio()!=null){
            tatalRatio = tatalRatio + grpcr10Vo.getFirstSupplierRatio();
        }
        if(grpcr10Vo.getSecondSupplierRatio()!=null){
            tatalRatio = tatalRatio + grpcr10Vo.getSecondSupplierRatio();
        }
        if(grpcr10Vo.getThirdSupplierRatio()!=null){
            tatalRatio = tatalRatio + grpcr10Vo.getThirdSupplierRatio();
        }
        if(count == 0){
            return 0;
        } else if(tatalRatio>30){
            return totalYear / count;
        }else{
            return grpcr10Vo.getAverageYearNum();
        }
    }
    @Override
    public String toString(){
        return "Grpcr10Vo{" +
                "firstSupplierRatio=" + firstSupplierRatio +
                ", secondSupplierRatio=" + secondSupplierRatio +
                ", thirdSupplierRatio=" + thirdSupplierRatio +
                ", firstSupplierYearNum=" + firstSupplierYearNum +
                ", secondSupplierYearNum=" + secondSupplierYearNum +
                ", thirdSupplierYearNum=" + thirdSupplierYearNum +
                ", averageYearNum=" + averageYearNum +
                ", ruleId='" + ruleId + '\'' +
                ", ruleName='" + ruleName + '\'' +
                ", scoring=" + scoring +
                '}';
    }
}
