package p.p;

import java.util.Objects;
import java.util.Scanner;

public class p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreYouP p = new AreYouP();
        cpbbj pp = new cpbbj();
        System.out.println("v3.0.0");
        System.out.println("此程序可以测试你屁不屁，而你只需要输入姓名和生肖");
        System.out.println("键入“version”查询当前软件版本");
        System.out.println("可以输入一串数据");
        System.out.println("用中文逗号隔开");
        while (true) {
            System.out.println("请输入你的姓名");
            p.setName(sc.next());
            String[] names = pp.NameAndChineseZodiacSigns(p.getName());
            String[] ChineseZodiacSigns;
            P:
            while (true) {
                System.out.println("请输入你的生肖");
                p.setChineseZodiacSigns(sc.next());
                ChineseZodiacSigns = pp.NameAndChineseZodiacSigns(p.getChineseZodiacSigns());
                if(pp.chineseZodiacSigns(names,ChineseZodiacSigns)){
                    break P;
                }else{
                    System.out.println("输错啦！重输！");
                        }
                    }
            for (int i = 0; i < names.length; i++) {
                p.setName(names[i]);
                p.setChineseZodiacSigns(ChineseZodiacSigns[i]);
                System.out.println(pp.WhoIsP(p));
            }
            System.out.println("键入任意键退出，键入1继续测试");
            if (!Objects.equals(sc.next(), "1")) {
                return;
            }
        }
    }
}
