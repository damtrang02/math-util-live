package com.fu.mathutil;
//Ta viết cái class để cung cấp tiện ích cho nơi khác xài
//Khi ta cung cấp tiện ích cho nơi khác xài, đó là lúc ta không cần nhớ cái gì
// Cho riêng ta , hàm static giúp làm điều này
public  class  MathUtil {

    //n!= 1.2.3.4.5.6...n
    //Quy ước: 0! = 1! = 1
    //Không tính giai thừa cho số âm
    //20! là vừa khớp kiểu long, kiểu long tối đa 18 con số 0
    //21! lố kiểu long
    //nếu đưa vào âm, 21 giai thừa , ta éo tính, ta đập vào mặt ai xài hàm
    //một cái ngoại lệ, chửi éo tính cũng được
    public static long getFactorial(int n){
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. n must be between 0..20");
            //hàm dừng liền éo cần return

        if(n == 0 || n == 1)
            return 1;// dừng ngay khi n đặc biệt

        //xuống đến đay thì n = 2..20 òi
        //chơi for hoặc đệ quy thôi
        //kĩ thuật nhồi  con heo đất, ốc bu dồn thịt
        //i = 2, i = 3 ...  i = n

        long product = 1 ;//tích khởi đầu bằng 1
        for (int i = 2; i<=n; i++)
            product *= i ;

        return product;
    }
}
