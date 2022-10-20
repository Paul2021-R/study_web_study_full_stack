# 10~n주차
---
<br>

# 13 자바스크립트와 첫 만남
## 13-1 자바스크립트로 무엇을 할까
### 웹의 요소를 제어합니다
HTML이나 CSS와 함께 사용해서 웹의 요소를 움직이거나 포토 갤러리를 펼쳐 놓는 것처럼 웹사이트 UI 부분에 많이 활용

### 웹 애플리케이션을 만듭니다
문서 작성, 그림 그리기, 게임 등

### 다양한 라이브러리를 사용할 수 있습니다
- 웹 애플리케이션을 개발할 때 사용하는 리액트, 앵귤러, 뷰 같은 프레임워크  
- 그래픽 활용을 위한 D3.js나 DOM을 쉽게 조작할 수 있게 해주는 제이쿼리 같은 라이브러리  

### 서버 개발을 할 수 있습니다
Node.js -> js를 백엔드 개발에서 사용할 수 있도록 만든 프레임워크

## 13-2 웹 브라우저가 자바스크립트를 만났을 때
### 웹 문서 안에 `<script>` 태그로 자바스크립트 작성하기
소스 코드가 짧을 경우 웹 문서에서 바로 코드를 작성할 수 있음  
`<script></script>` 태그 사이에 소스 작성, 하나의 문서에 여러 개 사용 가능  
자바스크립트는 이미지나 텍스트 등 요소를 제어하는 경우가 많으므로 되도록 다 표시한 후에 실행할 수 있도록 `</body>` 태그 직전에 삽입  
주의! HTML, CSS와 달리 자바스크립트에서는 영어 대소문자 구별함  

### 외부 스크립트 파일로 연결해서 자바스크립트 작성하기
외부 파일은 `<script>` 태그 없이 소스만 작성하고 확장자는 *.js  
HTML 문서에서 `<script>` 태그의 src속성을 이용해서 파일 연결  
기본형 `<script src="외부 스크립트 파일 경로"></script>`  

### 웹 브라우저에서 스크립트를 해석하는 과정
1. `<!DOCTYPE html>`을 보고 웹 문서라고 인식, `<html>`과 `</html>` 태그 사이의 내용을 HTML 표준에 맞춰 읽기 시작
2. HTML 태그의 순서와 포함 관계 확인. 태그 간의 관계 분석
3. 스타일 정보 분석 (`<style></style>`)
4. `<script>` 태그를 만나면 웹 브라우저 안에 포함된 자바스크립트 해석기에게 스크립트 소스를 넘기고, 해석기가 소스 해석
5. 2에서 분석한 HTML과 3에서 분석한 CSS 정보에 따라 웹 브라우저 화면에 표시
6. 분석해 놓은 자바스크립트를 때에 맞춰 실행해서 결과를 화면에 표시

## 13-3 자바스크립트 용어와 기본 입출력 방법
### 식과 문
큰 줄기 - **식**(expression)과 **문**(statement)  
식은 표현식이라고도 하는데, 연산식뿐만 아니라 실제 값도, 함수를 실행하는 것도 식이 됨.  
어떤 값을 만들어낼 수 있다면 모두 식이 될수 있으며, 식은 변수에 저장  
```js
inch * 2.54	// 연산식은 식
"hello?";	// 문자열도 식
5			// 숫자도 식
```
이에 비해 **문**은 명령  
문의 끝에 세미콜론(;)을 붙여서 구분, ex) '조건문'이나 '제어문'  
*넓은 의미에서 '문'은 값이나 식까지 포함*  

### 간단한 입출력 방법
**알림 창 출력하기**  
기본형 `alert(message)`  
괄호 안에 따옴표(" " 또는 ' ')와 함께 메시지를 넣음  
<br>

**확인 창 출력하기**  
기본형 `confirm(message)`  
[확인]이나 [취소] 버튼 중에서 사용자가 직접 클릭하고, 결과에 맞게 프로그램 동작  
<br>

**프롬프트 창에서 입력받기**  
기본형 `prompt(message) | prompt(message, default)`  
텍스트 필드 안에 간단한 메시지를 입력 받고, 그 내용을 가져와 프로그램에 사용  
기본값(default)를 지정하거나 지정하지 않을 수 있고, 기본값을 지정하지 않으면 빈 텍스트 필드로 표시됨  
<br>

**웹 브라우저 화면에 출력을 담당하는 document.write()문**  
브라우저 화면에 결괏값을 확인하는 용도로 많이 사용  
괄호 안에는 실제 표시할 내용이나 어떤 값이 저장된 변수를 넣을 수도 있음  따옴표 사이에 입력한 내용은 그대로 표시되고, 따옴표 안에 HTML 태그도 함께 사용할 수 있음  
\+ 연산자(연결 연산자)를 사용해 연결해주면 표시할 내용과 변수를 섞어서 나타낼 수도 있음  
<br>

**콘솔 창에 출력하는 console.log()문**  
괄호 안의 내용을 콘솔 창에 표시  
콘솔 창 : 웹 브라우저의 개발자 도구 창에 포함되어 있는 공간  
괄호 안에는 변수나 따옴표 사이에 표시할 텍스트를 넣을 수도 있지만, 따옴표 안에 HTML 태그는 사용 불가  

## 13-4 자바스크립트 스타일 가이드
### 코딩 규칙이 왜 필요할까요?
다른 프로그래밍 언어에 비해 데이터 유형이 유연해서 곳곳에 오류가 발생할 수 있음  
스타일 가이드(코딩 컨벤션)에 따라 작성하면 소스 코드의 오류도 줄이고 일관성이 생겨 읽기가 쉬워짐  
유지 보수도 수월하고 비용도 훨씬 줄어듬  

### 자바스크립트 스타일 가이드
보통 구글이나 에어비앤비에서 배포한 것을 기준으로 작성  

### 자바스크립트 소스를 작성할 때 지켜야 할 규칙
1. 코드를 보기 좋게 들여쓰기합니다  
   탭은 시스템 환경마다 다르게 보일 수 있으므로 스페이스바 공백 2칸이나 4칸 권장  
2. 세미콜론으로 문장을 구분합니다  
   세미콜론(;)은 문장의 끝을 나타내며 문장과 문장을 구분하는 역할  
   세미콜론을 붙이지 않아도 실행되지만, 문장을 명확히 표시하는 것을 권장  
   소스 한 줄에 한 문장만 작성  
3. 공백을 넣어 읽기 쉽게 작성합니다  
   예약어나 연산자, 값 사이에는 공백을 넣어서 소스 코드를 읽기 쉽게 작성  
4. 소스 코드를 잘 설명하는 주석을 작성합니다  
   1. 한줄 주석 : 주석 기호로 슬래시 2개 (//)를 붙이고 내용 작성. 한 줄을 넘으면 오류가 생김  
   2. 여러 줄 주석 : 여는 주석 기호(`/*`)와 닫는 주석 기호 (`*/`) 사이에 주석 내용 작성  
5. 식별자는 정해진 규칙을 지켜 작성합니다  
   식별자(identifier)는 개발자가 js의 변수, 함수, 속성 등을 구별하려고 이름 붙인 특정 단어를 의미  
   식별자의 첫 글자는 반드시 영문자/언더스코어(_)/달러 기호($)로 시작해야 하고, 그 다음에 +숫자까지 작성할 수 있음  
   두 단어 이상이 모여 하나의 식별자를 만들 경우 단어 사이를 하이픈(-)이나 언더바(_)로 연결해서 사용  
   하이픈이나 언더바 없이 붙여 사용할 경우 첫 번째 단어는 소문자로 시작하고 두 번째 단어는 대문자로 시작하는 것이 일반적 
6. 예약어는 식별자로 사용할 수 없습니다  
   예약어(Keyword)는 키워드라고도 하는데, 식별자로 사용할 수 없도록 자바스크립트에서 미리 정해놓은 단어를 가리킵니다. ex) var
<br>
<br>

# 14 자바스크립트 기본 문법
## 14-1 변수 알아보기
### 변수란
변수(variable)란 프로그램을 실행하는 동안 값이 여러 번 달라질 수 있는 데이터  
<-> 상수(constant)란 값을 한번 지정하면 바뀌지 않는 데이터  

### 변수 선언의 규칙
1. 변수 이름은 영어 문자와 언더스코어(_), 숫자를 사용
2. 자바스크립트는 영어 대소문자를 구별하며 예약어는 변수 이름으로 쓸 수 없습니다
3. 여러 단어를 연결한 변수 이름은 중간에 대문자를 섞어 씁니다
   낙타 표기법(camel case)
4. 변수 이름은 의미 있게 작성해야 합니다  

### 변수 선언하기
기본형 `var 변수명, ...`  
변수 여러 개를 쉼표로 구분하여 같은 줄에 한번에 선언할 수도 있음  
변수를 선언했으면 '='기호를 사용해서 값을 저장할 수 있음 = 값 할당  
변수 선언과 함께 하거나 따로 할 수 있음  

## 14-2 자료형 이해하기
### 자료형이란
숫자, 문자열, 논리형과 같은 **기본 유형**  
배열, 객체를 다루는 **복합 유형**  
undefined, null 같은 **특수 유형**  

### 숫자형
숫자형은 정수와 실수를 함께 묶어 숫자형  
실수를 정밀하게 계산하는 것은 적합하지 않으니 주의  

### 문자열
문자열은 따옴표로 묶은 데이터를 의미  

### 논리형
불린(boolean) 유형이라고도 하며, 참이나 거짓 값을 표현  

### undefined 유형과 null 유형
undefined : 변수 선언만 하고 값이 할당되지 않은 자료형  
null : 데이터의 값이 유효하지 않은 상태 = 변수에 할당된 값이 유효하지 않음  

### 배열
여러 개의 데이터값을 하나의 배열 이름으로 묶어서 선언  
데이터 값을 구분해서 대괄호([])로 묶어서 선언  
괄호 안에 아무 값도 넣지 않은 빈 배열 선언도 가능  

#### 자바스크립트의 데이터 유형 자동 변환
자바스크립트는 데이터 유형이 유연해 변수의 데이터 유형이 중간에 바뀔 수 있음

## 14-3 연산자 알아보기
### 산술 연산자
연산자의 왼쪽이나 오른쪽에 있는 연산 대상이 피연산자인데, 산술 연산자에서는 숫자나 변수  
전위/후위 연산자 사용 가능  

### 할당 연산자
할당 연산자는 연산자 오른쪽의 결과를 왼쪽 변수에 할당하는 연산자로 대입 연산자라고도 함  

### 연결 연산자
둘 이상의 문자열을 합쳐서 하나의 문자열로 만드는 연산자  
문자열 연산자라고도 함  

### 비교 연산자
피연산자 2개의 값을 비교해서 참이나 거짓으로 결괏값을 반환  
<br>

**==, != 연산자와 ===, !== 연산자 비교**  
==와 != 연산자는 피연산자의 자료형을 자동으로 변환해서 비교  
```js
3 == "3"	// true
3 != "3"	// false
```
반면 ===, !== 연산자는 피연산자의 자료형을 변환하지 않음  
```js
3 === "3"	// false
3 !== "3"	// true
```
<br>

**문자열의 비교**  
아스키 값을 비교해서 결정  

### 논리 연산자
true, false 자체가 피연산자인 연산자  
or (||), and (&&), not (!)  

## 14-4 조건문 알아보기
### if 문과 if~else 문 알아보기
if 문  
```js
if(조건) {
	조건 결괏값이 true일 때 실행할 명령
}
```
if~else 문  
```js
if(조건) {
	조건 결괏값이 true일 때 실행할 명령
} else {
	조건 결괏값이 false일 때 실행할 명령
}
```

### 조건 연산자로 조건 체크하기
조건이 하나이고 true일 때와 false일 때 실행할 명령이 각각 하나뿐이라면 if~else 문 대신에 조건 연산자를 사용  
기본형 `(조건) ? true일 때 실행할 명령 : false일 때 실행할 명령`  

### 논리 연산자로 조건 체크하기

### switch 문
```js
switch(조건)
{
	case 값1: 명령1
		break
	case 값2: 명령2
		break
	...
	default: 명령n
}
```
switch 문의 조건은 아래에 있는 case 문의 값과 일대일로 일치해야 함  
조건과 일치하는 case 문의 명령을 실행한 후 switch 문을 완전히 빠져나옴  
switch의 조건이 '값1'과 일치하면 '명령1'을 실행, 다음에 있는 break 문을 만나 switch문을 빠져나감  
조건과 일치하는 case 문이 없다면 마지막에 있는 default 문을 실행  

## 14-5 반복문 알아보기
### 반복문은 왜 필요할까?

### for 문 사용하기
```js
for(초깃값; 조건; 증가식) {
	실행할 명령
}
```
초깃값 : 카운터 변수를 초기화  
조건 : 명령을 반복하기 위해 조건 체크  
증가식 : 명령을 반복한 후 증가 실행  
<br>

**for 문 실행 순서**  
초깃값 설정 -> 조건 확인  
-> (조건 만족하는 경우) 명령 실행 -> 증가식 실행  
-> (조건 만족하지 않는 경우) for 문 탈출  

### 중첩된 for 문 사용하기

### while 문과 do~while 문 사용하기
while 문 : 조건이 true인 동안 명령 반복  
```js
while(조건) {
	실행할 명령
}
```
do~while 문 : 일단 명령을 한번 실행한 후 while 문에서 조건 체크  
```js
do {
	실행할 명령
} while(조건)
```

### break 문과 continue 문 사용하기
<br>
<br>

# 15 함수와 이벤트
## 15-1 함수 알아보기
### 여러 동작을 묶은 덩어리, 함수
alert() 함수와 같이 자바스크립트에 미리 만들어 놓은 함수를 내장 함수라고 함  

### 함수는 왜 사용할까?

### 함수 선언 및 호출
**함수 선언**  
```js
function 함수명() {
	명령
}
```
<br>

**함수 호출**  
`함수명() 또는 함수명(변수)`  
<br>

**함수 선언과 실행 순서**  
웹 브라우저에서 자바스크립트 소스를 해석할 때에는 함수 선언 부분을 가장 먼저하므로 선언한 위치와 상관없이 함수를 실행할 수 있음  
함수 선언 위치는 프로그램 흐름에 영향을 주지 않아, 보통 한 파일에 여러 함수를 선언했을 때 스크립트 소스의 앞부분이나 뒷부분에 함수 선언 부분을 모아 놓고 필요할 때마다 함수를 호출해서 사용  


## 15-2 var를 사용한 변수의 특징
### 변수의 적용 범위 스코프 알아보기
스코프(scope) : 자바스크립트에서 변수를 선언하고 사용할 때 변수가 적용되는 범위. 변수가 어디까지 유효한지 범위를 가리키는 영역  
지역 변수/로컬 변수(local variable) : 한 함수 안에서만 사용할 수 있는 변수  
전역 변수/글로벌 변수(global variable) : 스크립트 소스 전체에서 사용할 수 있는 변수  
<br>

**함수 안에서만 쓸 수 있는 지역 변수**  
지역 변수는 함수 안에서 선언하고 함수 안에서만 사용  
예약어 var와 함께 변수명 지정  
<br>

**스크립트 안에서 자유롭게 쓸 수 있는 전역 변수**  
전역 변수는 적용 범위를 제한하지 않고 쓸 수 있음 = 스크립트 소스 코드 전체에서 사용  
함수 밖에서 선언하거나 var 예약어를 빼고 선언해야 함  

### var와 호이스팅
호이스팅(hoisting) : '끌어올린다'는 뜻으로, 상황에 따라 변수의 선언과 할당을 분리해서 선언 부분을 스코프의 가장 위쪽으로 끌어올리는 것  
실제로 끌어올리는 게 아니라 소스 해석 순서를 가장 위쪽으로 올린다는 의미  
<br>

자바스크립트 해석기는 함수 소스를 훑어보면서 var를 사용한 변수는 따로 기억해둠  
즉, 변수를 실행하기 전에 기억해 두기 때문에 마치 선언한 것과 같은 효과가 있는데, 이것이 바로 호이스팅!  

### 변수의 재선언과 재할당
var를 사용한 변수는 호이스팅 외에도 **재선언**과 **재할당**을 할 수 있음  

## 15-3 let과 const의 등장
### let을 사용한 변수의 특징
예약어 var, let, const의 가장 큰 차이는 스코프의 범위  
var는 함수 영역의 스코프, let과 const는 블록 영역의 스코프  
<br>

**블록 안에서만 쓸 수 있는 변수**  
let 예약어로 선언한 변수는 변수를 선언한 블록 ({}로 묶은 부분)에서만 유효하고 블록을 벗어나면 사용할 수 없음  
*{} 블록 안에서만 사용할 수 있는 변수를 '블록 변수'라고 함*  
<br>

**재할당은 가능하지만 재선언은 할 수 없는 변수**  
let 예약어를 사용하여 선언한 변수는 값을 재할당할 수는 있지만 재선언할 수 없음  
-> 예약어 var와 같이 실수로 같은 변수의 이름을 사용할 걱정은 없음  
<br>

**호이스팅이 없는 변수**  
let 예약어를 사용한 변수는 호이스팅이 없으므로 선언하기 전에 사용할 경우 오류 메시지를 나타냄  

### const를 사용한 변수의 특징
const로 선언한 변수는 상수 변수(constant variable)  
프로그램 안에서 특정한 상숫값을 자주 사용한다면 변수에 담아서 사용하는 것이 편리  
const로 할당한 변수는 재선언/재할당 불가  
let 예약어를 사용한 변수처럼 블록 레벨의 스코프  

### 자바스크립트 변수, 이렇게 사용하세요
**전역 변수는 최소한으로 사용합니다**  
**var 변수는 함수의 시작 부분에서 선언합니다**  
**for 문에서 카운터 변수를 사용할 때는 var 예약어를 사용하지 않습니다**  
**ES6을 사용한다면 예약어 var보다 let을 사용하는 것이 좋습니다**  

## 15-4 재사용할 수 있는 함수 만들기
### 매개변수, 인수, return 알아보기
**함수 선언할 때 매개변수 지정하기**  
매개변수(parameter) : 함수를 선얼할 때부터 외부에서 값을 받아줄 변수  
인수 (argument) : 매개변수가 있는 함수를 호출할 때 실제 값 부분  

### 매개변수 기본값 지정하기
함수에서 매개변수를 선언할 때 기본값을 지정해주면, 매개변수에 변숫값을 넘겨받지 못했을 때 기본값을 사용  
ex)  
```js
function multiple(a, b = 5, c = 10) {	// b = 5, c = 10으로 기본값 지정
	return a * b + c;
}
```

## 15-5 함수 표현식
### 익명 함수
익명 함수 : 이름이 없는 함수  
즉, 선언할 때 이름을 붙이지 않음  
익명 함수는 함수 자체가 식이므로 함수를 변수에 할당할 수 있으며, 또한 다른 함수의 매개변수로 사용할 수도 있음  
```js
var sum = function (a, b) {						// 익명 함수를 선언한 후 변수 sum에 할당
	return a + b;
}
document.write("함수 실행 결과: " + sum(10, 20));	// 익명 함수 실행
```

### 즉시 실행 함수
한 번만 실행하는 함수라면 함수를 정의하면서 동시에 실행할 수 있음  
즉시 실행함수는 함수를 실행하는 순간에 자바스크립트 해석기에서 함수를 해석  
함수를 식 형태로 선언하므로 마지막에 세미콜론(;)을 붙임  
```js
(function() {
	명령
}());
```
```js
(function(매개변수) {
	명령
}(인수));
```
화살표 함수로도 사용 가능  
```js
(function () => { 명령 })();
(function (매개변수) => { 명령 })(인수);
```

### 화살표 함수
ES6 버전부터는 화살표 표기법을 사용해 함수 선언을 좀 더 간단하게 작성할 수 있음  
기본형 `(매개변수) => { 함수 내용 }`  
<br>

**매개변수가 없을 경우**  
`const hi = () => { return "hello?"; }`  
함수 내용이 한 줄 뿐이라면 중괄호 생략해서 작성 가능 (return 문도 생략된 것으로 간주)  
`const hi = () => "hello?";`  
<br>

**매개변수가 1개인 경우**  
`let hi = user => { document.write(user + ", hello?"); }`  
<br>

**매개변수가 2개 이상인 경우**  
`let sum = (a, b) => a + b;`  

## 15-6 이벤트와 이벤트 처리기
### 이벤트 알아보기
이벤트 : 웹 브라우저나 사용자가 행하는 어떤 동작  
ex) 키보드에서 키를 누르거나 웹 브라우저에서 새로운 페이지를 불러오는 것  
*웹 문서 영역 안에서 이루어지는 동작만!*  
주로 마우스나 키보드를 사용할 때, 웹 문서를 불러올 때, 폼에 내용을 입력할 때 발생  
<br>

**마우스 이벤트**  
click, dblclick, mousedown, mousemove, mouseover, mouseout, mouseup  
<br>

**키보드 이벤트**  
keydown, keypress, keyup  
<br>

**문서 로딩 이벤트**  
abort, error, load, resize, scroll, unload  
<br>

**폼 이벤트**  
blur, change, focus, reset, submit  

### 이벤트 처리기 알아보기
이벤트 처리기/이벤트 핸들러(event handler) : 이벤트가 발생하면 처리하는 함수  
가장 기본적인 방법은 이벤트가 발생한 HTML 태그에 이벤트 처리기를 직접 연결하는 것  
기본형 `<태그 on이벤트명 = "함수명">`  
<br>

이벤트가 발생한 후에 여러 가지 명령을 실행해야 한다면, 그 명령을 묶어서 하나의 자바스크립트 함수로 만드는 것이 좋고 이벤트가 발생할 때 함수 이름과 인수를 지정하여 실행  

## 15-7 DOM을 이용한 이벤트 처리기
DOM을 사용하면 자바스크립트가 주인이 되어 HTML의 요소를 가져와서 이벤트 처리기를 연결  
HTML과 자바스크립트 중에서 어느 쪽을 중심으로 잡는가에 따라 지정하는 방법이 다름  
ex) 웹 요소를 클릭했을 때 실행할 함수 연결  
기본형 `웹 요소.onclick = 함수;`  
<br>

`querySelector()`를 사용하여 웹 요소를 가져오는 방법  
괄호 안에는 클래스 이름이나 id 이름 또는 다양한 선택자를 넣을 수 있음  

```js
// 방법 1 : 웹 요소를 변수로 지정 & 미리 만든 함수 사용
var changeBttn = document.querySelector("#change");
changeBttn.onclick = changeColor;

function changeColor() {
	document.querySelector("p").style.color = "#f00";
}
```

```js
// 방법 2 : 웹 요소를 따로 변수로 만들지 않고 사용
document.querySelector("#change").onclick = changeColor;

function changeColor() {
	document.querySelector("p").style.color = "#f00";
}
```

```js
// 방법 3 : 함수를 직접 선언
document.querySelector("#change").onclick = function () {
	document.querySelector("p").style.color = "#f00";
};
```

# 16 자바스크립트와 객체
## 16-1 객체 알아보기
### 객체란?
자바스크립트에서의 객체 : 프로그램에서 인식할 수 있는 모든 대상을 가리킴  
- 문서 객체 모델(DOM) : 웹 문서, 그 안에 삽입되어 있는 이미지, 링크, 텍스트 필드 등도 모두 객체  
- 브라우저 관련 객체 : 사용하는 브라우저 정보를 담고 있는 navigator 객체를 비롯해 history, location, screen 객체 등  
- 내장 객체 : 웹 프로그래밍을 할 때 자주 사용하는 요소는 자바스크립트 안에 미리 객체로 정의되어 있음  
*자바스크립트는 모든 것이 객체*  
<br>

**객체의 인스턴스 만들기**  
자바스크립트에서 객체는 참조 형태로 사용해야 함  
즉, 객체 자체가 아니라 **인스턴스(instance)**의 형태로 만들어서 사용해야 함  
정의된 객체는 그대로 두고 객체와 똑같은 속성과 기능을 만듦 (객체라는 틀을 기본으로 같은 모양으로 찍어내는 것)  
그리고 그 인스턴스에 식별자를 붙여 사용  
기본형 `new 객체명`  
<br>

ex) Date 객체의 인스턴스 만들기
```js
var now = new Date();
document.write("현재 시각은" + now);
```
<br>

**프로퍼티와 메서드 이해하기**  
프로퍼티(property) : 객체의 특징이나 속성  
메서드(method) : 객체에서 할 수 있는 동작  
<br>

- ex) 자동차 운전이 하나의 프로그램이라면  
  - 객체 : 자동차
  - 프로퍼티 : 자동차 제조사, 모델명, 색상, 배기량 등
  - 메서드 : 시동 걸기, 움직이기, 멈추기, 주차하기 등
<br>

**마침표 표기법으로 프로퍼티와 메서드 작성하기**  
인스턴스는 객체의 프로퍼티와 메서드를 그대로 물려받아서 똑같이 사용  
프로퍼티와 메서드를 표시하려면 인스턴스명 뒤에 마침표(.)를 붙이고 프로퍼티나 메서드 이름을 작성  
메서드는 함수와 같은 역할을 하므로 이름 옆에 괄호를 넣어야 함!  
<br>

## 16-2 자바스크립트의 내장 객체
### Array 객체
여러 가지 내장 객체 중 **배열**을 다룸  
<br>

**Array 객체로 배열 만들기**  
배열의 크기를 지정하지 않을 수도 있고, 몇 개의 요소가 있는지 크기를 지정할 수도 있음  
- Array 객체 인스턴스 만들기 - 초깃값이 없는 경우  
```js
var numbers = new Array();	// 배열의 크기 지정하지 않음
var numbers = new Array(4);	// 배열의 크기 4로 지정
```
- Array 객체 인스턴스 만들기 - 초깃값이 있는 경우  
```js
var numbers = ["one", "two", "three", "four"];	// 배열 선언
var numbers = Array("one", "two", "three", "four");	// Array 객체를 사용한 배열 선언
```
<br>

**Array 객체의 length 프로퍼티 사용하기**  
Array 객체의 length 프로퍼티에는 배열 요소의 개수가 저장되어 있음  
ex) 배열을 만들고 요소 표시하기  
```js
var numbers = ["one", "two", "three"];	// 배열 선언
for (i = -; i < numbers.length; i++>) {
	document.write("<p>" + numbers[i] + "</p>");
}
```

### Array 객체의 메서드
- concat, every, filter, forEach, indexOf, join, push, unshift, pop, shift, splice, slice, reverse, sort, toString ... 등
<br>

**배열끼리 합치는 concat() 메서드**  
concat() 메서드는 서로 다른 배열 2개를 합쳐서 새로운 배열을 만들어 줌  
어느 배열을 먼저 쓰는가에 따라 기준이 달라지고, 결과 배열의 순서도 달라짐  
<br>

**배열 안의 요소끼리 합치는 join() 메서드**  
join() 메서드는 배열 요소를 연결해서 하나의 문자열로 만들어 줌  
이때 각 요소 사이에 원하는 구분자를 넣을 수도 있는데, 따로 지정하지 않으면 쉼표(,)로 구분  
<br>

**새로운 요소를 추가하는 push(), unshift() 메서드**  
배열 맨 끝에 추가하려면 push() 메서드 사용  
맨 앞에 추가하려면 unshift() 메서드 사용  
두 메서드는 사용 시 원본 배열이 바뀜  
메서드 리턴 값은 추가 된 배열의 length  
<br>

**배열에서 요소를 꺼내는 pop(), shift() 메서드**  
배열 뒤에 있는 요소를 꺼낼 때는 pop() 메서드 사용  
앞에 있는 요소를 꺼낼 때는 shift() 메서드 사용  
두 메서드는 꺼낸 요솟값을 반환하며 기존 배열은 꺼낸 요소가 빠진 상태로 변경됨  
<br>

**원하는 위치에 요소를 추가/삭제하는 splice() 메서드**  
배열 중간 부분에 요소를 추가/삭제하거나 한꺼번에 요소를 2개 이상 추가/삭제하려면 splice() 메서드 사용  
1. 인수가 1개인 경우
   괄호 안의 인수는 배열의 인덱스값, 즉 배열의 위치를 가리킴  
   인수가 지정한 인덱스의 요소부터 배열의 맨 끝 요소가지 삭제  
2. 인수가 2개인 경우
   첫 번째 인수는 인덱스값, 두 번째 인수는 삭제할 요소의 개수  
3. 인수가 3개 이상인 경우
   첫 번째 인수는 배열에서 삭제할 시작 위치, 두 번째 인수는 삭제할 개수, 세 번째 인수부터는 삭제한 위치에 새로 추가할 요소를 지정  
splice() 메서드를 실행한 후에는 삭제한 요소를 반환하고 기존의 numbers 배열은 변경된 상태가 됨  
<br>

**기존 배열을 바꾸지 않으면서 요소를 꺼내는 slice() 메서드**  
시작과 끝 인덱스를 지정해서 요소를 여러 개 꺼내고, 실행 결과 기존 배열이 바뀌지 않는다는 차이점이 있음  
인수를 하나만 지정하면 그 인수를 시작 인덱스로 간주하고 지정한 요소부터 마지막 요소까지 꺼내서 변환  
인수 2개를 사용하면 여러 개의 요소를 꺼낼 수 있음. 즉, 꺼낼 요소의 구간을 의미  
첫 번째 인수는 배열의 시작 인덱스, 두 번째 인수는 끝 인덱스의 바로 직전 인덱스  
실행한 후에는 꺼낸 요소를 반환  

### Date 객체
Date 객체는 날짜와 시간 정보를 나타낼 수 있음  
<br>

**Date 객체 인스턴스 만들기**  
`new Date();`  
특정한 날짜를 저장한 Date 객체를 만들고 싶다면 괄호 안에 날짜 정보를 입력  
`new Date("2020-02-25");`  

**자바스크립트의 날짜, 시간 입력 방식 알아보기**  
Date 객체를 사용하여 날짜와 시간을 지정하려면 자바스크립트가 인식할 수 있는 날짜와 시간 형식으로 써야 함  
1. YYYY-MM-DD 형식
2. YYYY-MM-DDTHH 형식
3. MM/DD/YYYY 형식
4. 이름 형식
   `new Date("Mon Jan 20 2020 15:00:41 GMT+0900 (대한민국 표준시)")`
<br>

**Date 객체의 메서드**  
- 날짜/시간 정보를 가져오는 메서드
- 사용자가 원하는 날짜/시간으로 설정하는 메서드
- 날짜/시간 형식을 바꿔 주는 메서드  
- get이 붙은 메서드는 주로 정보를 가져오는 메서드, set이 붙은 메서드는 주로 날짜/시간을 설정하는 메서드

### Math 객체
수학 계산과 관련된 메서드가 많이 포함되어 있지만 수학식에서만 사용하는 것은 아님  
Math 객체는 따로 인스턴스를 만들지 않음  
기본형 `Math.프로퍼티명`  
기본형 `Math.메서드명`  
<Br>

**Math 객체의 프로퍼티**  
- E, PI, SQRT2, SQRT1_2, LN2, LN10, LOG2E, LOG10E  
<br>

**Math 객체의 메서드**  
- abs, acos, asin, atan, atan2, ceil, cos, exp, floor, log, max, min, pow, random, round, sin, sqrt, tan  

## 16-3 브라우저와 관련된 객체
### 브라우저와 관련된 객체 알아보기
웹 브라우저 창에 문서가 표시되는 순간 브라우저는 HTML 소스를 한 줄씩 읽으면서 화면에 내용을 표시하고 관련된 객체를 만들어 냄  
웹 브라우저가 열리면 가장 먼저 window라는 객체가 만들어지고 밑으로 하위 요소에 해당하는 객체들이 나타남  
이 하위 객체는 웹 문서와 주소 표시줄처럼 브라우저 요소에 해당하며 각각 다른 하위 객체를 가짐  
- window : 브라우저 창이 열릴 때마다 하나씩 생성. 요소 중 최상위
  - document : 웹 문서마다 하나씩 있으며 `<body>` 태그를 만나면 생성. HTML 문서의 정보가 담김
    - area
    - image
    - form
      - textarea
      - button
      - text
      - checkbox
      - fileUpload
      - radio
      - ...
    - anchor
    - ...
  - navigator : 현재 사용하는 브라우저의 정보가 들어있음
  - history : 현재 창에서 사용자의 방문 기록을 저장
  - location : 현재 페이지의 URL 정보가 담겨 있음
  - screen : 현재 사용하는 화면 정보를 다룸

### window 객체의 프로퍼티
window 객체는 웹 브라우저의 상태를 제어하며 자바스크립트의 최상위에 있음  
따라서 모든 객체는 window 객체 안에 포함  
- window 객체의 프로퍼티
  - document, frameElement, innerHeight, innerWidth, localStorage, location, name, outerHeigth, outerWidth, pageXOffset, pageYOffset, parent, screenX, screenY, scrollX, srollY, sessionStorage

### window 객체의 메서드
대화 창을 표시하거나 브라우저 창의 크기나 위치를 알아내고 지정하는 등 웹 브라우저 창 자체와 관련  
window 객체는 기본 객체이므로 `window.`를 생략하고 `함수명()`만 사용할 수 있음  
- window 객체의 메서드
  - alert(), blur(), close(), confirm(), focus(), moveBy(), moveTo(), open(), postMessage(), print(), prompt(), resizeBy(), resizeTo(), scroll(), scrollBy(), scrollTo(), sizeToContent(), stop()

**새 브라우저 창을 여는 open() 메서드**  
링크를 클릭하거나 웹 문서를 열 때 새 창이 자동으로 뜨게 하려면 `window.open()` 메서드 사용  
주로 팝업 창을 띄울 때 사용  
`window.open(경로, 창 이름, 창 옵션)`  
ex) `window.open("notice.html", "", "width=500, height=400");`  
<br>

**창 이름 저장하기**  
메서드의 괄호 안에 두 번째 인자에 창 이름 입력  
<br>

**팝업 창 위치 지정하기**  
open() 메서드의 left와 top 속성으로 지정할 수 있음  
left 속성은 화면의 왼쪽 측면을 기준으로 하고, top 속성은 화면의 위쪽을 기준으로 해서 팝업 창을 얼마나 떨어뜨릴지 지정  
<br>

**팝업 차단 고려하기**  
팝업 차단된 상태인지 체크하여 사용자에게 알려주기  
```js
var newWin = window.open("notice.html", "pop", "width=500, height=400");
if (newWin == null) {	// 팝업이 차단되어 있으면 알림 창 표시
	alert("팝업이 차단되어 있습니다. 팝업 차단을 해제해 주세요.")
}
newWin.moveBy(100, 100);
```
<Br>

**브라우저 창을 닫는 close() 메서드**  
기본형 `window.close()`  

### navigator 객체
웹 브라우저의 버전을 비롯해 플러그인 설치 정보나 온오프라인 등의 여러 정보가 담겨 있음  
이 정보는 사용자가 수정할 수 없으며 가져와서 보여 줄 수만 있음  
<br>

**웹 브라우저와 렌더링 엔진**  
모든 사용자의 웹 브라우저에서 똑같이 동작하는 웹 문서를 개발할 필요성이 생김  
아직 표준화되지 않은 CSS 속성 앞에는 브라우저 벤더를 의미하는 프리픽스(prefix)를 지정  
웹 브라우저마다 HTML이나 CSS를 해석하는 렌더링 엔진(rendering engine)이 다르기 때문  
웹 브라우저는 웹 문서를 불러오면 내장된 렌더링 엔진에서 소스를 해석  
이때 웹 브라우저마다 사용하는 렌더링 엔진이 다르므로 프리픽스를 붙여 브라우저를 구별하는 것임  
마찬가지로 웹 브라우저마다 내장된 자바스크립트 엔진도 서로 다름  
<br>

**userAgent 프로퍼티 알아보기**  
navigator 객체에서 가장 먼저 알아야 할 프로퍼티는 userAgent로, 사용자 에이전트 문자열을 의미  
userAgent는 사용자의 웹 브라우저 정보를 서버에 보낼 때 사용  
userAgent에는 사용자의 웹 브라우저 버전, 자바스크립트의 엔진 종류 등 여러 정보가 들어 있음  
따라서 서버에서는 그 정보를 확인하여 사용자에게 맞는 웹 페이지를 보여 줄 수 있음  
<br>

**navigator 객체 정보 살펴보기**  
navigator 객체에는 진동 감지 속성이나 배터리 상태를 체크하는 속성 등이 새롭게 추가되고 있음  
- navigator 객체의 주요 프로퍼티
  - battery : 배터리 충전 상태를 알려 줌
  - cookieEnabled : 쿠키 정보를 무시하면 false, 허용하면 true를 반환
  - geolocation : 모바일 기기를 이용한 위치 정보를 나타냄
  - language : 브라우저 UI의 언어 정보를 나타냄
  - oscpu : 현재 운영체제 정보를 나타냄
  - userAgent : 현재 브라우저 정보를 담고 있는 사용자 에이전트 문자열  
navigator 객체의 메서드는 대부분 일부 브라우저에서만 지원  

### history 객체
history 객체에는 브라우저에서 [뒤로]나 [앞으로] 또는 주소 표시줄에 입력해서 방문한 사이트 주소가 배열 형태로 저장됨  
브라우저 히스토리는 보안 문제로 읽기 전용  
- 프로퍼티
  - length : 현재 브라우저 창의 history 목록에 있는 항목의 개수, 즉 방문한 사이트 개수가 저장됨  
- 메서드
  - back() : history 목록에서 이전 페이지를 현재 화면으로 불러옴
  - forward() : history 목록에서 다음 페이지를 현재 화면으로 불러옴
  - go() : history 목록에서 현재 페이지를 기준으로 상대적인 위치에 있는 페이지를 현재 화면으로 불러옴. history.go(1)은 다음 페이지, history.go(-1)은 이전 페이지

### location 객체
브라우저의 주소 표시줄과 관련된 객체  
현재 문서의 URL 주소 정보가 들어 있는데 이 정보를 편집하면 현재 브라우저 창에서 열어야 할 사이트나 문서를 지정할 수 있음  
- 프로퍼티
  - hash, host, hostname, href, pathname, port, protocol, password, search, username
- 메서드
  - assign() : 현재 문서에 새 문서 주소를 할당해서 새 문서를 가져옴
  - reload() : 현재 문서를 다시 불러옴
  - replace() : 현재 문서의 URL을 지우고 다른 URL의 문서로 교체
  - toString() : 현재 문서의 URL을 문자열로 반환

### screen 객체
웹 사이트에 접속하는 사용자의 화면 크기는 모두 다르고, 사용자의 화면 크기나 정보를 알아낼 때 screen 객체를 사용  
- 프로퍼티
  - availHeight, availWidth, colorDepth, height, orientation, pixelDepth, width
- 메서드
  - lockOrientation() : 화면 방향 잠금
  - unlockOrientation() : 화면 방향 잠금 해제  

# 17 문서 객체 모델(DOM)
## 17-1 문서 객체 모델 알아보기
### 문서 객체 모델이란
웹에서 자바스크립트를 사용하는 이유 : 어떤 조건에 맞거나 사용자의 동작이 있을 때 웹 문서 전체 또는 일부분이 동적으로 반응하게 하는 것.  
이렇게 반응하게 하려면 웹 문서의 모든 요소를 따로 제어할 수 있어야 함  
웹 문서 내의 모든 정보 요소를 자바스크립트로 가져와 프로그래밍 할 때 사용하는데, 이때 알아야 할 개념이 문서 객체 모델.  
<br>

"**문서 객체 모델 (DOM: document object model)**"  
자바스크립트를 이용하여 웹 문서에 접근하고 제어할 수 있도록 객체를 사용해 웹 문서를 체계적으로 정리하는 방법  
<br>

HTML 언어로 작성한 웹 문서의 DOM을 HTML DOM이라고 하며, XML 문서에서 사용하는 XML DOM도 있음  
DOM은 웹 문서를 하나의 객체로 정의하고, 웹 문서를 이루는 텍스트나 이미지, 표 등의 모든 요소도 각각 객체로 정의  
ex) 웹 문서 전체는 document 객체, 삽입한 이미지는 image 객체  

### DOM 트리
DOM은 웹 문서의 요소를 부모 요소와 자식 요소로 구분  
<br>

**HTML 요소의 계층 관계**  
- html
  - head
    - meta
    - title
  - body
  	- h1
  	- img
<br>

DOM은 문서 안의 요소뿐 아니라 각 요소에 사용한 내용과 속성도 자식으로 나타냄  
**DOM 트리**  
- html
  - head
    - meta
      - charset="..."
    - title
      - DOM tree 알아보기
  - body
  	- h1
    	- Do it!
  	- img
    	- src="..."
    	- alt="..."

이렇게 부모와 자식 구조로 표시하면 마치 나무 형태가 되므로 **DOM 트리**라고 함  
가지가 갈라져 나간 항목을 노드(node)라고 하며, 시작 부분인 html 노드를 루트(root) 노드라고 함  
<br>

**DOM을 구성하는 기본 원칙**  
> 1. 모든 HTML 태그는 요소(element) 노드입니다.
> 2. HTML 태그에서 사용하는 텍스트 내용은 자식 노드인 텍스트(text) 노드입니다.
> 3. HTML 태그에 있는 속성은 자식 노드인 속성(attribute) 노드입니다.
> 4. 주석은 주석(comment) 노드입니다.
<br>

DOM 트리를 노드의 종류대로 구분해서 다시 그리면,
**DOM 트리와 노드 종류**  
- [root element] html
  - [element] head
    - [element] meta
      - [attribute] charset="..."
    - [element] title
      - [text] DOM tree 알아보기
  - [attribute] lang="ko"
  - [element] body
  	- [element] h1
    	- [text] Do it!
  	- [element] img
    	- [attribute] src="..."
    	- [attribute] alt="..."
<br>

## 17-2 DOM 요소에 접근하고 속성 가져오기
### DOM에 접근하기
HTML 요소란 `<img>` 태그를 사용한 이미지나 `<p>` 태그를 사용한 텍스트 등 HTML 태그로 웹 문서에 삽입한 모든 대상을 가리킴  
<br>

**id 선택자로 접근하는 getElementById() 메서드**  
HTML 태그의 id 속성은 HTML 요소가 문서 안에서 중복되지 않도록 사용하는 CSS 선택자  
다음 메서드를 이용하면 특정한 id가 포함된 DOM 요소에 접근할 수 있음  
> 기본형 `요소명.getElementById("id명")`  

<br>

**class 값으로 접근하는 getElementsByClassName() 메서드**  
`getElementsByClassName()` 메서드는 지정한 class 선택자 이름이 들어 있는 DOM 요소에 접근  
> 기본형 `요소명.getElementsByClassName("class명")`  

class 선택자는 웹 문서 내 여러 요소에서 사용할 수 있으므로 반환 요소가 2개 이상일 수 있음  
이 요소들은 HTMLCollection 객체로 저장되는데, 배열과 비슷하고 배열처럼 사용할 수 있지만 배열은 아님  
<Br>

**태그 이름으로 접근하는 getElementsByTagName() 메서드**  
class나 id를 지정하지 않은 DOM 요소에 접근하려면 태그를 이용  
> 기본형 `요소명.getElementsByTagName("tag명")`  

반환 요소가 2개 이상일 수 있고, 반환 요소들은 HTMLCollection 형태로 저장  
<br>

**다양한 방법으로 접근하는 querySelector(), querySelectorAll() 메서드**  
앞에서 살펴본 메서드의 반환값은 HTMLCollection 객체이고, 여기에는 HTML 요소만 저장됨  
DOM 트리의 텍스트, 속성 노드까지 자유롭게 제어하려면 이 두 메서드를 사용해야 함  
반환값이 하나라면 `querySelector()`, 여러 값이 한꺼번에 반환될 경우에는 `querySelectorAll()` 메서드를 사용  
> 기본형 `노드.querySelector(선택자)`  
> 기본형 `노드.querySelectorAll(선택자 또는 태그)`  

이 메서드에서 선택자를 표시할 때 id 이름 앞에는 해시기호(#)를 붙이고, class 이름 앞에는 마침표(.)를 붙임  
태그는 기호 없이 태그명만 쓰면 됨  
두 메서드의 반환값은 노드이거나 노드 리스트(노드를 한꺼번에 여러 개 저장한 것))  

### 웹 요소의 내용을 수정하는 innerText, innerHTML 프로퍼티
자바스크립트에서는 웹 요소의 내용도 수정할 수 있음  
innerText 프로퍼티는 텍스트 내용을 표시, innerHTML 프로퍼티는 HTML 태그까지 반영하여 표시  
> 기본형 `요소명.innerText = 내용`  
> 기본형 `요소명.innerHTML = 내용`  

### 속성을 가져오거나 수정하는 getAttribute(), setAttribute() 메서드
웹 요소를 문서에 삽입할 때 태그 속성을 함께 사용하면 DOM 트리에 속성 노드가 추가되면서 속성값이 저장됨  
이때 속성에 접근하려면 `getAttribute()` 메서드를,  
접근한 속성의 값을 바꾸려면 `setAttribute()` 메서드에서 속성명을 지정  
> 기본형 `getAttribute("속성명")`  

`setAttribute()` 메서드를 사용하면 원하는 속성값으로 지정할 수 있음  
속성값이 이미 있다면 새로운 속성값으로 수정하고, 아직 해당 속성이 없다면 속성과 속성값을 새로 추가함  
> 기본형 `setAttribute("속성명", "값")`  

## 17-3 DOM에서 이벤트 처리하기
### DOM 요소에 함수 직접 연결하기
이벤트 처리기 함수가 간단하다면 DOM 요소에 직접 연결할 수 있음  
> ex) 이미지를 클릭하면 알림 창 표시하기
> ```js
> <img src="images/cup-1.png" id="cup">
> <script>
> 	var cup = document.querySelector("#cup"); // id=cup 요소
> 	cup.onclick = function() {
> 		alert("이미지를 클릭했습니다");
> 	}
> </script>
> ```

### 함수 이름을 사용해 연결하기
이벤트가 발생했을 때 실행할 함수를 따로 정의해놓았다면 함수 이름을 사용해 연결할 수 있음  
> ex) 이미지를 클릭하면 함수 실행하기
> ```js
> <img src="images/cup-1.png" id="cup">
> <script>
> 	var cup = document.querySelector("#cup"); // id=cup 요소
> 	cup.onclick = changePic;
> 	function changePic() {
> 		cup.src = "images/cup-2.png";
> 	}
> </script>
> ```

### DOM의 event 객체 알아보기
DOM에는 이벤트 정보를 저장하는 event 객체가 있음  
이 객체에는 웹 문서에서 이벤트가 발생한 요소가 무엇인지, 어떤 이벤트가 발생했는지 등의 정보가 들어 있음  
> ex) 이미지에서 클릭한 위치 알아내기
> ```js
> <img src="images/cup-1.png" id="cup">
> <script>
> 	var cup = document.querySelector("#cup"); // id=cup 요소
> 	cup.onclick = function(event) {
> 		alert("이벤트 유형: " + event.type + ", 이벤트 발생 위치: " + event.pageX + "," + event.pageY);
> 	}
> </script>
> ```

event 객체에는 이벤트 정보만 들어 있음  
이벤트가 발생한 대상에 접근하려면 이벤트 처리기에서 예약어 this를 사용해야 함  
> ex) this 예약어 사용하기
> ```js
> <img src="images/card.png" id="card">
> <script>
> 	var card = document.querySelector("#card"); // id=card 요소
> 	card.onclick = function(event) {
> 		alert("클릭한 이미지 파일 : " + this.src);
> 	}
> </script>
> ```

### addEventListener() 메서드 사용하기
이 메서드와 event 객체를 사용하면 한 요소에 여러 이벤트 처리기를 연결해 실행할 수 있음  
addEventListener() 메서드는 끝에 세미콜론(;)을 꼭 붙여야 함  
> 기본형 `요소.addEventListener(이벤트, 함수, 캡처 여부);`  
> - 이벤트 : 이벤트 유형을 지정  click과 keypress처럼 on을 붙이지 않고 씀  
> - 함수 : 이벤트가 발생하면 실행할 명령이나 함수를 지정. 함수를 정의할 때는 event 객체를 인수로 받음  
> - 캡처 여부 : 이벤트를 캡처하는지 여부를 지정하며 기본값은 false이고 true/false 중 선택. true이면 캡처링, false이면 버블링. 이벤트 캡처링은 DOM의 부모 노드에서 자식 노드로 전달되는 것이고 이벤트 버블링은 DOM의 자식 노드에서 부모 노드로 전달되는 것  

> ex) 마우스 포인터를 올리면 이미지 바꾸기 + 메서드 안에서 함수 선언하기  
> ```js
> <img src="images/easys-1.jpg" id="cover">
> <script>
> 	var cover = document.getElementById("cover");
> 	cover.addEventListener("mouseover", function() {
> 		cover.src = "images/easys-2.jpg";
> 	});
> 	cover.addEventListener("mouseout", function() {
> 		cover.src = "images/easys-1.jpg";
> 	});
> </script>
> ```

### CSS 속성에 접근하기
자바스크립트를 이용하면 스타일 속성값을 가져와서 그 값을 원하는 대로 수정할 수 있음  
CSS 속성에 접근하려면 해당 스타일이 적용된 HTML 요소 다음에 예약어 style을 쓰고 속성을 적음  
> 기본형 `document.요소명.style.속성명`

> ex) id가 desc인 요소의 글자색 바꾸기  
> ```js
> document.getElementById("desc").style.color = "blue";
> ```

위 예제의 color처럼 한 단어인 속성명은 그대로 사용하면 되지만 background-color, border-radius처럼 중간에 하이픈(-)이 있는 속성은 backgroundColoc나 borderRadius처럼 두 단어를 합쳐서 사용  

> ex) 도형의 테두리와 배경색 바꾸기  
> ```js
> <div id="rect"></div>
> <script>
> 	var myRect = document.querySelector("#rect");
> 	myRect.addEventListener("mouseover", function() {
> 		myRect.style.backgroudColor = "green";
> 		myRect.style.borderRadius = "50%";
> 	});
> 	myRect.addEventListener("mouseout", function () {
> 		myRect.style.backgroudColor = "";
> 		myRect.style.borderRadius = "";
> 	});
> </script>
> ```

## 17-4 DOM에서 노드 추가/삭제하기
### 노드 리스트란
DOM에서 새로운 노드를 만들어 추가하거나 삭제하려면 노드 리스트(node list)를 사용해야 함  
노드 리스트란 무엇일까?  
DOM에 접근할 때 `querySelectorAll()` 메서드를 사용하면 노드를 한꺼번에 여러 개 가져올 수 있음  
이때 노드 정보를 여러 개 저장한 것이 노드 리스트이며, 배열과 비슷하게 동작  
> `document.querySelectorAll("li")[1]`  

: `li` 노드 리스트 중에서 두 번째 노드를 가져올 수 있음  

**새로운 노드 추가 과정**  
DOM 트리를 구성하는 기본 원칙을 다시 살펴보면,  
> 1. 모든 HTML 태그는 요소(element) 노드입니다.
> 2. HTML 태그에서 사용하는 텍스트 내용은 자식 노드인 텍스트(text) 노드입니다.
> 3. HTML 태그에 있는 속성은 자식 노드인 속성(attribute) 노드입니다.
> 4. 주석은 주석(comment) 노드입니다.
이 원칙에 따라 특정 태그를 노드로 추가한다면 단순히 태그에 해당하는 요소 노드뿐만 아니라 텍스트 노드와 속성 노드도 추가해야 함  
예를 들어 `<img>` 태그를 요소로 추가한다면 요소 노드와 속성에 해당하는 `src`, `alt` 등의 사용하는 속성 노드도 추가됨  

### 텍스트 노드를 사용하는 새로운 요소 추가하기
[더 보기] 링크를 클릭하면 그 아래에 간단한 텍스트가 표시되는 스크립트 소스를 작성해보자.  
문서에는 단순히 `<p>` 태그 하나가 추가되어 보이지만 DOM에서는 여러 단계가 필요하다는 것을 알 수 있음  
<br>

1. 요소 노드 만들기 - createElement() 메서드  
   DOM에 새로운 요소를 추가할 때 가장 먼저 할 일은 요소 노드를 만드는 것  
   기본형 `document.createElement(노드명)`  
2. 텍스트 노드 만들기 - createTextNode() 메서드  
   새로운 요소 노드를 만들었다면 그다음은 내용을 담는 텍스트 노드를 자식 노드로 만들어 연결해야 함  
   기본형 `document.createTextNode(텍스트);`  
3. 자식 노드 연결하기 - appendChild() 메서드  
   아직 노드를 만든 상태이며 부모-자식 노드로 연결되지 않음  
   appendChild() 메서드를 사용해서 연결하는 노드는 자식 노드 중 맨 끝에 추가됨  
   기본형 `부모노드.appenChild(자식노드)`  
4. 전체 소스 코드 완성하기  
   `addp(); this.onclick='';` : addP() 함수가 한 번만 실행되도록 하기 위해  
   > 링크를 클릭하면 텍스트 표시하기
   > ```js
   > <div>
   > 	<h1>DOM을 공부합시다</h1>
   >	<a href="#" onclick="addP(); this.onclick='';">더 보기</a>
   >	<div id="info"></div>
   > </div>
   > <script>
   > 	function addP() {
   > 		var newP = document.createElement("p");
   > 		var txtNode = document.createTextNode("DOM은 document object model의 줄임말입니다.");
   > 		newP.appendChild(txtNode);
   > 		document.getElementById("info").appendChild(newP);
   > 	}
   > </script>
   > ```

### 속성값이 있는 새로운 요소 추가하기
앞의 예제 + 텍스트와 이미지까지 표시되는 스크립트 소스를 추가로 작성해보자.
<br>

1. 요소 노드 만들기 - createElement() 메서드
   텍스트 노드를 추가했던 방법과 마찬가지로 새로운 이미지 노드 만들기  
   `var newImg = document.createElement("img");`
2. 속성 노드 만들기 - createAttribute() 메서드
   img 요소는 src 속성을 사용해서 이미지 파일의 경로를 지정해야 브라우저에 이미지를 보여줄 수 있음  
   `document.createAttribute(속성명)`
3. 속성 노드 연결하기 - setAttributeNode() 메서드  
   속성 노드는 요소 노드의 자식으로 연결해야 함  
   `요소명.setAttributeNode(속성노드)`  
   만약 추가할 속성이 요소 노드에 이미 들어 있다면 기존 속성 노드를 새 속성 노드로 대체함  
4. 자식 노드 연결하기 - appendChild() 메서드
   속성 노드까지 연결했지만 아직 img 요소는 만들어 놓기만 한 상태  
   img 요소를 화면에 표시하려면 웹 문서의 DOM에 추가해야 함  
   `document.getElementById("info").appendChild(newImg);`
5. 전체 소스 코드 완성하기
   > 링크를 클릭하면 텍스트와 이미지 표시하기
   > ```js
   > <div id="container">
   > 	<h1>DOM을 공부합시다</h1>
   >	<a href="#" onclick="addP(); this.onclick='';">더 보기</a>
   >	<div id="info"></div>
   > </div>
   > <script>
   > 	function addContents() {
   > 		var newP = document.createElement("p");
   > 		var txtNode = document.createTextNode("DOM은 document object model의 줄임말입니다.");
   > 		newP.appendChild(txtNode);
   >
   > 		var newImg = document.createElement("img");
   > 		var srcNode = document.createAttribute("src");
   > 		var altNode = document.createAttribute("alt");
   > 		srcNode.value = "images/dom.jpg";
   > 		altNode.value = "돔 트리 예제 이미지";
   > 		newImg.setAttributeNode(srcNode);
   > 		newImg.setAttributeNode(altNode);
   > 
   > 		document.getElementById("info").appendChild(newP);
   > 		document.getElementById("info").appendChild(newImg);
   > 	}
   > </script>
   > ```
<Br>

> **마지막에 입력한 값을 맨 위에 나타내는 방법**
> appendChild() 메서드를 이용하면 새로운 노드를 부모 노드의 맨 끝에 추가  
> 이 순서를 바꿔서 표시하려면 부모 노드와 자식 노드의 관계를 파악한 후 마지막 자식 노드를 맨 앞에 추가하면 됨  
> itemList의 자식 노드 중에서 맨 앞의 자식 노드는 itemList.childNodes[0]으로 접근할 수 있음  
> `itemList.appendChild(newItem);`
> -> `itemList.insertBefore(newItem, itemList.childNodes[0]);`

### 노드 삭제하기
노드를 삭제할 때 기억해 둘 것은 부모 노드에서 자식 노드를 삭제해야 한다는 것  
즉, 삭제해야 할 노드가 있다면 반드시 부모 노드 먼저 찾아야 함  
그래서 노드를 삭제하는 메서드 외에 부모 노드를 찾는 프로퍼티가 필요  
<br>

**parentNode 프로퍼티**  
DOM 트리의 노드는 바로 삭제할 수 없으므로 먼저 부모 노드에 접근해야 함  
parentNode 프로퍼티는 현재 노드의 부모 노드에 접근해서 부모 노드의 요소 노드를 반환  
기본형 `노드.parentNode`  
*자식 노드를 알고 싶다면 childNode 프로퍼티를 사용*  
<Br>

**removeChild() 메서드**  
자식 노드를 삭제하는 역할을 하는 메서드  
기본형 `부모노드.removeChild(자식노드)`
