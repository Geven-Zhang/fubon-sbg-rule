package com.comwave.rule.vo;

public class Natrl06Vo {

	private double jcicSecured;	//聯徵擔保科目餘額合計(千元)
	private double jcicUnsecured;	//聯徵非擔保科目餘額合計(千元，含現金卡)
	private double jcicTotal;	//聯徵餘額合計(千元)
	private double loanRatio;	//無擔借款比率
	private int score;	//授借比率評分
	
	public Natrl06Vo() {super();}
	
	public Natrl06Vo(double jcicSecured, double jcicUnsecured){
		super();
		this.jcicSecured = jcicSecured;
		this.jcicUnsecured = jcicUnsecured;
	}
	
	public double getJcicSecured() {return jcicSecured;}
	
	public void setJcicSecured(double jcicSecured) {this.jcicSecured = jcicSecured;}
	
	public double getJcicUnsecured() {return jcicUnsecured;}
	
	public void setJcicUnsecured(double jcicUnsecured) {this.jcicUnsecured = jcicUnsecured;}
	
	public int getScore() {return score;}
	
	public void setScore(int score) {this.score = score;}
	
	public double getJcicTotal() {return jcicTotal;}
	
	public void setJcicTotal(double jcicTotal) {this.jcicTotal = jcicTotal;}
	
	public double getLoanRatio() {return loanRatio;}
	
	public void setLoanRatio(double loanRatio) {this.loanRatio = loanRatio;}
	
	public double calJcicTotal(Natrl06Vo nat) {
		double jcicTotal = nat.jcicSecured + nat.jcicUnsecured;
		nat.setJcicTotal(jcicTotal);
		return jcicTotal;
	}
	
	
	
	public double calLoanRatio(Natrl06Vo nat) {
		if(calJcicTotal(nat) == 0) {
			nat.setLoanRatio(99.99);
			return 99.99;
		}
		else{
			double lr = (nat.jcicUnsecured/calJcicTotal(nat))*100; 
			nat.setLoanRatio(lr);
			return lr;
		}
	}
	
	
}
