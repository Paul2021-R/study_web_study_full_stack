# Jump to JAVA
## Week Two

## 리스트

리스트는 배열과 비슷한 자바의 자료형으로 배열보다 편리한 기능을 많이 가지고 있다.

리스트와 배열의 가장 큰 차이는 크기가 정해져 있지 않고 동적으로 변한다는 점이다. 예를 들어 배열의 크기를 10개로 정했다면 10개 이상의 값을 담을 수는 없다. 하지만 리스트는 크기가 정해져 있지 않아 원하는 만큼의 값을 담을 수 있다.

### ArrayList

List 자료형 중 가장 간단한 형태의 자료형인 `ArrayList`에 대해서 알아보자

> **List 자료형**
>
> `List` 자료형에는 `ArrayList`, `Vector`, `LinkedList` 등의 List 인터페이스를 구현한 자료형이 있다. 여기서 말하는 `List` 자료형은 인터페이스인데, 인터페이스에 대해서는 뒤어서 자세히 알아보자

#### add

박찬호 선수가 총 3번의 투구를 138, 129, 142(km)의 속도로 던졌다면 다음과 같이 코드를 작성할 수 있다.

```java
import java.util.ArrayList;

public class Sample {
	public static void main(String[] args) {
		ArrayList pitches = new ArrayList();
		pitches.add("138");
		pitches.add("129");
		pitches.add("142");
	}
}
```

> ※ `ArrayList`를 사용하기 위해서는 `import java.util.ArrayList`와 같이 `ArrayList`를 먼저 `import`해야한다.

`ArrayList` 객체인 `pitches`에 `add`라는 메소드를 이용하여 투구 속도를 저장했다. 만약 첫 위치에 "133"이라는 투구 스피드를 삽입하고 싶다면 아래와 같이 삽입할 위치를 파라미터로 넘겨주어야 한다.

```java
pitches.add(0, "133");
```

> **제네릭스**
>
> 자바는 J2SE 5.0 버전 이후부터 `ArrayList<String> pitches = new ArrayList<>();`처럼 객체를 포함하는 자료형도 어떤 객체를 포함하는지에 대해서 명확하게 표현할 것을 권고하고 있다. 인텔리제이에서 위의 예제와 같이 제네릭스 없이 코딩하면 명확한 타입을 명시하라는 warning이 뜰 것이다.

#### get

```java
System.out.println(pitches.get(1)); // 특정 인덱스의 값 출력하기
```

#### size

```java
System.out.println(pitches.size()); // ArrayList의 갯수를 리턴
```

#### contains

```java
System.out.println(pitches.contains("142"));
// 리스트 안에 해당 항목이 있는 지 판별하여 결과를 boolean으로 리턴
```

#### remove

remove 메소드에는 2가지 방식이 있다.

1. remove(객체)
2. remove(인덱스)

```java
System.out.println(pitches.remove("129"));
// 리스트에서 객체에 해당되는 항목을 삭제하고, 삭제한 결과를 boolean형으로 리턴
System.out.println(pitches.remove(0));
// 리스트에서 해당 인덱스의 항목을 삭제하고 삭제된 항목 리턴
```

> 의문점. `ArrayList`에는 `int`형을 넣을 수 없는 걸까?
> 가능하다. 다만, `ArrayList`에는 `Object`를 상속한 클래스만 들어갈 수 있으므로 `int`의 `Wrapper`클래스인 `Integer`를 사용해야 한다.
> > **Object 클래스?**
> > 모든 자바클래스의 최고 조상 클래스이다.
> > [Object 클래스](http://www.tcpschool.com/java/java_api_object)

### 제네릭스(Generics)

#### 제네릭이란?

**제네릭(Generic)**은 클래스 내부에서 지정하는 것이 아닌 외부에서 사용자에 의해 지정되는 것을 의미한다. 한마디로 특정 타입을 미리 지정하는 것이 아닌 필요에 의해 지정할 수 있도록 하는 일반(Generic) 타입이라는 것이다.

[Generic](https://yaboong.github.io/java/2019/01/19/java-generics-1/)

### 다양한 방법으로 ArrayList 만들기

`ArrayList`의 `add`메소드를 사용하면 다음처럼 `ArrayList` 객체에 요소를 추가할 수 있다.

```java
import java.util.ArrayList;

public class Sample {
    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<>();  // 제네릭스를 사용한 표현
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        System.out.println(pitches);  // [138, 129, 142] 출력
    }
}
```

하지만 다음처럼 이미 데이터가 존재할 경우 보다 편하게 `ArrayList`를 생셩할 수 있다.

```java
import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        String[] data = {"138", "129", "142"};  // 이미 투구수 데이터 배열이 있다.
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList(data));
        System.out.println(pitches);  // [138, 129, 142] 출력
    }
}
```

### String.join

`ArrayList`의 각 요소를 콤마로 구분하여 하나의 문자열로 만들기.

```java
import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
        String result = "";
        for (int i = 0; i < pitches.size(); i++) {
            result += pitches.get(i);
            result += ",";  // 콤마를 추가한다.
        }
        result = result.substring(0, result.length() - 1);  // 마지막 콤마는 제거한다.
        System.out.println(result);  // 138,129,142 출력
    }
}
```

### 리스트 정렬하기

순서대로 정렬하기 위해서는 다음처럼 리스트의 `sort` 메소드를 사용해야 한다.

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Sample {
    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
        pitches.sort(Comparator.naturalOrder());  // 오름차순으로 정렬
        System.out.println(pitches);  // [129, 138, 142] 출력
    }
}
```

sort 메소드에는 정렬기준을 파라미터로 전달해야 하낟. 정렬 기준에는 다음처럼 오름차순, 내림차순이 있다.

- 오름차순(순방향) 정렬 - `Comparator.naturalOrder()`
- 내림차순(역방향) 정렬 - `Comparator.reverseOrder()`

> ※ 리스트의 `sort`메소드는 Java 8 버전부터 사용할 수 있다.

## 맵(Map)

자바의 맵은 대응관계를 쉽게 표현할 수 있게 해주는 자료형이다. 요즘 나오는 대부분의 언어들도 갖고 있는 자료형으로 `Associative array`, `Hash`라고도 불린다.

맵은 사전과 비슷하다. 즉 Map은 Key와 Value를 한 쌍으로 갖는 자료형이다.

key|value
:--:|:--:
people|사람
baseball|야구

Map은 리스트나 배열처럼 순차적으로 해당 요소 값을 구하지 않고 key를 통해 value를 얻는다. 맵의 가장 큰 특징이라면 key로 value를 얻어낸다는 점이다. baseball이란 단어의 뜻을 찾기 위해서 사전의 내용을 순차적으로 모두 검색하는 것이 아니라 baseball이라는 단어가 있는 곳만을 펼쳐보는 것이다.

### HashMap

자바의 맵 중 가장 간단한 HashMap에 대해서 알아보자

#### put

key와 value가 String 형태인 HashMap을 만들고 위애서 보았던 예제의 항목 값들을 입력해보자.

```java
import java.util.HashMap;

public class Sample {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
    }
}
```

key와 value는 위 예제에서 보듯이 `put`메소드를 이용하여 입력했다.

#### get

key에 해당되는 value값을 얻기 위해서는 다음과 같이 한다.

```java
System.out.println(map.get("people")); // "사람" 출력
```

위와 같이 get메소드를 이용하면 value값을 얻을 수 있다. 위 예제는 "people" Key에 대응되는 Value값으로 "사람"이라는 문자열을 출력할 것이다.

#### containsKey

containsKey 메소드는 맵에 해당 키가 있는지를 조사하여 그 결과값을 리턴한다.

```java
System.out.println(map.containsKey("people")); // true 출력
```

#### remove

remove 메소드는 맵의 항목을 삭제하는 메소드로 key값에 해당되는 아이템을 삭제한 후 그 value값을 리턴한다.

```java
System.out.println(map.remove("people")); // 사람 출력
```

#### size

맵의 개수 리턴

#### keySet

맵의 모든 key를 모아서 Set 자료형으로 리턴한다.

```java
import java.util.HashMap;

public class Sample {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
        System.out.println(map.keySet());  // [baseball, people] 출력
    }
}
```

Set 자료형은 다음과 같이 List 자료형으로 바꾸어 사용할수도 있다.

```java
List<String> keyList = new ArrayList<>(map.keySet());
```

## 집합(Set)

집합 자료형은 집합과 관련된 것을 쉽게 처리하기 위해 만든 자료형이다.

### 집합 자료형 만들기

집합 자료형은 다음과 같이 HashSet을 사용하여 만들 수 있다.

```java
import java.util.Arrays;
import java.util.HashSet;

public class Sample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
        System.out.println(set);  //  [e, H, l, o] 출력
    }
}
```

### 집합 자료형의 특징

집합 자료형에는 다음과 같은 2가지 큰 특징이 있다.

- 중복을 허용하지 않는다.
- 순서가 없다.

리스트나 배열은 순서가 있기 때문에 인덱싱을 통해 자료형의 값을 얻을 수 있지만 집합 자료형은 순서가 없기 때문에 인덱싱으로 값을 얻을 수 없다. 이는 마치 맵 자료형과 비슷하다. 맵 자료형 역시 순서가 없는 자료형이라 인덱싱을 지원하지 않는다.

### 교집합, 합집합, 차집합 구하기

집합 자료형을 정말 유용하게 사용하는 경우는 교집합, 합집합, 차집합을 구할 때이다.

우션 다음과 같이 2개의 집합 자료형을 만든 후 따라 해 보자. s1은 1부터 6까지의 값을 가지게 되었고, s2는 4부터 9까지의 값을 가지게 되었다.

```java
import java.util.Arrays;
import java.util.HashSet;

public class Sample {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));
    }
}
```

> ※ 제네릭스로 int를 사용하고 싶은 경우에는 int와 Wrapper 클래스인 integer를 대신 사용해야 한다.

1. 교집합

s1과 s2의 교집합을 구해 보자.

```java
import java.util.Arrays;
import java.util.HashSet;

public class Sample {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

        HashSet<Integer> intersection = new HashSet<>(s1);  // s1으로 intersection 생성
        intersection.retainAll(s2);  // 교집합 수행
        System.out.println(intersection);  // [4, 5, 6] 출력
    }
}
```

retainAll 메소드를 이용하면 교집합을 간단히 구할 수 있다. s1의 데이터를 유지하기 위해 s1로 `intersection`이라는 `HashSet` 객체를 복사하여 생성하였다. intersection대신 retainAll 매서드를 사용하면 s1의 내용이 변경될 것이다.

2. 합집합

합집합은 다음과 같이 구할 수 있다. 이때 4, 5, 6처럼 중복해서 포함된 값은 한 개씩만 표현된다.

```java
import java.util.Arrays;
import java.util.HashSet;

public class Sample {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

        HashSet<Integer> union = new HashSet<>(s1);  // s1으로 union 생성
        union.addAll(s2); // 합집합 수행
        System.out.println(union);  // [1, 2, 3, 4, 5, 6, 7, 8, 9] 출력
    }
}
```

합집합은 addAll 메소드를 사용하여 구할 수 있다. 합집합의 결과로 `[1, 2, 3, 4, 5, 6, 7, 8, 9]`를 출력한다.

3. 차집합

차집합은 다음과 같이 구할 수 있다.

```java
import java.util.Arrays;
import java.util.HashSet;

public class Sample {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

        HashSet<Integer> substract = new HashSet<>(s1);  // s1으로 substract 생성
        substract.removeAll(s2); // 차집합 수행
        System.out.println(substract);  // [1, 2, 3] 출력
    }
}
```

차집합은 removeAll메소드를 사용하여 구할 수 있다. 차칩합의 결과로 `[1, 2, 3]`을 출력한다.

### 집합 자료형 관련 메소드

#### 값 추가하기(add)

집합 자료형에 값을 추가할 때에는 add 메소드를 사용한다.

```java
import java.util.HashSet;

public class Sample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Jump");
        set.add("To");
        set.add("Java");
        System.out.println(set);  // [Java, To, Jump] 출력
    }
}
```

#### 값 여러 개 추가하기(addAll)

여러 개의 값을 한 번에 추가할 때는 다음과 같이 addAll 메소드를 사용한다.

```java
import java.util.Arrays;
import java.util.HashSet;

public class Sample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Jump");
        set.addAll(Arrays.asList("To", "Java"));
        System.out.println(set);  // [Java, To, Jump] 출력
    }
}
```

> ※ 합집합을 구할 때도 addAll을 사용했다.

#### 특정 값 제거하기(remove)

특정 값을 제거하고 싶을 때는 다음과 같이 remove 메소드를 사용한다.

```java
import java.util.Arrays;
import java.util.HashSet;

public class Sample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList("Jump", "To", "Java"));
        set.remove("To");
        System.out.println(set);  // [Java, Jump] 출력
    }
}
```

## 상수집합(Enum)

Enum은 서로 관련이 있는 여러 개의 상수 집합을 정의할 때 사용하는 자료형이다.

### Enum 만들기

예를 들어 어떤 커피숍에서 판매하는 커피가 종류가 다음과 같다고 가정해 보자.

- 아메리카노
- 아이스 아메리카노
- 카페라떼

이와 같이 3종류의 커피를 판매한다고 하면, 다음과 같이 Enum으로 상수집합을 만들수 있다.

```java
enum CoffeeType {
    AMERICANO,
    ICE_AMERICANO,
    CAFE_LATTE
};
```

정의한 상수 집합은 다음과 같이 사용할 수 있다.

```java
public class Sample {
    enum CoffeeType {
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    };

    public static void main(String[] args) {
        for(CoffeeType type: CoffeeType.values()) {
            System.out.println(type);  // 순서대로 AMERICANO, ICE_AMERICANO, CAFE_LATTE 출력
        }
    }
}
```

### Enum은 왜 필요한가?

.


## 형변환과 final

다음과 같은 문자열을 보자.

```java
String num = "123";
```

자료형은 문자열이지만 그 내용은 숫자로 이루어진 값이다. 이럴 경우에 문자열을 정수로 바꿀 수 있다. 문자열을 정수로 바꾸려면 다음과 같이 `integer`클래스를 사용한다.

```java
public class Sample {
    public static void main(String[] args) {
        String num = "123";
        int n = Integer.parseInt(num);
        System.out.println(n);  // 123 출력
    }
}
```

이번에는 반대로 정수 123을 문자열 "123"으로 바꾸는 방법에 대해서 알아보자. 정수를 문자열로 바꾸는 가장 쉬운 방법은 정수 앞에 빈문자열을 더해주는 것이다.

```java
public class Sample {
    public static void main(String[] args) {
        int n = 123;
        String num = "" + n;
        System.out.println(num);  // 123 출력
    }
}
```

또는 다음과 같이 변환할 수도 있다.

```java
public class Sample {
    public static void main(String[] args) {
        int n = 123;
        String num1 = String.valueOf(n);
        String num2 = Integer.toString(n);
        System.out.println(num1);  // 123 출력
        System.out.println(num2);  // 123 출력
    }
}
```

### final

자바의 final은 자료형에 값을 단 한 번만 설정할 수 있게 강제하는 키워드이다. 즉, 값을 한 번 설정하면 그 값을 다시 설정할 수 없다는 말이다.

```java
public class Sample {
    public static void main(String[] args) {
        final int n = 123;  // final 로 설정하면 값을 바꿀수 없다.
        n = 456;  // 컴파일 에러 발생
    }
}
```

리스트의 경우도 final로 선언시 재할당은 불가능하다.

```java
import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        final ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b"));
        a = new ArrayList<>(Arrays.asList("c", "d"));  // 컴파일 에러 발생
    }
}
```

final은 프로그램 수행 도중 그 값이 변경되면 안되는 상황에 사용한다.

## 3장 예제

1. 평균 구하기

```java
public class Main {
    public static void main(String[] args) {
        int average = 0;

        average += 80;
        average += 75;
        average += 55;
        average /= 3;

        System.out.println(average);

    }
}
```

2. 자연수 13이 홀수인지 짝수인지 판별할 수 있는 방법

   mod 연산

3. 문자열의 substring 메소드 활용하기

```java
public class Main {
    public static void main(String[] args) {
        String psnlID = "881120-1068234";

        System.out.println(psnlID.substring(0,6));
        System.out.println(psnlID.substring(7,14));
    }
}
```

4. 주민번호에서 성별을 나타내는 숫자를 출력해 보자.

```java
public class Main {
    public static void main(String[] args) {
        String pin = "881120-1068234";

        System.out.println(pin.charAt(7));
    }
}
```

5. "a:b:c:d"를 "a#b#c#d"로 바꾸어 출력하기.

```java
public class Main {
    public static void main(String[] args) {
        String a = "a:b:c:d";

        System.out.println(a.replaceAll(":", "#"));
    }
}
```

6. [1, 3, 5, 4, 2] 리스트를 [5, 4, 3, 2, 1]로 만들기

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
        System.out.println(myList); // [1, 3, 5, 4, 2] 출력

        myList.sort(Comparator.reverseOrder());
        System.out.println(myList);
    }
}
```

7. ['Life', 'is', 'too', 'short'] 리스트를 "Life is too short" 문자열로 만들어 출력해보자

```java
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        System.out.println(myList); // [Life, is, too, short] 출력

        String joined = "";
        for (int i = 0; i < myList.size(); i++) {
            joined += myList.get(i);
            joined += " ";
        }

        System.out.println(joined.substring(0, joined.length() - 1));
    }
}
```

8. 다음의 맵 grade에서 "B"에 해당하는 값을 추출해보자. 추출 이후에는 grade에서 "B"에 해당하는 아이템이 사라져야한다.

```java
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);

        System.out.println(grade.remove("B"));
    }
}
```

9. 다음의 numbers 리스트에서 중복 숫자를 제거해 보자.

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        System.out.println(numbers);  // [1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5] 출력

        HashSet<Integer> nbrs = new HashSet<>(numbers);

        System.out.println(nbrs);
    }
}
```

10.  커피의 종류를 입력하면 커피의 가격을 알려주는 프로그램에서, 1, 2, 3과 같은 매직 넘버를 제거하여 프로그램을 개선해보자.

```java
import java.util.HashMap;

public class Main {
    static void printCoffeePrice(int type) {
        enum coffeeType {
            AMERICANO,
            ICE_AMERICANO,
            CAFE_LATTE
        };
        HashMap<Integer, Integer> priceMap = new HashMap<>();
        priceMap.put(coffeeType.AMERICANO.ordinal() + 1, 3000);  // 1: 아메리카노
        priceMap.put(coffeeType.ICE_AMERICANO.ordinal() + 1, 4000);  // 2: 아이스 아메리카노
        priceMap.put(coffeeType.CAFE_LATTE.ordinal() + 1, 5000);  // 3: 카페라떼
        int price = priceMap.get(type);
        System.out.println(String.format("가격은 %d원 입니다.", price));
    }

    public static void main(String[] args) {
        printCoffeePrice(1);  // "가격은 3000원 입니다." 출력
        //printCoffeePrice(99);  // NullPointerException 발생
    }
}
```

## for each문

기존의 for문과 형태만 약간 다르다. 다음은 for문의 예제이다.

```java
String[] numbers = {"one", "two", "three"};
for(int i=0; i<numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

위 for문은 다음처럼 for each 구조로 변경할 수 있다.

```java
String[] numbers = {"one", "two", "three"};
for(String number: numbers) {
    System.out.println(number);
}
```

for each 문의 구조는 다음과 같다.

```java
for (type var: iterate) {
    body-of-loop
}
```

단, for each 문은 따로 반복회수를 명시적으로 주는 것이 불가능하고, 1스탭씩 순차적으로 반복될때만 사용가능하다는 제약이 있다.

