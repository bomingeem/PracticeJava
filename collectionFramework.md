#PracticeJava

1. 컬렉션 프레임워크 - 다수의 데이터를 쉽게 처리할 수 있는 표준화된 방법을 제공하는 클래스
2. 유용한 클래스 - 알아두면 좋은 자주 쓰이는 클래스
3. 형식화 클래스 - 데이터를 표준화된 형식으로 출력하는데 도움을 주는 클래스

1. 컬렉션 프레임워크
 - 데이터 군을 저장하는(Vector와 같은) 클래스들을 표준화한 설계
 
List : 순서가 있는 데이터의 집합, 데이터의 중복을 허용(ArrayList, LinkedList, Stack, Vector 등)
Set : 순서를 유지하지 않는 데이터의 집합, 데이터의 중복을 허용하지 않음(HashSet, TreeSet 등)
Map : key와 value의 쌍으로 이루어진 데이터의 집합, 순서는 유지되지 않으며 키는 중복을 허용하지 않고 값은 중복을 허용(HashMap, TreeMap, Properties 등)

1.3 Vector, ArrayList
 - Vector를 개선한 것 → ArrayList
 - 저장순서가 유지되고 중복을 허용
 - Vector는 멀티쓰레드에 대한 동기화가 되어있으나 ArrayList는 그렇지 않다


