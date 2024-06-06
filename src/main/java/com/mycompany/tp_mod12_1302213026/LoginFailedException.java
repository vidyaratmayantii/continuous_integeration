/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_mod12_1302213026;

import java.util.HashMap;

/**
 *
 * @author Asus
 */
public class LoginFailedException extends Exception {
    private static HashMap<Integer,Integer> failedcount;
    private int userid;
    
    public LoginFailedException(String msg, int user){
        super(msg);
        this.userid = user;
        failedcount = new HashMap<>();
         if (failedcount.containsKey(userid)) {
            int count = failedcount.get(userid);
            failedcount.put(userid, count + 1);
        } else {
            failedcount.put(userid, 1);
        }
    }
    
    public int getUserid(){
        return this.userid;
    }
    
    public int getFailedCounter(int user){
        if (failedcount.containsKey(userid)) {
        return failedcount.get(userid);
        } else {
            return 0;
        }
    }
}
