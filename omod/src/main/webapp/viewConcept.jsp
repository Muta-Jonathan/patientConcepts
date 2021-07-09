
<!-- header -->
<%@ include file="/WEB-INF/template/include.jsp"%>

<%@ include file="/WEB-INF/template/header.jsp"%>
<!-- context  -->
<form method="get">
	Choose a Concept:
	<openmrs_tag:conceptField formFieldName="conceptId" />
	<input type="submit" value="Search">
</form>
<br>
<table>
	<tr>
		<th>Concept ID</th>
		<td>${concept.conceptId }</td>
	</tr>
	<tr>
		<td>
			<table border="1">
				<tr>
					<th>Name</th>
					<th>Type</th>
					<th>Locale</th>
					<th>Description</th>

				</tr>

				<c:forEach var="cn" items="${concept.names}">
					<tr>
						<td>${cn.conceptNameType }</td>
						<td><c:out escapeXml="true" value="${cn.name }" /></td>
						<td>${cn.locale }</td>
						<td>${cn.description }</td>

					</tr>
				</c:forEach>
			</table>
		</td>
	</tr>
</table>
<br>
<p>Search for any Concept at anytime.........</p>
<br>
<!-- footer -->
<%@ include file="/WEB-INF/template/footer.jsp"%>
