package Obj_Practice;

public class q2_BaseballTeam {

    private String name;    // 球団名
    private int win;    // 勝ち数
    private int lose;   // 負け数
    private int draw;   // 引き分け数
    private double rate; //  勝率
    
    // 計算処理
    // 勝率の計算
    public double getRate() {
        rate = (double)win / (win+lose);
        return rate;
    }
    // 成績表示
    public void report(double rate) {       
        System.out.println(name + "の2019年の成績は " + win + "勝 " + lose + "敗 " + draw + "分、 " + "勝率は " + rate + "です。");
    }
    
    // getter,setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getWin() {
        return win;
    }
    public void setWin(int win) {
        this.win = win;
    }
    public int getLose() {
        return lose;
    }
    public void setLose(int lose) {
        this.lose = lose;
    }
    public int getDraw() {
        return draw;
    }
    public void setDraw(int draw) {
        this.draw = draw;
    }
    
}
