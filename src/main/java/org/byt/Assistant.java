package org.byt;

import java.util.HashMap;

public class Assistant extends User{
    private String workingPoint;//chto eto
    private int salary;
    private HashMap<Integer, Order> allOrders = Order.getAllOrders();//discuss this part
    public Assistant(String workingPoint){
        this.workingPoint = workingPoint;
        this.salary = calculateSalary();
    }

    public int calculateSalary(){
        return 0;
    }

}
