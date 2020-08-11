package com.comwave.rule.vo;

public class Natrl08Vo {

	private Integer bankNum;
	private Integer score;
	private String ruleId; //規則ID
	private String ruleName; //規則描述
	
	public Natrl08Vo() {super();}
	
	public Natrl08Vo(Integer bankNum){
		super();
		this.bankNum = bankNum;
	}

	public Integer getBankNum() {return bankNum;}
	
	public void setBankNum(Integer bankNum) {this.bankNum = bankNum;}	
	
	public Integer getScore() {return score;}
	
	public void setScore(Integer score) {this.score = score;}	
	
	public String getRuleId() {return ruleId;}
	
	public void setRuleId(String ruleId) {this.ruleId = ruleId;} 
	
	public String getRuleName() {return ruleName;}
	
	public void setRuleName(String ruleName) {this.ruleName = ruleName;}
	
	  public String toString() {
	        return "Natrl08Vo{" +
	                "bankNum='" + bankNum + '\'' +
	                ", ruleId='" + ruleId + '\'' +
	                ", ruleName='" + ruleName + '\'' +
	                ", score='" + score + '\'' +
	                '}';
	    }
}
