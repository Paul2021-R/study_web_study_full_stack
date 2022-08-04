## 5-1 폼 삽입하기

### 웹에서 만나는 폼

폼 : 사용자가 웹 사이트로 정보를 보낼 수 있는 요소 ex. 로그인 버튼, 회원 가입 등

로그인 폼의 동작 과정

1. 사용자가 아이디/비번 입력 후 [로그인] 버튼 클릭
2. 입력한 정보 웹 서버로 전송됨
3. 서버가 정보를 받아 데이터베이스에서 입력받은 정보가 일치하는 지 확인함
4. 결과 웹 브라우저에 전송

폼과 관련한 작업은 정보를 저장하거나 검색, 수정하는 것이 대부분. 이는 모두 데이터베이스를 기반으로 작동함. 따라서 텍스트 박스나 버튼 같은 폼 형태는 HTML 태그로 만들지만, 폼에 입력한 사용자 정보는 서버 프로그래밍을 이용해 처리.

### `<form>` 태그

기본형

```html
<form [속성="속성값"]>여러 폼 요소</form>
```

<form> 태그의 속성이 지정하는 것

- 입력 받은 자료를 서버로 넘기는 방법
- 서버에서 자료를 처리할 때 사용할 프로그램

<form> 태그의 속성

| 종류 | 설명 |
| --- | --- |
| method | 입력 받은 자료를 서버 쪽 프로그램으로 넘기는 방법 지정. 사용할 수 있는 속성 값은 get과 post 임.
| get | 데이터를  256byte ~ 4,096byte까지만 넘길 수 있음. 주소 표시줄에 사용자가 입력한 내용이 그대로 드러남.
| post | 입력한 내용의 길이에 제한받지 않고 사용자가 입력한 내용도 드러나지 않음. |
| name | 자바스크립트로 폼을 제어할 때 사용할 폼의 이름을 지정함 |
| action | <form> 태그 안의 내용을 처리해 줄 서버 프로그램 지정 |
| target | action 속성에서 지정한 스크립트 파일을 현재 창이 아닌 다른 위치에서 열도록 함 |
| autocomplete | 자동 완성 기능. 예전에 입력한 내용을 자동으로 표시함. 기본 속성 값은 “on”. 매우 중요한 정보나 일회성 정보 입력 “off”로 지정하는 것이 좋음. |

```html
<!-- 입력한 정보 서버로 전송시 서버에 있는 register.php 실행시키겠다고 선언하기-->
<form action="register.php"><!--폼 요소--></form>
```

### `<fieldset>`, `<legend>`태그로 폼 요소를 그룹으로 묶기

하나의 폼 안에서 여러 구역을 나누어 표시할 때 `<fieldset>` 태그를 사용.

기본형

```html
<fieldset [속성="속성값"> </fieldset>
```

`<legend>` 태그는 `<fieldset>` 태그로 묶은 그룹에 제목을 붙일 수 있음

기본형

```html
<fieldset>
	<legend>그룹 이름</legend>
</fieldset>
```

예시

```html
<form action="">
    <fieldset>
      <legend>상품 선택</legend>
    </fieldset>
    <fieldset>
      <legend>배송 정보</legend>
    </fieldset>      
</form>
```

![큰 글씨로 레드향 주문하기가 쓰여있고, 아래에 상품 정보와 배송 정보 폼이 수직으로 나열되어있다.](https://user-images.githubusercontent.com/91731260/182740894-c6b77421-3111-413f-b4b7-1b757ce7edb7.png)

### `<label>`태그 사용해 폼 요소에 레이블 붙이기

`<label>` 태그는 폼 요소에 레이블을 붙일 때 사용함. 

<aside>
💡 Q. 그렇다면 레이블은 무엇인가요?

A. 레이블이란 입력란 가까이에 아이디나 비밀번호처럼 붙여놓은 텍스트를 말합니다. `<lable>` 태그를 사용하면 폼 요소와 레이블 텍스트가 서로 연결되었다는 것을 웹 브라우저가 쉽게 알 수 있습니다.

</aside>

`<label>` 태그의 사용 방법

1. 태그 안에 폼 요소 넣기
    
    ```html
    <label>레이블 명<input></label>
    <!-- ex.
    	<label>아이디(6자 이상)<input type="text"></label>
    -->
    ```
    
2. `<label>` 태그와 폼 요소 따로 사용하고 `<label>` 태그의 `for` 속성과 폼 요소의 `id` 속성을 이용해 서로 연결하기 (= 폼 요소의 id 속성값을 `<label>` 태그의 `for` 속성에게 알려 주기)
    
    ```html
    <label for="id명">레이블 명<input id="id명"></label>
    ```
    
    예시
    
    ```html
    <label for="user-id">아이디(6자 이상)</label>
    <input type="text" id="user-id">
    ```
    
    ![image](https://user-images.githubusercontent.com/91731260/182741309-037e0981-e0cd-4565-8ed8-c588fb942010.png)
    

전자보다 후자가 더 복잡해 보이지만 `<label>` 태그를 사용한 레이블과 사용자 정보를 입력받는 `<input>` 태그가 떨어져 있더라도 둘 사이를 쉽게 연결할 수 있다는 장점이 있음.

## 5-2 사용자 입력을 위한 `input` 태그

아이디나 검색 상자나 로그인 버튼 등 사용자가 입력할 부분은 주로 `<input>` 태그를 사용함. 이를 사용해 넣을 수 있는 다양한 요소 사용 구별 법과 요소의 특성

### `<input>` 태그의 type 속성의 속성 값들

`<input>` 태그는 매우 다양한 입력 형태로 만들 수 있음. 입력 형태를 지정할 때 `type` 속성을 사용하면 됨.

### 텍스트와 비밀번호 나타내는 `type="text"` 와 `type="password"`

`텍스트 필드` : 폼에서 가장 많이 사용하는 요소. 주로 아이디나 이름, 주소 등 한 줄 짜리 일반 텍스트 입력 시 사용.

`비밀번호 필드` : 입력하는 내용을 화면에 보여주지 않기 위해 `*`나 `●`로 표시. 이 외에 텍스트 필드와 똑같이 작동하고 같은 속성 사용.

기본형

```html
<input type="text">
<input type="password">
```

주요 속성

예제

```html
<form>
    <fieldset>
    	<label>아이디: <input type="text" id="user_id" size="10"></label>
      <label>비밀번호: <input type="password" id="user_pw" size="10"></label>
      <input type="submit" value="로그인">
    </fieldset>
  </form>
```

![image](https://user-images.githubusercontent.com/91731260/182741483-b8cbf833-06aa-4c41-9c43-938c47af77dd.png)

### 다양한 용도에 맞게 입력하는 `type="search"`, `type=”url”`, `type=”email”`, `type=”tel”`

폼을 만들다 보면 텍스트 필드를 더 세분해야 할 때가 있음. 그래서 HTML5에서는 용도에 맞게 입력할 수 잇는 텍스트 필드를 다양하게 제공함.

`type="search"` : 검색을 위한 텍스트 필드. 사용자에게는 텍스트 필드와 같게 보이지만, 웹 브라우저에서는 검색을 위한 텍스트 필드로 인식함. 모바일 기기의 웹 브라우저에서는 검색어를 입력하면 오른쪽에 x표시되어 입력한 검색어 손쉽게 지울 수 있음.

`type="url"` : 웹 주소를 입력하는 필드.

`type="email"` : 이메일 주소를 입력하는 필드.

기존에는 값이 무엇인지 자바스크립트를 이용해서 직접 확인해야 했음. 그러나 HTML5에서는 특정 필드로 지정하기만 하면 웹 브라우저가 알아서 확인함. 입력값이 지정한 형식에 맞지 않을 경우 웹 브라우저에서 오류 메세지를 보여줌.

`type="tel"` : 전화번호를 나타내는 필드. 사용자가 입력한 값이 전화번호인지 아닌지 체크할 수 있음. 모바일 페이지에서는 이 값을 이용하여 바로 전화를 걸 수 있음.

텍스트 필드에서 세분화된 필드는 PC용 웹 브라우저에서는 큰 변화가 없는 것처럼 보이나, 모바일 기기의 웹 브라우저에서는 가상 키보드 배열이 바뀌는 것을 알 수 있음.

예제

```html
<h1>레드향 주문하기</h1>
<form action="">
  <fieldset>
    <legend>상품 선택</legend>
   
  </fieldset>
  <fieldset>
    <legend>배송 정보</legend>
    <ul id="shipping">
      <li>
        <label for="user-name">이름 </label>
        <input type="text" id="user-name">
      </li>
      <li>
        <label for="addr">배송 주소</label>
        <input type="text" id="addr">
      </li>
      <li>
        <label for="mail">이메일</label>
        <input type="email" id="mail">
      </li>        
      <li>
        <label for="phone">연락처</label>
        <input type="tel" id="phone">
      </li>
    </ul>  
  </fieldset> 
</form>
```

![image](https://user-images.githubusercontent.com/91731260/182741548-ad2c4709-70cc-4692-91a9-4d76b642d0a4.png)

### 체크박스와 라디오 버튼을 나타내는 `type="checkbox"`, `type="radio"`

두 폼 요소 모두 여러 항목 중 원하는 항목을 선택할 때 사용하는 폼 요소. 한 개만 선택하게 하기 위해서는 라디오 버튼을 사용하고, 두 개 이상 선택하려면 체크 박스를 사용할 것. 라디오 버튼 항목은 1개만 선택할 수 있으므로, 이미 선택한 항목이 있을 경우 다른 항목을 선택하면 기존의 항목은 체크가 해제됨.

기본형

```html
<input type="checkbox">
<input type="radio">
```

체크박스와 라디오 버튼에서 사용할 수 있는 속성

예제

```html
<h1>레드향 주문하기</h1>
<form>
  <fieldset>
    <legend>상품 선택</legend>
    <p><b>주문할 상품을 선택해 주세요.</b></p>
    <ul>
      <li>
        <label><input type="checkbox" value="s_3">선물용 3kg</label>
        <input type="number">개
      </li>
      <li>
        <label><input type="checkbox" value="s_5">선물용 5kg</label>
        <input type="number">개
      </li>
      <li>
        <label><input type="checkbox" value="f_3">가정용 3kg</label>
        <input type="number">개
      </li>
      <li>
        <label><input type="checkbox" value="f_5">가정용 5kg</label>
        <input type="number">개
      </li>
    </ul>   
    <p><b>포장 선택</b></p>
    <ul>
      <li><label><input type="radio" name="gift" value="yes" >선물 포장</label></li>
      <li><label><input type="radio" name="gift" value="no">선물 포장 안 함</label></li>
    </ul>     
  </fieldset>
  <fieldset>
    <legend>배송 정보</legend>
    <ul>
      <li>
        <label for="user-name">이름 </label>
        <input type="text" id="user-name">
      </li>
      <li>
        <label for="addr">배송 주소</label>
        <input type="text" id="addr">
      </li>
      <li>
        <label for="mail">메일 주소</label>
        <input type="email" id="mail">
      </li>        
      <li>
        <label for="phone">연락처</label>
        <input type="tel" id="phone">
      </li>
    </ul>  
  </fieldset>      
</form>
```

![image](https://user-images.githubusercontent.com/91731260/182741606-3d9d5518-f2e6-4683-804a-b47395b6fe06.png)

<aside>

💡 <b>라디오 버튼과 `name` 속성</b>

HTML 소스 코드를 보면 라디오 버튼에 `name` 속성이 포함된 것을 볼 수 있는데, 이것은 웹 프로그래밍에서 폼 요소를 제어할 때 자주 사용한다. 라디오 버튼에서 하나의 버튼만 선택할 수 있게 하려면 모든 라디오 버튼의 `name` 값을 똑같이 지정해야 한다.

</aside>

예제

![image](https://user-images.githubusercontent.com/91731260/182741661-baff3fe1-1bbe-4180-8731-ba5eee0b5132.png)

```html
<div id="container">
    <h1>회원 가입을 환영합니다</h1>
    <form>
      <fieldset>
        <legend>사용자 정보</legend>
        <ul>
          <li>
            <label for="uid">아이디</label>
            <input type="text"  id="uid">
          </li>
          <li>
            <label for="umail">이메일</label>
            <input type="email" id="umail">
          </li>
          <li>
            <label for="pwd1">비밀번호</label>
            <input type="password" id="pwd1">
          </li>
          <li>
            <label for="pwd2">비밀번호 확인</label>
            <input type="password" id="pwd2">
          </li>
        </ul>
      </fieldset>
      <fieldset>
        <legend>이벤트와 새로운 소식</legend>
        <input type="radio" name="mailing" id="mailing_y">
        <label for="mailing_y">메일 수신</label>
        <input type="radio" name="mailing" id="mailing_n" checked>
        <label for="mailing_n">메일 수신 안 함</label>
      </fieldset>
      <div id="buttons">
        <input type="submit" value="가입하기">
        <input type="reset" value="취소">
      </div>
    </form>
    
  </div>
```

### 숫자 입력 필드를 나타내는 `type="number"`, `type=”range"`

텍스트 필드에서 사용자가 숫자를 직접 입력할 수도 있지만, `type="number"` 사용하면 스핀 박스가 나타나며 숫자를 선택할 수 있다. 또한 `type="range"` 는 슬라이드 막대를 움직여 숫자를 입력할 수 있다.

기본형

```html
<input type="number">
<input type="range">
```

`type=”number"`, `type="range"` 필드에서 사용할 수 잇는 속성.

예제

```html
<ul>
  <li>
    <label><input type="checkbox" value="s_3">선물용 3kg</label>
    <input type="number" min="0" max="5">개 (최대 5개)
  </li>
  <li>
    <label><input type="checkbox" value="s_5">선물용 5kg</label>
    <input type="number" min="0" max="3" value="1">개 (최대 3개)
  </li>
</ul>
<ul>
  <li>
    <label><input type="checkbox" value="f_3">가정용 3kg</label>
    <input type="range" min="0" max="5">개 (최대 5개)
  </li>
  <li>
    <label><input type="checkbox" value="f_5">가정용 5kg</label>
    <input type="range" min="0" max="3" value="1">개 (최대 3개)
  </li>
</ul>
```

![image](https://user-images.githubusercontent.com/91731260/182741719-14b98956-16f4-41d7-a7d8-a13e37a283f6.png)

### 날짜 입력 나타내는 `type="date"`, `type="month"`, `type="week"`

웹 문서나 애플리케이션에 달력을 넣기 위해  `type="date"`, `type="month"`, `type="week"` 같은 날짜 관련 유형을 이용한다.

```html
<input type="date | month | week">
```
<br>
<aside>
💡 파이프 기호는 W3C 표준 규약에서 사용하는 방식으로 ‘나열한 옵션 중 하나가 속성 값이 되어야 한다’는 의미이다.
</aside>
<br>
예제

```html
<h1>날짜 지정하기</h1>
<input type="date">
<input type="month">
<input type="week">
<!--순서대로 yyyy-mm-dd / yyyy-mm / 1월 첫째 주 기준 몇 번째 주 형식으로 표시-->
```

![image](https://user-images.githubusercontent.com/91731260/182744786-363c7e5f-917a-480b-b7ec-e46c27fd3c38.png)

### 시간 입력을 나타내는 `type=”time”`, `type=”datetime”`, `type=”datetime-local”`
<br>

시간을 지정할 때는 `type="time"`을 사용, 날짜와 시간을 함께 지정 위해서는  `type=”datetime”`이나 `type=”datetime-local”` 사용

<br>
기본형

```html
<input type="time | datetime | datetime-local">
<!--순서대로 오전/오후, 시, 분 | 날짜와 시간 | 지역 날짜와 시간 입력 가능-->
```

<br>

예제

```html
<h1>시간 지정하기</h1>
<input type="time">
<input type="datetime-local">
```

![image](https://user-images.githubusercontent.com/91731260/182767612-c152596e-72c7-4b58-8daa-fda27bc9eee2.png)


<aside>
💡 <b>날짜나 시간의 범위 제한하기</b>

날짜나 시간과 관련된 유형을 지정할 때는 아래 표의 속성을 사용할 수 있다. 예를 들 어 날짜의 범위를 제한하고, 초기 화면에 표시될 날짜도 지정할 수 있다.

</aside>

### 전송, 리셋 버튼을 나타내는 `type="submit"`, `type="reset"`

전송 버튼을 나타내는 `submit`은 폼에 입력한 정보를 서버로 전송한다. `submit` 버튼으로 전송된 정보는 `<form>` 태그의 `action` 속성에서 지정한 폼 처리 프로그램에 넘겨진다. 

`reset` 버튼은 `<input>` 요소에 입력된 모든 정보를 재설정해서 사용자가 입력한 내용을 모두 지우는 역할을 함. 이때 두 타입 모두 `value` 속성을 사용해서 버튼에 표시할 내용을 지정한다.

기본형

```html
<input type="submit | reset" value="버튼에 표시할 내용">
```

예제

```html
<div>
  <input type="submit" value="주문하기">
  <input type="reset" value="취소하기">
</div>
```

![image](https://user-images.githubusercontent.com/91731260/182767744-6808692b-b411-4cdf-a711-9f22794548a5.png)

![image](https://user-images.githubusercontent.com/91731260/182767777-befa220e-a16f-452e-a329-d306c9a6d63c.png)

취소하기를 누르면 취소된다.

### 이미지 버튼을 나타내는 `type=”image”`

`type=”image”`는 `submit` 버튼과 같은 기능을 하는 이미지 버튼을 나타낸다.

기본형

```html
<input type="image" src="이미지 경로" alt="대체 텍스트">
```

예제

```html
<form>
  <fieldset>
  	<label>아이디: <input type="text" id="user_id" size="10"></label>
    <label>비밀번호: <input type="password" id="user_pw" size="10"></label>
    <input type="image" src="images/login.png" alt="로그인">
  </fieldset>
</form>
```

![image](https://user-images.githubusercontent.com/91731260/182767940-7696abc7-1196-4df8-b2e1-b84f059e63cb.png)

로그인 버튼이 이미지이다.

### 기본 버튼을 나타내는 `type="button"`

`type="button"`은 `submit`이나 `reset` 버튼과 같은 기능이 없고 오직 버튼 형태만 삽입한다.주로 버튼을 클릭해 자바스크립트를 실행할 때 사용한다. `value` 속성을 사용해 버튼에 표시할 내용을 지정한다.

기본형

```html
<input type="button" value="버튼에 표시할 내용">
```

### 파일을 첨부할 때 사용하는 `type="file"`

폼에서 파일을 첨부해야 하는 경우, `type="file"`으로 지정 시 폼에 파일 첨부가 가능해진다. 이것을 사용하면 웹 브라우저 화면에 [파일 선택]이나 [찾아보기] 버튼 등이 표시되는데, 이 버튼을 클릭하고 파일을 선택하면 파일이 첨부된다.

기본형

```html
<input type="file">
```

예제

```html
<h1>레드향 주문하기</h1>
<form>
  <fieldset>
    <legend>반품 정보</legend>
    <p>만일 수령한 상품에 문제가 있다면 즉시 <b>반품 신청</b>해 주세요.</p>
    <p>반품 신청시 상품의 상태를 사진으로 첨부해 주세요.</p>
    <hr>
    <input type="file">    
  </fieldset>
  <div>
    <input type="submit" value="반품 신청"> 
    <input type="reset" value="취소하기">
  </div>        
</form>
```

![image](https://user-images.githubusercontent.com/91731260/182767997-a7800860-649e-4f33-876d-176f09f0bf26.png)

파일 선택 버튼이 추가되었다.

### 히든 필드 만들 때 사용하는 `type="hidden"`

히든 필드는 화면의 폼에는 보이지 않지만 사용자가 입력을 마치면 폼과 함께 서버로 전송되는 요소이다. 사용자에게 굳이 보여 줄 필요는 없지만 관리자가 알아야 하는 정보는 히든 필드로 입력한다.

기본형

```html
<input type="hidden" name="이름" value="서버로 넘길 값">
```

예제

```html
<form>
  <fieldset>
    <input type="hidden" name="url" id="url" value="사이트를 통한 직접 로그인">
  	<label>아이디: <input type="text" id="user_id" size="10"></label>
    <label>비밀번호: <input type="password" id="user_pw" size="10"></label>
    <input type="submit" value="로그인">
  </fieldset>
</form>
```

![image](https://user-images.githubusercontent.com/91731260/182768076-f9e6763c-3091-48e9-8349-22e321e5d9ed.png)

타입을 hidden으로 지정한 input 태그는 화면에 보이지 않는다.

## `<input>` 태그의 주요 속성

### 자동으로 입력 커서를 갖다 놓는 `autofocus`속성

`autofocus` 속성을 사용하면 페이지를 불러오자마자 폼에서 원하는 요소에 마우스 포인터를 표시할 수 있다. 

기본형

```html
<input type=" <!--텍스트-입력-필드--> " autofocus required>
```

<aside>
💡 `autofocus` 속성은 웹 문서를 열면 텍스트 필드에 바로 입력할 수 있도록 만들어준다.

</aside>

### 힌트를 표시해 주는 `placeholder` 속성

사용자가 텍스트를 입력할 때 입력란에 적당한 힌트 내용을 표시해서 그 필드를 클릭하면 내용이 사라지도록 한다. 

예제

```html
<label for="phone">연락처</label>
<input type="tel" id="phone" placeholder="하이픈 빼고 입력해 주세요.(01012345678)" required>
```

![image](https://user-images.githubusercontent.com/91731260/182768159-b2898373-1669-4c6e-86fb-83a9ea1cb4a4.png)
![image](https://user-images.githubusercontent.com/91731260/182768178-b38d075b-73ea-43ee-9625-4f4398f96105.png)

~~*클릭했을 때 힌트가 사라지는 지는 모르겠지만 자동완성은 뜬다. 사용자가 입력 시 사라진다.*~~

### 읽기 전용 필드를 만들어 주는 `readonly` 속성

`readonly` 속성은 해당 필드를 읽기 전용으로 바꾼다. 텍스트 필드나 텍스트 영역에 내용이 표시되어 있어도 사용자는 그 내용을 볼 수만 있고 입력은 할 수 없게된다. 

`readonly` 속성은 간단히 `readonly`라고만 쓰거나 `readonly="readonly"`, 또는 `readonly="true"`로 지정한다.

기본형

```html
<input type=" <!--텍스트 입력 필드--> " readonly>
```

### 필수 입력 필드를 지정하는 `required` 속성

`submit` 버튼을 클릭하면 폼을 서버로 전송, 이때 필수 필드에 필요한 내용이 모두 채워졌는지 검사해야한다. 이렇게 반드시 입력해야 하는 내용에는 `required` 속성을 지정해 필수 필드로 만들 수 있다. 이 속성을 사용하려면 `required="required"`라고 지정하거나 `required`라고만 해도 된다.

## 5-4 폼에서 사용하는 여러가지 태그

### 여러 줄을 입력하는 텍스트 영역 `<textarea>` 태그

폼에서 텍스트를 여러 줄 입력하는 영역을 만들 수도 있다. 이 영역을 “텍스트 영역”이라고 한다. `<textarea>`태그는 게시판에서 글을 입력하거나 회원 가입 양식에서 사용자 약관을 표시할 때 자주 사용한다.

기본형

```html
<textarea>내용</textarea>
```

`<textarea>`태그에서 너비 크기를 지정하는 `cols` 속성과 화면에 텍스트를 몇 줄 표시할지 지정하는 `rows` 속성을 사용한다. `cols`에서 지정하는글자 수는 영문자를 기준으로 한다. 한글 1글자는 영문자 2글자에 해당.

<aside>
💡 <code>cols</code>에서 지정하는 글자 수는 사용하는 글꼴이나 글자 크기에 따라 달라질 수 있어서 정확하게 크기를 지정할 수 없다. 따라서 대략 그 정도의 크기를 지정하는 것이라고 생각하면 된다.

</aside>

| 종류 | 설명 |
| --- | --- |
| cols | 텍스트 영역의 가로 너비를 문자 단위로 지정한다. |
| rows | 텍스트 영역의 세로 길이를 줄 단위로 지정한다. 지정한 숫자보다 줄 개수보다 많아지면 스크롤 막대가 생긴다. |


### 드롭다운 목록을 만들어 주는 `<select>`, `<option>` 태그

여러 옵션 중에서 선택하게 하려면 드롭다운 목록이나 데이터 목록을 사용한다.

드롭다운 목록은 목록을 클릭했을 때 옵션이 요소 아래쪽으로 펼쳐서 붙인 이름이다. 드롭다운 목록은 `<select>`태그와 `<option>`태그를 이용해 표시한다. `<select>` 태그로 드롭다운 목록의 시작과 끝을 표시하고, 그 안에 `<option>`태그를 사용해 원하는 항목을 추가한다. `<option>` 태그에는 `value`속성을 이용해 서버로 넘겨주는 값을 지정한다.

기본형

```html
<select>
	<option value="값1">내용1</option>
	<option value="값1">내용2</option>
	......
</select>
```

**`<select>`태그의 속성 알아보기**

먼저 `<select>`태그를 사용해 만든 드롭다운 목록은 기본적으로 옵션이 하나만 표시되는데, 옆에 있는 화살표를 클릭해 나머지 나머지 옵션을 살펴본 후 필요한 항목을 선택할 수 있다. 이때 `size` 속성이나 `multiple`속성을 이용하면 드롭다운 목록의 크기나 선택할 항목의 개수를 조절할 수 있다.

`<select>` 태그의 속성

| 종류 | 설명 |
| --- | --- |
| size | 화면에 표시할 드롭다운 항목의 개수를 지정한다. |
| multiple | 드롭다운 목록에서 둘 이상의 항목을 선택할 때 사용한다. |

**`<option>`태그의 속성 알아보기**

드롭다운 목록에 표시되는 옵션은 `<option>`태그를 이용해 지정한다.
<br>

`<option>`태그의 속성

| 종류 | 설명 |
| --- | --- |
| value | 해당 항목을 선택할 때 서버로 넘겨줄 값을 지정. |
| selected | 드롭다운 메뉴를 삽입할 때 기본적으로 선택해서 보여 줄 항목을 지정. |

`<option>`태그 4개를 사용해서 각 항목을 만들고, 항목마다 `value`속성을 사용해서 서버로 넘겨줄 값도 지정한다. 첫 번째 항목이 기본적으로 목록에 보이도록 `selected`속성을 추가한다.

### 데이터 목록 만들어 주는 `<datalist>`, `<option>`태그

데이터 목록을 사용하면 텍스트 필드에 값을 직접 입력하지 않고 미리 만들어 놓은 값 중에서 선택할 수 있다. 데이터 목록을 만들 때는 `<datalist>`태그를 이용해 데이터 목록의 시작과 끝을 표시하고 그 사이에 `<option>` 태그를 사용해 각 데이터의 옵션을 표시함.

이때 `value`속성을 사용해서 서버로 넘겨줄 값을 지정하는데 이 값이 텍스트 필드에도 나타난다. 그리고 데이터 목록을 이용할 텍스트 필드에서 어떤 데이터 목록을 연결할지 `id`값을 지정하면 된다.

기본형

```html
<input type="text" list="데이터 목록 id">
<datalist id="데이터 목록 id">
	<option value="서버로 넘길 값1">선택 옵션1</option>
	<option value="서버로 넘길 값2">선택 옵션2</option>
</datalist>
```

### 버튼을 만들어 주는 `<button>`태그

`<input>` 태그의 필드를 사용하여 버튼을 삽입한 것처럼 `<button>` 태그를 이용하여 폼을 전송하거나 리셋하는 버튼을 삽입할 수 있다.

기본형

```html
<button type="submit">내용</button>
<button type="reset">내용</button>
<button type="button">내용</button>
```

`<button>` 태그의 `type` 속성은 버튼이 활성화되었을 때 어떤 동작을 할 지 지정. `submit`, `reset`, `button` 중에서 선택할 수 있고, 지정하지 않으면 `submit`을 선택한 것으로 간주한다.

`<button>` 태그의 `type` 속성

| 종류 | 설명 |
| --- | --- |
| submit | 폼을 서버로 전송한다. `<input type="submit">`과 같은 기능을 한다. |
| reset | 폼에 입력한 내용을 초기화한다. `<input type=”reset”>`과 같은 기능을 한다. |
| button | 버튼 형태만 만들 뿐 자체 기능은 없다. `<input type=”button”>`과 같은 기능을 한다. |

<aside>
💡 화면 낭독기로 웹 문서를 만날 때 <code>&lt;button&gt;</code> 태그를 만나면 이 부분에 버튼이 있다는 것을 알고 정확이 전달한다.

</aside>