<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui"     uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
  /**
  * @Class Name : egovSampleList.jsp
  * @Description : Sample List 화면
  * @Modification Information
  *
  *   수정일         수정자                   수정내용
  *  -------    --------    ---------------------------
  *  2009.02.01            최초 생성
  *
  * author 실행환경 개발팀
  * since 2009.02.01
  *
  * Copyright (C) 2009 by MOPAS  All right reserved.
  */
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="ko" xml:lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title></title>
    <link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>
    <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    
</head>

<body style="text-align:center; margin:0 auto; display:inline; padding-top:100px;">
<input type="button" class="tab" value="btn1" />
<input type="button" class="tab" value="btn2" />
<input type="button" class="tab" value="btn3" />
<input type="button" class="tab" value="btn4" />
<input type="button" class="tab" value="btn5" />
</body>

<script>
$( document ).ready(function() {
	
	// 함수 표현식의 클로저 실행
	// 함수가 실행 되기 전 함수에 값을 전달하기위해 사용
	// 함수가 실행 되기 전 값을 전달하지않으면 for문의 length값(즉 마지막 값)만 함수에 전달되게 됨
	function tabsHandler(index) {
	    return function tabClickEvent(event) {
	        // 바깥 함수인 tabsHandler 의 index 인자를 여기서 접근할 수 있다.
	        console.log(index); // 탭을 클릭할 때 마다 해당 탭의 index 값을 표시
	    };
	}
	
	var tabs = document.querySelectorAll('.tab');
	var i;
	
	for (i = 0; i < tabs.length; i += 1) {
	    tabs[i].onclick = tabsHandler(i);
	}
	
	
	logMessage();
});

// 함수의 표현식
var logMessage = function () {
  console.log('An anonymous function');
};

</script>

</html>
