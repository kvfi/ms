package ma.sii.workshop.libs.advice;


import lombok.extern.slf4j.Slf4j;
import ma.sii.workshop.libs.response.NegativeResponse;
import ma.sii.workshop.libs.response.ResponseAPI;
import ma.sii.workshop.libs.response.StatusCode;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Optional;

import static org.apache.commons.lang3.ObjectUtils.defaultIfNull;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Throwable.class)
    public NegativeResponse handleException(Throwable throwable) {
        // for handling chained exceptions
        Throwable cause = Optional.ofNullable(throwable.getCause()).orElse(throwable);
//        if (cause instanceof ValidationException) {
//            return handleValidationException((ValidationException) cause);
//        }
//        etc...

        return handleDefault(cause);
    }

    private NegativeResponse handleDefault(Throwable throwable) {
        log.error("Error while processing the request", throwable);
        return ResponseAPI.negativeResponse(StatusCode.INTERNAL_SERVER_ERROR,
                defaultIfNull(throwable.getMessage(), "Error while processing the request"), throwable);
    }
}

