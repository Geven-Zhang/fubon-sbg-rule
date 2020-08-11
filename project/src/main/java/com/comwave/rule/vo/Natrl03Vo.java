package com.comwave.rule.vo;

public class Natrl03Vo {
	private String isCreditAccount;//是否本行授信戶
	private Double creditLimit;//本行核准額度(千元)
	private Double loanBalance;//本行最近半年放款均餘(千元)
	
	private Integer scoring;//額度動用率評分
	private Double usageRate;//動用率
	private String ruleId;
	private String ruleName;
	
	public Natrl03Vo() {super();}
	
	public Natrl03Vo(String isCreditAccount,Double creditLimit,Double loanBalance) {
		super();
		this.isCreditAccount=isCreditAccount;
		this.creditLimit=creditLimit;
		this.loanBalance=loanBalance;
	}
	
	public String getIsCreditAccount() {return isCreditAccount;}
	
	public void setIsCreditAccount(String isCreditAccount) {this.isCreditAccount=isCreditAccount;}

	public Double getCreditLimit() {return creditLimit;}
	
	public void setCreditLimit(Double creditLimit) {this.creditLimit=creditLimit;}

	public Double getLoanBalance() {return loanBalance;}
	
	public void setLoanBalance(Double loanBalance) {this.loanBalance=loanBalance;}

	public Integer getScoring() {return scoring;}
	
	public void setScoring(Integer scoring) {this.scoring=scoring;}

	public String getRuleId() {return ruleId;}
	
	public void setRuleId(String ruleId) {this.ruleId=ruleId;}
	
	public String getRuleName() {return ruleName;}
	
	public void setRuleName(String ruleName) {this.ruleName=ruleName;}
	
	public Double getUsageRate() {return usageRate;}
	
	public void setUsageRate(Double usageRate) {this.usageRate=usageRate;}

	public Double calUsageRate(Natrl03Vo obj) {
		Double usageRate=null;
		if(obj.getIsCreditAccount()!=null && obj.getCreditLimit()!=null && obj.getLoanBalance()!=null) {
			if(obj.getIsCreditAccount().equals("02")&&(obj.getCreditLimit()+obj.getLoanBalance()>0)) {
				//動用率=error
				usageRate=(Double)null;
			}
			else if(obj.getLoanBalance()==0) {
				usageRate=0.0;
			}
			else if(obj.getCreditLimit()==0) {
				usageRate=9999.0;
			}
			else if(obj.getCreditLimit()!=0) {
				usageRate=(Double)obj.getLoanBalance()*100/obj.getCreditLimit();
			}
		}
		else {
			//輸入為null錯誤
		}
		obj.setUsageRate(usageRate);
		return usageRate;
	}
	
	public String toString() {
        return "NATRL03Vo{" +
                "isCreditAccount='" + isCreditAccount + '\'' +
                ", creditLimit='" + creditLimit + '\'' +
                ", loanBalance='" + loanBalance + '\'' +
                ", usageRate='" + usageRate + '\'' +"\n"+
                ", ruleId='" + ruleId + '\'' +
                ", ruleName='" + ruleName + '\'' +
                ", scoring=" + scoring +
                '}';
    }

}
