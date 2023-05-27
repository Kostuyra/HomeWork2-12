package com.example.homework212;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CalculatorArgumentException extends IllegalArgumentException{
public CalculatorArgumentException(){
	super("Делить на ноль нельзя!");
}
}
