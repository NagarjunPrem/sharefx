/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sharefx;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



/**
 *
 * @author Nagarjun Prem
 */
@ManagedBean
@SessionScoped
public class ControllerBean {
    
    private List<Rides> rides=null;
    
    private Rides selectedRides=null;
    
    @PostConstruct
    public void init(){
        rides=new ArrayList<Rides>();
        rides.add(new Rides("Arjun", "Brookland to Stfx at 9 am", 2));
        rides.add(new Rides("KT", "Brookland to Walmart at 9 am", 2));
        rides.add(new Rides("Rohith", "Brookland to McD at 9 am", 2));
        
        selectedRides=new Rides();
    }
    
    public void select(Rides r)
    {
        selectedRides=r;
    }
    
    public void update()
    {
        selectedRides=new Rides();
    }
    
    public void delete()
    {
        rides.remove(selectedRides);
    }

    public List<Rides> getRides() {
        return rides;
    }

    public void setRides(List<Rides> rides) {
        this.rides = rides;
    }

    public Rides getSelectedRides() {
        return selectedRides;
    }

    public void setSelectedRides(Rides selectedRides) {
        this.selectedRides = selectedRides;
    }
    
    
   
    
    
}
