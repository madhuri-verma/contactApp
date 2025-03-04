package com.example.demo.exceptionHandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ModelAndView catchExceptions(Exception e) {
		
		ModelAndView mv = new ModelAndView("Error.jsp");
		mv.addObject("errorMsg", e.getMessage());
		return mv;
	}
}
