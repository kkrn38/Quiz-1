package model;
public class Tabung {
    private double r = 0.0;
    private double T = 0.0;
    public final double PI = 22.0/7;

    public Tabung(double r, double T) {
        this.r = r;
        this.T = T;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return this.r;
    }

    public void setT(double T) {
        this.T = T;
    }

    public double getT() {
        return this.T;
    }

    public double getPI() {
        return this.PI;
    }


    public double hitungLuasSelimut()
    {
        double LS = 2 * PI * r * T;
        return LS;        
    }
    public double hitungLuasPermukaan()
    {
        double LP = hitungLuasSelimut() + (2 * PI * Math.pow(r , 2));
        return LP;
    }
    public void tampilkanLS()
    {
        System.out.println("Luas Selimut Tabung = " + hitungLuasSelimut());
    }
    public void tampilkanLP()
    {
        System.out.println("Luas Permukaan Tabung = " + hitungLuasPermukaan());
    }

    public void tampilkanDeretLSGenap()
    {
        for(int i= 1; i<=hitungLuasSelimut(); i++)
        {
            if(i%2 == 0)
            {
                System.out.print(i + " ");
            }
        }
    }

    public void tampilkanDeretLSGanjil()
    {
        for(int i= 1; i<=hitungLuasSelimut(); i++)
        {
            if(i%2 == 1)
            {
                System.out.print(i + " ");
            }
        }
    }

    public void tampilkanDeretLPGenap()
    {
        for(int i= 1; i<=hitungLuasPermukaan(); i++)
        {
            if(i%2 == 0)
            {
                System.out.print(i + " ");
            }
        }
    }

    public void tampilkanDeretLPGanjil()
    {
        for(int i= 1; i<=hitungLuasPermukaan(); i++)
        {
            if(i%2 == 1)
            {
                System.out.print(i + " ");
            }
        }
    }
}