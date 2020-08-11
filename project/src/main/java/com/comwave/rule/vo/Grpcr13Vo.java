package com.comwave.rule.vo;

public class Grpcr13Vo {
	private Double loanDomesticBank; // 企業團國內金融機構總借款金額(美金千元)
	private Double loanFolk; // 企業團國內民間借貸總金額(美金千元)
	private Double loanForeinBank; // 企業團海外總借款金額(美金千元)
	private Double loanDepositBacked; // 企業團定存單十足擔保之借款金額(美金千元)
	private Double bankCurr; // 企業團在本行最近半年之存款平均積數(美金百萬元)
	private Double bankOther; // 企業團在他行最近半年之存款平均積數(美金百萬元)
	
	private String ruleId; // 規則ID
	private String ruleName; // 規則描述
	 private Double proportion; 
	private int scoring = 0; // 存款均積數比負債淨額比率評分
	
	public Grpcr13Vo() { super(); }
	
	public Grpcr13Vo(Double loanDomesticBank, Double loanFolk, Double loanForeinBank, Double loanDepositBacked,
			Double bankCurr, Double bankOther) {
		super();
		this.loanDomesticBank = loanDomesticBank;
		this.loanFolk = loanFolk;
		this.loanForeinBank = loanForeinBank;
		this.loanDepositBacked = loanDepositBacked;
		this.bankCurr = bankCurr;
		this.bankOther = bankOther;
	}

	public Double getLoanDomesticBank() {
		return loanDomesticBank;
	}

	public void setLoanDomesticBank(Double loanDomesticBank) {
		this.loanDomesticBank = loanDomesticBank;
	}

	public Double getLoanFolk() {
		return loanFolk;
	}

	public void setLoanFolk(Double loanFolk) {
		this.loanFolk = loanFolk;
	}

	public Double getLoanForeinBank() {
		return loanForeinBank;
	}

	public void setLoanForeinBank(Double loanForeinBank) {
		this.loanForeinBank = loanForeinBank;
	}

	public Double getLoanDepositBacked() {
		return loanDepositBacked;
	}

	public void setLoanDepositBacked(Double loanDepositBacked) {
		this.loanDepositBacked = loanDepositBacked;
	}

	public Double getBankCurr() {
		return bankCurr;
	}

	public void setBankCurr(Double bankCurr) {
		this.bankCurr = bankCurr;
	}

	public Double getBankOther() {
		return bankOther;
	}

	public void setBankOther(Double bankOther) {
		this.bankOther = bankOther;
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

	public Double getProportion() {
		return proportion;
	}

	public void setProportion(Double proportion) {
		this.proportion = proportion;
	}

	public int getScoring() {
		return scoring;
	}

	public void setScoring(int scoring) {
		this.scoring = scoring;
	}
	
	public Double proportion(Grpcr13Vo grpcr13Vo) {
		Double netDebt = 0.0;
		Double proportion = null;
		
		if (grpcr13Vo.getLoanDomesticBank() == null || grpcr13Vo.getLoanFolk() == null
				|| grpcr13Vo.getLoanForeinBank() == null || grpcr13Vo.getLoanDepositBacked() == null) {
			return proportion;
		}

		netDebt += grpcr13Vo.getLoanDomesticBank() != null ? grpcr13Vo.getLoanDomesticBank() : 0;
		netDebt += grpcr13Vo.getLoanFolk() != null ? grpcr13Vo.getLoanFolk() : 0;
		netDebt += grpcr13Vo.getLoanForeinBank() != null ? grpcr13Vo.getLoanForeinBank() : 0;
		netDebt -= grpcr13Vo.getLoanDepositBacked() != null ? grpcr13Vo.getLoanDepositBacked() : 0;
		
		if (netDebt == 0) {
			proportion = 9999.0;
		} else {
			proportion = (grpcr13Vo.getBankCurr() + grpcr13Vo.getBankOther()) * 1000
					/ netDebt * 100;
		}
		
		grpcr13Vo.setProportion(proportion);
		
		return proportion;
	}

	@Override
	public String toString() {
		return "Grpcr13Vo [loanDomesticBank=" + loanDomesticBank + ", loanFolk=" + loanFolk + ", loanForeinBank="
				+ loanForeinBank + ", loanDepositBacked=" + loanDepositBacked + ", bankCurr=" + bankCurr
				+ ", bankOther=" + bankOther + ", ruleId=" + ruleId + ", ruleName=" + ruleName + ", proportion="
				+ proportion + ", scoring=" + scoring + "]";
	}
	
}
