package com.nt.service;

import org.springframework.stereotype.Component;

@Component("iac")
public class IntrAmountCalculator {
	public float calcIntrAmount(float pAmt, float rate, float time) {
		return (pAmt * rate * time) / 100.0f;
	}// method
	
	public float calcCompoundIntrAmount(float pAmt, float rate, float time) {
	  return  (float) (pAmt*Math.pow((1+rate/100),time)-pAmt);
	}
	
	
}
