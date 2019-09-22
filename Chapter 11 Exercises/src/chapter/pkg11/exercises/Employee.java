/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg11.exercises;

/**
 *
 * @author ben_d
 */
public class Employee {
    
    private String name;
    private String empno;
    private String hiredate;
    
    public Employee(String name, String empno, String hiredate) throws InvalidEmployeeNumber {
        this.name = name;
        this.hiredate = hiredate;
        if(isValidEmployeeNumber(empno)){
            this.empno = empno;
        } else {
            throw new InvalidEmployeeNumber(empno);
        }
    }
    
    private boolean isValidEmployeeNumber(String empno){
        if(empno.length() != 5) return false;
        StringBuilder str = new StringBuilder(empno);
        if(!Character.isDigit(str.charAt(0)) ||
                !Character.isDigit(str.charAt(1)) ||
                    !Character.isDigit(str.charAt(2)))
            return false;
        if(str.charAt(3) != '-')
            return false;
        char c = str.charAt(4);
        if(!Character.isLetter(c) || Character.toUpperCase(c) > 'M')
            return false;
        return true;
    }
    
    // accessors and mutators
    public String getName(){return name;}
    public String getEmployeeNumber(){return empno;}
    public String getHireDate(){return hiredate;}
    
    public void setName(String name){this.name = name;}
    public void setEmployeeNumber(String empno) throws InvalidEmployeeNumber {
        if(isValidEmployeeNumber(empno)){
            this.empno = empno;
        } else {
            throw new InvalidEmployeeNumber(empno);
        }
    }
    public void setHireDate(String hiredate){this.hiredate = hiredate;}
    
}
