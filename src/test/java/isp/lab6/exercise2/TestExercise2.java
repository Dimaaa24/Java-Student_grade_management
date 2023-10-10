package isp.lab6.exercise2;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class TestExercise2
{
    Set<Vehicle> vehicles=new HashSet<Vehicle>();

    @Test
    public void TestAdd()
    {
        Vehicle car=new Vehicle("abc", "cde","fgh","ijk",2000);
        Vehicle car1=new Vehicle("abc", "cde","fgh","ijk",2000);
        vehicles.add(car);
        vehicles.add(car1);
        Assert.assertEquals("[abc ijk fgh cde 2000]",vehicles.toString());
    }

    @Test
    public void TestRemove()
    {
        Vehicle car=new Vehicle("abc", "cde","fgh","ijk",2000);
        Vehicle car1=new Vehicle("abb", "cde","fgh","ijk",2000);
        vehicles.add(car);
        vehicles.add(car1);
        vehicles.remove(car1);
        Assert.assertEquals("[abc ijk fgh cde 2000]",vehicles.toString());
    }

    @Test
    public void TestCheck()
    {
        Vehicle car=new Vehicle("abc", "cde","fgh","ijk",2000);
        Vehicle car1=new Vehicle("abb", "cde","fgh","ijk",2000);
        vehicles.add(car);
        vehicles.add(car1);
        String VIN="abd";
        boolean ok=false;
        for(Vehicle i:vehicles)
        {
            if(i.getVIN().equals(VIN))
            {
                System.out.println(i);
                ok=true;
                break;
            }
        }
        Assert.assertEquals(false,ok);
    }

}
