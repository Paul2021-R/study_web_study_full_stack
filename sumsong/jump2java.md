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
<br>

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
<br>

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
<br>

# 04 제어문
## for each문
구조  
```java
for (type var: iterate) {
    body-of-loop
}
```
- iterate는 루프를 돌릴 객체  
- 이 객체에서 한개씩 순차적으로 var에 대입되어 for문이 수행됨.  
- iterate로 사용할 수 있는 자료형은 루프를 돌릴수 있는 자료형(배열 및 ArrayList 등)만 가능  

※ 따로 반복 횟수를 명시적으로 주는 것이 불가능하고 1스탭씩 순차적으로 반복될때만 사용 가능  
※ 파이썬의 `for ~ in` 문과 비슷  
<br>

예제  
```java
String[] numbers = {"one", "two", "three"};
for(String number: numbers) {
    System.out.println(number);
	// one\n, two\n, three\n가 순서대로 출력
}
```
<br>

# 05 객체지향 프로그래밍
## 매개변수와 인수
**※ 매번 정리하지만 묘하게 헷갈리는..**
매개변수는 '받고' 인수는 '준다' !  
ex) 매개변수로 `int a`와 `String str`을 받는다. 인수로 `1`과 `"hi"`를 준다.  

## this 활용하기
예제) 객체 `sample` 넘기기  
```java
public class Sample {

	int a;  // 객체변수 a

	void varTest(Sample sample) {
		sample.a++;
	}

	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.a = 1;
		sample.varTest(sample);
		System.out.println(sample.a);
	}
}
```
<br>

`this`를 활용하면 객체인 `sample`을 굳이 넘겨줄 필요가 없다.  
`varTest` 메소드 내에서 객체에 접근할 수 있기 때문  
  
예제) `this`를 사용해 변경한 코드
```java
public class Sample {

	int a;  // 객체변수 a

	void varTest() {
		this.a++;
	}

	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.a = 1;
		sample.varTest();
		System.out.println(sample.a);  // 2 출력
	}
}
```
<br>

## 상속
자식 클래스가 부모 클래스의 기능을 그대로 물려받을 수 있는 상속(Inheritance) 기능  
(예제)  
```java
class Animal {
	String name;

	void setName(String name) {
		this.name = name;
	}
}

class Dog extends Animal {
}

public class Sample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("poppy");
		System.out.println(dog.name);  // poppy 출력
	}
}
```
클래스 상속을 위해 사용하는 키워드 `extends` . 
클래스를 상속했으므로 부모 클래스의 `setName` 메소드를 그대로 사용 가능  
<br>

### 부모 클래스의 기능을 확장
(예제) `Animal`을 상속 받은 `Dog` 클래스에 `sleep` 메소드 추가 
```java
class Animal {
	String name;

	void setName(String name) {
		this.name = name;
	}
}

class Dog extends Animal {
	void sleep() {
		System.out.println(this.name+" zzz");
	}
}

public class Sample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("poppy");
		System.out.println(dog.name);  // poppy 출력
		dog.sleep();  // poppy zzz 출력
	}
}
```
  
### IS-A 관계
`Dog` 클래스는 `Animal` 클래스를 상속.  
즉, `Dog`는 `Animal`의 하위 개념.  
`Dog`는 `Animal`에 포함되기 때문에 "개는 동물이다"라고 표현  
즉 "`Dog` `is a` `Animal`"과 같이 말할 수 있는 관계를 IS-A 관계라고 함  
  
-> 자식 클래스의 객체는 부모 클래스의 자료형인 것처럼 사용할 수 있음!  
반대로, 부모 클래스로 만든 객체를 자식 클래스의 자료형으로는 사용할 수 없음  

```java
Animal dog = new Dog();  // Dog is a Animal
// 개로 만든 객체는 동물 자료형이다.
```
※ `Dog`객체를 `Animal` 자료형으로 사용할 경우에는 `Dog` 클래스에만 존재하는 `sleep` 메소드를 사용할 수 없다  
  

### Object 클래스
자바에서 만드는 모든 클래스는 자동으로 Object 클래스를 상속받음.  
따라서 자바에서 만드는 모든 객체는 Object 자료형으로 사용할 수 있음  
```java
Object animal = new Animal();  // Animal is a Object
Object dog = new Dog();  // Dog is a Object
```

### 메소드 오버라이딩 (Method overriding)
(예제) `Dog` 클래스를 구체화시키는 `HouseDog` 클래스
```java
class Animal {
	String name;

	void setName(String name) {
		this.name = name;
	}
}

class Dog extends Animal {
	void sleep() {
		System.out.println(this.name+" zzz");
	}
}

class HouseDog extends Dog {
}

public class Sample {
	public static void main(String[] args) {
		HouseDog houseDog = new HouseDog();
		houseDog.setName("happy");
		houseDog.sleep();  // happy zzz 출력
	}
}
```
<br>

(예제) `HouseDog`은 "happy zzz"가 아닌 "happy zzz in house"를 출력해야 한다고 가정  
```java
class HouseDog extends Dog {
	void sleep() {
		System.out.println(this.name + " zzz in house");
	}
}

public class Sample {
	public static void main(String[] args) {
		HouseDog houseDog = new HouseDog();
		houseDog.setName("happy");
		houseDog.sleep();  // happy zzz in house 출력
	}
}
```
<br>

`HouseDog` 클래스에 `Dog` 클래스와 동일한 형태(입출력이 동일)의 `sleep` 메소드를 구현하면  
`HouseDog` 클래스의 `sleep` 메소드가 `Dog` 클래스의 `sleep` 메소드보다 더 높은 우선순위를 갖게 되어  
`HouseDog` 클래스의 `sleep` 메소드가 호출되게 된다.  
  
-> 부모클래스의 메소드를 자식클래스가 동일한 형태로 또다시 구현하는 행위를 **메소드 오버라이딩(Method Overriding)** 이라고 한다. (※ 메소드 덮어쓰기)  

### 메소드 오버로딩 (method overloading)
(예제) `HouseDog` 클래스에 메소드 추가
```java
void sleep(int hour) {
	System.out.println(this.name+" zzz in house for " + hour + " hours");
} 
```
기존의 sleep이라는 메소드와 동일한 이름의 sleep 메소드 추가 생성  
단, 메소드의 매개변수가 다를 경우만 가능  
  
-> 매개변수가 다른 동일한 이름의 메소드를 만들 수 있는데 이를 **메소드 오버로딩(method overloading)** 라고 함  

### 다중 상속
다중 상속은 클래스가 동시에 하나 이상의 클래스를 상속받는 것을 뜻한다.  
C++, 파이썬 등 많은 언어들이 다중 상속을 지원하지만  
-> 자바는 **다중 상속을 지원하지 않는다.**  
  
※ 다중상속을 지원하는 다른 언어들은 동일한 이름의 메소드를 상속받는 경우 우선순위 등을 적용하여 해결한다.

## 인터페이스
```java
interface Predator {
}
```
- 인터페이스는 `class`가 아닌 `interface` 라는 키워드를 이용하여 작성  
- 인터페이스는 클래스와 마찬가지로 Predator.java와 같은 단독 파일로 저장하는 것이 일반적인 방법  
  
(예제) 인터페이스가 필요한 이유  

```java
class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Animal {
}

class Lion extends Animal {
}

class ZooKeeper {
    void feed(Tiger tiger) {  // 호랑이가 오면 사과를 던져 준다.
        System.out.println("feed apple");
    }

    void feed(Lion lion) {  // 사자가 오면 바나나를 던져준다.
        System.out.println("feed banana");
    }
}

public class Sample {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        zooKeeper.feed(tiger);  // feed apple 출력
        zooKeeper.feed(lion);  // feed banana 출력
    }
}
```
동물 클래스가 추가될때마다 feed 메소드를 추가해야 하는 번거로움이 있음  
-> **이를 편리하게 하기 위해 인터페이스가 필요!**  
  
(예제) 인터페이스 `Predator`를 이용하여 수정
```java
...

class Tiger extends Animal implements Predator {
}

class Lion extends Animal implements Predator {    
}

...

class ZooKeeper {
    void feed(Predator predator) {
        System.out.println("feed apple");
    }
}

...
```
- 인터페이스 구현은 `implements` 라는 키워드 사용  
- `tiger`, `lion`은 각각 `Tiger`, `Lion`의 객체이면서 `Predator` 인터페이스의 객체이기도 함  
  -> IS-A 관계가 인터페이스에도 마찬가지로 적용  
  -> 이와 같이 객체가 한 개 이상의 자료형 타입을 갖게되는 특성을 다형성(폴리모티즘)이라고 함!  
  

### 인터페이스의 메소드
```java
interface Predator {
    String getFood();
}
```
인터페이스는 규칙이기 때문에  
인터페이스의 메소드는 이름과 입출력에 대한 정의만 있고 그 내용은 없음  
-> 예제에서 설정한 `getFood`라는 메소드는 인터페이스를 `implements`한 클래스들이 구현해야만 함  
<br>

```java
class Tiger extends Animal implements Predator {
    public String getFood() {
        return "apple";
    }
}

class Lion extends Animal implements Predator {
    public String getFood() {
        return "banana";
    }
}

class ZooKeeper {
    void feed(Predator predator) {
        System.out.println("feed "+predator.getFood());
    }
}
```
※ 인터페이스의 메소드는 항상 `public`으로 구현해야 한다.  
※ `implements` 키워드는 `extends` 다음에 와야 한다.  
  
**상속과 인터페이스**  
- 상속 : 자식 클래스가 부모 클래스의 메소드를 오버라이딩하지 않고 사용할 수 있기 때문에 해당 메소드를 반드시 구현해야 한다는 "강제성"을 갖지 못함  
- 인터페이스 : 인터페이스의 메소드를 반드시 구현해야 하는 "강제성"을 가짐  
  

### 디폴트 메서드
```java
interface Predator {
    String getFood();

    default void printFood() {
        System.out.printf("my food is %s\n", getFood());
    }
}
```
- 디폴트 메서드는 메소드명 가장 앞에 "`default`" 라고 표기해야 함  
- 이렇게 `Predator` 인터페이스에 `printFood` 디폴트 메서드를 구현하면 `Predator` 인터페이스를 구현한 `Tiger`, `Lion` 등의 실제 클래스는 `printFood` 메서드를 구현하지 않아도 사용할 수 있음  
- 디폴트 메서드는 오버라이딩 가능 (`printFood` 메서드를 실제 클래스에서 다르게 구현하여 사용할수 있다.)  
  

### 스태틱 메서드
(예제) interface 안에 스태틱 메서드 구현  
```java
interface Predator {
    String getFood();

    default void printFood() {
        System.out.printf("my food is %s\n", getFood());
    }

    int LEG_COUNT = 4;  // 인터페이스 상수

    static int speed() {
        return LEG_COUNT * 30;
    }
}
```
사용할 때는 `Predator.speed();` . 
  
**인터페이스 상수**  
위 코드에서 사용한 `int LEG_COUNT = 4;` 문장은 인터페이스에 정의한 상수  
인터페이스에 정의한 상수는 `int LEG_COUNT=4;`처럼 `public static final`을 생략해도 자동으로 `public static final`이 적용되고 다른 형태의 상수 정의는 불가능  
<br>

## 다형성
