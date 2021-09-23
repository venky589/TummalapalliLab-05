/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S545233
 */
public class Employee {
    public static void main(String[] args){
    Office e1=new Office();
    System.out.println("---------After using getter method----------");
  
     Office e2=new Office("Maryville","MO",64468,6.0,4.0);
    
     System.out.println("city : "+e2.getCity());
     
      System.out.println("State : "+e2.getState());
    
      System.out.println("pin : "+e2.getPin());
   
     
     System.out.println("Total hourly rate of permanent_employee : "+ e2.Permanent_employees());
     System.out.println("Total hourly rate of temproary_employee : "+ e2.temproary_employees());
      System.out.println("Total hourly rate for both employees : "+ e2.total_employees());
       System.out.println("Percantage of fund : "+ e2. per());
       System.out.println("---------After using setter method----------");
       
       
       Office e3=new Office("Dallas","TX",30028,5.0,9.0);
       
       System.out.println("state : "+e3.getCity()); 
     System.out.println("state : "+e3.getState());
      System.out.println("city : "+e3.getPin());
       System.out.println("Total hourly rate of permanent_employee : "+ e3.getPermanent_employees()*15);
     System.out.println("Total hourly rate of temproary_employee : "+ e3.getTemproary_employees()*10);
      System.out.println("Total hourly rate for both employees : "+ (e3.getPermanent_employees()*15+e3.getTemproary_employees()*10));
       System.out.println("Percantage of fund : "+ (e3.getPermanent_employees()*15+e3.getTemproary_employees()*10)/2);
    }
}

