package lesson14;
/*
Расставь правильно наследование между
Building(здание) и School(здание школы).
2. Подумай, объект какого класса должны
возвращать методы getSchool и getBuilding.
3. Измени null на объект класса Building или School
 */
public class Class1 {
    public static void main(String[] args) {
        Building building = new Building();
        System.out.println(building.getBuilding());

        School school = new School();
        System.out.println(school.getSchool());
    }
}
