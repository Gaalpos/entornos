# Emmet


## nav>ul>li
```html
<nav>
    <ul>
        <li></li>
    </ul>
</nav>
```
---
## ul>li*5
```html
<ul>
    <li></li>
    <li></li>
    <li></li>
    <li></li>
    <li></li>
</ul>
```
---

## ul>li.item
```html
<ul>
    <li class="item"></li>
</ul>

```
---
## ul>li.item$*5
```html
<ul>
    <li class="item1"></li>
    <li class="item2"></li>
    <li class="item3"></li>
    <li class="item4"></li>
    <li class="item5"></li>
</ul>

```
---
## h1[title=item$]
```html
<h1 title="item$"></h1>

```

---
## [a='value1' b="value2"]
```html
<div a="value1" b="value2"></div>
```
---
## h$[title=item$]{Header $}*3
```html
<h1 title="item1">Header 1</h1>
<h2 title="item2">Header 2</h2>
<h3 title="item3">Header 3</h3>
```
---

## ul>li.item$$$*5
```html
<ul>
    <li class="item001"></li>
    <li class="item002"></li>
    <li class="item003"></li>
    <li class="item004"></li>
    <li class="item005"></li>
</ul>

```
---
## div+p+bq

```html
<div></div>
<p></p>
<blockquote></blockquote>
```
---

## #header
```html
<div id="header"></div>
```
---
## p.class1.class2.class3

```html
<p class="class1 class2 class3"></p>

```
---
## form#search.wide
```html
<form id="search" class="wide"></form>

```
--- 
## p[title="Hello world"]
```html
<p title="Hello world"></p>
```
---
## td[rowspan=2 colspan=3 title]
```html
<td rowspan="2" colspan="3" title=""></td>
```
---
## a{Click me}
```html
<a href="">Click me</a>
```

## div+div>p>span+em^bq

```html
<div></div>
<div>
    <p><span></span><em></em></p>
    <blockquote></blockquote>
</div>
```
---
## div+div>p>span+em^^bq
```html
<div></div>
<div>
    <p><span></span><em></em></p>
</div>
<blockquote></blockquote>
```
---
## ul>li.item$@-*5
```html
<ul>
    <li class="item5"></li>
    <li class="item4"></li>
    <li class="item3"></li>
    <li class="item2"></li>
    <li class="item1"></li>
</ul>
```
---
## ul>li.item$@3*5

```html
<ul>
    <li class="item3"></li>
    <li class="item4"></li>
    <li class="item5"></li>
    <li class="item6"></li>
    <li class="item7"></li>
</ul>
```
---
## div>(header>ul>li*2>a)+footer>p
```html
<div>
    <header>
        <ul>
            <li><a href=""></a></li>
            <li><a href=""></a></li>
        </ul>
    </header>
    <footer>
        <p></p>
    </footer>
</div>
```
---
## div>dl>(dt+dd)*3)+footer>p

```html
<div>
    <dl>
        <dt></dt>
        <dd></dd>
        <dt></dt>
        <dd></dd>
        <dt></dt>
        <dd></dd>
    </dl>
</div>
<footer>
    <p></p>
</footer>

```
---
## input:text o input:t

```html
<input type="text" name="" id="">

```
---
