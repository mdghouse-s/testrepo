package com.learn.rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Contact with given id does not exist")
public class ContactNotFoundException extends Exception {
}
