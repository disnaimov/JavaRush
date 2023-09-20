package lesson15_dop;

import com.sun.source.tree.Tree;

/*
1.В классе Tree перегрузи метод info(Object s)
два раза так, чтобы получилось три метода info(Object s),
 info(Number s), info(String s).
1.1. Разберись в методе info(Object s). Сделай
по аналогии функционал новых методов.
1.2. Например, для метода info(Number s) результат
может быть таким "Дерево № 123 , метод Number, параметр Short".
2. В блоке 2 должен вызываться метод info(Object s).
3. В блоке 3 должен вызываться метод info(Number s).
4. В блоке 4 должен вызываться метод info(String s).

 */
public class Class2 {
    static class Tree{
        void info(Object s){
            System.out.println(s);
        }

        void info(Number s){
            System.out.println("Дерево 123");
        }

        void info(String s){
            System.out.println(s);
        }
    }


    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.info(202);
        tree.info("1488");
        tree.info(1.2F);
    }

}
