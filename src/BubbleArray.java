public class BubbleArray {
    //버블정렬 알고리즘
    public static void main(String[] args) {
        int[] number = new int[10];

        for(int i=0; i<number.length; i++){
            System.out.print(number[i] = (int) (Math.random() * 10));
        }
        System.out.println();
        
        for(int i=0; i<number.length; i++){
            boolean changed = false; //자리바꿈이 발생했는지 체크

            for(int j=0; j<number.length-i-1; j++){
                if(number[j] > number[j+1]){
                    int temp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = temp;
                    changed = true;
                }
            }
            if(!changed) break; //자리바꿈이 없을 경우 반복문을 벗어남

            for(int k=0; k<number.length; k++){
                System.out.print(number[k]);
            }
            System.out.println();
        }
    }
}
