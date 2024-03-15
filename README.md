Java 17

Перед запуском:

Создать БД
Выполнить скрипты из resources/database-init.sql
Выполнить скрипты из resources/sql-data.sql

Чтобы в расписании отображались данные, можно выполнить скрипт:
update film_seance set date = now()::date

В application.properties указать название БД, логин и пароль

Запустить CinemaApplication

