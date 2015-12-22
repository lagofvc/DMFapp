package com.lago.dmf.exceptions;

/**
 * Created by lago on 12/22/15.
 */
public class FacebookLoginException extends Throwable {

    public static final String TOKEN_IS_NULL = "Facebook login failed.  No token received.";

    public FacebookLoginException(String s) {
        super(s);
    }
}
