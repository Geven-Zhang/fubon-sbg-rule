package com.comwave.rule.vo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Natrl12Vo {
	private String isCivilServant;//是否為公務或軍警人員
	private String establishDate;//經營事業/服務單位之設立日期(西元年月日YYYY/MM/DD)
	private String ratingDate;//評等日期(西元年月日YYYY/MM/DD)
	
	private Integer scoring;//公司成立年限評分
	private String ruleId;
	private String ruleName;
	private Integer establishPeriodYear ; //公司成立年數
	
	public Natrl12Vo() {super();}
	
	public Natrl12Vo(String isCivilServant,String establishDate,String ratingDate) {
		super();
		this.isCivilServant=isCivilServant;
		this.establishDate=establishDate;
		this.ratingDate=ratingDate;
	}
	
	public String getIsCivilServant() {return isCivilServant;}
	
	public void setIsCivilServant(String isCivilServant) {this.isCivilServant=isCivilServant;}	

	public String getEstablishDate() {return establishDate;}
	
	public void setEstablishDate(String establishDate) {this.establishDate=establishDate;}	

	public String getRatingDate() {return ratingDate;}
	
	public void setRatingDate(String ratingDate) {this.ratingDate=ratingDate;}

	public Integer getScoring() {return scoring;}
	
	public void setScoring(Integer scoring) {this.scoring=scoring;}
	
	public String getRuleId() {return ruleId;}
	
	public void setRuleId(String ruleId) {this.ruleId=ruleId;}
	
	public String getRuleName() {return ruleName;}
	
	public void setRuleName(String ruleName) {this.ruleName=ruleName;}
	
	public Integer getEstablishPeriodYear() {return establishPeriodYear;}
	
	public void setEstablishPeriodYear(Integer establishPeriodYear) {this.establishPeriodYear = establishPeriodYear;}
	
	public int timeInterval(String startDate, String endDate) {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			c1.setTime(sdf.parse(startDate));
			c2.setTime(sdf.parse(endDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		int year = c2.get(Calendar.YEAR)-c1.get(Calendar.YEAR);
		int month = c2.get(Calendar.MONTH)-c1.get(Calendar.MONTH);
		int day = c2.get(Calendar.DAY_OF_MONTH)-c1.get(Calendar.DAY_OF_MONTH);
		int result;
		if(month>0) {
			result = year;
		}
		else if(month==0) {
			if(day>=0) {
				result = year;
			}
			else {
				result = year -1;
			}
		}
		else {
			result = year -1;
		}
		
		return result;
	}
	
	public Integer calEstablishPeriodYear(Natrl12Vo obj) {
		Integer year=null;
		if(obj.getIsCivilServant()!=null) {
			if(obj.getIsCivilServant().equals("01")) {
				year=9999;
			}
			else if(obj.getEstablishDate()==null || obj.getEstablishDate().equals("")) {
				year=0;
			}
			else if(obj.getIsCivilServant().equals("02") && obj.getRatingDate()!=null && !obj.getRatingDate().equals("")){
				year=obj.timeInterval(obj.getEstablishDate(), obj.getRatingDate());
			}
		}
		else {
			if(obj.getEstablishDate()==null || obj.getEstablishDate().equals("")) {
				year=0;
			}
			else if(obj.getRatingDate()!=null && !obj.getRatingDate().equals("")){
				year=obj.timeInterval(obj.getEstablishDate(), obj.getRatingDate());
			}
		}		
		obj.setEstablishPeriodYear(year);
		return year;
	}
	
	public String toString() {
        return "Natrl12Vo{" +
                "isCivilServant='" + isCivilServant + '\'' +
                ", establishDate='" + establishDate + '\'' +
                ", ratingDate='" + ratingDate + '\'' +"\n"+
                ", ruleId='" + ruleId + '\'' +
                ", ruleName='" + ruleName + '\'' +
                ", establishPeriodYear=" + establishPeriodYear +
                ", scoring=" + scoring +
                '}';
    }

}
