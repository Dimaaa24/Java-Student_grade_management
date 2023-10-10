package isp.lab6.exercise2;

public class Vehicle
{
    private String VIN;
    private String LicensePlate;
    private String make;
    private String model;
    private int year;

    Vehicle(String VIN,String LicensePlate,String make,String model,int year)
    {
        this.VIN=VIN;
        this.LicensePlate=LicensePlate;
        this.make=make;
        this.model=model;
        this.year=year;
    }

    public String getVIN() {
        return VIN;
    }

    public String getMake() {
        return make;
    }

    public String getLicensePlate() {
        return LicensePlate;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setLicensePlate(String licensePlate) {
        LicensePlate = licensePlate;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o)
    {
        if(o instanceof Vehicle)
        {
            Vehicle x = (Vehicle) o;
            return this.VIN.equals(x.VIN);
        }
        else
            return false;
    }

    @Override
    public int hashCode()
    {
        return VIN.hashCode();
    }

    @Override
    public String toString()
    {
        return VIN+" "+model+" "+make+" "+LicensePlate+" "+year;
    }
}
