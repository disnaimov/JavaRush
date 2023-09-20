package lesson15_dop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
/*
1. Найти в гугле пример для - Singleton pattern
Lazy initialization.
2. По образу и подобию в отдельных файлах создать
 три синглтон класса Sun, Moon, Earth.
3. Реализовать интерфейс Planet для классов
 Sun, Moon, Earth.
4. В статическом блоке класса Solution
вызвать метод readKeyFromConsoleAndInitPlanet.
5. Реализовать функционал метода
readKeyFromConsoleAndInitPlanet:
5.1. С консоли считать один параметр типа String.
5.2. Если параметр равен одной из констант интерфейса
Planet, то создать соответствующий объект и присвоить
его Planet thePlanet, иначе обнулить Planet thePlanet.
5.3. Сравнивать введенный параметр можно только с
константами из Planet, нельзя создавать свои строки.
 */
public class Class3 {
    public static Planet thePlanet;

    public static Planet readKeyFromConsoleAndInitPlanet() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = null;

        try {
            while (!(Objects.equals(s, "exit"))) {
                s = br.readLine();

            if (Objects.equals(s, Planet.EARTH_CONST)) {
                thePlanet = Earth.getInstance();
                System.out.println(thePlanet.toString());
            } else if (Objects.equals(s, Planet.MOON_CONST)) {
                thePlanet = Moon.getInstance();
                System.out.println(thePlanet.toString());
            } else if (Objects.equals(s, Planet.SUN_CONST)) {
                thePlanet = Sun.getInstance();
                System.out.println(thePlanet.toString());
            } else {
                thePlanet = null;
                System.out.println((Object) null);
            }
        } } catch(IOException e){
            e.printStackTrace();
        }

        br.close();
        return thePlanet;
    }

    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

    }
}
