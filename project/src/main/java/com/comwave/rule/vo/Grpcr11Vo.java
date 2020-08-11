package com.comwave.rule.vo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Grpcr11Vo {
	private Double sellerPorportion1; // 第一大銷售商佔總銷售額之比重(%)
	private Double sellerPorportion2; // 第二大銷售商佔總銷售額之比重(%)
	private Double sellerPorportion3; // 第三大銷售商佔總銷售額之比重(%)
	
	private Double sellerYear1; // 第一大銷售商往來年數
	private Double sellerYear2; // 第二大銷售商往來年數
	private Double sellerYear3; // 第三大銷售商往來年數
	
	private Double sellerYear4 = 0.0; // 銷售比重累積(由大至小)超過30%的銷貨商之平均往來年數

	private String ruleId; // 規則ID
	private String ruleName; // 規則描述
	private Double contactYear; // 往來年數
	private int scoring = 0; // 主要銷貨商往來評分

	public Grpcr11Vo() { super(); }
	
	public Grpcr11Vo(Double sellerPorportion1, Double sellerPorportion2, Double sellerPorportion3,
			Double sellerYear1, Double sellerYear2, Double sellerYear3, Double sellerYear4) {
		super();
		this.sellerPorportion1 = sellerPorportion1;
		this.sellerPorportion2 = sellerPorportion2;
		this.sellerPorportion3 = sellerPorportion3;
		this.sellerYear1 = sellerYear1;
		this.sellerYear2 = sellerYear2;
		this.sellerYear3 = sellerYear3;
		this.sellerYear4 = sellerYear4;
	}
	
	public Double getSellerPorportion1() {
		return sellerPorportion1;
	}

	public void setSellerPorportion1(Double sellerPorportion1) {
		this.sellerPorportion1 = sellerPorportion1;
	}

	public Double getSellerPorportion2() {
		return sellerPorportion2;
	}

	public void setSellerPorportion2(Double sellerPorportion2) {
		this.sellerPorportion2 = sellerPorportion2;
	}

	public Double getSellerPorportion3() {
		return sellerPorportion3;
	}

	public void setSellerPorportion3(Double sellerPorportion3) {
		this.sellerPorportion3 = sellerPorportion3;
	}

	public Double getSellerYear1() {
		return sellerYear1;
	}

	public void setSellerYear1(Double sellerYear1) {
		this.sellerYear1 = sellerYear1;
	}

	public Double getSellerYear2() {
		return sellerYear2;
	}

	public void setSellerYear2(Double sellerYear2) {
		this.sellerYear2 = sellerYear2;
	}

	public Double getSellerYear3() {
		return sellerYear3;
	}

	public void setSellerYear3(Double sellerYear3) {
		this.sellerYear3 = sellerYear3;
	}

	public Double getSellerYear4() {
		return sellerYear4;
	}

	public void setSellerYear4(Double sellerYear4) {
		this.sellerYear4 = sellerYear4;
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

	public Double getContactYear() {
		return contactYear;
	}

	public void setContactYear(Double contactYear) {
		this.contactYear = contactYear;
	}

	public Integer getScoring() {
		return scoring;
	}

	public void setScoring(Integer scoring) {
		this.scoring = scoring;
	}

	public Double contactYear(Grpcr11Vo grp) {
		
		List<Double> sellerYearList = Arrays.asList(grp.getSellerYear1(), grp.getSellerYear2(), grp.getSellerYear3()).stream()
				.filter(x -> x != null).collect(Collectors.toList());
		
		int sellerNumber = sellerYearList.size();
		Double year; // 往來年數
		
		Double totalPorportion = Arrays.asList(grp.getSellerPorportion1(), grp.getSellerPorportion2(), grp.getSellerPorportion3())
				.stream().filter(x -> x != null)
				.mapToDouble(Double::valueOf).sum();
		Double totalYear = sellerYearList.stream().mapToDouble(Double::valueOf).sum();

		if (totalPorportion > 30)
			year = totalYear / sellerNumber;
		else
			year = grp.getSellerYear4();
		
		grp.setContactYear(year);
		
		return year;
	}

	@Override
	public String toString() {
		return "Grpcr11Vo [sellerPorportion1=" + sellerPorportion1 + ", sellerPorportion2=" + sellerPorportion2
				+ ", sellerPorportion3=" + sellerPorportion3 + ", sellerYear1=" + sellerYear1 + ", sellerYear2="
				+ sellerYear2 + ", sellerYear3=" + sellerYear3 + ", sellerYear4=" + sellerYear4 + ", ruleId=" + ruleId
				+ ", ruleName=" + ruleName + ", contactYear=" + contactYear + ", scoring=" + scoring + "]";
	}
	
}
