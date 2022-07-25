# 1주차
#### [01 웹 개발 시작하기](https://github.com/Paul2021-R/web_study_full_stack/blob/sumsong/sumsong/week_1.md#01-%EC%9B%B9-%EA%B0%9C%EB%B0%9C-%EC%8B%9C%EC%9E%91%ED%95%98%EA%B8%B0-1)
#### [02 웹 개발 환경 만들기](https://github.com/Paul2021-R/web_study_full_stack/blob/sumsong/sumsong/week_1.md#02-%EC%9B%B9-%EA%B0%9C%EB%B0%9C-%ED%99%98%EA%B2%BD-%EB%A7%8C%EB%93%A4%EA%B8%B0-1)
#### [03 HTML 기본 문서 만들기](https://github.com/Paul2021-R/web_study_full_stack/blob/sumsong/sumsong/week_1.md#03-html-%EA%B8%B0%EB%B3%B8-%EB%AC%B8%EC%84%9C-%EB%A7%8C%EB%93%A4%EA%B8%B0-1)
<br>

* * *

# 01 웹 개발 시작하기
- `프론트엔드` 영역
	- HTML
	- CSS
	- Javascript -> 백/프론트 모두 가능
		- jQuery
		- D3.js
		- Bootstrap
		- React
		- Angular
		- Vue
   
- `백엔드` 영역
	- Javascipt (Node.js) => Express
	- Java => Spring
	- Ptyhon => Django, Flask
	- PHP => CodeIgniter
<br>

# 02 웹 개발 환경 만들기   
<br>

# 03 HTML 기본 문서 만들기
## 03-2 HTML 구조 파악하기
### 웹 브라우저에 문서 정보를 알려 주는 `<head>` 태그
#### 문자 세트를 비롯해 문서 정보가 들어 있는 `<meta>` 태그
<meta> 태그의 가장 중요한 역할 : 화면에 글자를 표시할 때 어떤 인코딩을 사용할지 지정하는 것.   
웹 서버는 영어가 기본이므로 한글을 표시할 때는 UTF-8이라는 문자 세트를 사용한다고 알려줘야 함.   
`<meta charset="UTF-8">`   
<br>

## 03-3 HTML 파일 만들기
#### <실습> HTML의 기본 구조 자동으로 만들기
> `!`를 입력 한 후 `Tab`이나 `Enter`를 누르면 html 템플릿이 자동 완성됨
> -> 나는 되지 않음
>> **해결방법**
>> 1. `html:5`를 입력한 뒤 템플릿 자동 완성 시키기
>> 2. In vscode user setting, add `"emmet.includeLanguages": { "javascript": "html" }`
<br>

## 03-4 웹 문서 구조를 만드는 시맨틱 태그
### 시맨틱 태그 알아보기
HTML의 태그는 그 이름만 봐도 의미를 알 수 있어 **시맨틱(semantic) 태그**   
*시맨틱(semantic) : 의미론적인, 의미가 통하는

### 시맨틱 태그는 왜 필요할까
1. 웹 브라우저가 코드만으로 제목과 본문을 구분할 수 있고, 시각 장애인의 보조 기기에서 사이트의 구조를 이해하여 정확한 내용 전달이 가능해짐
2. 문서 구조가 정확히 나눠지므로 PC/모바일/스마트 기기 등 다양한 화면에서 문서 표현하기가 쉬워짐
3. 웹 사이트 검색 시에 본문 영역에서만 검색이 가능하는 등 검색 범위를 좁혀 빠르게 정보를 찾을 수 있음

#### 웹 문서 구조를 만드는 주요 시맨틱 태그
#### 헤더 영역을 나타내는 `<header>` 태그
#### 내비게이션 영역을 나타내는 `<nav>` 태그
#### 핵심 콘텐츠를 담는 `<main>` 태그
#### 독립적인 콘텐츠를 담는 `<article>` 태그
#### 콘텐츠 영역을 나타내는 `<section>` 태그
- `<section>` 태그는 몇 개의 콘텐츠를 묶는 용도로 사용
- `<article>` 태그는 블로그의 포스트처럼 독립된 콘첸트로 사용   
*단순히 스타일을 적용하려고 콘텐츠를 묶으려면 `<section>` 태그 대신 `<div>` 태그를 사용

#### 사이드 바 영역을 나타내는 `<aside>` 태그
#### 푸터 영역을 나타내는 `<footer>` 태그
#### 여러 소스를 묶는 `<div>` 태그
