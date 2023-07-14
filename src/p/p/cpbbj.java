package p.p;

import java.util.Random;

public class cpbbj {
    public boolean chineseZodiacSigns(String[] names,String[] chineseZodiacSigns){
        if (names.length != chineseZodiacSigns.length) {
            return false;
        }
        boolean pppppp = false;
        for (int i = 0; i < names.length; i++) {
            switch (chineseZodiacSigns[i]) {
                case "鼠", "牛", "虎", "兔", "龙", "蛇", "马", "羊", "猴", "鸡", "狗", "猪", "屁" -> {
                    pppppp = true;
                    break;
                }default -> pppppp = false;
            }
            if(!pppppp){
                return false;
            }
        }
        return pppppp;
    }
    public String WhoIsP(AreYouP p){
        Random r = new Random();
        if(p.getName().equals("屁") && p.getChineseZodiacSigns().equals("屁")) {
            return "啊！你如此闲得慌的输入了两个屁！你可真屁！史无前例！";
        }else if(p.getName().equals("屁") || p.getChineseZodiacSigns().equals("屁")) {
            return "啊！你竟然往个人信息中填“屁”，你可真屁！";
        }else if(p.getName().equals("曲晓贺") && p.getChineseZodiacSigns().equals("蛇")) {
            return "啊！" + p.getName() + "！你可真是非常非常非常屁啊！";
        }else if(p.getName().equals("曲霄致") && p.getChineseZodiacSigns().equals("兔")) {
            return "啊！" + p.getName() + "！你可太不屁啦！史无前例！";
        }else if(p.getName().equals("曲晓贺") && !p.getChineseZodiacSigns().equals("蛇")) {
            return "啊！" + p.getName() + "！你生肖不屁，名字很屁";
        }else if(p.getName().equals("曲霄致") && !p.getChineseZodiacSigns().equals("兔")) {
            return "啊！" + p.getName() + "！你名字不屁，生肖很屁";
        }else {
            int o = r.nextInt(3);
            switch (o) {
                case 0 -> {
                    return "你不屁";
                }
                case 1 -> {
                    return "你有点屁";
                }
                case 2 -> {
                    return "你很屁";
                }
            }
        }
        return null;
    }
    //为什么要把api放这？？？
    //直接调不行吗？？？？
    //算了，懒得改了。
    public String[] NameAndChineseZodiacSigns(String data){
        return data.split("，");
    }
}
