package com.example.springbootdemo.error;

import com.example.springbootdemo.Exception.ProductNotFoundException;
import com.example.springbootdemo.error.model.ApiError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class ApiErrorController extends ResponseEntityExceptionHandler {

  @ExceptionHandler(ProductNotFoundException.class)
  public ResponseEntity<ApiError> handleProductNotFoundException(ProductNotFoundException exception) {
    ApiError apiError = new ApiError();
    apiError.setStatusCode(404);
    apiError.setErrorMessage(exception.getMessage());

    return new ResponseEntity<>(apiError, HttpStatus.NOT_FOUND);
  }

}
