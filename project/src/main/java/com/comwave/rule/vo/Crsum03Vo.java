package com.comwave.rule.vo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Crsum03Vo {

	private Integer natrl01 = 0;  // 職稱評分
	private Integer natrl02 = 0;  // 財務能力評分
	private Integer natrl03 = 0;  // 額度動用率評分
	private Integer natrl04 = 0;  // 存借比率評分
	private Integer natrl05 = 0;  // 聯徵額度動用率評分
	private Integer natrl06 = 0;  // 授借比率評分
	private Integer natrl07 = 0;  // 現金卡餘額評分
	private Integer natrl08 = 0;  // 往來銀行家數評分
	private Integer natrl09 = 0;  // 信用卡遲繳評分
	private Integer natrl10 = 0;  // 信用卡循環借款評分
	private Integer natrl11 = 0;  // 公司規模評分
	private Integer natrl12 = 0;  // 公司成立年限評分
	
	private String ruleId; // 規則ID
	private String ruleName; // 規則描述
	private Integer overallScore; // 總評分
	private Integer scoring; // 評分
	
    public Crsum03Vo() { super(); }
    
	public Crsum03Vo(Integer natrl01, Integer natrl02, Integer natrl03, Integer natrl04, Integer natrl05, Integer natrl06, Integer natrl07,
			Integer natrl08, Integer natrl09, Integer natrl10, Integer natrl11, Integer natrl12) {
	    
	        super();
	        this.natrl01 = natrl01;
	        this.natrl02 = natrl02;
	        this.natrl03 = natrl03;
	        this.natrl04 = natrl04;
	        this.natrl05 = natrl05;
	        this.natrl06 = natrl06;
	        this.natrl07 = natrl07;
	        this.natrl08 = natrl08;
	        this.natrl09 = natrl09;
	        this.natrl10 = natrl10;
	        this.natrl11 = natrl11;
	        this.natrl12 = natrl12;
      
	    }
		
    public Integer getNatrl01() {return natrl01;}
	
	public void setNatrl01(Integer natrl01) {this.natrl01 = natrl01;}
	
    public Integer getNatrl02() {return natrl02;}
	
	public void setNatrl02(Integer natrl02) {this.natrl02 = natrl02;}
	
    public Integer getNatrl03() {return natrl03;}
	
	public void setNatrl03(Integer natrl03) {this.natrl03 = natrl03;}
	
    public Integer getNatrl04() {return natrl04;}
	
	public void setNatrl04(Integer natrl04) {this.natrl04 = natrl04;}
	
    public Integer getNatrl05() {return natrl05;}
	
	public void setNatrl05(Integer natrl05) {this.natrl05 = natrl05;}
	
    public Integer getNatrl06() {return natrl06;}
	
	public void setNatrl06(Integer natrl06) {this.natrl06 = natrl06;}
	
    public Integer getNatrl07() {return natrl07;}
	
	public void setNatrl07(Integer natrl07) {this.natrl07 = natrl07;}
	
    public Integer getNatrl08() {return natrl08;}
	
	public void setNatrl08(Integer natrl08) {this.natrl08 = natrl08;}
	
    public Integer getNatrl09() {return natrl09;}
	
	public void setNatrl09(Integer natrl09) {this.natrl09 = natrl09;}
	
    public Integer getNatrl10() {return natrl10;}
	
	public void setNatrl10(Integer natrl10) {this.natrl10 = natrl10;}
	
    public Integer getNatrl11() {return natrl11;}
	
	public void setNatrl11(Integer natrl11) {this.natrl11 = natrl11;}
	
    public Integer getNatrl12() {return natrl12;}
	
	public void setNatrl12(Integer natrl12) {this.natrl12 = natrl12;}
		
	public String getRuleId() { return ruleId; }
	    
	public void setRuleId(String ruleId) { this.ruleId = ruleId; }
	    
	public String getRuleName() {return ruleName;}
		
    public void setRuleName(String ruleName) {this.ruleName = ruleName;}
		
	public Integer getOverallScore() {return overallScore;}
		
    public void setOverallScore(Integer overallScore) {this.overallScore = overallScore;}
		
    public Integer getScoring() {return scoring;}
		
	public void setScoring(Integer scoring) {this.scoring = scoring;}
	
	public Integer getOverallScore(Crsum03Vo crs) {
		if(crs.natrl01 != null && crs.natrl02 != null && crs.natrl03 != null && crs.natrl04 != null && crs.natrl05 != null && crs.natrl06 != null
				&& crs.natrl07 != null && crs.natrl08 != null && crs.natrl09 != null && crs.natrl10 != null && crs.natrl11 != null 
				&& crs.natrl12 != null) {
		Integer overallScore = (crs.natrl01 + crs.natrl02 + crs.natrl03 + crs.natrl04 + crs.natrl05
				+ crs.natrl06 + crs.natrl07 + crs.natrl08 + crs.natrl09 + crs.natrl10 + crs.natrl11
				+ crs.natrl12);
		crs.setOverallScore(overallScore);
		return overallScore;
		}
		else {
			crs.setOverallScore(null);
			return null;
		}
	}
	
	public String toString() {
        return "Crsum01Vo{" +               
                "ruleId='" + ruleId + '\'' +
                ", ruleName='" + ruleName + '\'' +
                ", overalllScore=" + overallScore +
                ", scoring=" + scoring +
                '}';
    }
}
