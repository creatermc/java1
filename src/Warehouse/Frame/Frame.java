package Warehouse.Frame;

import javax.swing.*;

// TODO: 22.12.2019  ШАБЛОН ФРЕЙМА
//иногда бывает так, что то теряется...

public class Frame extends JFrame {

    public static void main(String[] args) {


        JFrame f = new JFrame();
        f.setVisible(true);
        f.setSize(200,200);
        f.setResizable(false); //запрет на развертку окна
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //.setLocation(900,500);   //расположение фрейма
        f.setLocationRelativeTo(null);  //centre

    }
}