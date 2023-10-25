package test;

import Human.Human;
import Human.Chinese;
import Human.English;
import Human.Japanese;

public class HumanTest {
    public static void main(String[] args) {
        Human[] humans = {
                new English("John"),
                new Chinese("张三"),
                new Japanese("ヘリコプター")
        };

        for (Human human : humans) {
            human.sayHello();
        }
    }
}
