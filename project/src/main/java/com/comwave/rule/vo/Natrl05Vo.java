package com.comwave.rule.vo;

public class Natrl05Vo {

	private Double jcicSecured;	//聯徵擔保科目餘額合計(千元)
	private Double jcicUnsecured;	//聯徵非擔保科目餘額合計(千元，含現金卡)
	private Double jcicContractSum;	//聯徵訂約金額(千元)
	private Double total;
	private Double quota;
	private String ruleId; //規則ID
	private String ruleName; //規則描述
	private Integer score;	//聯徵額度動用率評分
	
	public Natrl05Vo() {super();}
	
	public Natrl05Vo(Double jcicSecured, Double jcicUnsecured, Double jcicContractSum){
		super();
		
		this.jcicSecured = jcicSecured;
		
		this.jcicUnsecured = jcicUnsecured;

		this.jcicContractSum = jcicContractSum;

		}
	
	
	public Double getJcicSecured() {return jcicSecured;}
	
	public void setJcicSecured(Double jcicSecured) {this.jcicSecured = jcicSecured;}
	
	public Double getJcicUnsecured() {return jcicUnsecured;}
	
	public void setJcicUnsecured(Double jcicUnsecured) {this.jcicUnsecured = jcicUnsecured;}
	
	public Double getJcicContractSum() {return jcicContractSum;}
	
	public void setJcicContractSum(Double jcicContractSum) {this.jcicContractSum = jcicContractSum;}
	
	public Double getTotal() {return total;}
	
	public void setTotal(Double total) {this.total = total;}	
	
	public Double getQuota() {return quota;}
	
	public void setQuota(Double quota) {this.quota = quota;}	
	
	public Integer getScore() {return score;}
	
	public void setScore(Integer score) {this.score = score;}
	
	public String getRuleId() {return ruleId;}
	
	public void setRuleId(String ruleId) {this.ruleId = ruleId;} 
	
	public String getRuleName() {return ruleName;}
	
	public void setRuleName(String ruleName) {this.ruleName = ruleName;}
	
	public Double jcicTotal(Natrl05Vo nat) {
		if(nat.jcicContractSum!=null && nat.jcicSecured!=null && nat.jcicUnsecured!=null) {
			nat.setTotal(nat.jcicUnsecured + nat.jcicSecured);
			return nat.jcicUnsecured + nat.jcicSecured;
		}
		else {
			nat.setTotal(null);
			return null;
		}
		
		
	}
	
	public Double getQuota(Natrl05Vo nat) {
		if (jcicTotal(nat) == null) {
			nat.setQuota(null);
			return null;
		}
		else if(jcicTotal(nat) == 0) {
			nat.setQuota(0.00);
			return 0.00;
		}
		else if (nat.jcicContractSum == 0) {
			nat.setQuota(99.99);
			return 99.99;
		}
		else {
			nat.setQuota((jcicTotal(nat)/nat.jcicContractSum)*100);
			return (jcicTotal(nat)/nat.jcicContractSum)*100;
		}
	}
	
    public String toString() {
        return "Natrl05Vo{" +
                "jcicSecured='" + jcicSecured + '\'' +
                ", jcicUnsecured='" + jcicUnsecured + '\'' +
                ", jcicContractSum='" + jcicContractSum + '\'' +
                ", ruleId='" + ruleId + '\'' +"\n"+
                ", ruleName='" + ruleName + '\'' +
                ", total=" + total + 
                ", quota=" + quota + 
                ", score=" + score + 
                '}';
    }
	

}
