package test;

import Human1.Chinese;
import Human1.English;
import Human1.Human;
import Human1.Japanese;

public class Human1Test {
    public static void main(String[] args) {
        Human[] humans = new Human[3];
        humans[0] = new English("John");
        humans[1] = new Japanese("ヘリコプター");
        humans[2] = new Chinese("张三");

        for (Human human : humans) {
            human.sayHello();
        }
    }
}
