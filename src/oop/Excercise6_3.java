package oop;

public class Excercise6_3 {
    public static void main(String[] args) {
        Student s = new Student("김보민", 1, 1, 100, 60, 76);
        /*
        s.name = "김보민";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;
        */
        System.out.println("이름 : " + s.name);
        System.out.println("총점 : " + s.getTotal());
        System.out.println("평균 : " + s.getAverage());
    }

    static class Student {
        String name;
        int ban;
        int no;
        int kor;
        int eng;
        int math;
        Student (String name, int ban, int no, int kor, int eng, int math) {
            this.name = name;
            this.ban = ban;
            this.no = no;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
            this.getTotal();
            this.getAverage();

        }
        public int getTotal(){
            return kor+eng+math;
        }

        public float getAverage(){
            return (float)(kor+eng+math)/3;
        }

        public String info(){
            return name + " , " + ban + " , " + no + " , " + kor + " , " + eng + " , " + math + " , " + getTotal() + " , " + getAverage();
        }
    }
}
