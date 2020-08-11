package com.comwave.rule.vo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Grpcr12Vo {
	private Double sellerPorportion1; // 第一大銷售商佔總銷售額之比重(%)
	private Double sellerPorportion2; // 第二大銷售商佔總銷售額之比重(%)
	private Double sellerPorportion3; // 第三大銷售商佔總銷售額之比重(%)
	
	private String ruleId; // 規則ID
	private String ruleName; // 規則描述
	private Double avgPorportion; // 往來年數
	private int scoring = 0; // 主要銷貨商往來評分

	public Grpcr12Vo() { super(); }
	
	public Grpcr12Vo(Double sellerPorportion1, Double sellerPorportion2, Double sellerPorportion3) {
		super();
		this.sellerPorportion1 = sellerPorportion1;
		this.sellerPorportion2 = sellerPorportion2;
		this.sellerPorportion3 = sellerPorportion3;
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

	public Double getAvgPorportion() {
		return avgPorportion;
	}

	public void setAvgPorportion(Double avgPorportion) {
		this.avgPorportion = avgPorportion;
	}

	public int getScoring() {
		return scoring;
	}

	public void setScoring(int scoring) {
		this.scoring = scoring;
	}
	
	public Double avgPorportion(Grpcr12Vo grpcr12Vo) {
		Double avg = null;
		
		List<Double> porportionList = Arrays.asList(grpcr12Vo.getSellerPorportion1(), grpcr12Vo.getSellerPorportion2(), grpcr12Vo.getSellerPorportion3())
				.stream().filter(x -> x != null).collect(Collectors.toList());
		
		Double sellerNumber = new Double(porportionList.size());
		
		if (sellerNumber > 0) {
			avg = porportionList.stream().mapToDouble(Double::valueOf).sum() * Math.pow(sellerNumber, -1);
			grpcr12Vo.setAvgPorportion(avg);
		}
		
		return avg;
	}

	@Override
	public String toString() {
		return "Grpcr12Vo [sellerPorportion1=" + sellerPorportion1 + ", sellerPorportion2=" + sellerPorportion2
				+ ", sellerPorportion3=" + sellerPorportion3 + ", ruleId=" + ruleId + ", ruleName=" + ruleName
				+ ", avgPorportion=" + avgPorportion + ", scoring=" + scoring + "]";
	}
}
