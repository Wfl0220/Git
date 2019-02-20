import java.util.Scanner;

public class CaiQuanYX {
    public static void main(String[] args) {


        Scanner aa = new Scanner(System.in);        //新建一个手势方法


        while (true) {

            System.out.println("-----猜拳小游戏-----");
            System.out.println("请出拳（1.剪刀 2.石头 3.布）");


            String userInput = aa.next();


            int per = 1;        // 默认出剪刀
            try {
                per = Integer.valueOf(userInput);
                // per = aa.nextInt();                     //接受用户输入的手势
            } catch (Exception e) {
                System.out.println("输入异常，游戏重新开始");
                continue;
            }

            int com = (int) (Math.random() * 3) + 1;     //电脑随机产生一个手势



            String bj_1 = "空";    //标记用户的手势
            String bj_2 = "空";    //标记电脑的手势

            switch (per) {
                case 1:
                    bj_1 = "剪刀";
                    break;
                case 2:
                    bj_1 = "石头";
                    break;
                case 3:
                    bj_1 = "布";
                    break;
            }
            switch (com) {
                case 1:
                    bj_2 = "剪刀";
                    break;
                case 2:
                    bj_2 = "石头";
                    break;
                case 3:
                    bj_2 = "布";
                    break;
            }
            if (per == 1 && com == 1 || per == 2 && com == 2 || per == 3 && com == 3) {  // per == com
                System.out.println("你出的：" + bj_1 + "  电脑出的：" + bj_2);
                System.out.println("你与电脑打成平手");
                // 1.剪刀 2.石头 3.布
            } else if (per == 1 && com == 3 || per == 2 && com == 1 || per == 3 && com == 2) {
                System.out.println("你出的：" + bj_1 + "  电脑出的：" + bj_2);
                System.out.println("恭喜你，你赢了");
            } else //(per==1&&com==2||per==2&&com==3||per==3&&com==1)
            {
                System.out.println("你出的：" + bj_1 + "  电脑出的：" + bj_2);
                System.out.println("很遗憾，你输了");
            }

            // func

        }

    }
}

