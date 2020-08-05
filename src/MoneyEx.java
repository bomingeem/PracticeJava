//[5-6]
public class MoneyEx {
    public static void main(String[] args) {
        int[] coinUnit = {500, 100, 50, 10};
        int[] rest = {0, 0, 0, 0};

        int money = 2680;
        System.out.println("money = " + money);

        for(int i=0; i<coinUnit.length; i++){
            //rest[i] = money/coinUnit[i];
            System.out.println(coinUnit[i]+"원 : " + money/coinUnit[i]);
            //money = money-(coinUnit[i]*rest[i]);
            money = money%coinUnit[i];
        }
    }
}
