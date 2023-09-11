package lesson13;

/*
1. Подумай, какой из двух интерфейсов нужно
реализовать в классе Beer.
2. Добавь к классу Beer этот интерфейс
и реализуйте все нереализованные методы.
3. Подумай, как связаны переменная
READY_TO_GO_HOME и метод isReadyToGoHome.
4. Верни значение переменной READY_TO_GO_HOME
в методе isReadyToGoHome.
 */
public class Beer implements DrinkBeer {
    static boolean READY_TO_GO_HOME = false;

    @Override
    public void drinkBeer() {
        System.out.println("Drink beer");
    }

    @Override
    public boolean haveBeer(boolean havebeer) {
        if (havebeer == true) {
            READY_TO_GO_HOME = false;
        } else if (havebeer == false) {
            READY_TO_GO_HOME = true;
        }
        return READY_TO_GO_HOME;
    }

    public boolean isReadyToGoHome(boolean READY_TO_GO_HOME) {
        if (READY_TO_GO_HOME == false) {
            return false;
        } else return true;
    }

    public static void main(String[] args) {
        Beer beer = new Beer();
        boolean haveBeer = beer.haveBeer(true);
        beer.isReadyToGoHome(haveBeer);
        //beer.drinkBeer();

        boolean beerAfterDrink = beer.haveBeer(true);

        if (beer.isReadyToGoHome(beerAfterDrink) == true){
            System.out.println("Go home");
        } else if (beer.isReadyToGoHome(beerAfterDrink == false)) {
            System.out.println("Let's drink some beer");
        }

        beer.drinkBeer();
        beerAfterDrink = beer.haveBeer(false);
        beer.isReadyToGoHome(haveBeer);

        if (beer.isReadyToGoHome(beerAfterDrink) == true){
            System.out.println("Go home");
        } else if (beer.isReadyToGoHome(beerAfterDrink == false)) {
            System.out.println("Let's drink some beer");
        }
    }
}
