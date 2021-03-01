/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sharefx;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Nagarjun Prem
 */
@ManagedBean(name="login")
@SessionScoped

public class Login {
    
    private String username;
    private String password;
    
    public Login() {
    }
   

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String validate()
    {
        if(username.equals("x2019ftr")&& password.equals("8055"))
        {
            return "loginSuccess";
        }
        else if(username.equals("admin")&& password.equals("admin"))
        {
            return "adminLogin";
        }
        else
        return "loginFail";
        
    }
      
}
