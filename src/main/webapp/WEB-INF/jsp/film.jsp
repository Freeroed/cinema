<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<html>
    <head>
        <title>ВлГУ-МАКС</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

    </head>
    <body >
   <nav class="navbar navbar-light bg-light">
     <a class="navbar-brand" href="/">ВлГУ МАКС</a>
   </nav>
   <div style="margin:2em;">
        <h1>${film.name}</h1>
        <img src=${film.imageUrl} alt="Card image cap">

        <div>
            <dt>
                <label>
               Жанр
                </label>
            </dt>
            <dd>
            ${film.genre.name}
            </dd>
            <dt>
               <label>Жанр</label>
            </dt>
            <dd>
              ${film.description}
            </dd>
        </div>
        </div>
    </body>
</html>