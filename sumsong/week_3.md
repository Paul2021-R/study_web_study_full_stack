# week 3

## 3주차

[**05 입력 양식 작성하기**](https://github.com/Paul2021-R/web\_study\_full\_stack/new/sumsong/sumsong#04-%EC%9B%B9-%EB%AC%B8%EC%84%9C%EC%97%90-%EB%8B%A4%EC%96%91%ED%95%9C-%EB%82%B4%EC%9A%A9-%EC%9E%85%EB%A0%A5%ED%95%98%EA%B8%B0-1)

\


***

\


## 05 입력 양식 작성하기

### 05-1 폼 삽입하기

#### 웹에서 만나는 폼

폼(form)

* 아이디, 비밀번호 입력, 로그인 버튼, 회원가입 등
* 검색 사이트나 쇼핑몰 주문서 화면에서도 폼을 이용한 입력란 사용
* 로그인 폼의 동작 과정
  1. 사용자가 아이디/비밀번호를 입력하고 \[로그인] 버튼 클릭 -> 입력한 정보는 웹 서버로 전송
  2. 서버가 자신이 가진 DB에서 입력받은 아이디/비밀번호가 일치하는지 확인 -> 결과를 웹 브라우저로 전송
* 텍스트 박스나 버튼 같은 폼 형태는 HTML 태그로 만들지만, 폼에 입력한 사용자 정보는 ASP나 PHP, JSP 같은 서버 프로그래밍을 이용해 처리\


#### 폼을 만드는 `<form>` 태그

기본형 `<form [속성="속성값"]>여러 폼 요소</form>`

* `<form>` 태그의 속성
  * method
    * 사용자가 입력한 내용을 서버 쪽 프로그램에 어떻게 넘겨줄 것인지 지정
    * get : 데이터를 256 \~ 4,096 byte까지만 서버로 넘길 수 있음. 주소 표시줄에 사용자 입력값이 그대로 노출되는 보안상 단점
    * post : 입력 내용의 길이 제한 없음, 사용자 입력값도 노출되지 않음
  * name
    * 자바스크립트로 폼을 제어할 때 사용할 폼의 이름 지정
  * action
    * `<form>` 태그 안의 내용을 처리해줄 서버 프로그램 지정
  * target
    * action 속성에서 지정한 스크립트 파일을 현재 창이 아닌 다른 위치에서 열도록 함\


> \[예시]
>
> ```html
> <form action="register.php">
> 	/* 여러 폼 요소 */
> </form>
> ```

**자동 완성 기능을 나타내는 autocomplete 속성**

* 자동완성기능 : 폼에서 내용을 입력할 때 예전에 입력한 내용을 자동으로 표시해주는 것
* 기본 속성값은 "on"
* 개인정보나 인증번호 같은 일회성 정보를 입력할 때는 off로 지정해 기능 꺼두기\


#### 폼 요소를 그룹으로 묶는 `<fieldset>`, `<legend>` 태그

`<fieldset>` : 하나의 폼 안에서 여러 구역을 나누어 표시할 때 사용\
ex) 쇼핑몰 사이트에서 주문서를 작성할 때 개인정보/배송정보를 나누어 표시\
기본형 `<fieldset [속성="속성값"]></fieldset>`\
`<legend>` : `<fieldset>` 태그로 묶은 그룹에 제목을 붙일 수 있음

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

\


#### 폼 요소에 레이블을 붙이는 `<label>` 태그

`<label>` : `<input>` 태그와 같은 폼 요소에 레이블을 붙일 때 사용\
레이블(label) : 입력란 가까이에 아이디나 비밀번호처럼 붙여 놓은 텍스트

1.  태그 안에 폼 요소 넣는 방법

    ```html
    (...생략...)
    <label>아이디(6자 이상)<input type="text"></label>
    (...생략...)
    ```
2.  폼 요소의 id 속성값을 `<label>` 태그의 for 속성에게 알려주는 방법

    ```html
    (...생략...)
    <label for="user-id">아이디(6자 이상)</label>
    <input type="text" id="user-id">
    (...생략...)
    ```

    _복잡해 보이지만 `<label>` 태그 레이블과 `<input>` 태그가 떨어져 있더라도 둘 사이를 연결할 수 있다는 장점_

    \


### 05-2 사용자 입력을 위한 input 태그

#### 웹 폼의 다양한 곳에서 사용하는 `<input>` 태그

\


#### `<input>` 태그의 type 속성 한눈에 살펴보기

`<input>` 태그에서 입력 형태를 지정할 때 type 속성 사용\
\


#### 텍스트와 비밀번호를 나타내는 type="text"와 type="password"

* 텍스트 필드는 폼에서 가장 많이 사용하는 요소
* 비밀번호 필드는 입력하는 내용을 화면에 보여주지 않음 '\*' 등으로 표시
* 텍스트, 비밀번호 필드에서 사용하는 주요 속성
  * size
    * 텍스트와 비밀번호 필드의 길이 지정. 즉 화면에 몇 글자가 보이도록 할 것인지.
    * 최대 입력 글자 수가 10인데 size가 5일 경우 필드 크기는 5개 크기에 맞추고 나머지 5개는 화면에 보이지 않음
  * value
    * 텍스트 필드 요소가 화면에 표시될 때 텍스트 필드 부분에 보여주는 내용
    * 이 속성을 사용하지 않으면 빈 텍스트 필드 표시
  * maxlength
    * 텍스트, 비밀번호 필드에 입력할 수 있는 최대 문자 수 지정\


#### 다양한 용도에 맞게 입력하는 type="search", type="url", type="email", type="tel"

* search : 검색을 위한 텍스트 필드로 인식. 오른쪽에 x가 표시되어 입력한 검색어 지울 수 있음.
* url : 웹 브라우저가 url 주소인지 알아서 확인 후 오류 메시지를 보여줌
* tel : 모바일 페이지에서 이용 시 바로 전화를 걸 수 있음\


#### 체크 박스와 라디오 버튼을 나타내는 type="checkbox", type="radio"

* 여러 항목 중에서 원하는 항목을 선택할 때 사용하는 폼 요소
* 라디오 버튼 : 항목을 1개만 선택
* 체크 박스 : 항목으 여러 개 선택
* 체크 박스, 라디오 버튼에서 사용하는 속성
  * value : 선택한 버튼을 서버에게 알려줄 때 넘겨줄 값 지정, 영문이거나 숫자여야 하고 필수 속성
  * checked : 여러 항복 중 기본으로 선택해 놓고 싶은 항목에 사용, 속성값 따로 없음

**라디오 버튼과 name 속성**

name 속성은 PHP 같은 웹 프로그래밍에서 폼 요소를 제어할 때 자주 사용

```html
<fieldset>
	<p><b>포장 선택</b></p>
	<label><input type="radio" name="gift" value="yes">포장</label>
	<label><input type="radio" name="gift" value="no">포장 안함</label>
</fieldset>
```

_라디오 버튼에서 하나만 선택할 수 있게 하려면 모든 라디오버튼의 name 값을 똑같이 지정_\
\


#### 숫자 입력 필드를 나타내는 type="number", type="range"

* number : 스핀 박스가 나타나면서 숫자 선택 가능\
  _스핀박스 : 오른쪽에 작은 화살표를 표시해서 클릭할 때마다 숫자를 높이거나 낮추는 기능_
* range : 슬라이드 막대를 움직여 숫자 입력 가능
* 숫자 입력 필드에서 사용하는 속성
  * min : 필드에 입력할 수 있는 최솟값 지정. 기본 0
  * max : 필드에 입력할 수 있는 최댓값 지정. 기본 100
  * step : 숫자 간격 지정. 기본 1
  * value : 필드에 표시할 초깃값\


#### 날짜 입력을 나타내는 type="date", type="month", type="week"

기본형 `<input type="date | month | week">`\
\


#### 시간 입력을 나타내는 type="time", type="datetime", type="datetime-local"

기본형 `<input type="time | datetime | datetime-local">`

**날짜나 시간의 범위 제한**

날짜와 시간의 범위를 지정하는 속성

* min, max : 범위의 시작/마지막 날짜나 시간을 지정
* step : 스핀 박스의 화살표를 클릭했을 때 증감시킬 크기 지정
* value : 기본적으로 표시할 날짜나 시간 지정\


#### 전송, 리셋을 나타내는 type="submit", type="reset"

* submit : 폼에 입력한 정보를 서버로 전송
  * `<form>` 태그의 action 속성에서 지정한 폼 처리 프로그램에 넘겨짐
* reset : `<input>` 요소에 입력된 모든 정보를 재설정=사용자 입력값 초기화
  * value 속성을 사용해서 버튼에 표시할 내용을 지정 기본형 `<input type="submit | reset" value="버튼에 표시할 내용">`\


#### 이미지 버튼을 나타내는 type="image"

submit 버튼과 같은 기능을 하는 이미지 버튼\
기본형 `<input type="image" src="이미지 경로" alt="대체 텍스트">`\
\


#### 기본 버튼을 나타내는 type="button"

submit이나 reset 버튼과 같은 기능 없이 오직 버튼 형태만 삽입\
주로 자바스크립트를 실행할 때 사용\
기본형 `<input type="button" value="버튼에 표시할 내용">`\
\


#### 파일을 첨부할 때 사용하는 type="file"

폼에 사진이나 문서를 첨부해야 하는 경우\
이 유형 사용 시 웹 브라우저 화면에 \[파일선택]이나 \[찾아보기] 버튼 등이 표시됨\
\


#### 히든 필드 만들 떄 사용하는 type="hidden"

화면의 폼에는 보이지 않지만 사용자가 입력을 마치면 폼과 함께 서버로 전송되는 요소\
기본형 `<input type="hidden" name="이름" value="서버로 넘길 값">`\
\


### 05-3 input 태그의 주요 속성

#### 자동으로 입력 커서를 갖다 놓는 autofocus 속성

페이지를 불러오자마자 폼에서 원하는 요소에 마우스 포인터를 표시할 수 있음\
기본형 `<input type=텍스트-입력-필드 autofocus required>`\
\


#### 힌트를 표시해 주는 placeholder 속성

사용자가 텍스트를 입력할 때 입력란에 힌트 내용을 표시하고, 필드 클릭 시 내용이 사라지도록 만들 수 있음\
ex) 아이디/비밀번호 입력 필드에 '아이디를 입력하세요.'와 같은 내용 표시

```html
<label for="phone">연락처</label>
<input type="tel" id="phone" placeholder="하이픈 빼고 입력해주세요.(01023345678)">
```

\


#### 읽기 전용 필드를 만들어주는 readonly 속성

기본형 `<input type=텍스트-입력-필드 readonly>`\
or `<input type=텍스트-입력-필드 readonly="readonly">`\
or `<input type=텍스트-입력-필드 readonly="true">`\
\


#### 필수 입력 필드를 지정하는 required 속성

submit 버튼으로 폼을 서버로 전송할 때, 필수 필드에 필요한 내용이 모두 채워졌는지 검사해야 함.\
이렇게 반드시 입력해야 하는 내용에는 required 속성을 지정해 필수 필드로 만들 수 있음\
`required="required"`라고 지정하거나 `required`라고만 해도 됨\
_필수 필드를 입력하지 않는 경우 브라우저에서 오류 메시지를 띄워줌. 오류 메시지는 브라우저마다 다름._\
\


### 05-4 폼에서 사용하는 여러 가지 태그

#### 여러 줄을 입력하는 텍스트 영역 `<textarea>` 태그

기본형 `<textarea>내용</textarea>`

* `<textarea>` 태그의 속성
  * cols : 텍스트 영역의 가로 너비를 문자 단위로 지정\
    _영문자를 기준으로 함._\
    _글꼴이나 글자 크기에 따라 달라지므로 대략적인 크기 지정 정도로 생각_
  * rows : 텍스트 영역의 세로 길이를 줄 단위로 지정. 지정한 숫자보다 줄 개수가 많아지면 스크롤 막대가 생김\


#### 드롭다운 목록을 만들어 주는 `<select>`, `<option>` 태그

사용자가 내용을 입력하지 않고 여러 옵션 중 선택하게 함

* `<select>` : 드롭다운 목록의 시작과 끝을 표시
* `<option>` : 원하는 항목 추가
  * value 속성을 이용해 서버로 넘겨주는 값을 지정

기본형

```html
<select>
	<option value="값1">내용1</option>
	<option value="값2">내용2</option>
</select>
```

**`<select>` 태그의 속성 알아보기**

* size : 화면에 표시할 드롭다운 항목의 개수 지정
* multiple : 드롭다운 목록에서 둘 이상의 항목을 선택할 때 사용

**`<option>` 태그의 속성 알아보기**

* value : 서버로 넘겨줄 값 지정
* selected : 기본적으로 선택해서 보여줄 항목 지정\


\*\* _헷갈리는 부분. 예시 여러번 보기_

#### 데이터 목록 만들어 주는 `<datalist>`, `<option>` 태그

* `<datalist>` : 데이터 목록의 시작과 끝 표시
* `<option>` : 각 데이터의 옵션 표시
  * value 속성으로 서버로 넘겨줄 값 지정, 이 값이 텍스트 필드에도 나타남
* 데이터 목록을 사용할 텍스트 필드에서 어떤 데이터 목록을 연결할지 id값을 지정\
  기본형

```html
<input type="text" list="데이터 목록 id">
<datalist id="데이터 목록 id">
	<option value="서버로 넘길 값1">선택 옵션1</option>
	<option value="서버로 넘길 값2">선택 옵션2</option>
</datalist>
```

\


#### 버튼을 만들어 주는 `<button>` 태그

* `<button>` 태그의 type 속성은 버튼이 활성화되었을 때 어떤 동작을 할지 지정
* submit, reset, button 중 선택 가능
  * submit : 폼을 서버로 전송. `<input type="submit">`과 같은 기능
  * reset : 폼에 입력한 내용 초기화. `<input type="reset">`과 같은 기능
  * button : 버튼 형태만 만듦. `<input type="button">`과 같은 기능
* 지정하지 않으면 submit을 선택한 것으로 간주