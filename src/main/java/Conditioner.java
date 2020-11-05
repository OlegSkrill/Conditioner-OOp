public class Conditioner {
    private int maxTemperature = 25;
    private int minTemperature = 15;
    private int currentTemperature;

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
//        проверка, что текущ t меньше max
        if (currentTemperature > maxTemperature)
//        если текущ t больше max, то return приведет к выходу
//        и вернет последнее присвоенное знач, то есть 0
            return;
//        проверка что текущ t больше min
        if (currentTemperature < minTemperature)
//            если текущ t меньше min, то return приведет к выходу
//        и вернет последнее присвоенное знач, то есть 0
            return;
//        если проверка проходит, то есть меньше max и больше min, то
//        в поле currentTemperature текущего объекта записывается
//        текущее значение переменной/параметра, то есть то, кот
//        было передано в сеттер
        this.currentTemperature = currentTemperature;
    }

    public void increaseCurrentTemperature() {
        if (currentTemperature < maxTemperature)
            currentTemperature++;
    }

    public void decreaseCurrentTemperature() {

        if (currentTemperature > minTemperature)
            currentTemperature--;
    }
}









