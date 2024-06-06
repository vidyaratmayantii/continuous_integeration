package com.mycompany.tp_mod12_1302213026;

public class UserData {
    private int userid;
    private int password;
    private boolean isLoggedIn;
    
    public UserData(int uid, int pwd){
        this.userid = uid;
        this.password = pwd;
    }
    
    public void login(){
        int expectedPassword = 10000 - userid;
        
        if (password == expectedPassword) {
            isLoggedIn = true;
            System.out.println("Login berhasil");
        } else {
            try {
                throw new LoginFailedException("failure", userid);
            } catch (LoginFailedException ex) {
                System.out.println("Login user " + ex.getUserid() + " gagal, telah melakukan login " + ex.getFailedCounter(userid) + " kali");
            }
        }
        assert String.valueOf(userid).length() == 4 : "User ID harus 4 digit";
        assert String.valueOf(password).length() == 4 : "Password harus 4 digit";
    }
    
    public boolean isLoggedIn() {
        return isLoggedIn;
    }
}
