package com.axis.exception;

public class NegativeSalaryException extends RuntimeException {
	String msg;
	 
    public NegativeSalaryException(String msg) {
        super();
        this.msg = msg;
    }
 
    public String getMsg() {
        return msg;
    }
}
