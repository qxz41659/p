package p.p;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class p {
    public static void main(String[] args) {
        System.out.println("此程序可以测试你屁不屁，而你只需要输入姓名和生肖");
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while (t == 1){
            System.out.println("请输入你的姓名");
            String n = sc.next();
            System.out.println("请输入你的生肖（只能输入鼠、牛、虎、兔、龙、蛇、马、羊、猴、鸡、狗、猪）");
            String m = sc.next();
            switch (m) {
                case "鼠":
                case "牛":
                case "虎":
                case "兔":
                case "龙":
                case "蛇":
                case "马":
                case "羊":
                case "猴":
                case "鸡":
                case "狗":
                case "猪":
                case "屁":
                    break;
                default:
                    System.out.println("输错啦！");
                    return;
            }
            if (Objects.equals(n, "曲晓贺") && m.equals("龙")) {
                System.out.println("啊！" + n + "！你可真是非常非常非常屁啊！");
            }else if(Objects.equals(n, "曲霄致") && m.equals("兔")) {
                System.out.println("啊！" + n + "！你可太不屁啦！史无前例！");
            }else if(Objects.equals(n, "曲晓贺") && !m.equals("龙")) {
                System.out.println("啊！" + n + "！你生肖不屁，名字很屁");
            }else if(Objects.equals(n, "曲霄致") && !m.equals("兔")) {
                System.out.println("啊！" + n + "！你名字不屁，生肖很屁");
            }else if(Objects.equals(n, "屁") && m.equals("屁")) {
                System.out.println("啊！你如此闲得慌的输入了两个屁！你可真屁！史无前例！");
            }else if(Objects.equals(n, "屁") || m.equals("屁")) {
                System.out.println("啊！你竟然往个人信息中填“屁”，你可真屁！");
            }else {
                int o = r.nextInt(3);
                switch (o) {
                    case 0 -> System.out.println("你不屁");
                    case 1 -> System.out.println("你有点屁");
                    case 2 -> System.out.println("你很屁");
                }
            }
            System.out.println("键入任意数字退出，键入1继续测试");
            t = Integer.parseInt(sc.next());
        }
    }
}
