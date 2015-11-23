<%@page import="com.meera.multidatasource.service.TableFromDefaultDataSourceLocalServiceUtil"%>
<%@page import="com.meera.multidatasource.model.TableFromDefaultDataSource"%>
<%@page import="com.meera.multidatasource.model.TableFromAnotherDataSource"%>
<%@page import="com.meera.multidatasource.service.TableFromAnotherDataSourceLocalServiceUtil"%>
<%
/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<h1>MultiDataSource  portlet.</h1>

<h1>Portlet Used Another  Data source to fetch data from TableFromAnotherDataSourc  table</h1>
<%
TableFromAnotherDataSource object=TableFromAnotherDataSourceLocalServiceUtil.getTableFromAnotherDataSource(1);
String data="";
if(object!=null){
	data=object.getDescription();
}else{
	data="No data avilable in table with primary key 1";
}


%>
<h1><%=data%></h1>


<br/>
<h1>Portlet Used Default Data source to fetch data from meera_tablefromdefaultdatasource table</h1>
<%
TableFromDefaultDataSource object1=TableFromDefaultDataSourceLocalServiceUtil.getTableFromDefaultDataSource(1);
String data1="";
if(object1!=null){
	data1=object1.getDescription();
}else{
	data1="No data avilable in table with primary key 1";
}


%>
<h1><%=data1 %></h1>