package com.comwave.rule.vo;

public class Natrl04Vo {
	private Double currentDeposits;//活存6個月均額(千元)
	private Double fixedDeposits;//定存金額(千元)
	private Double pledgeAmount;//設質金額(千元)
	private Double totalAmount;//加計本案後之總額度(千元)
	private String isBorrower;//是否本案借款人
	
	private Integer scoring;//存借比率評分
	private Double avgDeposits;//最近半年存款均額(千元)
	private Double ratio;//存借比率
	private String ruleId;
	private String ruleName;
	
	public Natrl04Vo() {super();}
	
	public Natrl04Vo(Double currentDeposits,Double fixedDeposits,Double pledgeAmount,Double totalAmount,String isBorrower) {
		super();
		this.currentDeposits=currentDeposits;
		this.fixedDeposits=fixedDeposits;
		this.pledgeAmount=pledgeAmount;
		this.totalAmount=totalAmount;
		this.isBorrower=isBorrower;
	}
	
	public Double getCurrentDeposits() {return currentDeposits;}
	
	public void setCurrentDeposits(Double currentDeposits) {this.currentDeposits = currentDeposits;}

	public Double getFixedDeposits() {return fixedDeposits;}
	
	public void setFixedDeposits(Double fixedDeposits) {this.fixedDeposits = fixedDeposits;}

	public Double getPledgeAmount() {return pledgeAmount;}
	
	public void setPledgeAmount(Double pledgeAmount) {this.pledgeAmount = pledgeAmount;}

	public Double getTotalAmount() {return totalAmount;}
	
	public void setTotalAmount(Double totalAmount) {this.totalAmount = totalAmount;}

	public String getIsBorrower() {return isBorrower;}
	
	public void setIsBorrower(String isBorrower) {this.isBorrower = isBorrower;}

	public Integer getScoring() {return scoring;}
	
	public void setScoring(Integer scoring) {this.scoring = scoring;}

	public Double getAvgDeposits() {return avgDeposits;}
	
	public void setAvgDeposits(Double avgDeposits) {this.avgDeposits = avgDeposits;}

	public Double getRatio() {return ratio;}
	
	public void setRatio(Double ratio) {this.ratio = ratio;}
	
	public String getRuleId() {return ruleId;}
	
	public void setRuleId(String ruleId) {this.ruleId=ruleId;}
	
	public String getRuleName() {return ruleName;}
	
	public void setRuleName(String ruleName) {this.ruleName=ruleName;}
	
	public Double calRatio(Natrl04Vo obj) {
		Double ratio=null;
		Double avgDeposits=null;
		if(obj.getCurrentDeposits()!=null && obj.getFixedDeposits()!=null && obj.getPledgeAmount()!=null && obj.getTotalAmount()!=null && obj.getIsBorrower()!=null) {
			avgDeposits=obj.getCurrentDeposits()+obj.getFixedDeposits()-obj.getPledgeAmount();
			if(obj.getTotalAmount()==0 && obj.getIsBorrower().equals("01")) {
				ratio=(Double)null;
			}
			else if(obj.getTotalAmount()==0 && !obj.getIsBorrower().equals("01")) {
				if(avgDeposits>0) {
					ratio=9999.0;
				}
				else {
					ratio=0.0;
				}
			}
			else if(obj.getTotalAmount()!=0) {
				ratio=(Double)avgDeposits*100/obj.getTotalAmount();
			}
		}		
		obj.setRatio(ratio);
		obj.setAvgDeposits(avgDeposits);
		return ratio;
	}
	
	public String toString() {
        return "NATRL04Vo{" +
                "currentDeposits='" + currentDeposits + '\'' +
                ", fixedDeposits='" + fixedDeposits + '\'' +
                ", pledgeAmount='" + pledgeAmount + '\'' +
                ", avgDeposits='" + avgDeposits + '\'' +
                ", totalAmount='" + totalAmount + '\'' +
                ", ratio='" + ratio + '\'' +
                ", isBorrower='" + isBorrower + '\'' +"\n"+
                ", ruleId='" + ruleId + '\'' +
                ", ruleName='" + ruleName + '\'' +
                ", scoring=" + scoring +
                '}';
    }

}
