package com.comwave.rule.vo;

public class Natrl06Vo {

	private Double jcicSecured;	//聯徵擔保科目餘額合計(千元)
	private Double jcicUnsecured;	//聯徵非擔保科目餘額合計(千元，含現金卡)
	private Double jcicTotal;	//聯徵餘額合計(千元)
	private Double loanRatio;	//無擔借款比率
	private String ruleId; //規則ID
	private String ruleName; //規則描述
	private Integer score;	//授借比率評分
	
	public Natrl06Vo() {super();}
	
	public Natrl06Vo(Double jcicSecured, Double jcicUnsecured){
		super();

			this.jcicSecured = jcicSecured;

			this.jcicUnsecured = jcicUnsecured;

	}
	
	public Double getJcicSecured() {return jcicSecured;}
	
	public void setJcicSecured(Double jcicSecured) {this.jcicSecured = jcicSecured;}
	
	public Double getJcicUnsecured() {return jcicUnsecured;}
	
	public void setJcicUnsecured(Double jcicUnsecured) {this.jcicUnsecured = jcicUnsecured;}
	
	public Integer getScore() {return score;}
	
	public void setScore(Integer score) {this.score = score;}
	
	public Double getJcicTotal() {return jcicTotal;}
	
	public void setJcicTotal(Double jcicTotal) {this.jcicTotal = jcicTotal;}
	
	public Double getLoanRatio() {return loanRatio;}
	
	public void setLoanRatio(Double loanRatio) {this.loanRatio = loanRatio;}
	
	public String getRuleId() {return ruleId;}
	
	public void setRuleId(String ruleId) {this.ruleId = ruleId;} 
	
	public String getRuleName() {return ruleName;}
	
	public void setRuleName(String ruleName) {this.ruleName = ruleName;}
	
	public Double calJcicTotal(Natrl06Vo nat) {
		if(nat.jcicSecured!=null && nat.jcicUnsecured!=null) {
			Double jcicTotal = nat.jcicSecured + nat.jcicUnsecured;
			nat.setJcicTotal(jcicTotal);
			return jcicTotal;
		}
		else {
			nat.setJcicTotal(null);
			return null;
		}
		
	}
	
	
	
	public Double calLoanRatio(Natrl06Vo nat) {
		if(calJcicTotal(nat)==null) {
			return null;
		}
		else if(calJcicTotal(nat) == 0) {
			nat.setLoanRatio(99.99);
			return 99.99;
		}
		else{
			Double lr = (nat.jcicUnsecured/calJcicTotal(nat))*100; 
			nat.setLoanRatio(lr);
			return lr;
		}
	}
	
	  public String toString() {
	        return "Natrl06Vo{" +
	                "jcicSecured='" + jcicSecured + '\'' +
	                ", jcicUnsecured='" + jcicUnsecured + '\'' +
	                ", jcicTotal='" + jcicTotal + '\'' +
	                ", loanRatio='" + loanRatio + '\'' +"\n"+
	                ", ruleId='" + ruleId + '\'' +
	                ", ruleName=" + ruleName + 
	                ", score=" + score +  
	                '}';
	    }
	
	
}
