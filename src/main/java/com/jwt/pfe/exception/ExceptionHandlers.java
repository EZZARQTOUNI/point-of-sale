package com.jwt.pfe.exception;

import com.jwt.pfe.dto.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class ExceptionHandlers {



    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ErrorResponse> handleCustomException(CustomException e, WebRequest request ) {


        return new ResponseEntity<>(
                new ErrorResponse(
                        e.getCode(),
                        e.getMessage()
                ),
                HttpStatus.valueOf(e.getCode())
        );
    }

}
