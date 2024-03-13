package Obj_Practice;

public class employee {
  
    // プロバティ
    public String employeeName;     // 社員名
    public String divisionName;     // 部署名
    
    // 自己紹介処理
    public void introduce() {
        System.out.println("私の名前は" + employeeName + "です。");
        System.out.println("所属部署は" + divisionName + "です。");
    }
}
