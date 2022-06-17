/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.tuan.mathutil.test.core;

//import org.junit.jupiter.api.Test;
import com.tuan.mathutil.core.MathUtil;
import java.beans.ExceptionListener;
import org.junit.Assert;
import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author Admin
 */
public class MathUtilTest {
    //đây là class sẽ sd các hàm của thư viện/franework JUnit
    //để kt code chính -  hàm tinh1GiaiThua() bên
    //class.core.MathUtil
    //viết code để test code chính bên kia

    //có nhiều quy tac71 đặt tên hàm kiểm thử
    //nhưng thường sẽ là nói lên mục đích của các case/ tình huống kiểm thử
    //tình huống xài hàm theo kiểu thành công và thất bại
    //hàm dưới đây là tình huong1 test chạy thành công, trả về tốt
    //ta sẽ xài hàm well - đưa 5!, k đưa -5!
    //@Test JUnit sẽ phối hợp vs JVM để chạy hàm này
    //@Test phía hậu trường chính là public static void main()
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        int n = 0; //test thử tình huống tử tế đầu vào, phải chạy đúng
        long expected = 1; //hy vọng 0! = 1
        //long actual = ;//gọi hàm cần test bên core/ app chính/code chính
        long actual = MathUtil.getFactorial(n);

        //ss expected vs actual dùng xanh đỏ, framework
        Assert.assertEquals(expected, actual);

        //gộp thêm vài case thành công/đưa đầu vào ngon!! hàm tính ngon
        Assert.assertEquals(1, MathUtil.getFactorial(1));//tui muốn 1! == 1
        Assert.assertEquals(2, MathUtil.getFactorial(2));//tui muốn 2! == 2
        Assert.assertEquals(6, MathUtil.getFactorial(3));//tui muốn 3! == 6
        Assert.assertEquals(24, MathUtil.getFactorial(4));//tui muốn 4! == 24
        Assert.assertEquals(120, MathUtil.getFactorial(5));//tui muốn 5! == 120
        Assert.assertEquals(720, MathUtil.getFactorial(6));//tui muốn 6! == 720

    }   //hàm giúp ss 2 giá trị nào đó có giống nhau hay k
    //nếu giống nhau -> thảy màu xanh đèn đường- đường thông, code ngon
    //                  ít nhất cho case đang test
    //nếu k giống nhau ->thảy màu đỏ
    //                  hàm ý expected và actual k giống nhau

    //hàm getF() ta thiết kế có 2 tình huống xử lí
    //1. đưa data tử tế trong [0..20] -> tính đúng dc n! - done
    //2. đưa data vào cà chớn, âm, >20; THIẾT KẾ CỦA HÀM LÀ NÉM RA NGOẠI LỆ
    //KÌ VỌNG NGOẠI LỆ XUẤT HIỆN KHI N < 0 || N > 20
    //rất mong ngoại lệ xuất hiện vs n cà chớn này
    //nếu hàm nhận vào n < 0 hoặc n > 20 và hàm ném ra ngoại lệ 
    //hàm chạy đúng như thiết kế -> Xanh phải xuất hiện
    //nếu hàm nhận vào n < 0 hoặc n > 20 và hàm k ném ra ngoại lệ
    //sure, hàm chạy sai thiết kế, sai kì vọng, màu đỏ
    //Test case:
    //Input: -5
    //expected: IllegalArgumentException xuất hiện
    //tình huống bất thường, ngoại lệ, ngoài dự tính, dự liệu
    //là những thứ k thể đo lường so sánh theo kiểu value
    //mà chỉ có thể đo lường - cách chúng có xuất hiện hay k
    //assertEquals() k dùng để so sánh ngoại lệ
    //      equals() là bằng nhau hay k  trên value
    //màu đỏ đó, do hàm đúng là có ném ngoại lệ thật sự
    //          nhưng k phải là ngoại lệ như kì vọng - thực sự kì vọng sai
    //          ko phải hàm ném sai
//        @Test(expected = NumberFormatException.class)
//        public void testGetFactorialGivenWrongArgumentThrowsException(){
//            MathUtil.getFactorial(-5); //hàm @Test chạy hay hàm getF() chạy
//                                        //sẽ ném về ngoại lệ NumberFormat..
//        }
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5); //hàm @Test chạy hay hàm getF() chạy
        //sẽ ném về ngoại lệ NumberFormat..
    }

    //cách khác để bắt ngoại lệ xuất hiện, viết tn hơn
    //xài lambda
    //Test case: hàm sẽ ném về ngoại lệ nếu nhận vào 21
    //cần thấy màu xanh khi chơi vs 21!
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVerssion() {
//            Assert.assertThrows(tham số 1: loại ngoại lệ muốn so sánh,
//                                    tham số 2: đoạn code chạy văng ra ngoại runable);

        Assert.assertThrows(IllegalArgumentException.class,
                () -> MathUtil.getFactorial(-5));

        
//        MathUtil.getFactorial(-5); //hàm @Test chạy hay hàm getF() chạy
        //sẽ ném về ngoại lệ NumberFormat..
    }
    
    //Bắt ngoại lệ, xem hàm có ném về ngoại lệ hay k khi n cà chớn
    //có ném, túc là hà chạy đúng thiết kế -> xanh
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_TryCacth() {
        //chủ động kiểm soát ngoại lệ
        try {
            MathUtil.getFactorial(-5);
        } catch (Exception e) {
            //bắt try-catch là Junit sẽ ra xanh do đã chủ động kiểm soát ngoại lệ
            //nhưng k chắc ngoại lệ mình cần có xuất hiện hay k
            //có đoạn code kiểm soát đúng ngoại lệ IllegalArgumentException xuất hiện
            Assert.assertEquals("Invalid argument. N must be between 0 .. 20", e.getMessage());
        }
    }

    public MathUtilTest() {

    }

}
