package ru.progwards.T8;

//Пример коллизии со строками в Java
public class StringCollisions {
    public static void main(String[] args) {
        String [] collisionStrings = {
                "pollinating sandboxes",
                "amusement & hemophilias",
                "schoolworks = perversive",
                "electrolysissweeteners.net",
                "Microcomputers: the unredeemed lollipop..."
        };
        for (String s: collisionStrings) {
            System.out.println(s.hashCode());
        }
    }
}
