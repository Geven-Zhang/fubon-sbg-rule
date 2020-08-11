package com.comwave.rule.vo;

public class Crsum04Vo {
	private Integer crsum03;
	private Integer alter02;
	
	private String ruleId;
	private String ruleName;
	private Integer max;
	
	public Crsum04Vo() { super(); }
	
	public Crsum04Vo(Integer crsum03, Integer alter02) {
		super();
		this.crsum03 = crsum03;
		this.alter02 = alter02;
	}

	public Integer getCrsum03() {
		return crsum03;
	}

	public void setCrsum03(Integer crsum03) {
		this.crsum03 = crsum03;
	}

	public Integer getAlter02() {
		return alter02;
	}

	public void setAlter02(Integer alter02) {
		this.alter02 = alter02;
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

	public Integer getMax() {
		return max;
	}

	public void setMax(Integer max) {
		this.max = max;
	}

	public boolean calMax(Crsum04Vo crsum04Vo) {
		
		if (crsum04Vo.getAlter02() == null || crsum04Vo.getCrsum03() == null) {
			return false;
		} else {
			crsum04Vo.setMax(Math.max(crsum04Vo.getCrsum03(), crsum04Vo.getAlter02()));
			
			return true;
		}
	}
	
	@Override
	public String toString() {
		return "Crsum04Vo [crsum03=" + crsum03 + ", alter02=" + alter02 + ", ruleId=" + ruleId + ", ruleName="
				+ ruleName + ", max=" + max + "]";
	}
}
