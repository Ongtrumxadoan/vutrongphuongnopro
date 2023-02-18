/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baibon;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class BaiBon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     menuChucNang();
       }
    public static void giaiphuongtrinhba1(){
        int aNumber, bNumber; // co the van la so thuc nen cung co the dung double
        double nghiem;
        Scanner invoday = new Scanner(System.in);
        DecimalFormat traveday = new DecimalFormat("#.##");

        //in ra man hinh a va b su dung scanner 
        System.out.println("Nhap a Tu Ban Phim:");
        aNumber = invoday.nextInt();

        System.out.println("Nhap b tu ban phim:");
        bNumber = invoday.nextInt();

        System.out.println("Phuong Trinh Bac Nhat La:" + aNumber + "x +" +  bNumber + " = 0");
         
        if (aNumber == 0)
    {
     
            if (bNumber == 0)
                {
                    System.out.println("thong Bao Vo So Nghiem");
                }
            else if(bNumber !=0 ){
                    System.out.print ("Thong BAo Vo Nghiem");
                }     
    }
    else{
            nghiem = (double) -bNumber/aNumber;
            System.out.println ("Ket Qua Cua Phuong Trinh Bac Nhat La: x = " +traveday.format(nghiem));
            }
    }
        public static void giaiphuongtrinhbac2(){
            double aNumber, bNumber, cNumber, x1, x2, delta; 
         

        //tao mot vat the cua scanner va decimalforat
        Scanner input = new Scanner(System.in);
        DecimalFormat thichthira = new DecimalFormat("#.##");

        //nhap a,b,c
        System.out.println("Nhap a Vao Day:");
        aNumber = input.nextDouble();

        System.out.println("Nhap b Vao Day:");
        bNumber = input.nextDouble();

        System.out.println("Nhap c Vao Day:");
        cNumber = input.nextDouble();

        //ket luan phuong trinh bac hai 
        System.out.println("Vay Phuong Trinh Bac Hai La :" + aNumber + "x^2 +" + bNumber + "x +" + cNumber + " = 0");

        if (aNumber == 0) {
            if (bNumber == 0) {

                if (cNumber == 0) {
                    System.out.println("thong Bao Vo So Nghiem");
                } else {
                    System.out.print("Thong BAo Vo Nghiem");
                }
            } else {
                x2 = -cNumber / bNumber;
                System.out.println("Ket Qua Cua Phuong Trinh Co Nghiem  La: x =" + thichthira.format(x2));
                System.out.println("---------------------------------------------------------------");
            }
        } else if (aNumber != 0) 
                    {
                            delta =   Math.pow(bNumber,2)-4*aNumber*cNumber ;
                                if (delta<0)
                                {
                                    System.out.print("Phuong Trinh Bac Hai Vo Nghiem");
             
                                }
                                else if(delta ==0)
                                    {
                                        x1= -bNumber/2*aNumber;
                                        System.out.print("Phuong Trinh Bac Hai Co Nghiem kep: x1 = x2 ="+x1);
                                    }
                                else if(delta >0) 
                                    {
                                        x1 = (-bNumber +  Math.sqrt(delta))/(2*aNumber);
                                        x2 = (-bNumber -  Math.sqrt(delta))/(2*aNumber);
                                        System.out.println("Phuong Trinh Bac Hai Co 2 Ngiem Phan Biet:x1 ="+x1 +" va x2 ="+x2);
                                        System.out.println("-----------------------------------------------------------");
                                    }
        }
    }
        public static void tinhtiendien(){
            int sotiendien, tien;
        Scanner input = new Scanner (System.in);
        
        System.out.println ("Nhap SO Tien Dien:");
        sotiendien = input.nextInt();
             
        if(sotiendien <50)
        {
            tien= sotiendien*1000; 
            System.out.println ("So Tien Dien Ban Phai Tra La:"+tien);
            
        }else   {
                    tien=50*1000 +(sotiendien-50)*1200;
                    System.out.println("So Tien Dien Ban Phai Tra La:"+ tien);
                }
        
            }
        public static void menuChucNang(){
            
                System.out.println("0.thoat");      
                System.out.println("1.giai phuong trinh bac nhat");     
                System.out.println("2.giai phuog trinh bac hai");     
                System.out.println("3.tinh tien dien");     
            int chon;
            System.out.println("Nhap Lua Chon: ");
            Scanner thichvoday = new Scanner(System.in);
            chon = thichvoday.nextInt();
            switch (chon)
            {
                case 0:
                 break;
                 
                 
                case 1:
                    giaiphuongtrinhba1();
                    break;
                    
                case 2: 
                    giaiphuongtrinhbac2();
                    break;
                    
                case 3: 
                    tinhtiendien();
                    break;
                    
                    
                    default:
                        System.out.println(" May Chon Lai, May Chay Lai!");
                        break ;
            }
            
        }
        
    }


