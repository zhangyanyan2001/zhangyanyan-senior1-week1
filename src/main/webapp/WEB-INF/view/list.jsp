<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>影片管理</title>
</head>

<link href="/resource/css/index3.css" rel="stylesheet">
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>
<body>
	<form action="list" method="post">
		影片名称:<input type="text" name="name">　　　  
		上映时间:<input type="date" name="startuptime">--<input type="date" name="enduptime"><br><br>
		
		　　导演:<input type="text" name="dao">
		　　　价格:<input type="text" name="startprice">--<input type="text" name="endprice"><br><br>
		
		电影年代:<select name="year">
				<option value="">请选择</option>
				<option value="2019">2019</option>
				<option value="2018">2018</option>
				<option value="2017">2017</option>
				<option value="2016">2016</option>
			</select>
		电影时长:<input type="text" name="startlongtime">--<input type="text" name="endlongtime"><br><br>
		<button>查询影片</button>
		<input type="submit" value="批量删除" onclick="ps()">
	</form>
	<table>
		<tr>
			<td>
				<input type="submit"  onclick="qx()" value="全选">
				<input type="submit"  onclick="fx()" value="反选">
			</td>
			<td>影片名</td>
			<td>导演</td>
			<td>票价</td>
			<td>上映时间</td>
			<td>时长</td>
			<td>类型</td>
			<td>年代</td>
			<td>区域</td>
			<td>状态</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list}" var="m">
			<tr>
				<td><input type="checkbox" value="${m.id}" class="ck"></td>
				<td>${m.name}</td>
				<td>${m.dao}</td>
				<td>${m.price}</td>
				<td>${m.uptime}</td>
				<td>${m.longtime}</td>
				<td>${m.type}</td>
				<td>${m.year}</td>
				<td>${m.tell}</td>
				<td>${m.stear}</td>
				<td>
					<a>详情</a>
					<a>编辑</a>
					<a>下架</a>
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="11">${page}</td>
		</tr>
	</table>
</body>
<script type="text/javascript">
	 function qx(){
		 $(".ck").each(function(){
				this.checked=true;
			})	
	}
	
	function fx(){
		$(".ck").each(function(){
			this.checked=!this.checked;
		})	
	} 
	

</script>
</html>