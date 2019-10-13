/**
 * 
 */
package com.spring.annotationEx;

import org.springframework.stereotype.Component;

/**
 * @CLASS Name
 *  AbstractSvcImpl02
 * 
 * @AUTHOR     : Rony Kwak
 * @CREATE DATE: 2019-10-11
 * @PROJECT    : Java-Spring4-Ex04
 * @PACKAGE    : com.spring.annotationEx
 * @Description: 
 * =============================
 * @Change History
 * v1.0: 
 * v1.1: 
 * =============================
 **/
@Component("service02")
public class AbstractSvcImpl02 implements AbstractSvc{
	
	private String name = "02";
	
	@Override
	public String getClassName() {
		return "AnstractSvcImpl = " + name;
	}
}
