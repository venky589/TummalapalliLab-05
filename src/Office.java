/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S545233
 */
public class Office {

    /**
     * @param args the command line arguments
     */
      private String city;
      private String state;
      private int pin;
      private double permanent_employees;
       private double temproary_employees;

        public Office(){
}
        public Office(String city, String state, int pin, double permanent_employees, double temproary_employees){
           
            this.city=city;
          
            this.state=state;
             
            this.pin=pin;
        
            this.permanent_employees=permanent_employees;
             
            this.temproary_employees=temproary_employees;
             
        }
        
          // TODO code application logic here

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getPermanent_employees() {
        return permanent_employees;
    }

    public void setPermanent_employees(double permanent_employees) {
        this.permanent_employees = permanent_employees;
    }

    public double getTemproary_employees() {
        return temproary_employees;
    }

    public void setTemproary_employees(double temproary_employees) {
        this.temproary_employees = temproary_employees;
    }
    public double Permanent_employees(){
        int rateOfHour=15;
        return rateOfHour*6;
        

    }
    public double temproary_employees(){
    int rateOfHour=10;
    return rateOfHour*4;
    
    }
    public double total_employees(){
        return Permanent_employees()+temproary_employees();
        
    }
    public double per(){
    double total=200;
    double percentage=(total_employees()/total)*100;
    return percentage;
    }
   
    
    
    
}
