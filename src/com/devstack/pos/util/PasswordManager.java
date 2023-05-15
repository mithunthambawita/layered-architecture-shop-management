package com.devstack.pos.util;

import org.mindrot.BCrypt;

//SOLID// ==> Single responsibility
public class PasswordManager {
    public static String encryptPassword(String plainTxt){
       return BCrypt.hashpw(plainTxt,BCrypt.gensalt(10));
    }
}
