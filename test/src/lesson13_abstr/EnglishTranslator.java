package lesson13_abstr;
/*
Создать класс EnglishTranslator, который наследуется
от Translator.
2. Реализовать все абстрактные методы.
3. Подумай, что должен возвращать метод getLanguage.
4. Программа должна выводить на экран
"Я переводчик с английского".
5. Метод main менять нельзя
 */
public class EnglishTranslator extends Translator{
    String getLanguage(){
        return "Я переводчик с Английского";
    }

    public static void main(String[] args) {
        EnglishTranslator englishTranslator = new EnglishTranslator();

        System.out.println(englishTranslator.getLanguage());
    }
}
