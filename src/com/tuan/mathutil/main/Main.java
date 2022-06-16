/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tuan.mathutil.main;

import com.tuan.mathutil.core.MathUtil;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        //thử nghiệm hàm tính giai thừa coi chạy đúng như thiết kế hay k
        //ta phải đưa  ra các tình huống sd hàm trong thực tế
        //vd: -5 coi tính dc hok
        //      0 ------
        //      20 -------
        //Test case: một tình huống hàm/app/màn hình /tính năng dc đưa vào sd
        //giả lập hành vi xài của ai đó
        //test case:là 1 tình huống sd, xài app (hàm) mà nó bao gồm
        //data đầu vào cụ thể nào đó
        //output: đầu ra ứng vs xử lí của hàm/ chức năng của app, dĩ nhiên dùng đầu vào để xử lí
        //kì vọng: mong hàm trả về value nào đó ứng vs inut ở trên
        // ss để xem kq có như kì vọng hay k
        
        long expected = 120; //kì vọng hàm trả vè 120 nếu tính 5!
        int n = 5;
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = " + expected + " expected");
        System.out.println("5! = " + expected + " actual");
        
    }
}
