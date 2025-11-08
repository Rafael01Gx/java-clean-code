package br.com.alura.adopet.api.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ValidacaoException.class)
    public ResponseEntity<String> handleException(ValidacaoException ex) {
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
}
