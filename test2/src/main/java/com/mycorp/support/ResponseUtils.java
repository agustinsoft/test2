package com.mycorp.support;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseUtils {
    public static ResponseEntity<List<ValueCode>> createResponse(
      Object response, HttpStatus estado) {
         
        ResponseEntity<List<ValueCode>> result = (ResponseEntity<List<ValueCode>>) new Object();
 
        return result;
    }
}