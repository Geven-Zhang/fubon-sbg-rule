package com.comwave.rule.vo;

public class Natrl11Vo {

	private String isGovernment;
	private String isPublicCompany;
	private Double capital; 
	private Double scale;
	private Integer score;
	private String ruleId; 
	private String ruleName; 
	
	public Natrl11Vo() {super();}
	
	public Natrl11Vo(String isGovernment, String isPublicCompany, Double capital){
		super();
		this.isGovernment = isGovernment;
		this.isPublicCompany = isPublicCompany;
		this.capital = capital;
	}
	
	public void setIsGovernment(String isGovernment) {
		this.isGovernment = isGovernment;
	}
	
	public String getIsGovernment() {
		return isGovernment;
	}
	
	public void setIsPublicComapany() {
		this.isPublicCompany = isPublicCompany;
	}
	
	public String getIsPublicCompany() {
		return isPublicCompany;
	}
	
	public Double getCapital() {
		return capital;
	}
	
	public void setCapital(Double capital) {
		this.capital = capital;
	}
	
	public void setScale(Double scale) {
		this.scale = scale;
	}
	
	public Double getScale() {
		return scale;
	}
	
	public void setScore (Integer score) {
		this.score = score;
	}
	
	public Integer getScore() {
		return score;
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
	
	public Double calScale(Natrl11Vo nat ) {
		Double scale = null;
		if(nat.isGovernment!=null)  {
			if(nat.isGovernment.equals("01")) {
				scale = -1.0;
			}
			else if(nat.isPublicCompany!=null) {
				 if(nat.isPublicCompany.equals("01")) {
						scale = -2.0;
				}
				 else if (nat.capital != null ) {
					 scale = capital/10;
					}
			}
			else {
				if (nat.capital != null ) {
					 scale = capital/10;
					}
			}
		}
		else {
			 if(nat.isPublicCompany!=null) {
				 if(nat.isPublicCompany.equals("01")) {
						scale = -2.0;
				}
				 else if (nat.capital != null ) {
					 scale = capital/10;
					}
			}
			 else {
				 if (nat.capital != null ) {
					 scale = capital/10;
					}
			 }
		}
		nat.setScale(scale);
		return scale;
	}
	
	 public String toString() {
	        return "Natrl08Vo{" +
	                "isGovernment='" + isGovernment + '\'' +
	                "isPublicCompany='" + isPublicCompany + '\'' +
	                "capital='" + capital + '\'' +
	                "scale='" + scale + '\'' +
	                ", ruleId='" + ruleId + '\'' +
	                ", ruleName='" + ruleName + '\'' +
	                ", score='" + score + '\'' +
	                '}';
	    }

	
}
