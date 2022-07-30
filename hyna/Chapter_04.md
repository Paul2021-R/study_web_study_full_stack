오늘 공부한 내용을 html 파일에 계속해서 정리했다. 나온 코드는 아래에.

![Untitled](https://user-images.githubusercontent.com/91731260/181907285-4c340f2c-876b-4f3d-8e91-182e9a274666.png)

```html
<!--제목 텍스트는 <hn></hn>태그를 이용하며 1이 가장 크고 6이 가장 작다.-->
    <h1>실습 내용</h1>
    <h2>4-1</h2>
    <div>
        <p> &lt;p&gt;태그는 위 아래로 빈줄을 생성한다. &lt;p&gt;태그 안에서 줄 바꿈을 위해서는 &lt;br&gt; 태그를 사용한다.<br>
            줄 바꾸기</p>
        <p>&lt;br&gt;를 두 개 사용하면 단락을 두 개 만든 것 처럼 보이게 할 수 있다.<br><br>
            그러나 이는 이후에 css를 적용할 때 문제가 생기므로 단락을 만들 때는 &lt;p&gt;를 사용하자.</p>
        <blockquote>인용문을 웹 브라우저가 인식하게 하기 위해서는 &lt;blockquote&gt;를 사용하자.</blockquote>
        <!--인용문을 웹 브라우저에서는 다른 텍스트보다 약간 들여쓴다. 화면 낭독기에서도 다르게 인식한다.-->
        <p>텍스트를 <b>굵게</b> 표시해 강조하고 싶을 땐 <strong>&lt;strong&gt;</strong>이나 <b>&lt;b&gt;</b>태그를 사용하자.<br>
            strong 태그는 주의 사항이나 중요한 내용을 강조해야할 때,<br>
            b 태그는 단순한 키워드나 글자만 굵게 표시할 때 사용한다.</p>
        <p>텍스트를 기울여 표시해 강조하고 싶을 땐 <em>&lt;em&gt;</em>이나 <i>&lt;i&gt;</i>태그를 사용하자.<br>
            &lt;em&gt;태그는 문장에서 흐름항 특정 부분을 강조하고 싶을 때,<br>
            &lt;i&gt;태그는 문장을 구별하기 위해 기울여서 표기할 때 사용한다.</p>
        <p>다양한 태그들<br>
            <!--<abbr="Internet_of_Things">IoT</abbr><br>-->
                <!--줄임말을 표시하고 title 속성을 함께 사용할 수 있다.-->
                <cite>Do it HTML, CSS, 자바스크립트 웹 표준의 정석</cite><br>
                <!--참고 내용 표시-->
                <code>function savetheLocal()</code><br>
                <!--컴퓨터 인식을 위한 짧은 소스 코드 / 마크다운의 `test`같은 느낌-->
                <small>작게 표시해도 되는 텍스트</small><br>
                윗 첨자<sup>&lt;sup&gt;</sup>태그와 아랫 첨자<sub>&lt;sub&gt;</sub><br>
                <s>취소선</s>과 <u>밑줄</u><br>
                <ins>공동 문서에서 새로운 내용 삽입</ins><br>
                <del>공동 문서에서 기존 내용 삭제</del>
        </p>
    </div>
```

![image](https://user-images.githubusercontent.com/91731260/181907631-144f10f8-bb4c-4ef6-b8f4-bd9ee7a970c2.png)
![image](https://user-images.githubusercontent.com/91731260/181907646-ad728116-4eed-42f0-9196-c2db32b4a213.png)

```html
   <h2>4-2</h2>
    <div>
        <h3>목록 만들기</h3>
        <div>
            <h4>순서 있는 목록 만들기</h4>
            <p>
                순서 있는 목록을 만들기 위해서는 &lt;ol&gt;태그와 &lt;li&gt;태그를 사용해야한다.<br>
                <!--ol은 ordered list의 준말, li는 list의 준말이다.-->
                표시할 내용 앞뒤에 &lt;ol&gt;과 &lt;/ol&gt;태그를 두고, 그 사이에 &lt;li&gt;태그와 &lt;/li&gt;태그를 삽입한다.<br>
                예시
            <ol>
                <li>list 1</li>
                <li>list 2</li>
            </ol>
            </p>
            <p>type 목록</p>
            <ol type="1" start="1">
                <li>type = "1"<sup>숫자(기본값)</sup></li>
            </ol>
            <ol type="a" start="2">
                <li>type = "a"<sup>영문 소문자</sup></li>
            </ol>
            <ol type="A" start="3">
                <li>type = "A"<sup>영문 대문자</sup></li>
            </ol>
            <ol type="i" start="4">
                <li>type = "i"<sup>로마 숫자 소문자</sup></li>
            </ol>
            <ol type="I" start="5">
                <li>type = "I"<sup>로마 숫자 대문자</sup></li>
            </ol>
        </div>
        <div>
            <h4>순서 없는 리스트 만들기</h4>
            <p>
                순서 없는 목록<sup>unordered list</sup>은 순서가 중요하지 않을 때 사용한다.<br>
                &lt;ul&gt;과 &lt;/ul&gt;태그를 목록 앞뒤에 붙인 후 &lt;li&gt;와 &lt;/li&gt;태그를 삽입한다.<br>
                순서 없는 목록은 학목 앞에 작은 원이나 사각형 등 작은 그림을 붙여서 구분하는데, 이것을 불릿<sup>bullet</sup>이라고 한다.<br>
                예시
            <ul>
                <li>list 1</li>
                <li>list 2</li>
            </ul>
            </p>
        </div>
        <div>
            <h4>설명 목록</h4>
            <p>설명 목록이란 이름과 값 형태로 된 목록이다.<br>
                이름을 지정하는 &lt;dt&gt;태그와 &lt;dd&gt;태그를 넣는다. &lt;dt&gt;안에 여러 개의 &lt;dd&gt;태그를 넣을 수도 있다.</p>
            <p>예시</p>
            <dl>
                <dt>name</dt>
                <dd>value1</dd>
                <dd>value2</dd>
            </dl>
        </div>
    </div><h2>4-2</h2>
    <div>
        <h3>목록 만들기</h3>
        <div>
            <h4>순서 있는 목록 만들기</h4>
            <p>
                순서 있는 목록을 만들기 위해서는 &lt;ol&gt;태그와 &lt;li&gt;태그를 사용해야한다.<br>
                <!--ol은 ordered list의 준말, li는 list의 준말이다.-->
                표시할 내용 앞뒤에 &lt;ol&gt;과 &lt;/ol&gt;태그를 두고, 그 사이에 &lt;li&gt;태그와 &lt;/li&gt;태그를 삽입한다.<br>
                예시
            <ol>
                <li>list 1</li>
                <li>list 2</li>
            </ol>
            </p>
            <p>type 목록</p>
            <ol type="1" start="1">
                <li>type = "1"<sup>숫자(기본값)</sup></li>
            </ol>
            <ol type="a" start="2">
                <li>type = "a"<sup>영문 소문자</sup></li>
            </ol>
            <ol type="A" start="3">
                <li>type = "A"<sup>영문 대문자</sup></li>
            </ol>
            <ol type="i" start="4">
                <li>type = "i"<sup>로마 숫자 소문자</sup></li>
            </ol>
            <ol type="I" start="5">
                <li>type = "I"<sup>로마 숫자 대문자</sup></li>
            </ol>
        </div>
        <div>
            <h4>순서 없는 리스트 만들기</h4>
            <p>
                순서 없는 목록<sup>unordered list</sup>은 순서가 중요하지 않을 때 사용한다.<br>
                &lt;ul&gt;과 &lt;/ul&gt;태그를 목록 앞뒤에 붙인 후 &lt;li&gt;와 &lt;/li&gt;태그를 삽입한다.<br>
                순서 없는 목록은 학목 앞에 작은 원이나 사각형 등 작은 그림을 붙여서 구분하는데, 이것을 불릿<sup>bullet</sup>이라고 한다.<br>
                예시
            <ul>
                <li>list 1</li>
                <li>list 2</li>
            </ul>
            </p>
        </div>
        <div>
            <h4>설명 목록</h4>
            <p>설명 목록이란 이름과 값 형태로 된 목록이다.<br>
                이름을 지정하는 &lt;dt&gt;태그와 &lt;dd&gt;태그를 넣는다. &lt;dt&gt;안에 여러 개의 &lt;dd&gt;태그를 넣을 수도 있다.</p>
            <p>예시</p>
            <dl>
                <dt>name</dt>
                <dd>value1</dd>
                <dd>value2</dd>
            </dl>
        </div>
    </div>
    <h2>4-2</h2>
    <div>
        <h3>목록 만들기</h3>
        <div>
            <h4>순서 있는 목록 만들기</h4>
            <p>
                순서 있는 목록을 만들기 위해서는 &lt;ol&gt;태그와 &lt;li&gt;태그를 사용해야한다.<br>
                <!--ol은 ordered list의 준말, li는 list의 준말이다.-->
                표시할 내용 앞뒤에 &lt;ol&gt;과 &lt;/ol&gt;태그를 두고, 그 사이에 &lt;li&gt;태그와 &lt;/li&gt;태그를 삽입한다.<br>
                예시
            <ol>
                <li>list 1</li>
                <li>list 2</li>
            </ol>
            </p>
            <p>type 목록</p>
            <ol type="1" start="1">
                <li>type = "1"<sup>숫자(기본값)</sup></li>
            </ol>
            <ol type="a" start="2">
                <li>type = "a"<sup>영문 소문자</sup></li>
            </ol>
            <ol type="A" start="3">
                <li>type = "A"<sup>영문 대문자</sup></li>
            </ol>
            <ol type="i" start="4">
                <li>type = "i"<sup>로마 숫자 소문자</sup></li>
            </ol>
            <ol type="I" start="5">
                <li>type = "I"<sup>로마 숫자 대문자</sup></li>
            </ol>
        </div>
        <div>
            <h4>순서 없는 리스트 만들기</h4>
            <p>
                순서 없는 목록<sup>unordered list</sup>은 순서가 중요하지 않을 때 사용한다.<br>
                &lt;ul&gt;과 &lt;/ul&gt;태그를 목록 앞뒤에 붙인 후 &lt;li&gt;와 &lt;/li&gt;태그를 삽입한다.<br>
                순서 없는 목록은 학목 앞에 작은 원이나 사각형 등 작은 그림을 붙여서 구분하는데, 이것을 불릿<sup>bullet</sup>이라고 한다.<br>
                예시
            <ul>
                <li>list 1</li>
                <li>list 2</li>
            </ul>
            </p>
        </div>
        <div>
            <h4>설명 목록</h4>
            <p>설명 목록이란 이름과 값 형태로 된 목록이다.<br>
                이름을 지정하는 &lt;dt&gt;태그와 &lt;dd&gt;태그를 넣는다. &lt;dt&gt;안에 여러 개의 &lt;dd&gt;태그를 넣을 수도 있다.</p>
            <p>예시</p>
            <dl>
                <dt>name</dt>
                <dd>value1</dd>
                <dd>value2</dd>
            </dl>
        </div>
    </div><h2>4-2</h2>
    <div>
        <h3>목록 만들기</h3>
        <div>
            <h4>순서 있는 목록 만들기</h4>
            <p>
                순서 있는 목록을 만들기 위해서는 &lt;ol&gt;태그와 &lt;li&gt;태그를 사용해야한다.<br>
                <!--ol은 ordered list의 준말, li는 list의 준말이다.-->
                표시할 내용 앞뒤에 &lt;ol&gt;과 &lt;/ol&gt;태그를 두고, 그 사이에 &lt;li&gt;태그와 &lt;/li&gt;태그를 삽입한다.<br>
                예시
            <ol>
                <li>list 1</li>
                <li>list 2</li>
            </ol>
            </p>
            <p>type 목록</p>
            <ol type="1" start="1">
                <li>type = "1"<sup>숫자(기본값)</sup></li>
            </ol>
            <ol type="a" start="2">
                <li>type = "a"<sup>영문 소문자</sup></li>
            </ol>
            <ol type="A" start="3">
                <li>type = "A"<sup>영문 대문자</sup></li>
            </ol>
            <ol type="i" start="4">
                <li>type = "i"<sup>로마 숫자 소문자</sup></li>
            </ol>
            <ol type="I" start="5">
                <li>type = "I"<sup>로마 숫자 대문자</sup></li>
            </ol>
        </div>
        <div>
            <h4>순서 없는 리스트 만들기</h4>
            <p>
                순서 없는 목록<sup>unordered list</sup>은 순서가 중요하지 않을 때 사용한다.<br>
                &lt;ul&gt;과 &lt;/ul&gt;태그를 목록 앞뒤에 붙인 후 &lt;li&gt;와 &lt;/li&gt;태그를 삽입한다.<br>
                순서 없는 목록은 학목 앞에 작은 원이나 사각형 등 작은 그림을 붙여서 구분하는데, 이것을 불릿<sup>bullet</sup>이라고 한다.<br>
                예시
            <ul>
                <li>list 1</li>
                <li>list 2</li>
            </ul>
            </p>
        </div>
        <div>
            <h4>설명 목록</h4>
            <p>설명 목록이란 이름과 값 형태로 된 목록이다.<br>
                이름을 지정하는 &lt;dt&gt;태그와 &lt;dd&gt;태그를 넣는다. &lt;dt&gt;안에 여러 개의 &lt;dd&gt;태그를 넣을 수도 있다.</p>
            <p>예시</p>
            <dl>
                <dt>name</dt>
                <dd>value1</dd>
                <dd>value2</dd>
            </dl>
        </div>
    </div>
```

![image](https://user-images.githubusercontent.com/91731260/181907669-3f4e1619-c9e6-44eb-a5f3-458a5226f566.png)
![image](https://user-images.githubusercontent.com/91731260/181907676-34ab20c9-d53d-4700-b2cd-4c46925ab0bc.png)

```html
<h2>4-3</h2>
    <div>
        <h3>표 만들기</h3>
        <p>표<sup>table</sup>는 행<sup>row</sup>과 열<sup>column</sup>과 셀<sup>cell</sup>로 이루어진다.<br>
            표의 시작과 끝을 알려주는 &lt;table&gt;과 &lt;/table&gt;태그를 표시하고 그 사이에 표와 관련된 태그를 모두 넣는다.<br>
            제목을 넣고 싶다면 &lt;caption&gt;태그를 이용하자.<br>
            &lt;tr&gt;은 행, &lt;td&gt;는 셀을 만든다.<br>
            &lt;th&gt;를 &lt;td&gt;대신 사용하여 제목 셀로 지정해주자.
        </p>
        <p>예시</p>
        <table>
            <caption>표 제목</caption>
            <tr>
                <th>row 1, column 1</th>
                <th>row 1, column 2</th>
            </tr>
            <tr>
                <td>row 2, colomn 1</td>
                <td>row 2, colomn 2</td>
            </tr>
        </table>
        <p>표에 구조를 지정할 수도 있다. 이 경우 시각 장애인도 화면 낭독기를 통해 표를 쉽게 이해할 수 있다.<br>
            아래는 &lt;thead&gt;와 &lt;tbody&gt;, &lt;tfoot&gt;태그를 이용한 예시이다.<br>
            표의 구조는 웹 브라우저 화면에서 보이지 않지만, 화면 낭독기나 자바스크립트 등에서 읽을 수 있다.</p>
        <table>
            <caption>example with &lt;thead&gt;, &lt;tbody&gt;,&lt;tfoot&gt;.</caption>
            <thead>
                <tr>
                    <th>&lt;thead&gt; title cell r1 c1</th>
                    <th>&lt;thead&gt; title cell r1 c2</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>&lt;tbody&gt; cell r2 c1</td>
                    <td>&lt;tbody&gt; cell r2 c2</td>
                </tr>
                <tr>
                    <td>&lt;tbody&gt; cell r3 c1</td>
                    <td>&lt;tbody&gt; cell r3 c2</td>
                </tr>
            </tbody>
            <tfoot>
                <tr>
                    <td>&lt;tfoot&gt; cell r4 c1</td>
                    <td>&lt;tfoot&gt; cell r4 c2</td>
                </tr>
            </tfoot>
        </table>
        <h3>행이나 열 합치기</h3>
        <p>여러 셀을 합치거나 나누어서 다양한 형태로 바꿀 수 있다. 행이나 열을 합치는 것은 실질적으로 셀을 합치는 것이므로 &lt;td&gt;, &lt;th&gt;태그에서 이루어진다.
            행을 합치려면 <b>rowspan</b>속성, 열을 합치려면 <b>colspan</b>속성을 사용하여 몇 개의 셀을 합칠지 지정한다.<br>
            <small>아래는 rowspan과 colspan 속성을 사용한 예시</small>
        </p>
        <table>
            <caption>example with &lt;thead&gt;, &lt;tbody&gt;,&lt;tfoot&gt;.</caption>
            <thead>
                <tr>
                    <th colspan="2">&lt;thead&gt; title cell r1</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td rowspan="2">&lt;tbody&gt; cell r2 c1</td>
                    <td>&lt;tbody&gt; cell r2 c2</td>
                </tr>
                <tr>
                    <td>&lt;tbody&gt; cell r3 c2</td>
                </tr>
            </tbody>
            <tfoot>
                <tr>
                    <td colspan="2">&lt;tfoot&gt; cell r4</td>
                </tr>
            </tfoot>
        </table>
        <h3>열을 묶기</h3>
        <p>단순히 표를 만들기만 하는 것이 아닌 특정 열에 배경색을 넣거나 너비를 바꾸려면 원하는 열을 선택할 수 있어야한다.<br>
            이때 사용하는 태그가 &lt;col&gt;태그와 &lt;colgroup&gt;태그다.<br>
            &lt;col&gt;태그는 열을 한 개만 지정할 때 사용, &lt;colgroup&gt;태그는 &lt;col&gt;태그를 2개 이상 묶어서 사용한다.<br>
            <strong>&lt;col&gt;태그는 닫는 태그가 없다!!</strong>
            &lt;col&gt;태그와 &lt;colgroup&gt;태그는 반드시 &lt;caption&gt;태그 다음에 써야한다. 즉, 표의 내용이 시작되기 전에 열의 상태를 알려주는 것이다.
            그리고 &lt;col&gt;태그를 사용할 때는 &lt;colgroup&gt;태그 안에 표의 전체 열의 개수만큼 &lt;col&gt;태그를 넣어야한다.<br>
            <small>아래는 특정 열에 스타일 속성을 지정한 예시</small>
        </p>
        <table>
            <caption>example with &lt;thead&gt;, &lt;tbody&gt;,&lt;tfoot&gt;.</caption>
            <colgroup>
                <col style="background-color: aqua;">
                <col span="2" style="background-color: azure" ;>
            </colgroup>
            <thead>
                <tr>
                    <th colspan="2">&lt;thead&gt; title cell r1</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td rowspan="2">&lt;tbody&gt; cell r2 c1</td>
                    <td>&lt;tbody&gt; cell r2 c2</td>
                </tr>
                <tr>
                    <td>&lt;tbody&gt; cell r3 c2</td>
                </tr>
            </tbody>
            <tfoot>
                <tr>
                    <td colspan="2">&lt;tfoot&gt; cell r4</td>
                </tr>
            </tfoot>
        </table>
    </div>
    <h2>4-4</h2>
    <div>
        <h3>이미지 삽입하기</h3>
        <div>
            <p>웹 문서에 이미지를 삽입할 때 가장 기본적인 태그는 &lt;img&gt;태그이다.</p>
            <!--이미지 태그-->
            <img src="http://placeimg.com/300/200/nature" alt="random nature dummy img">
            <p>src는 웹 브라우저가 이미지를 가지고 올 때 참고할 이미지 경로, alt는 화면 낭독기 등에서 이미지를 대신해서 읽어줄 텍스트이다.<br>
                src에 이미지 경로를 넣을 때는 현 웹 문서가 있는 디렉토리를 기준으로 작성하여야한다.</p>
            <p>웹에서 사용하는 대표적인 이미지 파일 형식에는 GIF<sup>graphic interchange format</sup>, JPG<sup> joint photographic experts
                    group</sup>,
                PNG<sup>portable network graphics</sup>가 있다.</p>
            <h4>alt 작성하기</h4>
            <p>텍스트로 만든 메뉴나 로고, 또는 내용을 이미지로 처리할 경우, 이미지를 부연 설명하는 것이 아닌 이미지 안에 포함된 텍스트를 넣어줘야한다.<br>
                불릿이나 아이콘 이미지처럼 내용 전달이 아닌 화면을 꾸밀 때 사용한 이미지는 텍스트를 따로 넣지 않아도 된다. 이때는 alt=""만 입력한다.
            </p>
        </div>
        <h3>이미지 크기를 조절하기</h3>
        <div>
            <p>
                &lt;img&gt;태그로 이미지 파일을 삽입하면 원래 이미지 크기대로 표시된다. 웹 브라우저 창에서 보이는 이미지 크기만 조절하고 싶다면 with와 height 속성을 사용할 수
                있다.<br>
                width는 이미지의 너비를, height는 이미지의 높이를 지정한다. 두 가지 다 사용해도 돠고, 한 가지만 사용해도 된다. 한 가지만 사용할 경우 다른 하나는 자동계산되어
                나타낸다.<br>
                이 두 속성에서 사용할 수 있는 단위에는 퍼센트<sup>%</sup>와 픽셀<sup>px</sup>이 있다.
            </p>
            <table>
                <caption>이미지의 크기를 표현하는 단위</caption>
                <colgroup>
                    <col style="width:150px">
                    <col style="width:500px">
                    <col style="width:150px">
                </colgroup>
                <tr>
                    <th>종류</th>
                    <th>설명</th>
                    <th>예시</th>
                </tr>
                <tr>
                    <td>%</td>
                    <td>현재 웹 브라우저 창의 너비와 높이를 기준으로 이미지 크기를 결정한다.</td>
                    <td>width="50%"</td>
                </tr>
                <tr>
                    <td>px</td>
                    <td>이미지의 너비나 높이를 해당 픽셀 크기만큼 표시한다.</td>
                    <td>width="150"</td>
                </tr>
            </table>
            <div>
                <h4>이미지 너비 지정을 다양하게 하기</h4>
                <p>원래 크기의 이미지</p>
                <img src="http://placeimg.com/300/200/nature" alt="random nature dummy img">
                <p>width="50%", height="50%"</p>
                <img src="http://placeimg.com/300/200/nature" alt="random nature dummy img" width="50%" height="50%">
                <p>width="150"</p>
                <img src="http://placeimg.com/300/200/nature" alt="random nature dummy img" width="150">
            </div>
        </div>
    </div>
```

![image](https://user-images.githubusercontent.com/91731260/181907694-4d3d499e-bb69-4f2d-94cd-18f1515c7fad.png)
![image](https://user-images.githubusercontent.com/91731260/181907701-d35645f3-2bfb-47c6-b18d-7ddb729f5c3e.png)
![image](https://user-images.githubusercontent.com/91731260/181907707-6c08e87c-565f-4228-9806-285d0dadb7a2.png)

```html
    <h2>4-4</h2>
    <div>
        <h3>이미지 삽입하기</h3>
        <div>
            <p>웹 문서에 이미지를 삽입할 때 가장 기본적인 태그는 &lt;img&gt;태그이다.</p>
            <!--이미지 태그-->
            <img src="http://placeimg.com/300/200/nature" alt="random nature dummy img">
            <p>src는 웹 브라우저가 이미지를 가지고 올 때 참고할 이미지 경로, alt는 화면 낭독기 등에서 이미지를 대신해서 읽어줄 텍스트이다.<br>
                src에 이미지 경로를 넣을 때는 현 웹 문서가 있는 디렉토리를 기준으로 작성하여야한다.</p>
            <p>웹에서 사용하는 대표적인 이미지 파일 형식에는 GIF<sup>graphic interchange format</sup>, JPG<sup> joint photographic experts
                    group</sup>,
                PNG<sup>portable network graphics</sup>가 있다.</p>
            <h4>alt 작성하기</h4>
            <p>텍스트로 만든 메뉴나 로고, 또는 내용을 이미지로 처리할 경우, 이미지를 부연 설명하는 것이 아닌 이미지 안에 포함된 텍스트를 넣어줘야한다.<br>
                불릿이나 아이콘 이미지처럼 내용 전달이 아닌 화면을 꾸밀 때 사용한 이미지는 텍스트를 따로 넣지 않아도 된다. 이때는 alt=""만 입력한다.
            </p>
        </div>
        <h3>이미지 크기를 조절하기</h3>
        <div>
            <p>
                &lt;img&gt;태그로 이미지 파일을 삽입하면 원래 이미지 크기대로 표시된다. 웹 브라우저 창에서 보이는 이미지 크기만 조절하고 싶다면 with와 height 속성을 사용할 수
                있다.<br>
                width는 이미지의 너비를, height는 이미지의 높이를 지정한다. 두 가지 다 사용해도 돠고, 한 가지만 사용해도 된다. 한 가지만 사용할 경우 다른 하나는 자동계산되어
                나타낸다.<br>
                이 두 속성에서 사용할 수 있는 단위에는 퍼센트<sup>%</sup>와 픽셀<sup>px</sup>이 있다.
            </p>
            <table>
                <caption>이미지의 크기를 표현하는 단위</caption>
                <colgroup>
                    <col style="width:150px">
                    <col style="width:500px">
                    <col style="width:150px">
                </colgroup>
                <tr>
                    <th>종류</th>
                    <th>설명</th>
                    <th>예시</th>
                </tr>
                <tr>
                    <td>%</td>
                    <td>현재 웹 브라우저 창의 너비와 높이를 기준으로 이미지 크기를 결정한다.</td>
                    <td>width="50%"</td>
                </tr>
                <tr>
                    <td>px</td>
                    <td>이미지의 너비나 높이를 해당 픽셀 크기만큼 표시한다.</td>
                    <td>width="150"</td>
                </tr>
            </table>
            <div>
                <h4>이미지 너비 지정을 다양하게 하기</h4>
                <p>원래 크기의 이미지</p>
                <img src="http://placeimg.com/300/200/nature" alt="random nature dummy img">
                <p>width="50%", height="50%"</p>
                <img src="http://placeimg.com/300/200/nature" alt="random nature dummy img" width="50%" height="50%">
                <p>width="150"</p>
                <img src="http://placeimg.com/300/200/nature" alt="random nature dummy img" width="150">
            </div>
        </div>
    </div>
```

![image](https://user-images.githubusercontent.com/91731260/181907723-012a4907-cfdd-4512-9bac-e81558c12ba4.png)
![image](https://user-images.githubusercontent.com/91731260/181907728-7bae63d3-4a41-4290-9aa6-14b8aa7fcbfc.png)
![image](https://user-images.githubusercontent.com/91731260/181907733-ad3672f3-75b0-4ff6-9f78-30574e39026c.png)

```html
<h2>4-5</h2>
    <div>
        <h3>오디오와 비디오 삽입</h3>
        <h4>&lt;object&gt;, &lt;embed&gt; 태그</h4>
        <div>
            <p>&lt;object&gt;태그는 오디오 파일 외에도 비디오, 자바 애플릿, PDF등 다양한 멀티미디어 파일 삽입 시 사용한다.<br>
                <code>&lt;object width="너비" height="높이" data="파일"&gt;&lt;/object&gt;</code><br>
                data 속성에 보여 줄 멀티미디어 파일을 지정하고 width, height 속성을 사용해 플래이어의 크기를 지정한다.
            </p>
            <p>&lt;embed&gt;태그는 html 초기 버전부터 사용해서 대부분의 브라우저에서 사용할 수 있다. &lt;embed&gt;태그에서는 src 속성을 사용해 삽입할 멀티미디어 파일을
                지정한다.
                필요할 경우에는 width, height 속성으로 플레이어의 너비와 높이를 지정할 수 있다. 닫는 태그가 없다.<br>
                <code>&lt;embed src="파일 경로" width="너비" height="높이"&gt;</code><br>
                &lt;embed&gt;는 다양한 멀티미디어 파일을 삽입할 수 있다. 따라서 &lt;audio&gt;, &lt;video&gt;, &lt;object&gt;태그를 지원하지 않는 웹
                브라우저를 고려해야한다면 &lt;embed&gt; 태그를 사용하여 멀티미디어 파일을 삽입한다.
            </p>
        </div>
        <h4>웹 브라우저에서 지원하는 멀티미디어 파일의 종류</h4>
        <div>
            <table>
                <caption>멀티미디어 파일의 종류</caption>
                <colgroup>
                    <col span="2" width="100">
                    <col width="800">
                </colgroup>
                <tr>
                    <th>종류</th>
                    <th>확장자</th>
                    <th>설명</th>
                </tr>
                <tr>
                    <td rowspan="2">비디오</td>
                    <td>mp4</td>
                    <td>많이 사용하는 비디오 형식, 라이선스 존재하나 웹에서는 무료로 사용 가능</td>
                </tr>
                <tr>
                    <td>webm</td>
                    <td>화질이 우수하고 무료이기에 mp4와 많이 사용됨</td>
                </tr>
                <tr>
                    <td rowspan="2">오디오</td>
                    <td>mp3</td>
                    <td>대부분의 음원에서 사용하는 형식. 2017년 이후 라이선스 종료되며 무료로 사용 가능하게 됨</td>
                </tr>
                <tr>
                    <td>mp4,<br>m4a</td>
                    <td>mp3의 문제점을 보완한 AAC 코덱을 사용한 파일 형식. 확장자는 mp4뿐만 아니라 m4a를 사용하기도 함</td>
                </tr>
            </table>
            <img src="https://user-images.githubusercontent.com/91731260/181904602-cba3c5fe-9f88-4f70-a6be-d3e7e1c1e319.png"
                alt="웹 브라우저별 오디오, 비도오 파일 지원 여부">
        </div>
        <h4>오디오와 비디오 파일 삽입하는 &lt;audio&gt;태그와 &lt;video&gt;태그</h4>
        <div>
            <p>HTML5에서는 이전 버전과 달리 웹 브라우저 안에서 멀티미디어 파일을 삽입하고 바로 재생 가능하다. 따라서 웹 브라우저에서 바로 멀티미디어 파일을 재생하기 때문에 브라우저마다 플레이어가
                다르다.
                같은 브라우저라도 버전에 따라 지원 상황이 달라질 수 있다.
            </p>
            <h5>오디오와 비디오 파일 삽입하기</h5>
            <p>html에서 오디오 파일을 삽입할 때는 &lt;audio&gt;를, 비디오 태그를 삽입할 때는 &lt;video&gt;태그를 사용한다. 이때 컨트롤 바 속성도 함께 표시한다.<br>
                <code>&lt;audio src="오디오 파일 경로" &gt;&lt;/audio&gt;</code><br>
                <code>&lt;video src="비디오 파일 경로" &gt;&lt;/video&gt;</code>
            </p>
        </div>
        <h4>&lt;audio&gt;, &lt;video&gt;태그의 속성</h4>
        <div>
            <table>
                <caption>&lt;audio&gt;와 &lt;video&gt;태그의 속성</caption>
                <tr>
                    <th>종류</th>
                    <th>설명</th>
                </tr>
                <tr>
                    <td>controls</td>
                    <td>플레이어 화면에 컨트롤 바를 표시</td>
                </tr>
                <tr>
                    <td>autoplay</td>
                    <td>오디오나 비디오를 자동으로 실행</td>
                </tr>
                <tr>
                    <td>loop</td>
                    <td>오디오나 비디오를 반복 재생</td>
                </tr>
                <tr>
                    <td>preload</td>
                    <td>페이지를 불러올 때 오디오나 비디오 파일을 어떻게 로딩할 것인지 지정. 사용할 수 있는 값은 auto, metadata, none. 기본값은 auto</td>
                </tr>
                <tr>
                    <td>width, height</td>
                    <td>비디오 플레이어의 너비와 높이를 지정. 하나만 지정할 시 나머지는 자동으로 계산해서 표시</td>
                </tr>
                <tr>
                    <td>poster="파일 이름"</td>
                    <td>&lt;video&gt;태그에서 사용하는 속성, 비디오가 재생되기 전까지 화면에 표시될 포스터 이미지 지정</td>
                </tr>
            </table>
            <p>오디오 파일을 배경 음악처럼 이용하려면 &lt;audio&gt; 태그에서 autoplay 속성과 loop 속성을 지정하고, 플레이어를 보이지 않도록 하려면 controls 속성을 빼면
                된다.<br>
                그러나 대부분의 웹 브라우저에서는 오디오나 소리가 있는 비디오 파일의 자동 재생을 금지하고 있다.</p>
        </div>
    </div>
```

![image](https://user-images.githubusercontent.com/91731260/181907739-deb13ac3-7154-4e70-859d-8bca8718be82.png)

```html
<h2>4-6</h2>
    <div>
        <h3>하이퍼링크 삽입하기</h3>
        <div>
            <h4>&lt;a&gt;태그와 href 속성</h4>
            <p>링크는 &lt;a&gt;태그로 만드는데 텍스트를 사용하면 텍스트 링크가 되고, 이미지를 사용하면 이미지 링크가 된다. &lt;a&gt;태그는 href속성을 이용해 연결할 파일이나 링크할
                주소를 쓴다.<br>
                <code>&lt;a href="링크할 주소">&gt;텍스트 또는 이미지&lt;/a&gt;</code>
            </p>
            <div>
                <h5>텍스트 링크 만들기</h5>
                <p>텍스트 링크는 &lt;a&gt;와 &lt;/a&gt;사이에 링크로 만들 텍스트를 입력하고 href 속성에는 텍스트를 클릭하면 연결할 문서의 경로와 파일 명을 넣으면 된다.<br>
                    텍스트 링크의 색을 바꾸기 위해서는 CSS를 이용한다.</p>
            </div>
            <div>
                <h5>이미지 링크 만들기</h5>
                <p>텍스트 링크를 만드는 것과 마찬가지로 &lt;a&gt;태그를 사용해 이미지에 링크를 추가할 수 있다. &lt;a&gt;태그와 &lt;/a&gt;태그 사이에 &lt;img&gt;태그를
                    넣으면 된다.</p>
            </div>
            <div>
                <h5>링크를 새 탭에서 여는 target 속성</h5>
                <p>target 속성에 _blank 지정시 링크를 클릭했을 때 연결된 문서가 새 탭에서 열린다.</p>
            </div>
        </div>
```

아래는 전체 코드
```html
<!DOCTYPE html>
<html lang="ko">

<head>
    <title>Document</title>
</head>

<body>
    <!--제목 텍스트는 <hn></hn>태그를 이용하며 1이 가장 크고 6이 가장 작다.-->
    <h1>실습 내용</h1>
    <h2>4-1</h2>
    <div>
        <p> &lt;p&gt;태그는 위 아래로 빈줄을 생성한다. &lt;p&gt;태그 안에서 줄 바꿈을 위해서는 &lt;br&gt; 태그를 사용한다.<br>
            줄 바꾸기</p>
        <p>&lt;br&gt;를 두 개 사용하면 단락을 두 개 만든 것 처럼 보이게 할 수 있다.<br><br>
            그러나 이는 이후에 css를 적용할 때 문제가 생기므로 단락을 만들 때는 &lt;p&gt;를 사용하자.</p>
        <blockquote>인용문을 웹 브라우저가 인식하게 하기 위해서는 &lt;blockquote&gt;를 사용하자.</blockquote>
        <!--인용문을 웹 브라우저에서는 다른 텍스트보다 약간 들여쓴다. 화면 낭독기에서도 다르게 인식한다.-->
        <p>텍스트를 <b>굵게</b> 표시해 강조하고 싶을 땐 <strong>&lt;strong&gt;</strong>이나 <b>&lt;b&gt;</b>태그를 사용하자.<br>
            strong 태그는 주의 사항이나 중요한 내용을 강조해야할 때,<br>
            b 태그는 단순한 키워드나 글자만 굵게 표시할 때 사용한다.</p>
        <p>텍스트를 기울여 표시해 강조하고 싶을 땐 <em>&lt;em&gt;</em>이나 <i>&lt;i&gt;</i>태그를 사용하자.<br>
            &lt;em&gt;태그는 문장에서 흐름항 특정 부분을 강조하고 싶을 때,<br>
            &lt;i&gt;태그는 문장을 구별하기 위해 기울여서 표기할 때 사용한다.</p>
        <p>다양한 태그들<br>
            <!--<abbr="Internet_of_Things">IoT</abbr><br>-->
                <!--줄임말을 표시하고 title 속성을 함께 사용할 수 있다.-->
                <cite>Do it HTML, CSS, 자바스크립트 웹 표준의 정석</cite><br>
                <!--참고 내용 표시-->
                <code>function savetheLocal()</code><br>
                <!--컴퓨터 인식을 위한 짧은 소스 코드 / 마크다운의 `test`같은 느낌-->
                <small>작게 표시해도 되는 텍스트</small><br>
                윗 첨자<sup>&lt;sup&gt;</sup>태그와 아랫 첨자<sub>&lt;sub&gt;</sub><br>
                <s>취소선</s>과 <u>밑줄</u><br>
                <ins>공동 문서에서 새로운 내용 삽입</ins><br>
                <del>공동 문서에서 기존 내용 삭제</del>
        </p>
    </div>
    <h2>4-2</h2>
    <div>
        <h3>목록 만들기</h3>
        <div>
            <h4>순서 있는 목록 만들기</h4>
            <p>
                순서 있는 목록을 만들기 위해서는 &lt;ol&gt;태그와 &lt;li&gt;태그를 사용해야한다.<br>
                <!--ol은 ordered list의 준말, li는 list의 준말이다.-->
                표시할 내용 앞뒤에 &lt;ol&gt;과 &lt;/ol&gt;태그를 두고, 그 사이에 &lt;li&gt;태그와 &lt;/li&gt;태그를 삽입한다.<br>
                예시
            <ol>
                <li>list 1</li>
                <li>list 2</li>
            </ol>
            </p>
            <p>type 목록</p>
            <ol type="1" start="1">
                <li>type = "1"<sup>숫자(기본값)</sup></li>
            </ol>
            <ol type="a" start="2">
                <li>type = "a"<sup>영문 소문자</sup></li>
            </ol>
            <ol type="A" start="3">
                <li>type = "A"<sup>영문 대문자</sup></li>
            </ol>
            <ol type="i" start="4">
                <li>type = "i"<sup>로마 숫자 소문자</sup></li>
            </ol>
            <ol type="I" start="5">
                <li>type = "I"<sup>로마 숫자 대문자</sup></li>
            </ol>
        </div>
        <div>
            <h4>순서 없는 리스트 만들기</h4>
            <p>
                순서 없는 목록<sup>unordered list</sup>은 순서가 중요하지 않을 때 사용한다.<br>
                &lt;ul&gt;과 &lt;/ul&gt;태그를 목록 앞뒤에 붙인 후 &lt;li&gt;와 &lt;/li&gt;태그를 삽입한다.<br>
                순서 없는 목록은 학목 앞에 작은 원이나 사각형 등 작은 그림을 붙여서 구분하는데, 이것을 불릿<sup>bullet</sup>이라고 한다.<br>
                예시
            <ul>
                <li>list 1</li>
                <li>list 2</li>
            </ul>
            </p>
        </div>
        <div>
            <h4>설명 목록</h4>
            <p>설명 목록이란 이름과 값 형태로 된 목록이다.<br>
                이름을 지정하는 &lt;dt&gt;태그와 &lt;dd&gt;태그를 넣는다. &lt;dt&gt;안에 여러 개의 &lt;dd&gt;태그를 넣을 수도 있다.</p>
            <p>예시</p>
            <dl>
                <dt>name</dt>
                <dd>value1</dd>
                <dd>value2</dd>
            </dl>
        </div>
    </div>
    <h2>4-3</h2>
    <div>
        <h3>표 만들기</h3>
        <p>표<sup>table</sup>는 행<sup>row</sup>과 열<sup>column</sup>과 셀<sup>cell</sup>로 이루어진다.<br>
            표의 시작과 끝을 알려주는 &lt;table&gt;과 &lt;/table&gt;태그를 표시하고 그 사이에 표와 관련된 태그를 모두 넣는다.<br>
            제목을 넣고 싶다면 &lt;caption&gt;태그를 이용하자.<br>
            &lt;tr&gt;은 행, &lt;td&gt;는 셀을 만든다.<br>
            &lt;th&gt;를 &lt;td&gt;대신 사용하여 제목 셀로 지정해주자.
        </p>
        <p>예시</p>
        <table>
            <caption>표 제목</caption>
            <tr>
                <th>row 1, column 1</th>
                <th>row 1, column 2</th>
            </tr>
            <tr>
                <td>row 2, colomn 1</td>
                <td>row 2, colomn 2</td>
            </tr>
        </table>
        <p>표에 구조를 지정할 수도 있다. 이 경우 시각 장애인도 화면 낭독기를 통해 표를 쉽게 이해할 수 있다.<br>
            아래는 &lt;thead&gt;와 &lt;tbody&gt;, &lt;tfoot&gt;태그를 이용한 예시이다.<br>
            표의 구조는 웹 브라우저 화면에서 보이지 않지만, 화면 낭독기나 자바스크립트 등에서 읽을 수 있다.</p>
        <table>
            <caption>example with &lt;thead&gt;, &lt;tbody&gt;,&lt;tfoot&gt;.</caption>
            <thead>
                <tr>
                    <th>&lt;thead&gt; title cell r1 c1</th>
                    <th>&lt;thead&gt; title cell r1 c2</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>&lt;tbody&gt; cell r2 c1</td>
                    <td>&lt;tbody&gt; cell r2 c2</td>
                </tr>
                <tr>
                    <td>&lt;tbody&gt; cell r3 c1</td>
                    <td>&lt;tbody&gt; cell r3 c2</td>
                </tr>
            </tbody>
            <tfoot>
                <tr>
                    <td>&lt;tfoot&gt; cell r4 c1</td>
                    <td>&lt;tfoot&gt; cell r4 c2</td>
                </tr>
            </tfoot>
        </table>
        <h3>행이나 열 합치기</h3>
        <p>여러 셀을 합치거나 나누어서 다양한 형태로 바꿀 수 있다. 행이나 열을 합치는 것은 실질적으로 셀을 합치는 것이므로 &lt;td&gt;, &lt;th&gt;태그에서 이루어진다.
            행을 합치려면 <b>rowspan</b>속성, 열을 합치려면 <b>colspan</b>속성을 사용하여 몇 개의 셀을 합칠지 지정한다.<br>
            <small>아래는 rowspan과 colspan 속성을 사용한 예시</small>
        </p>
        <table>
            <caption>example with &lt;thead&gt;, &lt;tbody&gt;,&lt;tfoot&gt;.</caption>
            <thead>
                <tr>
                    <th colspan="2">&lt;thead&gt; title cell r1</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td rowspan="2">&lt;tbody&gt; cell r2 c1</td>
                    <td>&lt;tbody&gt; cell r2 c2</td>
                </tr>
                <tr>
                    <td>&lt;tbody&gt; cell r3 c2</td>
                </tr>
            </tbody>
            <tfoot>
                <tr>
                    <td colspan="2">&lt;tfoot&gt; cell r4</td>
                </tr>
            </tfoot>
        </table>
        <h3>열을 묶기</h3>
        <p>단순히 표를 만들기만 하는 것이 아닌 특정 열에 배경색을 넣거나 너비를 바꾸려면 원하는 열을 선택할 수 있어야한다.<br>
            이때 사용하는 태그가 &lt;col&gt;태그와 &lt;colgroup&gt;태그다.<br>
            &lt;col&gt;태그는 열을 한 개만 지정할 때 사용, &lt;colgroup&gt;태그는 &lt;col&gt;태그를 2개 이상 묶어서 사용한다.<br>
            <strong>&lt;col&gt;태그는 닫는 태그가 없다!!</strong>
            &lt;col&gt;태그와 &lt;colgroup&gt;태그는 반드시 &lt;caption&gt;태그 다음에 써야한다. 즉, 표의 내용이 시작되기 전에 열의 상태를 알려주는 것이다.
            그리고 &lt;col&gt;태그를 사용할 때는 &lt;colgroup&gt;태그 안에 표의 전체 열의 개수만큼 &lt;col&gt;태그를 넣어야한다.<br>
            <small>아래는 특정 열에 스타일 속성을 지정한 예시</small>
        </p>
        <table>
            <caption>example with &lt;thead&gt;, &lt;tbody&gt;,&lt;tfoot&gt;.</caption>
            <colgroup>
                <col style="background-color: aqua;">
                <col span="2" style="background-color: azure" ;>
            </colgroup>
            <thead>
                <tr>
                    <th colspan="2">&lt;thead&gt; title cell r1</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td rowspan="2">&lt;tbody&gt; cell r2 c1</td>
                    <td>&lt;tbody&gt; cell r2 c2</td>
                </tr>
                <tr>
                    <td>&lt;tbody&gt; cell r3 c2</td>
                </tr>
            </tbody>
            <tfoot>
                <tr>
                    <td colspan="2">&lt;tfoot&gt; cell r4</td>
                </tr>
            </tfoot>
        </table>
    </div>
    <h2>4-4</h2>
    <div>
        <h3>이미지 삽입하기</h3>
        <div>
            <p>웹 문서에 이미지를 삽입할 때 가장 기본적인 태그는 &lt;img&gt;태그이다.</p>
            <!--이미지 태그-->
            <img src="http://placeimg.com/300/200/nature" alt="random nature dummy img">
            <p>src는 웹 브라우저가 이미지를 가지고 올 때 참고할 이미지 경로, alt는 화면 낭독기 등에서 이미지를 대신해서 읽어줄 텍스트이다.<br>
                src에 이미지 경로를 넣을 때는 현 웹 문서가 있는 디렉토리를 기준으로 작성하여야한다.</p>
            <p>웹에서 사용하는 대표적인 이미지 파일 형식에는 GIF<sup>graphic interchange format</sup>, JPG<sup> joint photographic experts
                    group</sup>,
                PNG<sup>portable network graphics</sup>가 있다.</p>
            <h4>alt 작성하기</h4>
            <p>텍스트로 만든 메뉴나 로고, 또는 내용을 이미지로 처리할 경우, 이미지를 부연 설명하는 것이 아닌 이미지 안에 포함된 텍스트를 넣어줘야한다.<br>
                불릿이나 아이콘 이미지처럼 내용 전달이 아닌 화면을 꾸밀 때 사용한 이미지는 텍스트를 따로 넣지 않아도 된다. 이때는 alt=""만 입력한다.
            </p>
        </div>
        <h3>이미지 크기를 조절하기</h3>
        <div>
            <p>
                &lt;img&gt;태그로 이미지 파일을 삽입하면 원래 이미지 크기대로 표시된다. 웹 브라우저 창에서 보이는 이미지 크기만 조절하고 싶다면 with와 height 속성을 사용할 수
                있다.<br>
                width는 이미지의 너비를, height는 이미지의 높이를 지정한다. 두 가지 다 사용해도 돠고, 한 가지만 사용해도 된다. 한 가지만 사용할 경우 다른 하나는 자동계산되어
                나타낸다.<br>
                이 두 속성에서 사용할 수 있는 단위에는 퍼센트<sup>%</sup>와 픽셀<sup>px</sup>이 있다.
            </p>
            <table>
                <caption>이미지의 크기를 표현하는 단위</caption>
                <colgroup>
                    <col style="width:150px">
                    <col style="width:500px">
                    <col style="width:150px">
                </colgroup>
                <tr>
                    <th>종류</th>
                    <th>설명</th>
                    <th>예시</th>
                </tr>
                <tr>
                    <td>%</td>
                    <td>현재 웹 브라우저 창의 너비와 높이를 기준으로 이미지 크기를 결정한다.</td>
                    <td>width="50%"</td>
                </tr>
                <tr>
                    <td>px</td>
                    <td>이미지의 너비나 높이를 해당 픽셀 크기만큼 표시한다.</td>
                    <td>width="150"</td>
                </tr>
            </table>
            <div>
                <h4>이미지 너비 지정을 다양하게 하기</h4>
                <p>원래 크기의 이미지</p>
                <img src="http://placeimg.com/300/200/nature" alt="random nature dummy img">
                <p>width="50%", height="50%"</p>
                <img src="http://placeimg.com/300/200/nature" alt="random nature dummy img" width="50%" height="50%">
                <p>width="150"</p>
                <img src="http://placeimg.com/300/200/nature" alt="random nature dummy img" width="150">
            </div>
        </div>
    </div>
    <h2>4-5</h2>
    <div>
        <h3>오디오와 비디오 삽입</h3>
        <h4>&lt;object&gt;, &lt;embed&gt; 태그</h4>
        <div>
            <p>&lt;object&gt;태그는 오디오 파일 외에도 비디오, 자바 애플릿, PDF등 다양한 멀티미디어 파일 삽입 시 사용한다.<br>
                <code>&lt;object width="너비" height="높이" data="파일"&gt;&lt;/object&gt;</code><br>
                data 속성에 보여 줄 멀티미디어 파일을 지정하고 width, height 속성을 사용해 플래이어의 크기를 지정한다.
            </p>
            <p>&lt;embed&gt;태그는 html 초기 버전부터 사용해서 대부분의 브라우저에서 사용할 수 있다. &lt;embed&gt;태그에서는 src 속성을 사용해 삽입할 멀티미디어 파일을
                지정한다.
                필요할 경우에는 width, height 속성으로 플레이어의 너비와 높이를 지정할 수 있다. 닫는 태그가 없다.<br>
                <code>&lt;embed src="파일 경로" width="너비" height="높이"&gt;</code><br>
                &lt;embed&gt;는 다양한 멀티미디어 파일을 삽입할 수 있다. 따라서 &lt;audio&gt;, &lt;video&gt;, &lt;object&gt;태그를 지원하지 않는 웹
                브라우저를 고려해야한다면 &lt;embed&gt; 태그를 사용하여 멀티미디어 파일을 삽입한다.
            </p>
        </div>
        <h4>웹 브라우저에서 지원하는 멀티미디어 파일의 종류</h4>
        <div>
            <table>
                <caption>멀티미디어 파일의 종류</caption>
                <colgroup>
                    <col span="2" width="100">
                    <col width="800">
                </colgroup>
                <tr>
                    <th>종류</th>
                    <th>확장자</th>
                    <th>설명</th>
                </tr>
                <tr>
                    <td rowspan="2">비디오</td>
                    <td>mp4</td>
                    <td>많이 사용하는 비디오 형식, 라이선스 존재하나 웹에서는 무료로 사용 가능</td>
                </tr>
                <tr>
                    <td>webm</td>
                    <td>화질이 우수하고 무료이기에 mp4와 많이 사용됨</td>
                </tr>
                <tr>
                    <td rowspan="2">오디오</td>
                    <td>mp3</td>
                    <td>대부분의 음원에서 사용하는 형식. 2017년 이후 라이선스 종료되며 무료로 사용 가능하게 됨</td>
                </tr>
                <tr>
                    <td>mp4,<br>m4a</td>
                    <td>mp3의 문제점을 보완한 AAC 코덱을 사용한 파일 형식. 확장자는 mp4뿐만 아니라 m4a를 사용하기도 함</td>
                </tr>
            </table>
            <img src="https://user-images.githubusercontent.com/91731260/181904602-cba3c5fe-9f88-4f70-a6be-d3e7e1c1e319.png"
                alt="웹 브라우저별 오디오, 비도오 파일 지원 여부">
        </div>
        <h4>오디오와 비디오 파일 삽입하는 &lt;audio&gt;태그와 &lt;video&gt;태그</h4>
        <div>
            <p>HTML5에서는 이전 버전과 달리 웹 브라우저 안에서 멀티미디어 파일을 삽입하고 바로 재생 가능하다. 따라서 웹 브라우저에서 바로 멀티미디어 파일을 재생하기 때문에 브라우저마다 플레이어가
                다르다.
                같은 브라우저라도 버전에 따라 지원 상황이 달라질 수 있다.
            </p>
            <h5>오디오와 비디오 파일 삽입하기</h5>
            <p>html에서 오디오 파일을 삽입할 때는 &lt;audio&gt;를, 비디오 태그를 삽입할 때는 &lt;video&gt;태그를 사용한다. 이때 컨트롤 바 속성도 함께 표시한다.<br>
                <code>&lt;audio src="오디오 파일 경로" &gt;&lt;/audio&gt;</code><br>
                <code>&lt;video src="비디오 파일 경로" &gt;&lt;/video&gt;</code>
            </p>
        </div>
        <h4>&lt;audio&gt;, &lt;video&gt;태그의 속성</h4>
        <div>
            <table>
                <caption>&lt;audio&gt;와 &lt;video&gt;태그의 속성</caption>
                <tr>
                    <th>종류</th>
                    <th>설명</th>
                </tr>
                <tr>
                    <td>controls</td>
                    <td>플레이어 화면에 컨트롤 바를 표시</td>
                </tr>
                <tr>
                    <td>autoplay</td>
                    <td>오디오나 비디오를 자동으로 실행</td>
                </tr>
                <tr>
                    <td>loop</td>
                    <td>오디오나 비디오를 반복 재생</td>
                </tr>
                <tr>
                    <td>preload</td>
                    <td>페이지를 불러올 때 오디오나 비디오 파일을 어떻게 로딩할 것인지 지정. 사용할 수 있는 값은 auto, metadata, none. 기본값은 auto</td>
                </tr>
                <tr>
                    <td>width, height</td>
                    <td>비디오 플레이어의 너비와 높이를 지정. 하나만 지정할 시 나머지는 자동으로 계산해서 표시</td>
                </tr>
                <tr>
                    <td>poster="파일 이름"</td>
                    <td>&lt;video&gt;태그에서 사용하는 속성, 비디오가 재생되기 전까지 화면에 표시될 포스터 이미지 지정</td>
                </tr>
            </table>
            <p>오디오 파일을 배경 음악처럼 이용하려면 &lt;audio&gt; 태그에서 autoplay 속성과 loop 속성을 지정하고, 플레이어를 보이지 않도록 하려면 controls 속성을 빼면
                된다.<br>
                그러나 대부분의 웹 브라우저에서는 오디오나 소리가 있는 비디오 파일의 자동 재생을 금지하고 있다.</p>
        </div>
    </div>
    <h2>4-6</h2>
    <div>
        <h3>하이퍼링크 삽입하기</h3>
        <div>
            <h4>&lt;a&gt;태그와 href 속성</h4>
            <p>링크는 &lt;a&gt;태그로 만드는데 텍스트를 사용하면 텍스트 링크가 되고, 이미지를 사용하면 이미지 링크가 된다. &lt;a&gt;태그는 href속성을 이용해 연결할 파일이나 링크할
                주소를 쓴다.<br>
                <code>&lt;a href="링크할 주소">&gt;텍스트 또는 이미지&lt;/a&gt;</code>
            </p>
            <div>
                <h5>텍스트 링크 만들기</h5>
                <p>텍스트 링크는 &lt;a&gt;와 &lt;/a&gt;사이에 링크로 만들 텍스트를 입력하고 href 속성에는 텍스트를 클릭하면 연결할 문서의 경로와 파일 명을 넣으면 된다.<br>
                    텍스트 링크의 색을 바꾸기 위해서는 CSS를 이용한다.</p>
            </div>
            <div>
                <h5>이미지 링크 만들기</h5>
                <p>텍스트 링크를 만드는 것과 마찬가지로 &lt;a&gt;태그를 사용해 이미지에 링크를 추가할 수 있다. &lt;a&gt;태그와 &lt;/a&gt;태그 사이에 &lt;img&gt;태그를
                    넣으면 된다.</p>
            </div>
            <dig>
                <h5>링크를 새 탭에서 여는 target 속성</h5>
                <p>target 속성에 _blank 지정시 링크를 클릭했을 때 연결된 문서가 새 탭에서 열린다.</p>
            </dig>
        </div>
    </div>
</body>

</html>
```