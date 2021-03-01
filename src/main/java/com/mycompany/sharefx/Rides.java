/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sharefx;


/**
 *
 * @author Nagarjun Prem
 */

public class Rides {
    private String name;
    private String rideinfo;
    private int count;

    public Rides(String name, String rideinfo, int count) {
        this.name = name;
        this.rideinfo = rideinfo;
        this.count = count;
    }

    public Rides() {
    }
   
    
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRideinfo() {
        return rideinfo;
    }

    public void setRideinfo(String rideinfo) {
        this.rideinfo = rideinfo;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Rides{" + "name=" + name + ", rideinfo=" + rideinfo + ", count=" + count + '}';
    }
    
    

    
  
}
