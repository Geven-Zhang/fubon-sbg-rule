package com.comwave.rule.vo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 工廠或公司設立期間評分規則數據對象
 */
public class Grpcr01Vo {

    private String creditIndustry; // 授信戶產業別
    private String applyBankDate; // 於本行申請貸款之日期
    private String factoryEstablishDate; // 大陸/海外工廠設立日期
    private String companyEstablishDate; // 公司設立日期

    private String ruleId; // 規則ID
    private String ruleName; // 規則描述
    private int establishPeriod = 0; // 工廠或公司設立期間
    private int scoring = 0; // 評分

    public Grpcr01Vo() {
        super();
    }

    public Grpcr01Vo(String creditIndustry, String factoryEstablishDate,
                     String companyEstablishDate) {
        super();
        this.creditIndustry = creditIndustry;
        this.factoryEstablishDate = factoryEstablishDate;
        this.companyEstablishDate = companyEstablishDate;
    }

    public String getCreditIndustry() {
        return creditIndustry;
    }

    public void setCreditIndustry(String creditIndustry) {
        this.creditIndustry = creditIndustry;
    }

    public String getApplyBankDate() {
        // 於本行申請貸款之日期取系統日
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        applyBankDate = dateFormat.format(new Date());
        return applyBankDate;
    }

    public void setApplyBankDate(String applyBankDate) {
        this.applyBankDate = applyBankDate;
    }

    public String getFactoryEstablishDate() {
        return factoryEstablishDate;
    }

    public void setFactoryEstablishDate(String factoryEstablishDate) {
        this.factoryEstablishDate = factoryEstablishDate;
    }

    public String getCompanyEstablishDate() {
        return companyEstablishDate;
    }

    public void setCompanyEstablishDate(String companyEstablishDate) {
        this.companyEstablishDate = companyEstablishDate;
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

    public int getEstablishPeriod() {
        return establishPeriod;
    }

    public void setEstablishPeriod(int establishPeriod) {
        this.establishPeriod = establishPeriod;
    }

    public int getScoring() {
        return scoring;
    }

    public void setScoring(int scoring) {
        this.scoring = scoring;
    }

    /**
     * 計算兩個日期相差年數
     *
     * @param startlDate
     * @param endDate
     * @return
     */
    public int timeInterval(String startlDate, String endDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd"); // 創建日期格式
        Calendar c1 = Calendar.getInstance(); // 創建日期對象
        Calendar c2 = Calendar.getInstance();
        try {
            c1.setTime(sdf.parse(startlDate));
            c2.setTime(sdf.parse(endDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int years = c2.get(Calendar.YEAR) - c1.get(Calendar.YEAR); // 計算年度差
        int month = c2.get(Calendar.MONTH) - c1.get(Calendar.MONTH);// 計算月度差
        int day = c2.get(Calendar.DAY_OF_MONTH) - c1.get(Calendar.DAY_OF_MONTH);// 計算日數差
        int result = 0;
        if (month < 0) { // 月度差小於0
            result = years - 1;
        }
        if (month == 0) { // 月度差等於0
            if (day < 0) { // 日數差小於0
                result = years - 1;
            }
            if (day >= 0) { // 日數差大於等於0
                result = years;
            }
        }
        if (month > 0) { // 月度差大於0
            result = years;
        }
        //return result;    //考慮到日
        return years;   //只計算年份差，不考慮具體日期
    }

    /**
     * 工廠或公司設立期間=於本行申請貸款之年份-大陸/海外工廠設立年份
     *
     * @param grpcr01Vo
     * @return
     */
    public int manufacturing(Grpcr01Vo grpcr01Vo) {
        int period = grpcr01Vo.timeInterval(grpcr01Vo.getFactoryEstablishDate(), grpcr01Vo.getApplyBankDate());
        grpcr01Vo.setEstablishPeriod(period);
        return period;
    }

    /**
     * 工廠或公司設立期間=於本行申請貸款之年份-公司設立年份
     *
     * @param grpcr01Vo
     * @return
     */
    public int tradingTrade(Grpcr01Vo grpcr01Vo) {
        int period = grpcr01Vo.timeInterval(grpcr01Vo.getCompanyEstablishDate(), grpcr01Vo.getApplyBankDate());
        grpcr01Vo.setEstablishPeriod(period);
        return period;
    }

    @Override
    public String toString() {
        return "Grpcr01Vo{" +
                "creditIndustry='" + creditIndustry + '\'' +
                ", applyBankDate='" + applyBankDate + '\'' +
                ", factoryEstablishDate='" + factoryEstablishDate + '\'' +
                ", companyEstablishDate='" + companyEstablishDate + '\'' + "\n" +
                ", ruleId='" + ruleId + '\'' +
                ", ruleName='" + ruleName + '\'' +
                ", establishPeriod=" + establishPeriod +
                ", scoring=" + scoring +
                '}';
    }
}
