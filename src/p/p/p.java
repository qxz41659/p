package p.p;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class p {
    public static void main(String[] args) {
        System.out.println("v5.0.0");
        System.out.println("此程序可以测试你屁不屁");
        System.out.println("你可以输入一串数据");
        System.out.println("用中文逗号隔开");
        System.out.println("请选择你的方法");
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        cpbbj cpbbj = new cpbbj();
        ArrayList<cpbbj> pp = new ArrayList<>();
        while (true) {
            System.out.println("1.生肖测屁");
            System.out.println("2.星座测屁");
            String command = sc.next();
            switch (command) {
                case "1", "2" -> {
                    System.out.println("请输入你的姓名");
                    String[] name = sc.next().split("，");
                    System.out.println("请输入你的" + (command.equals("1") ? "生肖" : "星座"));
                    String[] zodiac = sc.next().split("，");
                    String[] a = {"鼠", "牛", "虎", "兔", "龙", "蛇", "马", "羊", "猴", "鸡", "狗", "猪", "屁"};
                    String[] b = {"白羊座", "金牛座", "双子座", "巨蟹座", "狮子座", "处女座", "天秤座", "天蝎座", "射手座", "摩羯座", "水瓶座", "双鱼座", "屁"};
                    boolean temp = ppp(name, zodiac, command.equals("1") ? a : b);
                    if (!temp) {
                        System.out.println("输错啦！");
                    } else {
                        for (int i = 0; i < name.length; i++) {
                            P:
                            {
                                for (int j = 0; j < pp.size(); j++) {
                                    if ((pp.get(j).getName().equals(name[i])) && (pp.get(j).getZodiac().equals(zodiac[i]))) {
                                            System.out.println(pp.get(j).getResults());
                                        break P;
                                    }
                                }
                                cpbbj.setName(name[i]);
                                cpbbj.setZodiac(zodiac[i]);
                                if (name[i].equals("屁") && zodiac[i].equals("屁")) {
                                    cpbbj.setResults("啊！你如此闲得慌的输入了两个屁！你可真屁！史无前例！");
                                } else if (name[i].equals("屁") || zodiac[i].equals("屁")) {
                                    cpbbj.setResults("啊！你竟然往个人信息中填“屁”，你可真屁！");
                                } else if (name[i].equals("曲晓贺") && (zodiac[i].equals("蛇") || zodiac[i].equals("天蝎座"))) {
                                    cpbbj.setResults("啊！" + name[i] + "！你可真是非常非常非常屁啊！");
                                } else if (name[i].equals("曲霄致") && (zodiac[i].equals("兔") || zodiac[i].equals("白羊座"))) {
                                    cpbbj.setResults("啊！" + name[i] + "！你可太不屁啦！史无前例！");
                                } else if (name[i].equals("曲晓贺") && (!zodiac[i].equals("蛇") || !zodiac[i].equals("天蝎座"))) {
                                    cpbbj.setResults("啊！" + name[i] + "！你名字很屁，" + (command.equals("1") ? "生肖" : "星座") + "不屁！");
                                } else if (name[i].equals("曲霄致") && (!zodiac[i].equals("兔") || !zodiac[i].equals("白羊座"))) {
                                    cpbbj.setResults("啊！" + name[i] + "！你名字不屁，" + (command.equals("1") ? "生肖" : "星座") + "很屁！");
                                } else {
                                    int o = r.nextInt(3);
                                    switch (o) {
                                        case 0 -> cpbbj.setResults("你不屁");
                                        case 1 -> cpbbj.setResults("你有点屁");
                                        case 2 -> cpbbj.setResults("你很屁");
                                    }
                                }
                                System.out.println(cpbbj.getResults());
                                try {
                                    pp.add(cpbbj.clone());
                                } catch (CloneNotSupportedException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    }
                }
                default -> System.out.println("鉴定完毕，你是屁");
            }
        }
    }
    public static boolean ppp(String[] name, String[] zodiac,String[] data){
        if (name.length != zodiac.length) {
            return false;
        }
        for (int i = 0; i < name.length; i++) {
            for (String datum : data) {
                if (datum.equals(zodiac[i])) {
                    return true;
                }
            }
        }
        return false;
    }
}