/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp_mod12_1302213026;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class TP_MOD12_1302213026 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userid,password;
        
        System.out.print("Masukkan User ID: ");
        userid = scanner.nextInt();

        System.out.print("Masukkan Password: ");
        password = scanner.nextInt();
        
        UserData user = new UserData(userid,password);
        user.login();
        
    }
}
