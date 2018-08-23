package com.star.sud.emp;

public class Message {

	protected String message;

	protected Boolean isSuccess;

	protected String errorCode;

	public Message(String message, Boolean isSuccess, String errorCode) {
		this.message = message;
		this.isSuccess = isSuccess;
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getIsSuccess() {
		return isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

}
