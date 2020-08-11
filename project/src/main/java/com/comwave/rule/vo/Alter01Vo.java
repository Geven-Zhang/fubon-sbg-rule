package com.comwave.rule.vo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Alter01Vo {

	private Double businessTurnover; // 企業團營業額
	private Double usdollarCurrency; // 美金匯率
	
	private String ruleId; // 規則ID
	private String ruleName; // 規則描述
	private Double revenue; // 企業年營收
	private Integer scoring; // 評分
	
	
	public Alter01Vo() { super(); }
	    
	public Alter01Vo(Double businessTurnover, Double usdollarCurrency) {
	    
	        super();
	        this.businessTurnover = businessTurnover;
	        this.usdollarCurrency = usdollarCurrency;
	       
	    }
	
    public Double getBusinessTurnover() { return businessTurnover; }
    
    public void setBusinessTurnover(Double businessTurnover) { this.businessTurnover = businessTurnover; }
    
    public Double getUsdollarCurrency() { return usdollarCurrency; }
    
    public void setUsdollarCurrency(Double usdollarCurrency) { this.usdollarCurrency = usdollarCurrency; }
     
    public String getRuleId() { return ruleId; }
    
    public void setRuleId(String ruleId) { this.ruleId = ruleId; }
    
    public String getRuleName() {return ruleName;}
	
	public void setRuleName(String ruleName) {this.ruleName = ruleName;}
	
    public Double getRevenue() {return revenue;}
	
	public void setRevenue(Double revenue) {this.revenue = revenue;}
	
	public Integer getScoring() {return scoring;}
	
	public void setScoring(Integer scoring) {this.scoring = scoring;}
	
	public Double getRevenue(Alter01Vo alt) {
		if(alt.businessTurnover != null && usdollarCurrency != null) {
		Double revenue = (alt.businessTurnover * alt.usdollarCurrency)/100;
		alt.setRevenue(revenue);
		return revenue;
	}
		else {
			alt.setRevenue(null);
			return null;
			}
		}
	
	public String toString() {
	        return "Alter01Vo{" +
	                "businessTurnover='" + businessTurnover + '\'' +
	                ", usdollarCurrency='" + usdollarCurrency + '\'' +"\n"+
	                ", ruleId='" + ruleId + '\'' +
	                ", ruleName='" + ruleName + '\'' +
	                ", revenue=" + revenue +
	                ", scoring=" + scoring +
	                '}';
	    }
}
