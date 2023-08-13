package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {
	
	//Handling exception in spring mvc
	
		@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
		@ExceptionHandler(value=NullPointerException.class)
		public String exceptionHandlerNull(Model m) 
		{
			m.addAttribute("msg", "Null Pointer exception has occured");
			return "null_page";
		}
		
		@ResponseStatus(value = HttpStatus.GATEWAY_TIMEOUT)
		@ExceptionHandler(value=NumberFormatException.class)
		public String exceptionHandlerNumberFormat(Model m) 
		{
			m.addAttribute("msg", "Number Format exception has occured");
			return "null_page";
		}
		
		@ResponseStatus(value = HttpStatus.GATEWAY_TIMEOUT)
		@ExceptionHandler(value=ArrayIndexOutOfBoundsException.class)
		public String exceptionHandlerArrayIndexOutOfBounds(Model m) 
		{
			m.addAttribute("msg", "Array Index Out Of Bounds exception has occured");
			return "null_page";
		}
		
		//Generalized exception handling for all types of exception for this controller
		@ExceptionHandler(value = Exception.class)
		public String exceptionHandlerGeneric(Model m) 
		{
			m.addAttribute("msg", "Generic exception has occured");
			return "null_page";
		}
}
