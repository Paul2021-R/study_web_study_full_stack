# Jump to JAVA
## Week Three

## 04장 연습문제

## 5장 객체지향 프로그래밍

## 5-1 객체지향 프로그래밍이란?

## 5-2 클래스

### 객체에 대하여

### 객체 변수

클래스에 선언된 변수를 **객체 변수**라고 한다. 객체 변수는 인스턴스 변수, 멤버 변수, 속성이라고도 한다.

> 자바에는 포인터로 접근할 수 있는 방법이 없다. 따라서 `this`로 접근하더라도 `->`로 접근하는 것이 아닌 `.(dot)`연산자로 접근해야한다.

### 메소드

## 5-3 메소드

자바의 함수는 따로 존재하지 않고 클래스 내에 존재한다.

### 메소드를 사용하는 이유

### 매개변수와 인수

### 메소드의 입력값과 리턴값

#### 메소드의 구조

## 5-4 Call by value

## 5-5 상속

클래스 상속을 위해서는 `extends` 키워드를 사용한다.

```java
class Animal {
	String	name;

	void setName(String name) {
		this.name = name;
	}
}

class Dog extends Animal {
	...
}
```

### 부모 클래스의 기능을 확장

### IS-A 관계

업캐스팅시 자식에만 존재하는 메소드를 사용할 수 없다.

### 메소드 오버라이딩

### 메소드 오버로딩

### 다중상속

자바는 다중 상속을 지원하지 않는다.

## 05-06 생성자

### 생성자

### 생성자 오버로딩

## 05-07 인터페이스

### 인터페이스는 왜 필요한가?

### 인터페이스 작성하기

인터페이스의 메소드는 메소드의 이름과 입출력에 대한 정의만 있고, 그 내용은 없다. 인터페이스는 규칙이기 때문이다. 또한 인터페이스의 메소드는 항상 public으로 작성하여야한다.

### default 메서드

자바8버전 이후 디폴트 메서드를 사용할 수 있다. 인터페이스의 메서드는 구현체를 가질 수 없지만, default 메서드를 사용하면 실제 구현된 형태의 메서드를 가질 수 있다.

### static 메서드

자바8버전 이후부터 인터페이스에 스태틱 메서드를 사용할 수 있다. 인터페이스에 스태틱 메서드를 구현하면 `인터페이스명.스테틱메서드명`과 같이 사용하여 일반 클래스의 스태틱 메서드를 사용하는 것과 동일하게 사용할 수 있다.

```java
interface Predator {
	String	getFood();

	default void	printFood() {
		System.out.printf("my food is %s\n", getFood());
	}
}

class Animal {
	String	name;

	void	setName(String name) {
		this.name = name;
	}
}

class Tiger extends Animal implements Predator {
	public String	getFood() {
		return "apple";
	}
}

class Lion extends Animal implements Predator {
	public String	getFood() {
		return "banana";
	}
}

class ZooKeeper {
	void feed(Predator	predator) {
		System.out.println("feed " + predator.getFood());
	}
}
```

## 05-08 다형성

> `instanceof`
>
> 어떤 객체가 특정 클래스의 객체인지 조사할 때 사용되는 자바의 내장 명령어이다.
>

객체가 여러개의 자료형 타입을 가질 수 있는 것을 객체지향 세계에서는 다형성이라고 한다.


## 05-09 추상클래스

추상클래스는 인터페이스의 역할도 하면서 클래스의 기능도 가지고 있는 자바의 돌연변이 같은 클래스이다. 혹자는 추상클래스는 인터페이스로 대체하는 것이 좋은 디자인이라고도 얘기한다.

추상클래스에서 abstract로 선언된 메소드는 인터페이스의 메소드와 마찬가지로 반드시 구현해야 하는 메소드이다.

> **인터페이스와 추상 클래스의 차이**
>
> 자바8 버전부터 인터페이스에 default 메서드가 추가되어 추상 클래스와의 차이점이 살짝 모호해졌다. 하지만 추상 클래스는 인터페이스와는 달리 일반 클래스처럼 객체변수, 생성자, private 메서드 등을 가질 수 있다.


## 06장 입출력

## 06-01 콘솔 입출력

### 콘솔 입력

```java
import java.io.IOException;
import java.io.InputStream;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStream in = System.in;

		int a;
		a = in.read();

		System.out.println(a);
	}
}
```

#### InputStreamReader

바이트 대신 문자로 입력 스트림을 읽으려면 `InputStreamReader`를 사용하면 된다.

#### BufferedReader

사용자가 엔터키를 입력할 때까지 사용자의 입력을 받기 위해서는 `BufferedReader`를 이용하면 가능하다.

BufferedReader를 사용하기위해 import문을 추가하자.

```java
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
```

- InputStream - byte
- InputStreamReader - character
- BufferedReader - String

### Scanner

Scanner를 사용하기 위해서는 다음의 클래스를 우선 import 해야 한다.

```java
import java.util.Scanner;
```

Scanner 클래스는 생성자의 입력으로 `System.in`, 즉 콘솔입력인 `InputStream`을 필요로 한다.
Scanner 클래스에는 단어 뿐만 아니라 숫자, 문자열 등 다양하게 읽어들일 수 있는 여러 메소드들이 준비되어 있다. 그 중 몇 가지만 알아보자.

- next
- nextLine
- nextInt

```java
import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next());
    }
}
```

### 콘솔 출력

System.out과 System.err

## 06-02 파일 입출력

### 파일 쓰기

```java
import java.io.FileOutputStream;
import java.io.IOException;

public class Sample {
    public static void main(String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream("/Users/salt/out.txt");
        output.close();
    }
}
```
위는 파일을 열고 닫는 예제이다. 이번에는 생성하는 파일에 내용을 적어보자.

```java
import java.io.FileOutputStream;
import java.io.IOException;

public class Sample {
    public static void main(String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream("/Users/salt/out.txt");
        for(int i=1; i<11; i++) {
            String data = i+" 번째 줄입니다.\r\n";
            output.write(data.getBytes()); // byte 배열 사용 위해 getByte 메서드 이용
        }
        output.close();
    }
}
```

### FileWriter

Sting을 byte 배열로 변환하지 않고 파일에 입력을 하기 위해서는 FileWriter를 이용하면 된다.

```java
import java.io.FileWriter;
import java.io.IOException;

public class Sample {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("/Users/salt/out.txt");
        for(int i=1; i<11; i++) {
            String data = i+" 번째 줄입니다.\r\n";
            fw.write(data);
        }
        fw.close();
    }
}
```

### PrintWriter

개행의 추가 없이 파일에 입력을 하기 위해서는 PrintWriter를 사용하면 된다.

```java
import java.io.IOException;
import java.io.PrintWriter;

public class Sample {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("/Users/salt/out.txt");
        for(int i=1; i<11; i++) {
            String data = i+" 번째 줄입니다.";
            pw.println(data);
        }
        pw.close();
    }
}
```

### append 모드로 파일 열기

```java
import java.io.FileWriter;
import java.io.IOException;

public class Sample {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("/Users/salt/out.txt");
        for(int i=1; i<11; i++) {
            String data = i+" 번째 줄입니다.\r\n";
            fw.write(data);
        }
        fw.close();

        FileWriter fw2 = new FileWriter("/Users/salt/out.txt", true);  // 파일을 추가 모드로 연다.
        for(int i=11; i<21; i++) {
            String data = i+" 번째 줄입니다.\r\n";
            fw2.write(data);
        }
        fw2.close();
    }
}
```

### 파일 읽기

파일을 읽기 위해서는 FileInputStream 클래스를 이용한다. 다만 byte 배열을 읽어야 하기 때문에 정확한 길이를 모를 경우에는 좀 불편한 방법이다.

```java
import java.io.FileInputStream;
import java.io.IOException;

public class Sample {
    public static void main(String[] args) throws IOException {
        byte[] b = new byte[1024];
        FileInputStream input = new FileInputStream("/Users/salt/out.txt");
        input.read(b);
        System.out.println(new String(b));  // byte 배열을 문자열로 변경하여 출력
        input.close();
    }
}
```

라인단위로 읽기 위해서는 다음과 같이 하면 된다.

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/salt/out.txt"));
        while(true) {
            String line = br.readLine();
            if (line==null) break;  // 더 이상 읽을 라인이 없을 경우 while 문을 빠져나간다.
            System.out.println(line);
        }
        br.close();
    }
}
```

## 07장 자바 날개 달기

## 07-01 패키지

`package`키워드는 이 파일이 어떤 패키지의 파일인지 알려주는 역할을 한다.

### 서브패키지

### 패키지 사용하기

다른 클래스에서 패키지의 클래스를 사용하려면 다음과 같이 import 해주면 된다.

```java
import packageName.className; // packageName 패키지에서 className 클래스 import하기
import packageName.*;		  // packageName 패키지의 모든 class import하기
```

## 07-02 접근제어자

### 접근 제어자

변수나 메소드의 사용 권한은 다음과 같은 접근 제어자를 사용하여 설정할 수 있다.

1. private
2. default
3. protected
4. public

#### private

#### default

접근 제어자를 별도로 설정하지 않는다면 접근 제어자가 없는 변수, 메소드는 default 접근 제어자가 되어 해당 패키지 내에서만 접근이 가능하다.

#### protected

접근제어자가 protected로 설정되었다면 protected가 붙은 변수, 메소드는 동일 패키지의 클래스 또는 해당 클래스를 상속받은 다른 클래스에서만 접근이 가능하다.

#### public

접근 제어자가 public으로 설정되었다면 public 접근제엊가 붙은 변수, 메소드는 어떤 클래스에서라도 접근이 가능하다.

### 클래스, 메소드의 접근 제어자

접근제어자를 이용하면 프로그래머의 코딩 실수를 방지할 수 있고, 기타 위험요소를 제거할 수 있는 증의 장점이 있다.

## 07-03 정적(static)변수와 메소드

### static 변수

### static 메소드

static 메소드에서는 static 키워드가 붙은 변수와 메소드에만 접근할 수 있다.

### 싱글톤 패턴

싱글톤은 단 하나의 객체만을 생성하게 강제하는 **패턴**이다. 즉 클래스를 통해 생성할 수 있는 객체는, 단 한 개만 되도록 만드는 것이 싱클톤이다.

```java
class Singleton {
    private static Singleton one;
    private Singleton() {
    }

    public static Singleton getInstance() {
        if(one==null) {
            one = new Singleton();
        }
        return one;
    }
}

public class Sample {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);  // true 출력
    }
}
```

Singleton 클래스에 one 이라는 static 변수를 두고 getInstance 메소드에서 one 값이 null 인 경우에만 객체를 생성하도록 하여 one 객체가 딱 한번만 만들어지도록 한다.

> ※ 위에서 예제로 든 싱글톤은 Thread Safe 하지는 않다. 쓰레드 환경에서도 안전한 싱글톤을 만드는 방법은 이곳에 어울리지 않으므로 생략한다.
>

## 07-04 예외처리

### 예외는 언제 발생하는가?

1. 없는 파일을 열려고 시도할 경우
2. 0으로 다른 숫자로 나누는 경우
3. 인덱스를 벗어날 경우
...

### 예외 처리하기

다음은 예외처리를 위한 `try, catch`문의 기본 구조와 예시코드이다.

```java
try {
    ...
} catch(예외1) {
    ...
} catch(예외2) {
    ...
...

int c;
try {
    c = 4 / 0;
} catch(ArithmeticException e) {
    c = -1;  // 예외가 발생하여 이 문장이 수행된다.
}
}
```

### finally

하지만 어떤 예외가 발생하더라도 반드시 실행되어야 하는 부분이 있다면 어떻게 해야할까?


```java
public class Sample {
    public void shouldBeRun() {
        System.out.println("ok thanks.");
    }

    public static void main(String[] args) {
        Sample sample = new Sample();
        int c;
        try {
            c = 4 / 0;
        } catch (ArithmeticException e) {
            c = -1;
        } finally {
            sample.shouldBeRun();  // 예외에 상관없이 무조건 수행된다.
        }
    }
}
```

### RuntimeException과 Exception

이번에는 직접 예외를 만들어보자.

#### RuntimeException

```java
class FoolException extends RuntimeException {
}

public class Sample {
    public void sayNick(String nick) {
        if("fool".equals(nick)) {
            throw new FoolException(); // return 문 대신 예외를 던짐
        }
        System.out.println("당신의 별명은 "+nick+" 입니다.");
    }

    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.sayNick("fool");
        sample.sayNick("genius");
    }
}
```

위 프로그램 실행시 `sample.sayNick("fool");`문장에서 예외가 발생한다.

```
Exception in thread "main" FoolException
    at Sample.sayNick(Sample.java:7)
    at Sample.main(Sample.java:14)
```

FoolException이 상속받은 클래스는 RuntimeException이다. Exception은 크게 두가지로 구분된다.

1. RuntimeException
2. Exception

RuntimeException은 실행시 발생하는 예외이고, Exception은 컴파일시 발생하는 예외이다. 즉, Exception은 프로그램 작성시 이미 예측가능한 예외를 작성할 때 사용하고 RuntimeException은 발생 할수도 발생 안 할수도 있는 경우에 작성한다.

#### Exception

RuntimeException을 상속하던 것을 Exception을 상속하도록 변경하면, 예외처리를 컴파일러가 강제하기 때문에 컴파일 오류가 발생한다. 따라서 다음과 같이 코드를 변경해주어야한다.

```java
class FoolException extends Exception {
}

public class Sample {
    public void sayNick(String nick) {
        try {
            if("fool".equals(nick)) {
                throw new FoolException();
            }
            System.out.println("당신의 별명은 "+nick+" 입니다.");
        }catch(FoolException e) {
            System.err.println("FoolException이 발생했습니다.");
        }
    }

    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.sayNick("fool");
        sample.sayNick("genius");
    }
}
```

### 예외 던지기(throws)

위의 코드는 sayNick 메서드에서 예외를 발생시키고 처리했지만, 이렇게 하지 않고 호출한 곳에서 FoolException을 처리하도록 예외를 뒤로 던질 수 있는 방법이 있다.

sayNick 메소드 뒷부분에 throws라는 구문을 사용하여 예외를 뒤로 미룰 수 있다.

```java
class FoolException extends Exception {
}

public class Sample {
    public void sayNick(String nick) throws FoolException {
        if("fool".equals(nick)) {
            throw new FoolException();
        }
        System.out.println("당신의 별명은 "+nick+" 입니다.");
    }

    public static void main(String[] args) {
        Sample sample = new Sample();
        try {
            sample.sayNick("fool");
            sample.sayNick("genius");
        } catch (FoolException e) {
            System.err.println("FoolException이 발생했습니다.");
        }
    }
}
```

FoolException 처리를 해당 메소드에서 하는 게 좋을까, 아니면 main메소드에서 하는 게 좋을까?
이는 프로그램 수행여부를 결정하기도 하고, 트랜잭션 처리와도 관련이 있다.

### 트랜잭션

트랜잭션은 하나의 작업 단위를 뜻한다.

이런 트랜잭션관리를 잘 해야한다.

## 07-05 쓰레드

쓰레드는 Tread를 상속받음으로서 스레드를 생성할 수 있다.

### Join

스레드 대기를 위해서는 join()메서드를 활용해서 기다릴 수 있다.

### Runnable

보통은 Tread 상속 대신 Runnable 인터페이스를 구현하도록 하는 방법을 주로 사용한다. 이는 다중상속이 지원되지 않기 때문인데, Runnable interface를 구현하게 되면 다른 클래스를 상속받을 수 있게된다.

## 07-06 함수형 프로그래밍

### 람다

람다는 익명함수를 의미한다. 예제를 통해 람다에 대해 자세히 알아보자.

#### 일반적인 코드

```java
interface Calculator {
    int sum(int a, int b);
}

class MyCalculator implements  Calculator {
    public int sum(int a, int b) {
        return a+b;
    }
}

public class Sample {
    public static void main(String[] args) {
        MyCalculator mc = new MyCalculator();
        int result = mc.sum(3, 4);
        System.out.println(result);  // 7 출력
    }
}
```

#### 람다를 적용한 코드

```java
interface Calculator {
    int sum(int a, int b);
}

public class Sample {
    public static void main(String[] args) {
        Calculator mc = (int a, int b) -> a +b; // 람다함수를 적용한 부분
        int result = mc.sum(3, 4);
        System.out.println(result);
    }
}
```

괄호 사이의 int a, int b는 sum함수의 입력항목에 해당하고 -> 뒤의 a+b가 리턴값에 해당한다. 이렇게 람다함수를 사용하면 클래스 없이도 객체의 생성이 가능하다.

#### 인터페이스 사용시 주의사항

여기서 주의점은 calculator 인터페이스의 메서드가 1개 이상이면 람다함수를 사용할 수 없다는 점이다.

그래서 람다 함수로 사용할 인터페이스는 다음처럼 `@FunctionalInterface` 어노테이션을 사용하는 것이 좋다. `@FunctionalInterface` 어노테이션을 사용하면 다음처럼 2개 이상의 메서드를 가진 인터페이스를 작성하는 것이 불가능해 진다.

```java
@FunctionalInterface
interface Calculator {
    int sum(int a, int b);
    int mul(int a, int b);  // @FunctionalInterface 는 두 번째 메서드를 허용하지 않는다.
}
```

#### 람다 축약

인터페이스에 이미 입출력에 대한 타입이 정의되어 있으므로 입력값의 타입은 생략이 가능하다.

#### 람다 함수 인터페이스

인터페이스를 생성하는 대신 함수형 프로그래밍을 위해 제공되는 인터페이스들을 사용하여 위 코드를 더 축약해보자. 자바가 제공하는 BiFunction 인터페이스를 사용하면 Calculator 인터페이스를 대신하여 다음과 같이 작성 가능하다.

```java
import java.util.function.BiFunction;

public class Sample {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> mc = (a, b) -> a + b;
        int result = mc.apply(3, 4);  // sum이 아닌 apply 메서드를 사용해야 한다.
        System.out.println(result);  // 7 출력
    }
}
```

BiFunction의 `<Integer, Integer, Integer> 제네릭스는 순서대로 입력항목 2개, 출력항목 1개를 의미한다. 그리고 인터페이스의 apply 메서드를 호출하면 람다함수가 실행된다.

입출력 항목이 모두 같으면 다음과 같이 코드를 수정할 수 있다.


```java
import java.util.function.BinaryOperator;

public class Sample {
    public static void main(String[] args) {
        BinaryOperator<Integer> mc = (a, b) -> a + b;
        int result = mc.apply(3, 4);
        System.out.println(result);  // 7 출력
    }
}
```

### 스트림

스트림은 글자 그대로 해석하면 "흐름"이라는 뜻이다.

```java
import java.util.*;

public class Sample {
    public static void main(String[] args) {
        int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};

        // 짝수만 포함하는 ArrayList 생성
        ArrayList<Integer> dataList = new ArrayList<>();
        for(int i=0; i<data.length; i++) {
            if(data[i] % 2 == 0) {
                dataList.add(data[i]);
            }
        }

        // Set을 사용하여 중복을 제거
        HashSet<Integer> dataSet = new HashSet<>(dataList);

        // Set을 다시 List로 변경
        ArrayList<Integer> distinctList = new ArrayList<>(dataSet);

        // 역순으로 정렬
        distinctList.sort(Comparator.reverseOrder());

        // Integer 리스트를 정수 배열로 변환
        int[] result = new int[distinctList.size()];
        for(int i=0; i< distinctList.size(); i++) {
            result[i] = distinctList.get(i);
        }
    }
}
```

위의 코드를 스트림으로 변환하면 다음과 같이 바꿀 수 있다.


```java
import java.util.Arrays;
import java.util.Comparator;

public class Sample {
    public static void main(String[] args) {
        int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};
        int[] result = Arrays.stream(data)  // IntStream을 생성한다.
                .boxed()  // IntStream을 Stream<Integer>로 변경한다.
                .filter((a) -> a % 2 == 0)  //  짝수만 걸러낸다.
                .distinct()  // 중복을 제거한다.
                .sorted(Comparator.reverseOrder())  // 역순으로 정렬한다.
                .mapToInt(Integer::intValue)  // Stream<Integer>를 IntStream으로 변경한다.
                .toArray()  // int[] 배열로 반환한다.
                ;
    }
}
```

위 코드는 다음과 같은 순서로 동작한다.

1. `Arrays.stream(data)`으로 정수 배열을 IntStream으로 생성한다.
2. `.boxed()` 로 IntStream을 Integer의 Stream으로 변경한다. 이렇게 하는 이유는 뒤에서 사용할 `Comparator.reverseOrder` 와 같은 메서드는 원시타입인 int 대신 Integer를 사용해야 하기 때문이다.
3. `.filter((a) -> a % 2 == 0)`로 짝수만 필터링한다. 이 때 사용한 `(a) -> a % 2 == 0` 구문은 위에서 공부한 람다 함수이다. 입력 a가 짝수인지를 조사하는 람다함수로 짝수에 해당되는 데이터만 필터링한다.
4. `.distinct()`로 스트림에서 중복을 제거한다.
5. `.sorted(Comparator.reverseOrder())`로 역순 정렬한다.
6. `.mapToInt(Integer::intValue)`로 Integer의 Stream을 IntStream으로 변경한다. 왜냐하면 최종적으로 `int[]` 타입의 배열을 리턴해야 하기 때문이다.
7. `.toArray()`를 호출하여 IntStream의 배열인 `int[]` 배열을 리턴한다.
성
스트림 방식은 일반적인 코드보다 확실히 간결하고 가독성이 좋다는 것을 확인할 수 있다.