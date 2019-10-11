/**
 * 
 */
package com.spring.annotationEx;

import org.springframework.stereotype.Component;

/**
 * @CLASS Name
 *  AbstractImpl
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
@Component
public class AbstractSvcImpl implements AbstractSvc{

	private String name = "01";
	
	@Override
	public String getClassName() {
		return "AbstractSvcImpl - " + name;
	}
}
