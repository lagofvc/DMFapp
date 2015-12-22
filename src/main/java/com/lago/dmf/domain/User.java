package com.lago.dmf.domain;

import com.lago.dmf.exceptions.FacebookLoginException;

import java.util.List;
import java.util.Objects;

/**
 * Created by lago on 4/4/15.
 */
public class User {
    private String username;
    private Integer age;
    private String gender;
    private String city;
    private String orientation;
    private List<?> fbFriendsOnDMF;
    private String currentCity;
    private Object fbToken;

    private User(){
    }

    public User(String username, String fbToken) throws FacebookLoginException {
        if(fbToken==null || fbToken.isEmpty()){
            throw new FacebookLoginException(FacebookLoginException.TOKEN_IS_NULL);
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCurrentCity() {
        return currentCity;
    }

    public void setCurrentCity(String currentCity) {
        this.currentCity = currentCity;
    }

    public List<?> getFbFriendsOnDMF() {
        return fbFriendsOnDMF;
    }

    public void setFbFriendsOnDMF(List<?> fbFriendsOnDMF) {
        this.fbFriendsOnDMF = fbFriendsOnDMF;
    }

    public Object getFbToken() {
        return fbToken;
    }

    public void setFbToken(Object fbToken) {
        this.fbToken = fbToken;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
            "username='" + username + '\'' +
            ", age=" + age +
            ", gender='" + gender + '\'' +
            ", city='" + city + '\'' +
            ", orientation='" + orientation + '\'' +
            ", fbFriendsOnDMF=" + fbFriendsOnDMF +
            ", fbToken=" + fbToken +
            ", currentCity='" + currentCity + '\'' +
            '}';
    }
}