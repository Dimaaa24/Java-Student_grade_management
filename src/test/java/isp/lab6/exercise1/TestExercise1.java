package isp.lab6.exercise1;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestExercise1
{
    @Test
    public void TestAdd()
    {
        List<Student> students=new ArrayList<Student>();
        Student stud=new Student(10,"Alex");
        students.add(stud);
        Assert.assertEquals("[ID:10 Name:Alex]",students.toString());
    }
    @Test
    public void testRemoveStudent()
    {
        List<Student> students=new ArrayList<Student>();
        Student stud=new Student(10,"Dima");
        Student stud2=new Student(11,"George");
        Student stud3=new Student(12,"Melisa");
        students.add(stud);
        students.add(stud2);
        students.add(stud3);
        students.remove(stud2);
        Assert.assertEquals("[ID:10 Name:Dima, ID:12 Name:Melisa]",students.toString());
    }

    @Test
    public void testUpdateInfo()
    {
        List<Student> students=new ArrayList<Student>();
        Student stud=new Student(10,"Dima");
        Student stud2=new Student(11,"George");
        Student stud3=new Student(12,"Melisa");
        students.add(stud);
        students.add(stud2);
        students.add(stud3);
        int modID=11;
        int ct=0;
        for (Student i : students)
        {
            if (i.getID() == modID)
                break;
            ct++;
        }
        students.get(ct).setID(5);
        students.get(ct).setName("VELisa");
        Assert.assertEquals("[ID:10 Name:Dima, ID:5 Name:VELisa, ID:12 Name:Melisa]",students.toString());
    }

    @Test
    public void testAverage()
    {
        List<Student> students=new ArrayList<Student>();
        Student stud=new Student(10,"Dima");
        stud.inputMark(5, "Math");
        stud.inputMark(2, "English");
        stud.inputMark(3, "CP");
        students.add(stud);
        Assert.assertEquals(3.3333333333333335,students.get(0).getAverage(),0);
    }
}
