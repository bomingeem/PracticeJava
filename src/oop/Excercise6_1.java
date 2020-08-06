package oop;
//[6-1,2]
public class Excercise6_1 {
    public static void main(String[] args) {
        SutdaCard car1 = new SutdaCard(3, false);
        SutdaCard car2 = new SutdaCard();

        System.out.println(car1.info());
        System.out.println(car2.info());
    }

    static class SutdaCard {
        int num;
        boolean isKwang;

        SutdaCard() {
            this(1, true);
        }

        SutdaCard(int num, boolean isKwang){
            this.num = num;
            this.isKwang = isKwang;
        }

        String info (){
            return num + (isKwang ? "K" : "");
        }
    }
}
