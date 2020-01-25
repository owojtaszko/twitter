<%--
  Created by IntelliJ IDEA.
  User: Olga
  Date: 19.01.2020
  Time: 10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.sda.twetter.persistance.entities.TbArticle" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:useBean id="articleService" scope="request" class="com.sda.twetter.service.ArticleService"/>
<!doctype html>
<html lang="en">

<jsp:include page="include/meta.jsp"/>
<%--Odnośnik do całej sekcji <head></head> w pliku meta--%>

<body>
<jsp:include page="include/header.jsp"/>
<main role="main">
    <!-- Main jumbotron for a primary marketing message or call to action -->
    <%
        final List<TbArticle> articles = articleService.getArticles();
        pageContext.setAttribute("articles", articles);
    %>

    <div class="container">
        <!-- Example row of columns -->
        <c:forEach items="${articles}" var="article">
            <%--        <div class="row ">--%>

            <div class="row d-flex justify-content-center">
                <div class="col-md-5">
                    <h2>Heading</h2>
                    <p>${article.content} </p>
                    <p><a class="btn btn-secondary" href="#" role="button">View details &raquo;</a></p>
                </div>
            </div>
            <hr>
        </c:forEach>
        <%--            <div class="row d-flex justify-content-center">--%>
        <%--                <div class="col-md-5">--%>
        <%--                    <h2>Heading</h2>--%>
        <%--                    <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor--%>
        <%--                        mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada--%>
        <%--                        magna--%>
        <%--                        mollis euismod. Donec sed odio dui. </p>--%>
        <%--                    <p><a class="btn btn-secondary" href="#" role="button">View details &raquo;</a></p>--%>
        <%--                </div>--%>
        <%--            </div>--%>
        <%--            <hr>--%>
        <%--            <div class="row d-flex justify-content-center">--%>
        <%--                <div class="col-md-5">--%>
        <%--                    <h2>Heading</h2>--%>
        <%--                    <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor--%>
        <%--                        mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada--%>
        <%--                        magna--%>
        <%--                        mollis euismod. Donec sed odio dui. </p>--%>
        <%--                    <p><a class="btn btn-secondary" href="#" role="button">View details &raquo;</a></p>--%>
        <%--                </div>--%>
        <%--            </div>--%>

        <%--        </div>--%>
        <%--        <hr>--%>
    </div> <!-- /container -->
</main>
<jsp:include page="include/footer.jsp"/>
<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="js/bootstrap.js"></script>
</body>
</html>
