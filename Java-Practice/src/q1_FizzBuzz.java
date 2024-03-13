
public class q1_FizzBuzz {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

//        変数を定義
        String fiz = "Fizz";
        String buz = "Buzz";
        String fizbuz = "FizzBuzz";
        
//        1から100までの数を表示させるループ処理
        for (int i = 1; i <= 100; i++) {
//            数字によって表示を分岐
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println(fizbuz);
            } else if (i % 5 == 0) {
                System.out.println(buz);
            } else if (i % 3 == 0) {
                System.out.println(fiz);
            } else {
                System.out.println(i);
            }
            
        }
    }

}
