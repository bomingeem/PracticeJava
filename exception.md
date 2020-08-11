#PracticeJava
컴파일 에러 - 컴파일 할 때 발생하는 에러
런타임 에러 - 프로그램 실행 도중 발생하는 에러

예외처리 : 프로그램 실행 시 발생할 수 있는 예외의 발생에 대비한 코드를 작성하는 것
try {
    //예외가 발생할 가능성이 있는 문장들을 넣는다
} catch (Exception e) {
    //Exception이 발생했을 경우, 이를 처리하기 위한 문장을 적는다
} finally {
    //예외의 발생여부에 관계없이 항상 수행되어야 하는 문장
}

▶ try 블럭 내에서 예외가 발생한 경우
1. 발생한 예외와 일치하는 catch 블럭이 있는지 확인
2. 일치하는 catch 블럭을 찾게 되면, 그 catch 블럭 내의 문장들을 수행하고 전체 try-catch문을 빠져나가서 그 다음 문장을 계속해서 수행 
▶ try 블럭 내에서 예외가 발생하지 않은 경우
1. catch 블럭을 거치지 않고 전체 try-catch문을 빠져나가서 수행을 계속함

throw 키워드를 사용하여 고의로 예외를 발생시킬 수 있음
1. 연산자 new를 이용하여 발생시키려는 예외 클래스의 객체를 만든다
   Exception e = new Exception("고의로 발생시킨 예외");
2. 키워드 throw를 이용하여 예외를 발생시킴
   throw e;
   
finally 블럭 : try-catch문과 함께 예외의 발생여부에 상관없이 실행되어야 할 코드를 포함
예외가 발생한 경우 'try → catch → finally'
예외가 발생하지 않은 경우 'try → finally'

메서드에 예외 선언하기
메서드의 선언부에 throws를 사용해서 메서드 내에서 발생할 수 있는 예외를 적어주기만 하면 됨
(예외를 발생시키는 throw와 메서드에 선언할 때 쓰이는 throws를 잘 구분하자..)
void method() throws Exception1, Exception2, .. ExceptionN {
}

오버라이딩 할 때, 조상 클래스의 메서드보다 많은 수의 예외를 선언할 수 없다
