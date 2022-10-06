# 8주차
---
<br>

# 11 트랜지션과 애니메이션
## 11-1 변형 알아보기
웹 문서에서 CSS 변형을 이용해 사용자의 동작에 반응해 텍스트나 이미지 등을 움직이게 할 수 있음  

### transform과 변형 함수
CSS에서 변형을 적용하려면 transform 속성과 변형 함수 이름을 함께 작성
기본형 `transform: 함수`  

> **예제**  
> 웹 요소를 이동시키는 변형 함수 translate()
> 웹 요소를 x, y축으로 이동하는 클래스 선택자 .photo를 정의하려면
> `.photo { transform: translate(50px,100px); }`
<br>

**2차원 변형과 3차원 변형**  
*2차원 변형*은 웹 요소를 평면에서 변형  
평면에서 변형할 때는 2차원 좌표 사용 : x축은 오른쪽으로, y축은 아래로 내려갈수록 값이 커짐  
*3차원 변형*은 원근감을 주는 z축을 추가해서 변형  
z축은 앞뒤로 이동, 다가올수록 값이 커지고 뒤로 갈수록 값이 작아짐  

### 웹 요소를 이동시키는 translate() 함수
translat() 함수는 x축이나 y축 또는 양쪽 방향으로 이동할 거리를 지정하면 해당 요소가 지정한 크기만큼 이동함  
기본형  
- `transform: translate(tx, ty)`
- `transform: translate3d(tx, ty, tz)`
- `transform: translateX(tx)`

### 요소를 확대 축소하는 scale() 함수
scale() 함수는 웹 요소를 지정한 크기만큼 확대/축소  
괄호 안의 값(sx, sy, sz)이 1보다 크면 확대되고 1보다 작으면 축소  
기본형  
- `transform: scale(sx, sy)`
- `transform: scale3d(sx, sy, sz)`
- `transform: scaleX(sx)`

### 요소를 회전시키는 rotate() 함수
**2차원 rotate() 함수**  
요소를 회전시키는 rotate() 함수는 2차원 회전과 3차원 회전에서 모두 사용 가능  
2차원에서 사용할 때는 각도만 지정  
웹 요소를 지정한 각도만큼 오른쪽이나 왼쪽으로 회전  
기본형 `transform: rotate(각도)`  
  
rotate() 함수에서 지정할 수 있는 각도의 값은 일반적인 각도(degree)나 래디안(radian)을 사용  
회적 각도가 양수일 경우 오른쪽 회전, 음수일 경우 왼쪽 회전  
  
**3차원 rotate() 함수**  
기본형  
- `transform: rotate(rx, ry, 각도)`
- `transform: rotate3d(rx, ry, rz, 각도)`
- `transform: rotateX(rx)`  
  
이때 perspective 속성을 함께 사용해서 원근감을 추가해주면 회전 형태를 입체적으로 표현할 수 있음  
perspective 속성은 3차원 변형에서 사용하는데, 원래 있던 위치에서 사용자가 있는 방향이나 반대 방향으로 잡아당기거나 밀어내어 원근감 표현  
perspective 속성에서 사용하는 값은 0보다 커야 하며, 원래 있던 위치에서 사용자가 있는 쪽으로 얼마나 이동하는지를 픽셀 크기로 나타냄. 값이 클수록 사용자로부터 멀어짐  
**주의!** perspective 속성은 변형하는 요소가 아니라 **변형하는 요소의 부모 요소**에 정의해야 함

### 요소를 비틀어 왜곡하는 skew() 함수
skew() 함수는 지정한 각도만큼 요소를 비틀어 왜곡  
이때 양쪽 방향으로 비틀거나 한쪽 방향으로만 비틀 수도 있음  
기본형  
- `transform: skew(x각도, y각도)`
- `transform: skewX(x각도)`

## 11-2 트랜지션 알아보기
### 트랜지션이란
트랜지션(transition)은 웹 요소의 배경색을 바꾸거나 도형의 테두리를 사각형에서 원형으로 바꾸는 것처럼 스타일 속성이 바뀌는 것을 말함.  

### 트랜지션과 속성
**트랜지션의 대상을 지정하는 transition-property 속성**  
어떤 속성에 트랜지션을 적용할 것인지 대상 지정  
기본형 `transition-property: all | none | <속성 이름>`
- all : 모든 속성이 트랜지션 대상. 기본값.
- none : 트랜지션을 하는 동안 아무 속성도 바뀌지 않음
- 속성 이름 : 트랜지션 효과를 적용할 속성 지정. 속성이 여럿일 경우 쉼표(,)로 구분하여 나열  
  
**트랜지션의 진행 시간을 지정하는 transition-duration 속성**  
지정할 수 있는 시간 단위는 초 또는 밀리초  
대상 속성이 여러 개라면 진행 시간도 쉼표로 구분해서 여러 개 지정 가능  
음숫값은 0으로 간주  
기본형 `transition-duration: <시간>`  
  
**트랜지션의 속도 곡선을 지정하는 transition-timing-function 속성**  
트랜지션 효과의 시작, 중간, 끝에서 속도를 지정해 전체 속도 곡선을 만들 수 있음  
속도 곡선은 미리 정해진 키워드나 베지에 곡선을 이용해 표현  
기본형 `transition-timing-functino: linear | ease | ease-in | ease-out | ease-in-out | cubic-bezier(n, n, n, n)`  
- ease : 처음에는 천천히 시작하고 점점 빨라지다가 마지막엔 천천히 끝냄. 기본값.
- linear : 시작부터 끝까지 똑같은 속도로 진행
- ease-in : 느리게 시작
- ease-out : 느리게 끝냄
- ease-in-out : 느리게 시작하고 느리게 끝
- cubic-bezier(n, n, n, n) : 베지에 함수를 정의해서 사용. 이때 n값은 0~1 사이만 사용
  
**트랜지션의 지연 시간을 설정하는 transition-delay 속성**  
transition-delay 속성은 트랜지션 효과를 언제부터 시작할 것인지 설정  
이 속성을 사용하면 지정한 시간만큼 기다렸다가 트랜지션 시작  
사용할 수 있는 값은 초(s)나 밀리초(ms)이며, 기본값 0  
기본형 `transition-delay: <시간>`  

**트랜지션의 속성을 한꺼번에 표기하는 transition 속성**
기본형 `transition: <transition-property값> | <transition-duration값> | <transition-timing-function값> | <transition-delay값>`  
순서는 상관없지만 시간값을 사용하는 속성이 2개(진행 시간, 지연 시간)이므로 앞에 오는 시간값을 transition-duration 속성으로, 뒤에 오는 시간값은 transition-delay 속성으로 간주함  

## 11-3 애니메이션 알아보기
### CSS 애니메이션에서 사용하는 속성
자바스크립트를 사용하지 않고도 웹 요소에 애니메이션을 추가할 수 있음  
animation 속성은 특정 지점에서 스타일을 바꾸면서 애니메이션을 만드는데, 이 특정 지점을 키프레임(keyframe)이라고 함  
키프레임은 `@keyframes` 속성으로 정의하고, `animation` 속성과 그 하위 속성을 이용해서 애니메이션의 실행 시간이나 반복 여부 등을 지정  
  
**애니메이션의 지점과 이름을 설정하는 @keyframes 속성, animation-name 속성
