package com.apackage;

public enum CLEEnum {
	
	SUCCESS("DB000","SUCCESS","SUCCESS"),
	TRANSID_INVALID("DB001","TRANSID IS INVALID","DATAERROR"),
	DB_DOWN("DB002","DB DOWN","SYSTEMERROR");

	

	private String errorCode;
	private String errorMsg;
	private String errorType;
	
    private CLEEnum(String errorCode, String errorMsg, String errorType) {
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
		this.errorType = errorType;
    }

	public static String contains(String errorCode){
		
		if(null==errorCode){
			return null;
		}
		for(CLEEnum l:CLEEnum.values()){
			if(l.errorCode.equals(errorCode)){
				return l.errorType;
			}
		}
		return null;
	}
	
	
}
