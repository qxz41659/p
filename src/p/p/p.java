package p.p;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        cpbbj cpbbj = new cpbbj();
        ArrayList<cpbbj> pp = new ArrayList<>();
        File f = new File(System.getenv("APPDATA") + "\\qxz41659\\Who-is-P\\p.data");
        Pattern pattern = Pattern.compile("[鼠牛虎兔龙蛇马羊猴鸡狗猪屁]");
        Pattern pattern1 = Pattern.compile("(白羊|金牛|双子|巨蟹|狮子|处女|天秤|天蝎|射手|摩羯|水瓶|双鱼)座|屁");
        if (f.length() != 0) {
            try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(f))) {
                pp = (ArrayList<cpbbj>) objectInputStream.readObject();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            try {
                new File(System.getenv("APPDATA") + "\\qxz41659\\Who-is-P").mkdirs();
                f.createNewFile();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("v6.0.1");
        System.out.println("此程序可以测试你屁不屁");
        System.out.println("你可以输入一串数据");
        System.out.println("用中文逗号隔开");
        System.out.println("请选择你的方法");
        while (true) {
            System.out.println("1.生肖测屁");
            System.out.println("2.星座测屁");
            String command = sc.next();
            if (!(command.equals("1") || command.equals("2"))){
                System.out.println("鉴定完毕，你是屁。");
                continue;
            }
            String[] name;
            String[] zodiac;
            while (true) {
                System.out.println("请输入你的姓名");
                name = sc.next().split("，");
                System.out.println("请输入你的" + (command.equals("1") ? "生肖" : "星座"));
                zodiac = sc.next().split("，");
                boolean temp = false;
                for (String s : zodiac) {
                    Matcher matcher = (command.equals("1") ? pattern.matcher(s) : pattern1.matcher(s));
                    if (!matcher.find()){
                        temp = true;
                    }
                }
                if (temp || (name.length != zodiac.length)) {
                    System.out.println("输错啦！");
                }else {
                    break;
                }
            }
            P:
            for (int i = 0; i < name.length; i++) {
                for (cpbbj value : pp) {
                    if ((value.getName().equals(name[i])) && (value.getZodiac().equals(zodiac[i]))) {
                        System.out.println(value.getResults());
                        continue P;
                    }
                }
                if (name[i].equals("屁") && zodiac[i].equals("屁")) {
                    System.out.println("啊！你如此闲得慌的输入了两个屁！你可真屁！史无前例！");
                } else if (name[i].equals("屁") || zodiac[i].equals("屁")) {
                    System.out.println("啊！你竟然往个人信息中填“屁”，你可真屁！");
                } else if (name[i].equals("曲晓贺") && (zodiac[i].equals("蛇") || zodiac[i].equals("天蝎座"))) {
                    System.out.println("啊！" + name[i] + "！你可真是非常非常非常屁啊！");
                } else if (name[i].equals("曲霄致") && (zodiac[i].equals("兔") || zodiac[i].equals("白羊座"))) {
                    System.out.println("啊！" + name[i] + "！你可太不屁啦！史无前例！");
                } else if (name[i].equals("曲晓贺")) {
                    System.out.println("啊！" + name[i] + "！你名字很屁，" + (command.equals("1") ? "生肖" : "星座") + "不屁！");
                } else if (name[i].equals("曲霄致")) {
                    System.out.println("啊！" + name[i] + "！你名字不屁，" + (command.equals("1") ? "生肖" : "星座") + "很屁！");
                }else {
                    switch (r.nextInt(3)) {
                        case 0 -> cpbbj.setResults("你不屁");
                        case 1 -> cpbbj.setResults("你有点屁");
                        case 2 -> cpbbj.setResults("你很屁");
                    }
                    cpbbj.setName(name[i]);
                    cpbbj.setZodiac(zodiac[i]);
                    System.out.println(cpbbj.getResults());
                    try (ObjectOutputStream oops1 = new ObjectOutputStream(new FileOutputStream(f))) {
                        pp.add(cpbbj.clone());
                        oops1.writeObject(pp);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}