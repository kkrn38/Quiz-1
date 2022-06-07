package model;
public class Kubus {
        public int s = 0;
        public int  hitungLuas(){
            //Long luas = 6 * Math.pow(s, 2);
            //System.out.println("Maka Luas Kubus = "+luas+"cm");
            return 6 * (s*s);
        }
        public int hitungVolume (){// sisi kali sisi kali sisi kali sisi
            return s*s*s;
        }
        public void tampilkanLuas(){
            System.out.println("Sisi = "+s+" cm");
            System.out.println("Luas = "+ hitungLuas());
        }
        public void tampilkanVolume(){
            System.out.println("Sisi = "+s+" cm");
            System.out.println("Volume = "+ hitungVolume());
        }
      }