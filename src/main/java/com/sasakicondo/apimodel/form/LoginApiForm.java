package com.sasakicondo.apimodel.form;

import lombok.Data;


public class LoginApiForm {
    @Data
    public static class Request {
        private String username;
        private String password;
    }

    @Data
    public static class Response{

    }
}
