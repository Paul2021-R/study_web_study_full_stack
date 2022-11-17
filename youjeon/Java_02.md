# 2주차

- cpp와 다른점 정리
    - 원시 자료형 = 기본 타입(primitive type)
        
        byte, short, char, int, long, float, double, boolean 의 기본적으로 사용하는 자료형을 의미함.
        
        원시 자료형은 new 키워드로 값을 생성할수 없으며, **리터럴**(****Literal)****로 값을 표시해야한다.
        
        [https://mine-it-record.tistory.com/100](https://mine-it-record.tistory.com/100)
        
    - 리터럴(literal)
        
        프로그램에서 직접 표현된, 고정되어있는 값을 뜻한다. 변수에 할당하는 값 중 변수나 상수가 아닌 ‘값’ 그 자체를 의미한다. (”10”, “true” 등)
        
        모든 원시자료형은 반드시 리터럴로만 값을 표시해야하며, 예외로 string도 리터럴로 표현되어야한다.
        
        string과 원시자료형은 heap 내에서 다른 pool을 사용하는데, 리터럴로 표시하면 pool내에서 같은 주소를 가리키게 되어서 메모리 사용량을 줄일수있고 캐시된 메모리를 가리키면 더 빠른 속도를 낼수있다. 반대로 리터럴이 아닌 new 키워드를 사용해서 만들면 다른 주소를 가리키게 된다.
        
        [https://ict-nroo.tistory.com/18](https://ict-nroo.tistory.com/18)  
        
        [https://yoo11052.tistory.com/50](https://yoo11052.tistory.com/50)
        
    - 래퍼 클래스(wrapper class)
        
        원시자료형을 래핑해서 클래스의 객체로 만들수있도록 해주는 클래스를 의미한다. 쉽게 얘기하면 기본 타입의 객체화를 의미한다. 가장 흔히 쓰이는 부분은 string을 int로 변환하는 함수를 호출할때 c나 cpp였다면 toString을 부를 상황에서, Integer.parseInt 를 불러서 처리해야한다.
        
        map 등 **제네릭**에 변수의 종류를 넣을때는 원시자료형이 아닌 래퍼클래스를 넣어줘야하며, 래퍼 클래스로 값을 전달하면 값이 아닌 객체를 전달할수있고, **immutable** 하기때문에 thread-safety 를 보장한다.
        
    - immutable, mutable
        
        불변 객체와 가변 객체. immutable object 는 말 그대로 값이 바뀌지 않는 객체를 의미하는데, 래퍼 클래스나 string 이 불변 객체이다. 이러한 불변 객체의 가장 큰 특징은 재할당만 가능하고 내부의 값을 바꿀수 없다는 것인데, 그로인해 thread-safety 한 코드가 된다. 예를 들어, 엄청 큰 string을 읽는 동안 다른 스레드에서 해당 값을 변경하면 출력 내용이 오염되는 현상이 있을텐데, 참조하는 주소만 변경하기 때문에, 출력하는 내용은 동일하게 유지될수있다.
        
        [https://velog.io/@conatuseus/Java-Immutable-Object불변객체](https://velog.io/@conatuseus/Java-Immutable-Object%EB%B6%88%EB%B3%80%EA%B0%9D%EC%B2%B4)
        
        [https://en.wikipedia.org/wiki/Thread_safety](https://en.wikipedia.org/wiki/Thread_safety)
        
    - string
        
        문자열 클래스인데, cpp와 가장 큰 차이점은 값을 비교하는 함수인 equals 함수가 따로 존재한다. equals 함수는 이름 그대로 문자열이 동일한지를 확인해주는데, ‘==’ 과 가장 큰 차이점은 자바에서의 ‘==’ 연산자는 같은 객체인지를 확인하기때문에 같은 리터럴로 생성한 문자열은 true가 나오지만, new 연산자를 이용해서 생성한 문자열은 늘 다른 객체이기 때문에, false 가 나올수도 있다.
        
        ```jsx
        String a = "hello";
        String b = new String("hello");
        String c = "hello";
        String d = new String("hello");
        
        System.out.println(a.equals(b));  // true
        System.out.println(a == b);  // false
        System.out.println(a == c);  // true
        System.out.println(b == d);  // false
        ```
        
        콘솔에 출력할때 System.out.print 혹은 println을 사용하면 되는데, C에서의 printf 처럼 formating 된 형태로 출력하고 싶다면 String.Format 함수를 사용하면 된다.
        
        ```jsx
        int number = 3;
        System.out.println(String.format("I eat %d apples.", number));  // "I eat 3 apples." 출력
        ```
        
    - stringBuffer, stringBuilder
        
        string이 불변이기 때문에 아무래도 객체를 여러번 바꿔야하는 상황에서는 많은 데이터를 생성해야한다. 그래서 string을 많은 데이터를 추가하고 삭제해야할때에 사용하는것이 stringBuffer 이다. 
        
        이 클래스는 객체를 가변으로 만들기때문에 데이터를 여러차례 추가/삭제 하더라도 여러개의 객체를 만들지 않고 하나의 객체에서 처리하게된다. 단, 객체 자체가 많이 무겁기 때문에 문자열의 변경이 많지 않은 경우는 그냥 string을 사용하는 것이 유리하다. 
        
        stringBuilder는 stringBuffer와 비슷하지만, 다중 쓰레드에서의 동기화를 지원하여 안전한 stringBuffer와 달리 다중 쓰레드 환경에서 위험한 대신 연산이 적어 더 빠른 클래스이다.
        
    - 리스트
        
        list안에 ArrayList, LinkedList, Vector등 다양한 자료구조가 있다. 
        
        자바는 초창기에 가변 크기 배열이 필요할경우 Vector 밖에 없어서 해당 자료구조만 사용했다. 하지만 현재에는 해당 자료구조에서 몇가지를 개선한 ArrayList를 주로 사용한다. 
        
        가장 큰 차이점은 Vector는 다중 쓰레드가 접근할때 하나의 쓰레드씩 처리를 하기때문에(동기화) Thread-safe 하지만 ArrayList는 다중 쓰레드 접근의 동기화에 대해서는 개발자가 직접 처리를 해줘야한다. 또한 추가로 메모리가 필요할때 Vector는 현재 크기의 100%를 추가로 할당받지만 ArrayList는 50%만 할당을 받는다. 따라서 동기화가 필요없는 단일쓰레드 환경이나 속도가 필요한 환경에서는 ArrayList를 사용하는게 바람직하다. 
        
        LinkedList는 이중 연결 리스트처럼 처음과 끝을 가지고있고 각각의 요소에서 이전 주소와 다음 주소를 가지고 비 순차적으로 저장하는 자료구조이다. 따라서 자료의 삽입/삭제에서 다른 두개의 list보다 훨씬 속도가 빠르지만, 검색이나 중간 값 접근에 있어서 당연히 느리다. 
        
        따라서 내가 자료구조를 선택할때 성능을 고려한다면, 중간 삽입 혹은 삭제가 빈번할경우 LinkedList를 사용하고, 동기화가 보장되어야한다면 Vector를, 둘다 아니라면 ArrayList를 사용하면 된다.
        
         
        
    - map, set
        
        map은 key와 value로 이루어진 자료구조이다. 자료를 순차적으로 검색하는 것이 아니라 key를 입력하면 value를 뱉어준다. key가 중복된다면 기존의 value가 삭제된다.
        
        set은 key로만 이루어진 자료구조이다. 마찬가지로 key가 중복된다면 기존의 key 가 삭제된다… 라기 보단 중복을 허용하지 않는다.
        
        주로 HashMap이나 HashSet을 사용하는데 c++에서의 unordered_map과 비슷하다. 가장 큰 특징은 해시를 이용하여 자료를 저장하기 때문에, key에 대한 검색에 있어서 시간복잡도가 O(1)이라고 ‘기대’할수있다.(→**해시**) 다만, value에 대한 검색은 순회를 해야하기때문에 시간복잡도가 O(n)이다.
        
        Hash 를 사용하면 순서가 hash(엉망으로 만들다)되기 때문에, 순서를 보장하지 않는다. 따라서 순서를 알고 사용해야하면 LinkedHash를, 순서를 오름차순으로 정렬하기 위해서는 Tree를 사용한다. 
        
        LinkedHash 자료구조는 Hash 자료구조를 상속받아서 해당 entry안에 이전 entry와 다음 entry를 추가로 저장하는 형태로 순서를 저장하는데 당연히 메모리를 비교적 많이 사용하기때문에 순서가 보장되어야만하거나, 순서가 보장되었을때 더 빠른 경우에만 사용한다.
        
        Tree 자료구조는 RBTree를 이용하여 key에 대한 검색이 O(log n)인 대신 오름차순으로 정렬되어 저장된다. 자주 사용되는 get과 containsKey 동작이 Hash보다 더 느리기 때문에 실제로는 비교적 덜 사용되지만, 알고리즘 테스트에서 Hash 를 저격하는 데이터값이 들어있는 경우가 있어서 종종 사용된다(→**해시 충돌**)
        
    - 해시, 해시함수, 해시테이블, 해시 충돌
        
        해시(Hash)는 위에서 설명했듯이 엉망으로 만들다 라는 뜻으로 주로 자료구조에서 key를 고유한 값으로 변경하기위해서 사용된다. key를 미리 저장된 방식인 해시 함수(Hash method)를 이용하여 그 결과값으로 저장할 값을 만들고 그것을 해시 테이블(Hash table) 에 저장한다. 어떤 값으로 저장될지 알수없기때문에 순서를 어떤형태로든 보장하지않는다.
        
        해시테이블은 배열을 이용하여 해시를 저장하기 때문에 시간복잡도를 O(1)을 ‘기대’할수있다. ‘보장’이 아닌 ‘기대’가 되는 이유는 해시 충돌 때문이다. key는 다르지만 key를 해시함수에 넣은 결과값이 같은 경우를 해시 충돌이라고 한다. 이에 대한 해결 방법은 여러가지가 있는데 자바에서는 체이닝(Separate Chaining) 방식을 사용한다.
        
        체이닝은 하나의 해시에 여러개의 키를 저장하는 방식인데, 해시 충돌이 많아지면 많아질수록 당연히 더 느려지기때문에, 자바에서는 연결리스트로 저장을 하다가 하나의 해시에 8개가 넘어가면 트리 형태로 변경하고, 다시 6개보다 낮아지면 연결리스트로 변환한다. 
        
        그래서 알고리즘 문제가 입력값에 해시를 저격하는 데이터도 들어가있는 경우가 많아서 종종 시간복잡도 상으로는 문제가 없는듯한 코드가 효율성이 문제가 있다고 나오는 경우가 많다. 그래서 코딩테스트가 오답을 알려주지않는다면 Tree로도 통과할수있을때에는 해당 자료구조를 사용하는것이 좋다고 한다. 
        
    - enum
        
        c++과 가장 큰 차이점은 자바에서는 enum도 하나의 클래스라는 점이다. c++에서의 enum은 상수의 집합이었기 때문에 불편한 점이 많아서 c++11에서 enum class 나오는 등 개선이 있었는데, 비슷한 맥락으로 자바를 쓰다가 c++을 쓰는 사람은 절름발이가 된것같은 기분을 느낀다고한다.
        
        ```jsx
        enum CoffeeType {
            AMERICANO,
            ICE_AMERICANO,
            CAFE_LATTE
        };
        
        int americano = countSellCoffee(CoffeType.AMERICANO);
        ```
        
        이런식으로 클래스안의 변수를 참조하듯이 사용하면 되며, c++에서처럼 인덱스를 바로 출력하기위해서는 ordinal() 함수를 사용하면 되는데, 아쉽게도 c++처럼 base를 바꾸기는 어렵고, 일반적인 경우에는 0에서부터 시작된다고한다.
        
        그외에 내장된 함수들은 상수의 이름을 가져오려면 name() 함수를 사용하며, 해당 상수가 있는지 확인할때에는 valueOf() 함수와 exception을 사용해야한다고 한다. values() 함수를 쓰면 enum의 상수를 배열에 담아준다.
        
    - 형변환, final
        
        c++에서의 형변환은 static_cast를 사용하거나 C처럼 괄호를 사용하여 변경할 자료형을 지정하는 식으로 사용하지만, 자바에서는 자료형의 wrapper 클래스의 변경 함수를 사용하여 처리한다.
        
        예를들어 int와 string사이의 형변환을 한다면, int a = Interger.parseInt(string) 을 사용하여 int로 변환하거나 string a = Interger.toString(int) 를 사용하여 변환할수있다.
        
        parseString이 없는 이유가 궁금한데 아무리 찾아도 이유를 찾지못했다. 추측하기로는 wrapper 클래스가 원시자료형에만 있는데 string은 원시자료형이 아니기때문이 아닐까 싶다.
        
        final 은 c++11에서도 사용하는 키워드인데, 클래스나 메소드에서 사용되면 비슷한 의미로 상속이나 오버라이딩을 금지하는데에 사용한다. 
        
        변수에 사용하는 경우는 자바에서만 사용되는데, 변수에 사용될때 비슷한 역할을 하는 c++의 키워드는 const이다. 자바에는 const가 없고 final을 대신해서 사용하며, 비슷하게 변수의 값을 변경하거나 자료형을 변경할수없게한다. 따라서 상수와 유사한 특성을 지니고있지만 조금 다르다.
        
        c++에서의 상수는 프로그램이 시작될때 정해져서 프로그램 종료시까지 반드시 동일한 값을 사용하게 되기 때문에 ‘변하지 않고 항상 같은 값을 가지는 수’ 라는 의미의 상수라는 말에 적합하며, 그에 따라 constant의 약자인 const 를 키워드로 사용한다.
        
        하지만 자바의 final은 객체가 생성될때마다 다르게 할당되거나, 아니면 선언 이후에 초기화를 해줄수있기때문에 ‘항상 같은 값’ 이 보장되지 않는다. 그래서 상수처럼 사용하지만 const라는 키워드를 사용하지 않았다고 추측해볼수있다.
        
        list는 클래스이기 때문에 원시자료형과 달리 final 키워드를 써도 재할당만 불가능하지 안에 값을 넣고 빼는건 자유롭게 할수있다. list를 수정불가능하게 만들기위해서는 final 키워드와 함께 list.of 함수를 써서 값을 넣거나 Collections 에 있는 unmodifiableList 메소드(생성자?)를 사용해야한다.
        
        ```jsx
        final List<String> a = List.of("a", "b");
        final List<String> items = Collections.unmodifiableList(Arrays.asList("a", "b", "c"));
        ```
        
         
        
    - for each
        
        c++11에서 추가된 auto 키워드나 python의 for문과 비슷하게 동작하는 for문이다. 
        
        기존의 for문에서는 배열의 값을 참조할때 배열의 길이를 구한다음 int로 순회하면서 처리해야했는데, 이 문법을 사용하면 그런 과정 없이 바로 값을 순회하는 for문을 사용할수있다.
        
        ```jsx
        
        기존의 for문
        String[] numbers = {"one", "two", "three"};
        for(int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        
        for each 문
        String[] numbers = {"one", "two", "three"};
        for(String number: numbers) {
            System.out.println(number);
        }
        ```
        
        해당 배열의 모든 값을 순차적으로 순회해야할때 쓰면 직관적인 코드를 작성할수있다.
        
    - call by value
        
        자바에는 call by reference가 없고 call by value만 있다. 이 말만 들으면 도대체 어떻게 코딩을 하라는건가 싶지만 사실 별다른 문제는 없다.
        
        원시자료형(기본 타입)을 메소드의 인자에 넣으면 당연히 call by value로 동작한다. 하지만 객체(참조 타입)를 인자에 넣으면 해당 객체에 접근할수있다.
        
        클래스의 객체가 생성될때 객체 자체는 heap 메모리에 생성이 되면서 그 객체를 가리키는 참조 타입 변수를 사용하기때문에 자연스럽게 주소를 전달하는 call by reference 처럼 동작하게 된다.
        
        ```jsx
        class Updater {
            void update(int count) {
                count++;
            }
        }
        
        class Counter {
            int count = 0;  // 객체변수
        }
        
        public class Sample {
            public static void main(String[] args) {
                Counter myCounter = new Counter();
                System.out.println("before update:"+myCounter.count);
                Updater myUpdater = new Updater();
                myUpdater.update(myCounter.count);
                System.out.println("after update:"+myCounter.count);
            }
        }
        
        class Updater {
            void update(Counter counter) {
                counter.count++;
            }
        }
        
        class Counter {
            int count = 0;  // 객체변수
        }
        
        public class Sample {
            public static void main(String[] args) {
                Counter myCounter = new Counter();
                System.out.println("before update:"+myCounter.count);
                Updater myUpdater = new Updater();
                myUpdater.update(myCounter);
                System.out.println("after update:"+myCounter.count);
            }
        }
        ```
        
         두개의 코드는 비슷해보이지만 updater가 counter의 객체 변수를 받는지 아니면 counter를 직접 받아서 해당 객체의 변수를 수정하는지의 차이가 있다. 그래서 위의 코드는 원시자료형인 int 변수를 수정하기때문에 counter 의 변수가 변경되지않지만 참조 타입인 객체를 전달받아서 증가시킨 아래 변수는 counter의 객체 변수 값이 증가한다.
        
    - 상속
        
        c++과의 가장 큰 차이점은 c++에서는 상속의 키워드로 public 과 같은 접근 제한자를 사용하지만, 자바는 상속 키워드가 extends 로 고정되어있다는 점이다. 
        
        자바에서는 모든 메소드가 virtual로 구현되어있기 때문에 자유롭게 오버라이딩을 할수있다. 오버라이딩을 막기위해서는 위에서 설명한 final 키워드를 사용하면 해당 클래스를 상속받은 클래스는 해당 메소드를 오버라이딩 할수없다.
        
        c++에서는 다중상속을 지원하지만 자바는 지원하지 않는다.
        
    
    - obsolete
        
        원래 뜻은 진부화라는 뜻으로 제품의 상태는 정상이지만 실제로는 거의 사용하지 않는 제품을 뜻한다. 현대에도 인텔 팬티엄 제품을 아직 팔지만 최근에 해당 브랜드를 더이상 사용하지않게되었으니 obsolete 되었다고 이해하면 된다.
        
        it 용어에서의 주된 뜻은 deprecated 되어서 곧 폐기될것이지만 하위 호환성이나 기존 관성을 위해 남겨둔 키워드나 함수가 진짜로 사라지게 되면 obsolete 되었다고 한다. 
        
    - this
        
        c++에서의 this 와 비슷하다. 객체지향언어에서는 인자로 받는 변수와 객체 안의 변수가 같은 이름을 사용하고있을수도있기때문에 this.str = str 같은 식으로 구별해줄수있어야한다.
        
        c++과 다른점은 c++에서는 해당 객체 변수를 가리킬때 사용하면 가독성을 위해 사용하는 느낌인데, 자바에서는 변수가 같을때 str = str 같은 식으로 사용하면 정상적으로 동작하지 않기때문에 필수로 사용해야한다.
        
    -