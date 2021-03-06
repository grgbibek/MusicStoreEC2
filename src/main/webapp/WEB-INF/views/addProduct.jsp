<%--
  Created by IntelliJ IDEA.
  User: grgbibek22
  Date: 6/27/2017
  Time: 9:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/views/template/header.jsp"%>
<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Add Product</h1>
            <p class="lead">Fill the given form to add the product..</p>
        </div>

        <form:form action="${pageContext.request.contextPath}/admin/product/addProduct" method="post" commandName="product"
        enctype="multipart/form-data">

            <div class="form-group">
                <form:errors path="productName" cssStyle="color: #ff000f; "/>
                <label for="name">Name</label>
                <form:input path="productName" id="name"  class="form-control"/>
            </div>

            <div class="form-group">
                <label for="category">Category</label>
                <label class="checkbox-inline"><form:radiobutton path="productCategory" id="category" value="instrument" />Instrument</label>
                <label class="checkbox-inline"><form:radiobutton path="productCategory" id="category" value="record" />Record</label>
                <label class="checkbox-inline"><form:radiobutton path="productCategory" id="category" value="accessory" />Accessory</label>

            </div>

            <div class="form-group">
                <label for="description">Description</label>
                <form:textarea path="productDescription" id="description" class="form-control" />
            </div>

            <div class="form-group">
                <form:errors path="productPrice" cssStyle="color: #ff000f; "/>
                <label for="price">Price</label>
                <form:input path="productPrice" id="price" class="form-control" />
            </div>

            <div class="form-group">
                <label for="condition">Condition</label>
                <label class="checkbox-inline"><form:radiobutton path="productCondition" id="condition" value="new" />New</label>
                <label class="checkbox-inline"><form:radiobutton path="productCondition" id="condition" value="used" />Used</label>
            </div>

            <div class="form-group">
                <label for="status">Status</label>
                <label class="checkbox-inline"><form:radiobutton path="productStatus" id="status" value="active" />Active</label>
                <label class="checkbox-inline"><form:radiobutton path="productStatus" id="status" value="inactive" />Inactive</label>
            </div>

            <div class="form-group">
                <label for="unitInStock">Unit in Stock</label>
                <form:input path="unitInStock" id="unitInStock" class="form-control" />
            </div>

            <div class="form-group">
                <form:errors path="productManufacturer" cssStyle="color: #ff000f; "/>
                <label for="manufacturer">Manufacturer</label>
                <form:input path="productManufacturer" id="manufacturer" class="form-control" />
            </div>

            <div class="form-group">
                <label class="control-label"for="productImage">Upload Image</label>
                <form:input path="productImage" id="productImage" type="file" class="form:input-large" />
            </div>

            <br> <br>
            <input type="submit" value="submit" class="btn btn-default">
        <a href="<c:url value="/admin/productInventory" />" class="btn btn-default"> Cancel </a>
        </form:form>

<%@include file="/WEB-INF/views/template/footer.jsp"%>