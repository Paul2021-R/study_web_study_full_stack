# 1주차
---
<br>

# 01 자바란 무엇인가?
## 자바의 특징
1. 간단하다 (Simple)
2. 객체 지향적이다 (Object-oriented)
3. 인터프리터 언어이다 (Interpreted)
4. 강력하다 (robust)
5. 안전하다 (Secured)
6. 플랫폼 독립적이다 (Platform independent)
7. 멀티 쓰레딩을 지원한다 (Multithreaded)
8. 동적이다 (Dynamic)

# 02 자바 시작하기
## 자바 소스코드의 구조
`클래스명.java`  
```java
/* 클래스 블록 */
public class 클래스명 {

    /* 메소드 블록 */
    [public|private|protected] [static] (리턴자료형|void) 메소드명1(입력자료형 매개변수, ...) {
        명령문(statement);
        ...
    }

    /* 메소드 블록 */
    [public|private|protected] [static] (리턴자료형|void) 메소드명2(입력자료형 매개변수, ...) {
        명령문(statement);
        ...
    }

    ...
}
```

## 명명 규칙
### 클래스 명
- 클래스명은 명사로 한다.
- 여러개의 단어가 섞이는 경우 각 단어의 첫번째 문자는 대문자이어야 한다. (CamelCase 라고도 한다)
  
```java
class Cookie {}
class ChocoCookie {}
```

### 메소드 명
- 메소드명은 동사로 한다.
- 클래스명과 마찬가지로 여러개의 단어가 섞이는 경우 각 단어의 첫번째 문자는 대문자이어야 한다. 단, 처음 시작하는 문자는 항상 소문자로 시작한다.
  
```java
run();
runFast();
getBackground();
```

### 변수 명
- 변수 이름은 짧지만 의미가 있어야 한다. (변수명을 통해 변수의 사용 의도를 알 수 있게 지어야 한다.)
- 순서를 의미하는 임시적인 정수의 변수명은 i, j, k, m, n을 사용한다. (문자의 경우는 c, d, e 등을 사용한다.)
- 변수명에 _, $ 기호를 사용할 수 있지만 시작 문자로 사용하지 않는다.
  
```java
int i;
char c;
float myWidth;
```

# 03 자료형
## 숫자 (Number)
### 정수
long 변수에 값을 대입할 때는 대입하는 숫자 값이 int 자료형의 최대값보다 큰 경우 L접미사(또는 l)를 붙여 주어야 한다.
```java
int age = 10;
long countOfStar = 8764827384923849L;
```

### 실수
자바에서 실수형은 디폴트가 double이므로 float 변수에 값을 대입할 때에는 3.14F 와 같이 F접미사(또는 f)를 꼭 붙여 주어야 한다.
```java
float pi = 3.14F;
double morePi = 3.14159265358979323846;
```

## 문자열 (String)
### 원시(primitive) 자료형
int, long, double, float, boolean, char 등을 자바는 원시(primitive) 자료형 이라고 부르고, 이런 원시 자료형은 new 키워드로 그 값을 생성할 수 없다.  
String 은 "Happy Java"와 같이 리터럴로 표기가 가능하지만 primitive 자료형은 아니다. String은 리터럴 표현식을 사용할 수 있도록 자바에서 특별 대우 해 주는 자료형이다.  
primitive 자료형은 다음과 같이 리터럴(literal)로만 값을 세팅할 수 있다.
```java
boolean result = true;
char capitalC = 'C';
int i = 100000;
```
<br>

**원시 자료형의 Wrapper 클래스**  
- int : Integer
- long : Long
- double : Double
- float : Float
- boolean : Boolean
- char : Char  

앞으로 공부할 ArrayList, HashMap, HashSet 등은 데이터 저장시 원시 자료형 대신 그에 대응하는 Wrapper 클래스들을 사용해야 한다.  
원시 자료형 대신 Wrapper 클래스를 사용하면 값 대신 객체를 주고 받을 수 있어 코드를 객체 중심적으로 작성하는데 유리하고 멀티스레딩 환경에서 동기화를 지원하기 위해서는 Wrapper 클래스가 반드시 필요하다.  

### 문자열 포매팅(Formatting)
문자열 포매팅은 `String.format` 메소드 사용 : 포매팅된 문자열을 리턴  
포매팅된 문자열을 출력하려면 `System.out.println` 메소드를 함께 사용  
  
`System.out.printf` 메소드를 사용하면 `String.format` 메소드 없이도 동일한 형식으로 포매팅된 문자열을 출력할 수 있음  

## StringBuffer
StringBuffer는 문자열을 추가하거나 변경 할 때 주로 사용하는 자료형  
StringBuffer 자료형은 String 자료형보다 무거운 편에 속함  
`new StringBuffer()` 로 객체를 생성하는 것은 일반 String을 사용하는 것보다 메모리 사용량도 많고 속도도 느리므로  
문자열 추가나 변경등의 작업이 많을 경우에는 StringBuffer를,  
문자열 변경 작업이 거의 없는 경우에는 그냥 String을 사용하는 것이 유리  

## 배열(Array), 리스트(List)
**배열**  
자료형의 집합  
```java
int[] odds = {1, 3, 5, 7, 9};
String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
```
  
**리스트**  
리스트는 배열과 비슷한 자바의 자료형으로 배열보다 편리한 기능을 많이 가지고 있음  
List 자료형에는 ArrayList, Vector, LinkedList 등의 List 인터페이스를 구현한 자료형이 있다.  
여기서 말하는 List 자료형은 인터페이스를 말함  
```java
import java.util.ArrayList;  // ArrayList를 먼저 import 해야함
ArrayList pitches = new ArrayList();
```
  
리스트와 배열의 가장 큰 차이는 크기가 정해져 있지 않고 동적으로 변한다는 점.  
배열은 크기가 정해져 있지만 리스트는 크기가 정해져 있지 않아 원하는 만큼의 값을 담을 수 있음  
  
**제네릭스(Generics)**  
```java
ArrayList pitches = new ArrayList(); // 기존 코드
ArrayList<String> pitches = new ArrayList<>(); // 제네릭스
```
제네릭스를 이용해 명확한 자료형 타입 체크

## 맵(Map)
key - value를 한 쌍으로 갖는 자료형  
Map 역시 List와 마찬가지로 인터페이스.  
Map 인터페이스를 구현한 Map 자료형에는 HashMap, LinkedHashMap, TreeMap등이 있음  
  
**LinkedHashMap과 TreeMap**  
- LinkedHashMap : 입력된 순서대로 데이터를 저장
- TreeMap : 입력된 key의 오름차순 순서로 데이터를 저장

## 집합(Set)
Set 자료형에는 HashSet, TreeSet, LinkedHashSet 등의 Set 인터페이스를 구현한 자료형이 있음  
  
**집합 자료형의 특징**  
- 중복을 허용하지 않는다.  
- 순서가 없다(Unordered).  
  
**TreeSet과 LinkedHashSet**  
- TreeSet : 오름차순으로 값을 정렬하여 저장
- LinkedHashSet : 입력한 순서대로 값을 정렬하여 저장

## 상수집합(Enum)
- 매직넘버(1과 같은 숫자 상수값)를 사용할 때보다 코드가 명확해짐.  
- 잘못된 값을 사용함으로 인해 발생할수 있는 위험성이 사라짐.  
*※ 프로그래밍에서 상수로 선언하지 않은 숫자를 매직넘버라고 한다.*  

## 형변환과 final
**형변환**
```java
String num = "123";
int n = Integer.parseInt(num); // int 123
String num = "" + n; // String 123
String num1 = String.valueOf(n); // String 123
String num2 = Integer.toString(n); // String 123

String num = "123.456";
double d = Double.parseDouble(num); // double 123.456
int n1 = (int) d; // int 123
double d1 = n1; // double 123.0
```
  
**final**  
- 자바의 final은 자료형에 값을 단 한번만 설정할수 있게 강제하는 키워드
- 프로그램 수행 도중 그 값이 변경되면 안되는 상황에 사용  
