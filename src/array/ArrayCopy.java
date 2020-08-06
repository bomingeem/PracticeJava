package array;

public class ArrayCopy {
    public static void main(String[] args) {
        //배열의 복사
        //1. for문 이용
        int[] number = {1, 2, 3, 4, 5};
        int[] newNumber = new int[10];

        for(int i=0; i<number.length; i++){
            newNumber[i] = number[i];
        }
        for(int i=0; i<newNumber.length; i++){
            System.out.print(newNumber[i]);
        }
        
        //2. System 클래스의 arraycopy()
        //arraycopy()는 배열에 저장되어 있는 값만 복사하기 때문에 참조변수 배열인 경우에는 단지 주소값만 복사할 뿐 참조변수가 가리키는 객체를 복사하지는 않는다
        int[] arr1 = {6, 7, 8, 9, 10};
        int[] arr2 = new int[10];
        //arr1[0]에서 arr2[0]으로 arr1.length개의 데이터를 복사
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
    }
}
