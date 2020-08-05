package com.comwave.rule.vo;

public class NATRL05Vo {

	private double jcicSecured;	//聯徵擔保科目餘額合計(千元)
	private double jcicUnsecured;	//聯徵非擔保科目餘額合計(千元，含現金卡)
	private double jcicContractSum;	//聯徵訂約金額(千元)
	
	private int score;	//聯徵額度動用率評分
	
	public NATRL05Vo() {super();}
	
	public NATRL05Vo(double jcicSecured, double jcicUnsecured, double jcicContractSum){
		super();
		this.jcicSecured = jcicSecured;
		this.jcicUnsecured = jcicUnsecured;
		this.jcicContractSum = jcicContractSum;
	}
	
	public double getJcicSecured() {return jcicSecured;}
	
	public void setJcicSecured(double jcicSecured) {this.jcicSecured = jcicSecured;}
	
	public double getJcicUnsecured() {return jcicUnsecured;}
	
	public void setJcicUnsecured(double jcicUnsecured) {this.jcicUnsecured = jcicUnsecured;}
	
	public double getJcicContractSum() {return jcicContractSum;}
	
	public void setJcicContractSum(double jcicContractSum) {this.jcicContractSum = jcicContractSum;}
	
	public int getScore() {return score;}
	
	public void setScore(int score) {this.score = score;}
	
	public double jcicTotal(NATRL05Vo nat) {
		return nat.jcicUnsecured + nat.jcicSecured;
	}
	
	public double getQuota(NATRL05Vo nat) {
		if(jcicTotal(nat) == 0) {
			return 0;
		}
		else if (nat.jcicContractSum == 0) {
			return 99.99;
		}
		else {
			return (jcicTotal(nat)/nat.jcicContractSum)*100;
		}
	}
	

}
