package com.employeemgnt.exception;

import java.net.http.HttpHeaders;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(MethodArgumentNotValidException.class)
	ResponseEntity<Map<String,List<String>>> handelValidatioonError(MethodArgumentNotValidException e)
	{
		List<String> error = e .getBindingResult()
								.getFieldErrors( ).stream()
								.map(FieldError::getDefaultMessage)
								.collect(Collectors.toList());
		return  new ResponseEntity<>(getErrorMap(error),new HttpHeaders(),HttpStatus.BAD_REQUEST);

	}
	private Map<String,List<String>> getErrorMap(List<String> errors) 
	{
		Map<String,List<String>>errorResponse=new HashMap<>();
		errorResponse.put("errors", errors); 
		return errorResponse;
	}
	
	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<Map<String,List<String>>> handleNotFoundException(EmployeeNotFoundException e)
	{
		List<String> errors=Collections.singletonList(e.getMessage());
		return new ResponseEntity<>(getErrorMap(errors),new HttpHeaders(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(CompanyNotFoundException.class)
	public ResponseEntity<Map<String,List<String>>> handleNotFoundException(CompanyNotFoundException e)
	{
		List<String> errors=Collections.singletonList(e.getMessage());
		return new ResponseEntity<>(getErrorMap(errors),new HttpHeaders(),HttpStatus.NOT_FOUND);
	}
}