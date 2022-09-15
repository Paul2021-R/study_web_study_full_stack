# Chapter 11. 트랜지션과 애니메이션

## 11-1 변형 알아보기

### transform과 변형 함수

CSS에서 변형을 적용하려면 transform 속성과 변형 함수 이름을 함께 작성해야 한다.

```css
/*기본형*/
transform: 함수
/*example*/
.photo { transform: translate(50px, 100px); } /*웹 요소를 x축으로 50px, y축으로 100px 이동*/
```

#### 2차원 변형과 3차원 변형

**2차원 변형**은 웹 요소를 평면에서 변형한다. 예를 들어 수평방향으로 이동하거나 수직방향으로 왜곡한다. 평면에서 변형할 때는 2차원 좌표를 이용하는데, x축은 오른쪽으로 갈수록 값이 커지고, y축은 아래로 내려갈수록 값이 커진다.
반면에 **3차원 변형**은 x축과 y축에 원근감을 주는 z축을 추가해서 변형한다. 3차원 변형에서 z축은 앞뒤로 이동하며, 보는 사람 쪽으로 다가올수록 값이 커지고 뒤로 갈수록 값이 작아진다.

#### 2차원 변형 함수

2차원에서 사용하는 변형 함수의 종류는 다음과 같다. 
![image](https://user-images.githubusercontent.com/91731260/190290282-64ffd222-4d37-419d-894e-0398ab1d3e8b.png)

#### 3차원 변형 함수

2차원 변형 함수에 z축을 추가하면 3차원 변형 함수가 된다. 3차원 변형 함수의 종류는 다음과 같다.
![image](https://user-images.githubusercontent.com/91731260/190290519-21db4930-60d6-494b-9851-44df4ba63393.png)

### 웹 요소를 이동시키는 translate() 함수

translate() 함수는 x축이나 y축 또는 양쪽 방향으로 이동할 거리를 지정하면 해당 요소가 지정한 크기만큼 이동한다. translate() 함수에서 사용하는 방식은 다음과 같다. 

![image](https://user-images.githubusercontent.com/91731260/190290787-cc8d4246-6ca4-4565-98d7-046e876b0e7a.png)

### 요소를 확대/축소하는 scale() 함수

scale() 함수는 웹 요소를 지정한 크기만큼 확대하거나 축소한다. scale() 함수를 사용하는 형식은 다음과 같다. 괄호 안의 값(sx, sy, sz)이 1보다 크면 확대되고 1보다 작으면 축소된다.

![image](https://user-images.githubusercontent.com/91731260/190291127-0e170073-1b2f-4a24-8c7b-b2bce5063855.png)
![image](https://user-images.githubusercontent.com/91731260/190291153-f69477f1-6aeb-454f-891e-ebc9fad45750.png)

### 요소를 회전시키는 rotate() 함수

#### 2차춴 rotate() 함수

요소를 회전시키는 rotate() 함수는 2차원 회전과 3차원 회전에서 모두 사용할 수 있다. rotate() 함수를 2차원에서 사용할 때는 각도만 지정하면 된다. 함수는 웹 요소를 지정한 각도만큼 시계 방향이나 시계 반대 방향으로 회전시킨다.

```css
/*기본형*/
transform: rotate(각도)
```

rotate() 함수에서 지정할 수 있는 각도의 값은 일반적인 각도나 레디안을 사용하는데, 이때 1래디안은 180º/π를 의미한다. 회전 각도가 양수일 경우 시계 방향, 음수일 경우 반시계 방향으로 회전한다.

#### 3차원 rotate() 함수

3차원 rotate()함수는 다음과 같이 x축이나 y축, z축을 기준으로 회전시킨다.

![image](https://user-images.githubusercontent.com/91731260/190292173-3159dd34-7a81-43ff-89ea-a4a65d77ab2c.png)

이때 perspective 속성을 함께 사용해서 원근감을 추가해 주면 회전 형태를 입체적으로 표현할 수 있다. perspective 속성은 3차원 변형에서 사용하는데, 원래 있던 위치에서 사용자가 있는 방향이나 혹은 반대 방향으로 잡아당기거나 밀어내어 원근감을 표현한다. 
perspective 속성에서 사용하는 값은 0보다 커야하며, 원래 있던 위치에서 사용자가 있는 쪽으로 얼마나 이동하는지를 픽셀 크기로 나타낸다. 값이 클수록 사용자로부터 멀어진다. 이때 주의할 점은 perspective 속성은 변형하는 요소가 아니라 변형하는 요소의 부모 요소에 정의해야 한다. 

### 요소를 비틀어 왜곡하는 skew() 함수

skew() 함수는 지정한 각도만큼 요소를 비틀어 왜곡한다. 이때 양쪽 방향으로 비틀거나 한쪽 방향으로 비틀 수도 있다. 

![image](https://user-images.githubusercontent.com/91731260/190293403-f6e6811f-1962-4839-983d-eecd5fa6d4f2.png)

skew() 함수는 각돗값이 양수면 왼쪽이 올라가고, 오른쪽이 내려가는 형태가 된다. 반대로 skew() 함수는 각돗값이 양수면 오른쪽이 올라가고, 왼쪽이 내려가는 형태이다. 이것을 응용해서 텍스트 영역에 skew() 함수를 적용하면 이미지를 사용하지 않고도 도형의 형태를 만들 수 있다. 

## 11-2 트랜지션 알아보기

### 트랜지션이란

**트랜지션**은 웹 요소의 배경색을 바꾸거나 도형의 테누리를 사각형에서 원형으로 바꾸는 것처럼, 스타일 속성이 바뀌는 것을 말한다. 웹 요소의 스타일 속성이 시간에 따라 바뀌는 것을 트랜지션이라고 한다.

### 트랜지션과 속성

css3 트랜지션을 실행하려면 다음과 같이 여러 가지 속성을 사용해야 한다. 

![image](https://user-images.githubusercontent.com/91731260/190293332-a8405945-7ebc-402f-947f-23c091e34224.png)

#### 트랜지션의 대상을 지정하는 transition-property 속성

트랜지션을 만들려면 맨 먼저 transition-property 속성을 사용하여 어떤 속성에 트랜지션을 적용할 것인지 대상을 지정해야 한다.

```css
/*기본형*/
transition-property: all | none | <속성 이름>
```

transition 속성에서 사용할 수 있는 속성값은 다음과 같다.

![image](https://user-images.githubusercontent.com/91731260/190293770-99da2321-666c-4311-a5c0-ee3a47471ec0.png)

#### 트랜지션의 진행 시간을 지정하는 transition-duration 속성

transition-property에서 트랜지션 대상을 지정했다면 다음으로 진행 시간을 지정해야 속성이 자연스럽게 바뀌는 애니메이션 효과를 만들 수 있다. 진행 시간은 transition-duration 속성으로 지정할 수 있다. 지정할 수 있는 시간 단위는 초, 또는 밀리초이다. 트랜지션의 대상 속성이 여러 개라면 진행 시간도 쉼표로 구분해서 여러 개를 지정할 수 있다. transition-property에서 지정한 개수와 transition-duration 속성에서 지정한 개수가 다를 경우 속성 순서대로 시간값을 반복해서 적용한다.

```css
/*기본형*/
transition-duration: <시간>
```

#### 트랜지션의 속도 곡선을 지정하는 transition-timing-function 속성

transition-timing-function 속성을 사용하면 트랜지션 효과의 시작, 중간, 끝에서 속도를 지정해 전체 속도 곡선을 만들 수 있다. 속도 곡선은 미리 정해진 키워드나 베지에 곡선을 이용해 표현한다. (베지에 곡선은 n개의 점을 이용해 (n-1)차 곡선을 만들어 내는 함수이다.)

```css
/*기본형*/
transition-timing-function: linear | ease | ease-in | ease-out | ease-in-out | cubic-bezier(n, n, n, n)
```

![image](https://user-images.githubusercontent.com/91731260/190294675-3d93f8a1-20da-4a7a-be69-a0b16c9615a7.png)

#### 트랜지션의 지연 시간을 설정하는 transition-delay 속성

transition-delay 속성은 트랜지션 효과를 언제부터 시작할 것인지 설정한다. 이 속성을 사용하면 지정한 시간만큼 기다렸다가 트랜지션이 시작된다. 사용할 수 있는 값은 초나 밀리초이며 기본값은 0이다.

```css
/*기본형*/
transition-delay: <시간>
```

#### 트랜지션의 속성을 한꺼번에 표기하는 transition 속성

트랜지션의 적용 대상이 전체이고, 각각의 진행시간이 같다면 transition 속성으로 한꺼번에 지정하는 것이 편리하다. 

```css
/*기본형*/
transition: <transition-property값> | <transition-duration값> | <transition-timing-function값> | <transition-delay값>
```

속성값을 지정하는 순서는 상관 없지만, 시간값을 사용하는 속성이 2개이므로 , 시간값이 2개 있다면 앖에 오는 시간값을 transition-duration 속성으로 간주한다.

## 11-3 애니메이션 알아보기

### CSS 애니메이션에서 사용하는 속성

CSS3의 animation 속성을 사용하면 자바스크립트를 사용하지 않고도 웹 요소에 애니메이션을 추가할 수 있다. animation 속성은 특정 지점에서 스타일을 바꾸면서 애니메이션을 만드는데 이렇게 애니메에션 중간에 스타일이 바뀌는 지점을 키프레임이라고 한다.
키프레임은 @keyframes 속성으로 정의하고, animation 속성과 그 하위 속성을 이용해서 애니메이션의 실행 시간이나 반복 여부 등을 지정한다. 

![image](https://user-images.githubusercontent.com/91731260/190296017-9f08bcbd-4375-4427-a6fb-80f5703810fa.png)

#### 애니메이션의 지점과 이름을 설정하는 @keyfranes 속성, animation-name 속성

애니메이션의 시작과 끝을 비롯하여 상태가 바뀌는 부분이 있다면 @keyframes 속성을 이용해 바뀌는 지점을 설정한다. 

```css
/*기본형*/
@keyframes <이름> {
	<선택자> { <스타일> }
}
```

또한 웹 문서에서는 애니메이션을 여러 개 정의할 수 있으므로 이름을 이용해 애니메이션을 구별해야 한다. 이때 animation-name 속성으로 어떤 애니메이션을 사용할지 이름으로 구분한다. 


```css
/*기본형*/
animation-name: <키프레임 이름> | none
```

@keyframes 속성에서 사용하는 선택자는 스타일 속성값이 바뀌는 지점을 가리킨다. 예를 들어 애니메이션의 중간 지점을 추가하려면 시작 위치를 0%, 끝 위치를 100%로 놓고, 50% 위치에 키프레임을 추가하면 된다. 시작과 끝 위치만 사용하려면 0%, 100%와 같은 값 대신 from과 to라는 키워드를 사용해도 된다.

#### 애니메이션의 실행 시간을 지정하는 animation-duration 속성

animation-durarion 속성은 애니메이션을 얼마 동안 재생할 것인지 설정한다. 

```css
/*기본형*/
animation-durarion: <시간>
```

animation-duration 속성에서 사용할 수 있는 값은 초나 밀리초와 같은 시간 단위이다. 기본값은 0이므로 animation-durarion 속성값을 정하지 않으면 애니메이션은 실행되지 않는다. 

#### 애니메이션의 방향을 지정하는 animation-direction 속성

애니메이션은 기본적으로 keyframes에서 정의한 from에서 to로 진행하는데, animation-diraction 속성을 사용해서 진행 방향을 바꿀 수 있다. 

```css
/*기본형*/
animation-direction: nomal | reverse | alternate | alternate-reverse
```

![image](https://user-images.githubusercontent.com/91731260/190297569-825b7502-ca1e-47c0-a29b-4abf8bbc14b1.png)

#### 반복 횟수를 지정하는 animation-iteration-count 속성

상횡에 따라 애니메이션을 반복해서 보여 줘야 할 때는 animation iteration-count 속성을 사용해 반복 횟수를 정한다.

```css
/*기본형*/
animation-iteration-count: <숫자> | infinite
```

종류 | 설명
---|---
숫자 | 애니메이션의 반복 횟수를 정한다.
infinite | 애니메이션을 무한 반복한다.

#### 애니메이션의 속도 곡선을 지정하는 animation-timing-function 속성

트랜지션과 마찬가지로 animation에서도 애니메이션의 시작, 중간, 끝에서 속도롤 지정하여 전체 속도 곡선을 만들 수 있다.

```css
/*기본형*/
animation-timing-function: linear | ease | ease-in | ease-out | ease-in-out | cubic-bezier(n, n, n, n)
```

#### 애니메이션의 속성을 한꺼번에 표기하는 animation 속성

애니메이션의 속성을 한 번에 표기할 때 animation-durarion 속성은 반드시 표기해야 한다. 애니메이션 실행 시간을 지정하지 않으면 기본값으로 0이 적용되기 때문이다.


```css
/*기본형*/
animation: <animation-name> | <animation-durarion> | <animation-timing-function> | <animation-delay> | <animation-iteration-count> | <animation-direction>
```
