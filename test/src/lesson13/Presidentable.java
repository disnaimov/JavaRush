package lesson13;
/*
1. Создай интерфейс Person.
2. Добавь в него метод isAlive(), который проверяет,
 жив человек или нет.
3. Подумай, какой тип должен возвращать этот метод.
4. Создай интерфейс Presidentable.
5. Унаследуй интерфейс Presidentable от интерфейса Person.
 */
public interface Presidentable extends Person{
    boolean presidentable();
}
