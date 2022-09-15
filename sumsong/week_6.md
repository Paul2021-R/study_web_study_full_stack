# 6주차
---
<br>

# 09 이미지와 그러데이션 효과로 배경 꾸미기
## 09-1 배경색과 배경 범위 지정하기
### 배경색을 지정하는 background-color 속성
background-color 값은 상속되지 않음.  
기본적으로 모든 웹 문서 요소의 배경은 투명하므로 body 스타일로 지정한 문서 배경이 그대로 비치는 것일 뿐 웹 요소에 배경색이 상속된 것은 아님  

### 배경색의 적용 범위를 조절하는 background-clip 속성
background-clip의 속성값
- border-box : 박스 모델의 가장 외곽인 테두리까지 적용. 기본값.
- padding-box : 박스 모델에서 테두리를 뺀 패딩 범위까지 적용.
- content-box : 박스 모델에서 내용(콘텐츠) 부분에만 적용.  

## 09-2 배경 이미지 지정하기
### 웹 요소에 배경 이미지를 넣는 background-image 속성
기본형 `background-image: url('이미지 파일 경로')`  
이미지 파일은 `*.jpg`, `*.gif`, `*.png` 형식을 사용, 파일 경로에는 작은따옴표('')나 큰따옴표("") 붙임  
웹 문서를 기준으로 상대 경로를 지정할 수도 있고 `http://`로 시작하는 절대 경로를 사용할 수도 있음  
요소보다 이미지 크기가 작으면 이미지가 가로 세로 반복되며 배경을 가득 채움  

### 배경 이미지의 반복 방법을 지정하는 background-repeat 속성
background-repeat의 속성값
- repeat : 브라우저 화면에 가득 찰 때까지 가로 세로 반복. 기본값.
- repeat-x : 브라우저 화면 너비에 가득 찰 때까지 가로 반복
- repeat-y : 브라우저 화면 높이에 가득 찰 때까지 세로 반복
- no-repeat : 한 번만 표시

### 배경 이미지의 위치를 조절하는 background-position 속성
기본값 `background-position: <수평 위치> <수직 위치>;`
> 수평 위치: left | center | right | <백분율> | <길이 값>  
> 수직 위치: top | center | bottom | <백분율> | <길이 값>  

속성값을 하나만 지정한다면 수평 위칫값으로 간주하고, 수직 위칫값은 50%나 center로 간주  
<br>

**키워드**  
가장 많이 사용하는 속성값 : 키워드  
수평 위치는 left, center, right / 수직 위치는 top, bottom, center 중에서  
모두 가운데로 지정한다면 줄여서 `background-position : center;`  
<br>

**백분율(%)**  
요소가 있는 해당 위치에 배경 이미지의 위치를 백분율로 계산하여 맞춘다는 뜻  
ex) `background-position: 30% 60%;` : 왼쪽 모서리로부터 가로 30%, 세로 60%의 위치에 배경 이미지의 가로 세로가 각각 30%, 60%인 위치를 맞춤  
<br>

**크기**  
길이로 직접 지정.  
ex) `background-position: 30px 20px;` : 가로 30픽셀, 세로 20픽셀 위치에 배경 이미지의 왼쪽 상단 모서리를 맞춤  

### 배경 이미지의 적용 범위를 조절하는 background-origin 속성
background-origin의 속성값
- content-box : 박스 모델에서 내용(콘텐츠) 부분에만 적용. 기본값.
- border-box : 박스 모델의 가장 외곽인 테두리까지 적용.
- padding-box : 박스 모델에서 테두리를 뺀 패딩 범위까지 적용.

### 배경 이미지를 고정하는 background-attachment 속성
background-attachment의 속성값
- scroll : 화면을 스크롤하면 배경 이미지도 스크롤. 기본값.
- fixed : 화면을 스크롤하면 이미지는 고정되고 내용만 스크롤.

### background 속성 하나로 배경 이미지 제어하기
하나의 속성으로 줄여 사용하기
```css
body {
	background-image: url('images/bg4.png');
	background-repeat: no-repeat;
	background-position: center bottom;
	background-attachment: fixed;
}
background: url('images/bg4.png') no-repeat center bottom fixed;
```
*속성값이 다르므로 입력 순서는 상관 없음!*

### 배경 이미지 크기를 조절하는 background-size 속성
background-size의 속성값
- auto : 원래 배경 이미지 크기만큼 표시. 기본값.
- contain : 요소 안에 배경 이미지가 다 들어오도록 이미지 확대/축소
- cover : 배경 이미지로 요소를 모두 덮도록 이미지 확대/축소
- <크기> : 이미지의 너비와 높이 지정. 값이 하나만 주어지면 너비로 인식되며 높잇값 자동 계산
- <백분율> : 배경 이미지가 들어갈 요소의 크기를 기준으로 값을 백분율로 지정하고 그 크기에 맞도록 배경 이미지를 확대/축소

## 09-3 그러데이션 효과로 배경 꾸미기
### 선형 그러데이션
기본형 `linear-gradient(to <방향> 또는 <각도>, <색상 중지점>, [<색상 중지점>, ...]);`  

**방향**  
끝 지점을 기준으로 to 예약어와 함께 사용  
to 다음에는 방향을 나타내는 예약어를 최대 2개까지 사용
- 수평 방향 : left, right
- 수직 방향 : top, bottom
ex) 색상이 왼쪽에서 오른쪽으로 변하는 그러데이션 : `to right`  
    왼쪽 아래에서 오른쪽 위로 변하는 그러데이션 : `to right top` or `to top right`  
선형 그러데이션의 위치나 각도 옵션을 생략하면 `to bottom`으로 인식  
<br>

**각도**  
선형 그러데이션에서 색상이 바뀌는 방향을 알려주는 방법.  
이때 각도는 그러데이션이 끝나는 부분이고 값은 `deg`로 표기  
CSS에서 각도는 맨 윗부분이 0deg이고, 시계 방향으로 회전하면서 90deg, 180deg, 270deg ...  
ex) 왼쪽 아래에서 오른쪽 위 방향 지정할 때 : 그러데이션이 끝나는 부분의 각도는 오른쪽 위 방향 부분이므로 45deg 정도의 값  
<br>

**색상 중지점**  
2가지 색 이상의 선형 그러데이션에서 색상이 바뀌는 부분 : 색상 중지점(color-stop)  
색상 중지점을 지정할 때 쉼표(,)로 색상을 구분하는데 색상만 지정할 수도 있고 중지점의 위치도 함께 지정할 수 있음  
<br>

### 원형 그러데이션
기본형 `radial-gradient(<모양> <크기> at <위치>, <색상 중지점>, [<색상 중지점>, ....])`  
<br>

**모양**  
원형(circle) / 타원형(eclipse) : 기본값 인식  
<br>

**크기**  
원형 그러데이션의 크기 속성값
- closest-side : 그러데이션 가장자리가 중심에서 가장 **가까운** 요소의 **측면**에 닿을 때까지 그림
- closest-corner : 그러데이션 가장자리가 중심에서 가장 **가까운** 요소의 **코너(꼭짓점)**에 닿을 때까지 그림
- farthest-side : 그러데이션 가장자리가 중심에서 가장 **먼** 요소의 **측면**에 닿을 때까지 그림
- farthest-corner : 그러데이션 가장자리가 중심에서 가장 **먼** 요소의 **코너**에 닿을 때까지 그림
<br>

**위치**  
`at` 키워드와 함께 지정하면 그러데이션이 시작하는 원의 중심을 다르게 나타낼 수 있음  
사용할 수 있는 위치 속성값은 키워드(left/center/right, top/center/bottom) 또는 백분율  
속성값을 생략하면 가로 세로 모두 중앙인 center로 인식  
<br>

**색상 중지점**  
ex)  
```css
.grad1 {
	background: skyblue; /* CSS3를 지원하지 않는 웹 브라우저용 */
	background: radial-gradient(yellow, white, orange); /* 색상 중지점 지정 */
}
.grad2 {
	background: skyblue;
	background: radial-gradient(yellow, white 10%, orange 60%); /* 색상 중지점의 위치까지 지정 */
}
```

### 그러데이션을 사용한 패턴 만들기
선형 그러데이션을 반복할 때는 repeating-linear-gradient를 사용하고,  
원형 그러데이션을 반복할 때는 repeating-radial-gradient를 사용  
<br>

그러데이션을 반복해서 패턴을 만들 때는 각 색상 중지점의 위치를 적절하게 조절해야 함.  
시작 색상과 끝 색상을 명확히 구분해 줘야 중간에 섞이지 않음.  