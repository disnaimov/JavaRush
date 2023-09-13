package lesson14;
/*
1. Реализовать интерфейс Selectable в классе Food.
2. Метод onSelect() должен писать в консоль
"food is selected".
3. Подумай, какие методы можно вызвать для
переменной food и какие для selectable.
4. В методе foodMethods вызови методы onSelect,
eat, если это возможно.
5. В методе selectableMethods вызови методы
onSelect, eat, если это возможно.
6. Явное приведение типов не использовать.
 */
public class Food implements Selectable {
    @Override
    public void onSelect() {
        System.out.println("food is selected");
    }

    void eat() {
        System.out.println("Eat some food");
    }

    public static void main(String[] args) {
        Food food = new Food();

        food.eat();
        food.onSelect();
    }


}
