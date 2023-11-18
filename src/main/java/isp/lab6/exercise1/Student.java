package isp.lab6.exercise1;

import java.beans.Introspector;
import java.util.HashMap;

public class Student
{
    private String name;
    private int ID;
    private HashMap<String, Integer> grades;
    private int NOTEPICAT;
    public String NUMEPROST;

    Student(int ID,String name)
    {
        this.ID=ID;
        this.name=name;
        grades=new HashMap<String,Integer>();
    }
    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void inputMark(int x,String subject)
    {
        if(x>10)
            x=10;
        grades.put(subject,x);
    }

    public void displayMarks()
    {
        for(String i: grades.keySet())
        {
            System.out.println(i+":"+grades.get(i));
        }
    }

    public double getAverage()
    {
        int average=0;
        int mark_ct=0;
        for(String i:grades.keySet())
        {
            mark_ct++;
            average+=grades.get(i);
        }
        return (double)average/mark_ct;
    }

    @Override
    public String toString()
    {
        return "ID:"+ID+" Name:"+name;
    }

}
