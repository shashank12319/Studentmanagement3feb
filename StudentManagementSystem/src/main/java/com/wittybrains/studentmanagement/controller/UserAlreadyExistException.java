package com.wittybrains.studentmanagement.controller;


@SuppressWarnings("serial")
class UserAlreadyExistException extends Exception{
    public UserAlreadyExistException(String message){
        super(message);
    }
}
