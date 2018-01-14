<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List,com.myproject.bean.Track" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
	fieldset {
		margin-left: 30%;
    	margin-right: 30%;
	}
	th, tr {
		text-align: left;
    	padding: 15px;
	}
	.button {
		margin-left: 45%;
	    position: absolute;
	    top: 40%;
	}
	.button1 {
		margin-left: 50%;
	    position: absolute;
	    top: 40%;
	}
</style>
<script>
function goBack() {
    window.history.back();
}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Find Track</title>
</head>
<body>
	<div>
		<form method="post" action="TrackController?action=Search">
			<fieldset>
				<legend align="center"><h1>Search an Entry</h1></legend>
				<table align="center">
				<tr>
				<th>Choose : </th>
				<th><select name="criteria">
				  <option value="title">Title</option>
				  <option value="singer">Singer</option>
				</select></th>
				</tr>
				<tr>
					<th>Title/Singer  : </th>
					<th><input type="text" name="searchText" required="true"></th>
				</tr>				
				</table>
				<br>
			</fieldset>
			<input class="button" type="submit" value="Search">
			<button class="button1" onclick="goBack()">Back</button>
	 	</form>
	 	
	 	<%String mode = (String) request.getAttribute("mode");
	 	if("results".equalsIgnoreCase(mode)){%>
	 	
	 	<table border="1">
	<thead>
		<tr><th>Title</th><th>Singer</th></tr>
	</thead>
	<tbody>
		<% List<Track> trackList = (List<Track>) request.getAttribute("trackList"); 
		if(trackList!=null && trackList.size()>0){
		for(Track track : trackList){%>
			<tr><td><%=track.getTitle() %></td><td><%=track.getSinger() %></td></tr>
		<%} }else{%>
		<tr colspan="2"><td>No Results to Display</td></tr>
		<%} }%>
	</tbody>		
	</table>
	</div>
</body>
</html>