package com.comwave.rule.vo;

public class Natrl09Vo {
	private Integer code_3_month;
	private Integer code_4_month;
	
	private Integer scoring;
	private String isLate;
	private String ruleId;
	private String ruleName;
	
	public Natrl09Vo() {super();}
	
	public Natrl09Vo(Integer code_3_month,Integer code_4_month) {
		super();
		this.code_3_month=code_3_month;
		this.code_4_month=code_4_month;
	}
	
	public Integer getCode_3_month() {return code_3_month;}
	
	public void setCode_3_month(Integer code_3_month) {this.code_3_month = code_3_month;}
	
	public Integer getCode_4_month() {return code_4_month;}
	
	public void setCode_4_month(Integer code_4_month) {this.code_4_month = code_4_month;}	

	public Integer getScoring() {return scoring;}
	
	public void setScoring(Integer scoring) {this.scoring = scoring;}	

	public String getIsLate() {return isLate;}
	
	public void setIsLate(String isLate) {this.isLate = isLate;}
	
	public String getRuleId() {return ruleId;}
	
	public void setRuleId(String ruleId) {this.ruleId=ruleId;}
	
	public String getRuleName() {return ruleName;}
	
	public void setRuleName(String ruleName) {this.ruleName=ruleName;}
	
	public String ifIsLate(Natrl09Vo obj) {
		String isLate=null;
		if(obj.getCode_3_month()!=null && obj.getCode_4_month()!=null 
				&& obj.getCode_3_month()<=12 && obj.getCode_4_month()<=12 
				&& obj.getCode_3_month()>=0 && obj.getCode_4_month()>=0) {
			if(obj.getCode_3_month()+obj.getCode_4_month()>0) {
				isLate="Y";
			}
			else {
				isLate="N";
			}
		}		
		obj.setIsLate(isLate);
		return isLate;
	}
	
	public String toString() {
        return "NATRL09Vo{" +
                "code_3_month='" + code_3_month + '\'' +
                ", code_4_month='" + code_4_month + '\'' +
                ", isLate='" + isLate + '\'' +"\n"+
                ", ruleId='" + ruleId + '\'' +
                ", ruleName='" + ruleName + '\'' +
                ", scoring=" + scoring +
                '}';
    }

}
