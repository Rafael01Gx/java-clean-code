package br.com.alura.adopet.api.exception;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ValidacaoException.class)
    public ResponseEntity<String> handleException(ValidacaoException ex) {
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<String> handleException(EntityNotFoundException ex) {
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
}
