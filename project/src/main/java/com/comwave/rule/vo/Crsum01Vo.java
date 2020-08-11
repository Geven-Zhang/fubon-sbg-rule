package com.comwave.rule.vo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Crsum01Vo {
     
	private Integer grpcr01 = 0;  // 工廠或公司設立期間評分
	private Integer grpcr02 = 0;  // 實收資本額評分
	private Integer grpcr03 = 0;  // 主經營者從業經驗評分
	private Integer grpcr04 = 0;  // 廠房或辦公室是否自有評分
	private Integer grpcr05 = 0;  // 他行往來家數評分
	private Integer grpcr06 = 0;  // 負責淨額與營業額比率評分
	private Integer grpcr07 = 0;  // 金融負債額度使用率評分
	private Integer grpcr08 = 0;  // 淨利率評分
	private Integer grpcr09 = 0;  // 營業額評分
	private Integer grpcr10 = 0;  // 主要供應商往來評分
	private Integer grpcr11 = 0;  // 主要銷貨商往來評分
	private Integer grpcr12 = 0;  // 主要銷貨商佔銷售額比率評分
	private Integer grpcr13 = 0;  // 存款均積數比負債淨額比率評分
	
	private String ruleId; // 規則ID
	private String ruleName; // 規則描述
	private Integer totalScore; // 總評分
	private Integer scoring; // 評分
	
	public Crsum01Vo() { super(); }
    
	public Crsum01Vo(Integer grpcr01, Integer grpcr02, Integer grpcr03, Integer grpcr04, Integer grpcr05, Integer grpcr06, Integer grpcr07,
			Integer grpcr08, Integer grpcr09, Integer grpcr10, Integer grpcr11, Integer grpcr12, Integer grpcr13) {
	    
	        super();
	        this.grpcr01 = grpcr01;
	        this.grpcr02 = grpcr02;
	        this.grpcr03 = grpcr03;
	        this.grpcr04 = grpcr04;
	        this.grpcr05 = grpcr05;
	        this.grpcr06 = grpcr06;
	        this.grpcr07 = grpcr07;
	        this.grpcr08 = grpcr08;
	        this.grpcr09 = grpcr09;
	        this.grpcr10 = grpcr10;
	        this.grpcr11 = grpcr11;
	        this.grpcr12 = grpcr12;
	        this.grpcr13 = grpcr13;
      
	    }
	
	public Integer getGrpcr01() {return grpcr01;}
	
	public void setGrpcr01(Integer grpcr01) {this.grpcr01 = grpcr01;}
	
    public Integer getGrpcr02() {return grpcr02;}
	
	public void setGrpcr02(Integer grpcr02) {this.grpcr02 = grpcr02;}
	
    public Integer getGrpcr03() {return grpcr03;}
	
	public void setGrpcr03(Integer grpcr03) {this.grpcr03 = grpcr03;}
	
    public Integer getGrpcr04() {return grpcr04;}
	
	public void setGrpcr04(Integer grpcr04) {this.grpcr04 = grpcr04;}
	
    public Integer getGrpcr05() {return grpcr05;}
	
	public void setGrpcr05(Integer grpcr05) {this.grpcr05 = grpcr05;}
	
    public Integer getGrpcr06() {return grpcr06;}
	
	public void setGrpcr06(Integer grpcr06) {this.grpcr06 = grpcr06;}
	
    public Integer getGrpcr07() {return grpcr07;}
	
	public void setGrpcr07(Integer grpcr07) {this.grpcr07 = grpcr07;}
	
    public Integer getGrpcr08() {return grpcr08;}
	
	public void setGrpcr08(Integer grpcr08) {this.grpcr08 = grpcr08;}
	
    public Integer getGrpcr09() {return grpcr09;}
	
	public void setGrpcr09(Integer grpcr09) {this.grpcr09 = grpcr09;}
	
    public Integer getGrpcr10() {return grpcr10;}
	
	public void setGrpcr10(Integer grpcr10) {this.grpcr10 = grpcr10;}
	
    public Integer getGrpcr11() {return grpcr11;}
	
	public void setGrpcr11(Integer grpcr11) {this.grpcr11 = grpcr11;}
	
    public Integer getGrpcr12() {return grpcr12;}
	
	public void setGrpcr12(Integer grpcr12) {this.grpcr12 = grpcr12;}
	
    public Integer getGrpcr13() {return grpcr13;}
	
	public void setGrpcr13(Integer grpcr13) {this.grpcr13 = grpcr13;}
	
	public String getRuleId() { return ruleId; }
	    
	public void setRuleId(String ruleId) { this.ruleId = ruleId; }
	    
	public String getRuleName() {return ruleName;}
		
    public void setRuleName(String ruleName) {this.ruleName = ruleName;}
		
	public Integer getTotalScore() {return totalScore;}
		
    public void  setTotalScore(Integer totalScore) {this.totalScore = totalScore;}
		
    public Integer getScoring() {return scoring;}
		
	public void setScoring(Integer scoring) {this.scoring = scoring;}
	
	public Integer getTotalScore(Crsum01Vo crs) {
		if(crs.grpcr01 != null && crs.grpcr02 != null && crs.grpcr03 != null && crs.grpcr04 != null && crs.grpcr05 != null && crs.grpcr06 != null
				&& crs.grpcr07 != null && crs.grpcr08 != null && crs.grpcr09 != null && crs.grpcr10 != null && crs.grpcr11 != null 
				&& crs.grpcr12 != null && crs.grpcr13 != null) {
		Integer totalScore = (crs.grpcr01 + crs.grpcr02 + crs.grpcr03 + crs.grpcr04 + crs.grpcr05
				+ crs.grpcr06 + crs.grpcr07 + crs.grpcr08 + crs.grpcr09 + crs.grpcr10 + crs.grpcr11
				+ crs.grpcr12 + crs.grpcr13);
		crs.setTotalScore(totalScore);
		return totalScore;
		}
		else {
			crs.setTotalScore(null);
			return null;
		}
	}
	
	public String toString() {
        return "Crsum01Vo{" +               
                "ruleId='" + ruleId + '\'' +
                ", ruleName='" + ruleName + '\'' +
                ", totalScore=" + totalScore +
                ", scoring=" + scoring +
                '}';
    }
	
}
