/**
 * 
 */
package com.spring.annotationEx;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @CLASS Name
 *  AbstractController
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
//@Component
@Controller
public class AbstractController extends org.springframework.web.servlet.mvc.AbstractController{
	
	// AbstractController 는 org.springframework.web.servlet.mvc의 최상위 컨트롤러로써..
	//  이런예제에서 많이 사용된다.
	@Resource(name="service01")
	private AbstractSvc service;
	
	// AbstractController의 handleRequestInternal 를 오버라이드 하여 예제로 많이 사용한다.
	@Override
	@RequestMapping("/comp")
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) 
	throws Exception{
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("componentView");
		mv.addObject("msg", "Component Annotation Test");
		
		System.out.println("--------------------");
		System.out.println(service.getClassName());
		System.out.println("--------------------");
		
		return mv;
	}
}
