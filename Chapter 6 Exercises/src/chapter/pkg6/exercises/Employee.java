/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg6.exercises;

/**
 *
 * @author ben_d
 */
public class Employee {
    
    // fields
    private String name;
    private int idNumber;
    private String department;
    private String position;
    
    // constructors
    public Employee(String name, int idNumber, String department, String position){
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }
    
    public Employee(String name, int idNumber){
        this.name = name;
        this.idNumber = idNumber;
        this.department = "";
        this.position = "";
    }
    
    public Employee(){
        this.name = "";
        this.idNumber = 0;
        this.department = "";
        this.position = "";
    }
    
    // mutators
    public void setName(String name){this.name = name;}
    public void setIdNumber(int idNumber){this.idNumber = idNumber;}
    public void setDepartment(String department){this.department = department;}
    public void setPosition(String position){this.position = position;}
            
    // accessors
    public String getName(){return name;}
    public int getIdNumber(){return idNumber;}
    public String getDepartment(){return department;}
    public String getPosition(){return position;}  
    
}
