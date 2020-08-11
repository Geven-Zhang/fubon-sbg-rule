package com.comwave.rule.vo;

public class Natrl07Vo {

	private String ownCashCard;
	private Double cashCardAMT;
	private String ruleId; //規則ID
	private String ruleName; //規則描述	
	private Integer score;
	
	public Natrl07Vo() {super();}
	
	public Natrl07Vo(String ownCashCard, Double cashCardAMT){
		super();
		this.ownCashCard = ownCashCard;
		this.cashCardAMT = cashCardAMT;
	}
	
	public String getOwnCashCard() {return ownCashCard;}
	
	public void setOwnCashCard( String ownCashCard) {this.ownCashCard = ownCashCard;}
	
	public Double getCashCardAMT() {return cashCardAMT;}
	
	public void setCashCardAMT( Double cashCardAMT) {this.cashCardAMT = cashCardAMT;}
	
	public Integer getScore() {return score;}
	
	public void setScore(Integer score) {this.score = score;}	
	
	public String getRuleId() {return ruleId;}
	
	public void setRuleId(String ruleId) {this.ruleId = ruleId;} 
	
	public String getRuleName() {return ruleName;}
	
	public void setRuleName(String ruleName) {this.ruleName = ruleName;}
	
	  public String toString() {
	        return "Natrl07Vo{" +
	                "ownCashCard='" + ownCashCard + '\'' +
	                ", cashCardAMT='" + cashCardAMT + '\'' +
	                ", ruleId='" + ruleId + '\'' +
	                ", ruleName='" + ruleName + '\'' +"\n"+
	                ", score='" + score + '\'' + 
	                '}';
	    }
}
