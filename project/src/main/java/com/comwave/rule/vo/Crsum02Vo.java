package com.comwave.rule.vo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Crsum02Vo {

	private Integer crsum01Score; // 大中華信評評等
	private Integer alter01Score; // 企業年營收門檻評等
	
	private String ruleId; // 規則ID
	private String ruleName; // 規則描述
	private Integer max;  // 取最大值
	
    public Crsum02Vo() { super(); }
    
	public Crsum02Vo(Integer crsum01Score, Integer alter01Score) {
	    
	        super();
	        this.crsum01Score = crsum01Score;
	        this.alter01Score = alter01Score;            	          
	    }
	
    public Integer getCrsum01Score() {return crsum01Score;}
	
	public void setCrsum01Score(Integer crsum01Score) {this.crsum01Score = crsum01Score;}
	
    public Integer getAlter01Score() {return alter01Score;}
	
	public void setAlter01Score(Integer alter01Score) {this.alter01Score = alter01Score;}
	
	public String getRuleId() {return ruleId; }
	    
	public void setRuleId(String ruleId) { this.ruleId = ruleId; }
	    
	public String getRuleName() {return ruleName;}
		
    public void setRuleName(String ruleName) {this.ruleName = ruleName;}
	
    public Integer getMax() {return max;}
	
	public void setMax(Integer max) {this.max = max;}
	
	public Boolean calMax(Crsum02Vo crs) {
		if(crs.crsum01Score != null && crs.alter01Score != null) {
		if(crs.crsum01Score > crs.alter01Score) {
			max = crs.crsum01Score;
		}
		if(crs.crsum01Score == crs.alter01Score) {
			max = crs.crsum01Score;			
		}
		if(crs.crsum01Score < crs.alter01Score) {
			max = crs.alter01Score;			
		}
		crs.setMax(max);
		return true;
		}
		else {
			crs.setMax(null);
			return false;
		}
	}

	public String toString() {
        return "Crsum02Vo{" +               
                "ruleId='" + ruleId + '\'' +
                ", ruleName='" + ruleName + '\'' +
                ", max=" + max +
                '}';
	}
}

