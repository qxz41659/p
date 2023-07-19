package p.p;

import java.util.Random;
import java.util.Scanner;

public class cpbbj {
    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();
    public static void start(){
        System.out.println("v4.0.0");
        System.out.println("此程序可以测试你屁不屁，而你只需要输入姓名和生肖");
        System.out.println("你可以输入一串数据");
        System.out.println("用中文逗号隔开");
        System.out.println("请选择你的方法");
        areYouP();
    }
    private static void areYouP(){
        while (true) {
            System.out.println("1.生肖测屁");
            System.out.println("2.星座测屁");
            String command = sc.next();
            switch (command) {
                case "1", "2" -> {
                    System.out.println("请输入你的姓名");
                    String[] name = sc.next().split("，");
                    System.out.println("请输入你的" + (command.equals("1") ? "生肖" : "星座"));
                    String[] temp = sc.next().split("，");
                    boolean temp1 = p(name, temp);
                    if (temp1) {
                        System.out.println("输错啦！");
                    } else {
                        areYouP(name, temp);
                    }
                }
                default -> {
                    System.out.println("鉴定完毕，你是屁");
                }
            }
        }
    }
    private static boolean p(String[] name,String[] data){
        if (name.length != data.length){
            return true;
        }
        boolean temp = true;
        for (String datum : data) {
            switch (datum) {
                case "鼠", "牛", "虎", "兔", "龙", "蛇", "马", "羊", "猴", "鸡", "狗", "猪", "白羊座", "金牛座", "双子座", "巨蟹座", "狮子座", "处女座", "天秤座", "天蝎座", "射手座", "摩羯座", "水瓶座", "双鱼座", "屁" -> {
                    temp = false;
                }
                default -> {
                    temp = true;
                }
            }
        }
        return temp;
    }
    private static void areYouP(String[] name,String[] data){
        for (int i = 0;i < name.length;i++) {
            if(name[i].equals("屁") && data[i].equals("屁")) {
                System.out.println("啊！你如此闲得慌的输入了两个屁！你可真屁！史无前例！");
            }else if(name[i].equals("屁") || data[i].equals("屁")) {
                System.out.println("啊！你竟然往个人信息中填“屁”，你可真屁！");
            }else if(name[i].equals("曲晓贺") && (data[i].equals("蛇") || data[i].equals("天蝎座"))) {
                System.out.println("啊！" + name[i] + "！你可真是非常非常非常屁啊！");
            }else if(name[i].equals("曲霄致") && (data[i].equals("兔") || data[i].equals("白羊座"))) {
                System.out.println("啊！" + name[i] + "！你可太不屁啦！史无前例！");
            }else if(name[i].equals("曲晓贺") && (!data[i].equals("蛇") || !data[i].equals("天蝎座"))) {
                System.out.println("啊！" + name[i] + "！你名字很屁，生肖或星座不屁！");
            }else if(name[i].equals("曲霄致") && (!data[i].equals("兔") || !data[i].equals("白羊座"))) {
                System.out.println("啊！" + name[i] + "！你名字不屁，生肖或星座很屁！");
            }else {
                int o = r.nextInt(3);
                switch (o) {
                    case 0 -> {
                        System.out.println("你不屁");
                    }
                    case 1 -> {
                        System.out.println("你有点屁");
                    }
                    case 2 -> {
                        System.out.println("你很屁");
                    }
                }
            }
        }
    }
}
