package com.test1;

public class AlternateBankIdToCountry {
	private String bankId;
	private String countryCode;
	private String qualityGrade;
	private String bankIdToCountrySystem;
	private String bankIdToCountrySystemCode;
	private String bankIdToCountrySystemDescription;
	private String knownQualityIssues;
	private Integer riskLevel;
	private String mitigation;
	private String approvalCode;
	private String entityState;

	public AlternateBankIdToCountry() {

	}

	public AlternateBankIdToCountry(String bankId, String countryCode, String qualityGrade,
			String bankIdToCountrySystem, String bankIdToCountrySystemCode, String bankIdToCountrySystemDescription,
			String knownQualityIssues, Integer riskLevel, String mitigation, String approvalCode, String entityState) {
		super();
		this.bankId = bankId;
		this.countryCode = countryCode;
		this.qualityGrade = qualityGrade;
		this.bankIdToCountrySystem = bankIdToCountrySystem;
		this.bankIdToCountrySystemCode = bankIdToCountrySystemCode;
		this.bankIdToCountrySystemDescription = bankIdToCountrySystemDescription;
		this.knownQualityIssues = knownQualityIssues;
		this.riskLevel = riskLevel;
		this.mitigation = mitigation;
		this.approvalCode = approvalCode;
		this.entityState = entityState;
	}

	public String getBankId() {
		return bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getQualityGrade() {
		return qualityGrade;
	}

	public void setQualityGrade(String qualityGrade) {
		this.qualityGrade = qualityGrade;
	}

	public String getBankIdToCountrySystem() {
		return bankIdToCountrySystem;
	}

	public void setBankIdToCountrySystem(String bankIdToCountrySystem) {
		this.bankIdToCountrySystem = bankIdToCountrySystem;
	}

	public String getBankIdToCountrySystemCode() {
		return bankIdToCountrySystemCode;
	}

	public void setBankIdToCountrySystemCode(String bankIdToCountrySystemCode) {
		this.bankIdToCountrySystemCode = bankIdToCountrySystemCode;
	}

	public String getBankIdToCountrySystemDescription() {
		return bankIdToCountrySystemDescription;
	}

	public void setBankIdToCountrySystemDescription(String bankIdToCountrySystemDescription) {
		this.bankIdToCountrySystemDescription = bankIdToCountrySystemDescription;
	}

	public String getKnownQualityIssues() {
		return knownQualityIssues;
	}

	public void setKnownQualityIssues(String knownQualityIssues) {
		this.knownQualityIssues = knownQualityIssues;
	}

	public Integer getRiskLevel() {
		return riskLevel;
	}

	public void setRiskLevel(Integer riskLevel) {
		this.riskLevel = riskLevel;
	}

	public String getMitigation() {
		return mitigation;
	}

	public void setMitigation(String mitigation) {
		this.mitigation = mitigation;
	}

	public String getApprovalCode() {
		return approvalCode;
	}

	public void setApprovalCode(String approvalCode) {
		this.approvalCode = approvalCode;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
