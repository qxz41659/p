package p.p;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p {
    public static final String LOCALAPPDATA_PATH = System.getenv("LOCALAPPDATA") + "\\qxz41659\\Who-is-P\\p.data";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        cpbbj cpbbj = new cpbbj();
        ArrayList<cpbbj> pp = new ArrayList<>();
        Pattern pattern = Pattern.compile("^[鼠牛虎兔龙蛇马羊猴鸡狗猪屁]$");
        Pattern pattern1 = Pattern.compile("^(白羊|金牛|双子|巨蟹|狮子|处女|天秤|天蝎|射手|摩羯|水瓶|双鱼)座|屁$");
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(LOCALAPPDATA_PATH))) {
            pp = (ArrayList<cpbbj>) objectInputStream.readObject();
        } catch (Exception e) {
            File f = new File(LOCALAPPDATA_PATH);
            f.mkdirs();
            f.delete();
        }
        ObjectOutputStream objectOutputStream;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(LOCALAPPDATA_PATH));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("v6.0.2");
        System.out.println("此程序可以测试你屁不屁");
        System.out.println("你可以输入一串数据");
        System.out.println("用中文逗号隔开");
        System.out.println("正确输出只对正确输入负责");
        System.out.println("请选择你的方法");
        while (true) {
            System.out.println("1.生肖测屁");
            System.out.println("2.星座测屁");
            String command = sc.next();
            if (!(command.equals("1") || command.equals("2"))) {
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
                    if (!matcher.find()) {
                        temp = true;
                    }
                }
                if (temp || (name.length != zodiac.length)) {
                    System.out.println("输错啦！");
                } else {
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
                    System.out.println("输入\"P\"试试");
                    if ("P".equalsIgnoreCase(sc.next())) {
                        String s = "(1)(|//fnncczzczXJCCCCJJJJUUYUUUJCCQQQQ0OmmwmZZZZZOOZZOOZZZZZZZZZZZqqmmmmmpkbdddqp#pZOOOOOZZZZZZZmmmmmmwwqqqqqqqpqqpdddddddd\n" +
                                "x111{{{}{{{{{{1)|tjrnvvvuXUUUYXYJJUUYXXXYUCQOmqqpddpppqqwwmmmZZZOOOZZZmmmmZZpdpppohZO0OOOOZZZZZZZmmmmwqqqqpqqqqqpppddbbdbbbb\n" +
                                "0)1{{{{{{{{{{{{{{}}}}}}}}{11)))|tfjjxnzXXcczJ0wmmmmwwwwwwwqqqqpqqqwwwwmmmZZO0OZZd#m0000OOOOOZZmwmmwqqpddpqqqpppppppddddbbddd\n" +
                                "0)1{}{{{{{{{{{{{{{{{{{{{{{{{{{{}}}}}}{{{111)(\\fjrrncULQLCLQ0OZZZZmmmmmmwwqwwwmmmakO00QQ00Q0Zqdbbdpqmmqppppppppppppppddddddpp\n" +
                                "cj/\\\\\\\\|()11{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{}}}}}}}}}{{11)|\\/fxrnvcXYJCLLQ00000mow00OQqbppbkkhhakkbqwZ000QQmqppppppppppddddp\n" +
                                "1))))(\\//tft\\\\\\\\\\\\\\(())1{{{{}}}}}{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{11)(|/tfjxZaOmpkbk*#*a*ooo*a*obdqOO0UcXJQmppppppppppppd\n" +
                                ")1{{{{{}}{{{{{{{1))))(|\\\\\\\\\\|()))11{{{{{{{{{{{{{{{{{{{{{{{{{{{{{11{{{{{{{{}}}}[rwmb*##M&8WM#M&&WMMM*bdZ0L0CJJXzQwppppppppppd\n" +
                                "Xnrrjt/\\|()1{{{{{{}}}}}}}{{{1)))(||\\\\|||(()))11{{{{{{{{{{{{{{{{{{{{{{{{{{{{{}}{zk#M#*oooha#W&&&&8&M###kd0LCZm0JXCLmpppqppddd\n" +
                                "nnnuuuuvvcvnnnxjf//\\|()1{{{{}}}}}}}{{{{11)))((|||||||(((())111{{{{{{{{{{{{{{{}Q&WqLUzunxjuCwbo*M&&&&M#o*bdpO0mQYYJcCpppppppp\n" +
                                "xnxxxxxxxxxxxnnnnnuuvvnnxxrxxxj\\||())1{{{}}}}}}}{{{11))((|\\\\\\//\\||()))11{{{{[v#hCj/())((|\\fncYCZph#MM##*#opZZYLCzcCvUppppppp\n" +
                                "nnxnnnnnnnnnnnnxxxxxxxxxxxxnnnnnuunuvvnxxrjff//\\|()11{{{}}}}}}}{{1)))(|||||(xpz({{{11)(|\\/tjrxnucYCOwZqhaoaO0LXQCXucfLppqppp\n" +
                                "nnnnnnnnnxxxxxxxxxxxnxnxxxxnnnnnnnnxxxxxnnnuuuuuuuunnxxxrjffft/\\()1{{{{{}}{}x/]?][}1))||\\/ffjrrrrrrxvvzJ0qZOLmZCLJznjXpqppdd\n" +
                                "nnnnnnnnnxxxxxxxxxxxxxxxxxxxxxnnnnnnnnnnnnnnnnnnnnnnnnnuunnnuuvvvuuuuxjft/(/\\[[{{1))(||\\\\\\/fffjjft/fxfj//vwm0LQJXcncxxmppdbb\n" +
                                "nnnnnnnnnxxxxxxxxxxxxxxxxxxxxxxxxnnnnnnnnnnnnnnuunnuunnunxrxxxxxxxxxxcJUYcnYOQct//////\\\\\\\\|\\\\//\\\\|)(}]{[)zdabpmZLLCzv/0pppdd\n" +
                                "nnnnnnnnnxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxnxnnnnnnnnnnnnnxxxxxxxruvnujnzXOq0cx屁xxxxxrft\\((1{{{屁[?-_++]rOmpbkahk*hmXxmpp\n" +
                                "nnnnnnnnnnnxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxrrvx/1(jCQkmQQXzczXXXXvnf(}?__+~~+?1xXJJCLQqkaodqCZpqqppp\n" +
                                "nnnnnnnnnnnnnxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxrrrrnt))\\frzQwm0L00JCQZpdpmJx)->i>><_1fxxxncXU0wawQZqqqqqqq\n" +
                                "nnnnnnnnnnnnnxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxrxxx\\(\\///tjjv0vxzUJLLQ0OZqqZYt-!!>>ii>_1\\\\ffrYmmQmqwwwwwww\n" +
                                "nnnnnnnnnnnnxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxj(|/rvYzxt/(\\uur00ObqkodOJXvt]<ii!!ll~)()(/nc0pdpdpppqww\n" +
                                "nnnnnnnnnnnnnxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxftrcUXj\\{}}{)/x)/cXYJZddpqJcYr}+>>lII>}{}{|jxuvcXUJCQ00Z\n" +
                                "nnnnnnnnnnxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxrrxxxxxxxxxxxxxxxxxxxxxruYJXj()()}]-_1/(|fxuczvxftcCQnxrj/({{||)\\fxxxxxnnxxxnnn\n" +
                                "nnnnnnnnnxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxrxxxxxxxxxxxxxxxxxxxxxxxrvUzxxzvnx/{-+i1Cnt/fjxuxjt}_{1-~__?](1}))(jxxxxnunnnunn\n" +
                                "rrrxxxxxnxxxxxxxxxxxxxxxxxrrrrxxxxxxxxxxxxxrrxxxxxxxxxxxxxxxxxxxxxxxxuYZXncJLLLXj1]vwUxf/\\/fjt1-+~~<<<<<-_-}1tY\\xxxxnuuunnnn\n" +
                                "ZOCYXcvnxrrxxxxxxxxxxxxxnUJYYXvunxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxunzmncJJL0mO0OZ0Uunrt|(1{[?-+<~~+~+<1XX(/vtxxxxnnnnnnnn\n" +
                                "dbbbbbbpmOLXvnxrrxxxxxxcmmJvvXUJJYzcvuxrxxxxxxxxxxxxxxxxxxxxxxxxxxxxxrjxczfrXJCUULQCJYcvurt(}]???_++++<<-c0Y(ffxxxxnnnnnnnnn\n" +
                                "mmmmmmwqqppddpw0JcnxrxxcZ{{/t/\\\\\\\\/tfxcYcnrrxxxxxxxxxxxxxxxxxxxxxxxxxjrvcXYJzccXXYJCJUXzcnf|1}]??-_++<>_-+t()jxxxxxnnnnnnnnn\n" +
                                "mwmmmmmmmmZmmwqppqqw0Ynvm)?--]1))1}{{{[[/vznrxxxxxxxxxxxxxxxxxxxxxxxxjrvUJUJL00ZZdbpCUYXznf\\)1{[?__~<)(]_<{fxxxxxxnnnnnnnnnn\n" +
                                "qwwwmmmmmmmmmmmZZmmqdbdmq)????--?})()(//}<[xvnxxrxxxxxxrrxnxxxxrjrxnnnnuzCQLCUXXUCQLUYzcuf/()1{]-+<+\\nnjfrnxxxxnnnnnnnnnnnnn\n" +
                                "wwwwwqwwwwwwmmmmmmmmmmwba|???????--?]})\\rU/}vf/fxftfrjft/\\\\(()))1{{11|/frncUCCJXccXYYzvnxt\\(1{[-+-tnnnxnnnxnnnnnnnnnnnnnnnnn\n" +
                                "wwwwqppppqqqqwwwwwwwwmmdo\\-???-??--??---?1uZ|[[xOfxcvxrrjjjjjftt/////frrjjjrxnnxvuvcccvuxt|1}}1\\n0pvxnxxxnnnnnnnnnnnnnnnnnnn\n" +
                                "wmmmmqqqppddpqqqwwwwwwbCYn)1[-?----------+{C[]])L}]?????????????????????--????-}zfjrxxxxrruYOpwqqd0xxnxxxxnnnnnnnnnnnnnnnnnn\n" +
                                "wmmmmwwwwqqpdpqqqwwmmdCIi-]{/t?--______---10}--[C1]]?]]]]][}}}}}}}}}}}{{}{[]]]]]XYXJL0wddqZhMbqwmdzxnxxxxnnnnnxxxxxxnnnnnnnn\n" +
                                "dbbpqwmmmmmwqqqqqwmmmdQ>;;;;>Y}---_____---}O1_-]J)]]?}0O0OZZmmmmwwwwwwwwwqc?]]]?nQXqL{]_~>l?qbmmpZxnnxxxnnnnnxxxxxxxnnnnnnnn\n" +
                                "XUQZpddpqmmmmmwwwmmZmkj{}][{cx----___-_---?C(_--J/?]?[qdqqqqqqqqqqpppppppdQ[]]]-t\\?\\i;IIIllI?qkwdzxxnnnnnnnxxxxxnnnnnnnnnnnn\n" +
                                "XXzzXYCQZwpdpwmmZZZZmojIlllI_x--______----_X|_--Qr?]?]QqmmmmmmmmwwwwwmmmZmJ[]]]?/X?lllll!lllI?Co0rnnnnxxnnnxxnnnnnnnnnnnnnnn\n" +
                                "zXzzzXzzzzXCOqdddbqpkdq(]__]n/----__-_----_c\\-?-Cu-???u\\(|\\\\\\||||\\\\|())))1r)-???(r>>lIlI?xlll/\\fpXxxxxxxnnnnnnnnnnnnnnnnnnnn\n" +
                                "zzzzzzzzzzzzzXXULZOmkkJ;!<~~X)----__-_----_vf_?_UY-]??z_><>>i><~~<<<<<<<<>xf?]]?}c)1|(i;{YlII!x|n*Zvxxnnnnnnnnnnnnnnnnnnnnnn\n" +
                                "zzXzzzzzzzzzzzzzzzXYLwpc{_+}v}-------__---_uc_-+zQ?]??{|||()fxrxxjj/)((()ju({(|))J]l!Xj-x+IIIIIn}\\b*Zcxxxxxxxnnnnnnnnnnnnnnn\n" +
                                "XXXXXXXXzzzzXXXXXXXXzzXJLQqwzf1?___--_-----jX-?_cm]]??-_+_}(J[>>>>{z1}?+]ni;;;Ii+?<Il[_>lIIIII,fj:i/QwLcnxrxxxxnnnnnnnnnnnnn\n" +
                                "YYXXXXXXXXXXXXXXXXXXXXXXXYYJL00LXj)?__-???-fL??_rZ]???-_\\QqpbLUJCJCdpq0j]n/[_<!II;III;;IIIII;;]v~II;;>{Qkm0CYzvuunnxxnnnnnnn\n" +
                                "YYYXXYYYYXXXXXXXXXXXXXXXXXYYYYYJL0OLzf)]---tQ]?-tO]??-_/dpqqduUJvpwZmqphjv1~?[~IIIIII;;;I;Ii_(\\>;lIIII;!zhqpbhkpZCUCCXvnxxxx\n" +
                                "YYXXXXXYYYXXXXXXXXXXXXXXXXXYYYYYXXXYJQ0Lcf1|U---\\0[?--_fdpqdm]??])))vbbL}1cf??]+I;;;>([__[1{]<;IIlIIIIlI!Looou{_<><]jQkpZLJO\n" +
                                "XXXYYYYXXXXXXXXXXXXXXXXXXXXXXXXXXXYYYYYUCLCCQr(])Q[????-\\Y0wL]?]CwwwwCj-__1u1-+<>+])/(_~>il;;IIIlIIIIIll;f%@@jIli[rzYCpbpdbk\n" +
                                "XXYYYYYXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXYXUCLLm)?_-??__?}}]??}\\nr\\||)[__?1))/juZ?lIIIIIIIIIIIIIIIIIllI_*WQ-l10ddqqqwwqwww\n" +
                                "XXXXYYYYYYYYYYXXXXXXXXXXXXzXXXXXYYUJCQ0ZmwOYXXXYCQ0Jx(]--???-??-|x()t\\[{nv)___-?-[Z_;llII;;;;;IIIIIIllllI\\C~l]Jkdwmmmwwwwwww\n" +
                                "XXXXXYYYYYYYYYYYYYYYYUUJCQ0ZmqpdbhaaaoaaaaapQYXXXXYJQOQXj{?-??-vu<I_!l}\\}-fn?-???]Zn{{{{{{[<IIIIllllllll!L|}Xbdwmmwmmmwmmmmm\n" +
                                "XXXXXXXYYUUJCQ0ZmqpdkhhaaaaaaaaahhkbdddddddbkdmJXzzXXXUQmwQu(]xclllIIl!I;II|x_----Uti!!!i><illlllllllI;>zomddwmwwwwwwmmwwwmm\n" +
                                "YYYYYQwkohkaaooaaahhkkbbbbbbddbbbdbbddddddddddkkp0UXXXXXYULmwmor!;;IIlllllI;rc/\\\\(Y(ll!!llllllllllll!_jmhqqwmwmmmmmmmmmwqqqw\n" +
                                "YYYXmokdZaokbbbddddbbbbbbbbbbbbbbddbbbddddddddddbbbwQYXXYYYYYJQwOz(~I;IIlllI]J?____<lllIIIIlli<+?{fcQpkpqqwwmwmmmmmmmmmwwqqw\n" +
                                "YYYYpMMw+]CahbbdbbbbbbbbbbbbbbbbbbdddddddbdddddddpdbkbmCUYYYYYXXJQmZCx[iIIllix<lllII!~}\\ncYJC0Zmqpdpqwwqqqqqwwwwwwwmmmwwwwww\n" +
                                "YYYXYOkMq(>)0ohbbbbbbbbbbbbbbbbbbbddddddddddddbbkkhhhbhamUYYYYYYYXXYC0mQv{>I!t>Il<{nCwbbbbdpqwmZZZmmmwwwwwqqqqqqqqqwwwqwwwww\n" +
                                "YYYC0Q0pW8O}>/mabbbbbbbbbbdbbddddddddbbkkhaaakbqOCzj){dmUYYYYYYYYYYYYXXUQZ0v1_+tJpkbdpqqqqpppwmmmmmmmmmwwwwqpddpppqqwwwwwwmm\n" +
                                "YYmhh*dmZq#oX-+nkabbbbbbbbddddbbbkhaakqZ0CXx\\}-~<~?)fcooqJYYYYYYYYYYYYYYXXJQmOdaddbbbbpppppppqwmwwmmmwwwmmwqpddpppqwwwwmmwqp\n";
                        for (int j = 0; j < s.length(); j++) {
                            System.out.print(s.charAt(j));
                            try {
                                TimeUnit.MILLISECONDS.sleep(10);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        try {
                            TimeUnit.SECONDS.sleep(2);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println(":P");
                    }
                } else if (name[i].equals("曲霄致") && (zodiac[i].equals("兔") || zodiac[i].equals("白羊座"))) {
                    System.out.println("啊！" + name[i] + "！你可太不屁啦！史无前例！");
                } else if (name[i].equals("曲晓贺")) {
                    System.out.println("啊！" + name[i] + "！你名字很屁，" + (command.equals("1") ? "生肖" : "星座") + "不屁！");
                } else if (name[i].equals("曲霄致")) {
                    System.out.println("啊！" + name[i] + "！你名字不屁，" + (command.equals("1") ? "生肖" : "星座") + "很屁！");
                } else {
                    switch (r.nextInt(3)) {
                        case 0 -> cpbbj.setResults("你不屁");
                        case 1 -> cpbbj.setResults("你有点屁");
                        case 2 -> cpbbj.setResults("你很屁");
                    }
                    cpbbj.setName(name[i]);
                    cpbbj.setZodiac(zodiac[i]);
                    System.out.println(cpbbj.getResults());
                    try {
                        pp.add(cpbbj.clone());
                        objectOutputStream.writeObject(pp);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
