package com.comwave.rule.vo;

public class Natrl01Vo {
	private String title;//職稱
	private Double paidInCapital;//經營事業/服務單位之實收資本額(千元)
	private String isCivilServant;//是否為公務或軍警人員
	private String isPublicCompany;//經營事業/服務單位是否為上市櫃或公發公司
	
	private Integer score;
	private String ruleId;
	private String ruleName;
	
	public Natrl01Vo() {super();}
	
	public Natrl01Vo(String title,Double paidInCapital,String isCivilServant,String isPublicCompany) {
		super();
		this.title=title;
		this.paidInCapital=paidInCapital;
		this.isCivilServant=isCivilServant;
		this.isPublicCompany=isPublicCompany;
	}
	
	public String getTitle() {return title;}
	
	public void setTitle(String title) {this.title=title;}
	
	public Double getPaidInCapital() {return paidInCapital;}
	
	public void setPaidInCapital(Double paidInCapital) {this.paidInCapital=paidInCapital;}
	
	public String getIsCivilServant() {return isCivilServant;}
	
	public void setIsCivilServant(String isCivilServant) {this.isCivilServant=isCivilServant;}
	
	public String getIsPublicCompany() {return isPublicCompany;}
	
	public void setIsPublicCompany(String isPublicCompany) {this.isPublicCompany=isPublicCompany;}
	
	public Integer getScore() {return score;}
	
	public void setScore(Integer score) {this.score=score;}

	public String getRuleId() {return ruleId;}
	
	public void setRuleId(String ruleId) {this.ruleId=ruleId;}
	
	public String getRuleName() {return ruleName;}
	
	public void setRuleName(String ruleName) {this.ruleName=ruleName;}
	
	public String toString() {
        return "NATRL01Vo{" +
                "title='" + title + '\'' +
                ", paidInCapital='" + paidInCapital + '\'' +
                ", isCivilServant='" + isCivilServant + '\'' +
                ", isPublicCompany='" + isPublicCompany + '\'' +"\n"+
                ", ruleId='" + ruleId + '\'' +
                ", ruleName='" + ruleName + '\'' +
                ", score=" + score +
                '}';
    }

}
