package Obj_Practice;

public class q2_baseballMain {

    public static void main(String[] args) {
        // 野球チームインスタンス
        q2_BaseballTeam giants = new q2_BaseballTeam();
        q2_BaseballTeam baystars = new q2_BaseballTeam();
        q2_BaseballTeam hanshin = new q2_BaseballTeam();
        q2_BaseballTeam curp = new q2_BaseballTeam();
        q2_BaseballTeam dragons = new q2_BaseballTeam();
        q2_BaseballTeam yakult = new q2_BaseballTeam();
        
        giants.setName("読売ジャイアンツ");
        baystars.setName("横浜DeNAベイスターズ");
        hanshin.setName("阪神タイガース");
        curp.setName("広島カープ");
        dragons.setName("中日ドラゴンズ");
        yakult.setName("東京ヤクルトスワローズ");
        
        giants.setWin(77);
        baystars.setWin(71);
        hanshin.setWin(69);
        curp.setWin(70);
        dragons.setWin(68);
        yakult.setWin(59);
        
        giants.setLose(64);
        baystars.setLose(69);
        hanshin.setLose(68);
        curp.setLose(70);
        dragons.setLose(73);
        yakult.setLose(82);
        
        giants.setDraw(2);
        baystars.setDraw(3);
        hanshin.setDraw(6);
        curp.setDraw(3);
        dragons.setDraw(2);
        yakult.setDraw(2);
               
        giants.report(giants.getRate());
        baystars.report(baystars.getRate());
        hanshin.report(hanshin.getRate());
        curp.report(curp.getRate());
        dragons.report(dragons.getRate());
        yakult.report(yakult.getRate());
    }
}
