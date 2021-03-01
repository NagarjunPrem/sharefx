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
@ManagedBean(name="admin")
@SessionScoped
public class adminLogin {

    public adminLogin() {
    }
    
     public String validate()
     {
         return "loginSuccess";
     }
    
}
