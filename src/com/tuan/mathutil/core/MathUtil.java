/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tuan.mathutil.core;

/**
 *
 * @author Admin
 */
public class MathUtil {
    //trong class nay cung cap cho ai do nhieu ham xử lí toán học
    //clone class Math của JDK
    //hàm thư viện xài chung cho ai đó, k cần lưu lại trnag5 thái/giá trị
    //chọn thiết kế là hàm static
    //hàm tính giai thừa!!!
    //n! = 1.2.3.4...n
    //k có giai thừa số âm
    //0! = 1! =1 quy ước
    //giai thừa hàm đồ thị dốc đứng, tăng nhanh về giá trị
    //20 giai thừa 18 con số 0, vừa kịp đủ cho kiểu long của Java
    //21 giai thừa tràn kiểu long
    //bài này ước tính n! trong khoảng từ 0 - 20
    
//    public static long getFactorial(int n){
//        if (n < 0 || n >20)
//            throw new IllegalArgumentException("Invalid argument. N must be between 0 .. 20");
//        if (n == 0 || n == 1)
//            return 1; //kết thúc sớm nếu nhận những đầu vào đặc biệt
//        long product = 1; //tích nhân dồn, thuật toán heo đất
//        for (int i = 2; i <= n; i++) {
//            product *= i;
//        }
//        return product;
//    }       
    
    //Học lại đệ quy
    //Hiện tượng gọi lại chính mình vs 1 quy mô khác
    //vd: con búp bê Nga
    //búp bê to, nhỏ hơn, nhỏ hơn nữa ...
    
    //tính giùm 6!
    //n! = 1.2.3.4.5.6 ... .n
    //6! = 6 x 5!
    //5! = 5 x 4!
    //4! = 4 x 3!
    //3! = 3 x 2!
    //2! = 2 x 1! //điểm dừng
    //1! = 1
    //quy ước 1! = 0! = 1;
    //ct n* (n-1)
    
    public static long getFactorial(int n){
     if(n < 0 || n > 20)
         throw new IllegalArgumentException("Invalid argument. N must be between 0 .. 20");
     if (n == 0 || n == 1)
            return 1; //kết thúc sớm nếu nhận những đầu vào đặc biệt
        
        return n* getFactorial(n-1); //ct đệ quy
    } 
    //adnask
    
}
