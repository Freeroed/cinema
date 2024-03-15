<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<html>
    <head>
        <title>ВлГУ-МАКС</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

    </head>
    <body>
   <nav class="navbar navbar-light bg-light">
     <a class="navbar-brand" href="/">ВлГУ МАКС</a>
   </nav>
   <div style="margin:2em;">
        <h1>Расписание</h1>
        <div style="display: flex; flex-wrap: wrap">

        <c:forEach items="${filmsAndSeances}" var="item">
        <div class="card col-4 col-md-2" style="width: 18rem; margin: 1em;">
            <div class="card-img-top" style="height: 12em; width: 100%;">
                <img style="width: 100%; height: 100%"  src=${item.film.imageUrl} alt="Card image cap">
            </div>
          <div class="card-body">
            <h5 class="card-title">${item.film.name}</h5>
            <div>
            <c:forEach items="${item.seances}" var="seance">
                            <span class="badge badge-secondary">${seance.time}</span></h1>
                        </c:forEach>
            </div>

            <a href='/films/${item.film.id}' class="btn btn-primary mt-1">О фильме</a>
          </div>
        </div>
         </c:forEach>
         </div>
        <a href="/about">Подробнее о нас</a>
        </div>
    </body>
</html>