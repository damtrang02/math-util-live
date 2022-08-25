package com.fu.mathutil;

public class Application {
    public static void main(String[] args) {
        long result = MathUtil.getFactorial(5);

        System.out.println("expected: 5! = 120; actual: "+ result);
        System.out.println("expected: 6! = 720; actual: "+ MathUtil.getFactorial(6));
        System.out.println("expected: 0! = 1; actual: "+ MathUtil.getFactorial(0));

        //THÊM CODE SAU LẦN ĐẦU TIÊN LÀM CHUYỆN ẤY - CODE LÊN SERVER 8:19PM  25/8/2022
        System.out.println("expected: 1! = 1; actual: "+ MathUtil.getFactorial(1));
        System.out.println("expected: 3! = 6; actual: "+ MathUtil.getFactorial(3));

        //kĩ thuật kiểm thử phần mềm : ước lượng xem giá trị trả về của hàm là gì
        //expected value: 5! = 120
        //mày/hàm ai đó viết khi chạy thực tế là mấy = actual , giả sử 120
        //if expected == actual , hàm ngon
//        MathUtil.getFactorial(-5);
    }
}
