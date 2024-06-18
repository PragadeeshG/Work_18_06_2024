package com.test1;

public class MeaninglessInformationLineItems {
	private Integer lineItemCode;
	private String meaninglessInformationRef;
	private boolean informationValid;
	private Integer contentCode;
	private String content;
	private String metadata;
	private Integer keyIdentifier;
	private Integer secretCode;
	private String keyRotationClient;
	private Integer lineItemReference;
	private String keyRotationSchedule;
	private String status;
	private String remarks;

	public MeaninglessInformationLineItems() {

	}

	public MeaninglessInformationLineItems(Integer lineItemCode, String meaninglessInformationRef,
			boolean informationValid, Integer contentCode, String content, String metadata, Integer keyIdentifier,
			Integer secretCode, String keyRotationClient, Integer lineItemReference, String keyRotationSchedule,
			String status, String remarks) {
		super();
		this.lineItemCode = lineItemCode;
		this.meaninglessInformationRef = meaninglessInformationRef;
		this.informationValid = informationValid;
		this.contentCode = contentCode;
		this.content = content;
		this.metadata = metadata;
		this.keyIdentifier = keyIdentifier;
		this.secretCode = secretCode;
		this.keyRotationClient = keyRotationClient;
		this.lineItemReference = lineItemReference;
		this.keyRotationSchedule = keyRotationSchedule;
		this.status = status;
		this.remarks = remarks;
	}

	public Integer getLineItemCode() {
		return lineItemCode;
	}

	public void setLineItemCode(Integer lineItemCode) {
		this.lineItemCode = lineItemCode;
	}

	public String getMeaninglessInformationRef() {
		return meaninglessInformationRef;
	}

	public void setMeaninglessInformationRef(String meaninglessInformationRef) {
		this.meaninglessInformationRef = meaninglessInformationRef;
	}

	public boolean isInformationValid() {
		return informationValid;
	}

	public void setInformationValid(boolean informationValid) {
		this.informationValid = informationValid;
	}

	public Integer getContentCode() {
		return contentCode;
	}

	public void setContentCode(Integer contentCode) {
		this.contentCode = contentCode;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getMetadata() {
		return metadata;
	}

	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}

	public Integer getKeyIdentifier() {
		return keyIdentifier;
	}

	public void setKeyIdentifier(Integer keyIdentifier) {
		this.keyIdentifier = keyIdentifier;
	}

	public Integer getSecretCode() {
		return secretCode;
	}

	public void setSecretCode(Integer secretCode) {
		this.secretCode = secretCode;
	}

	public String getKeyRotationClient() {
		return keyRotationClient;
	}

	public void setKeyRotationClient(String keyRotationClient) {
		this.keyRotationClient = keyRotationClient;
	}

	public Integer getLineItemReference() {
		return lineItemReference;
	}

	public void setLineItemReference(Integer lineItemReference) {
		this.lineItemReference = lineItemReference;
	}

	public String getKeyRotationSchedule() {
		return keyRotationSchedule;
	}

	public void setKeyRotationSchedule(String keyRotationSchedule) {
		this.keyRotationSchedule = keyRotationSchedule;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
