create table genre(
	id bigint not null PRIMARY KEY,
	"name" varchar(50) not null
);


create table film(
	id bigint not null PRIMARY KEY,
	film_name varchar(255) not null,
	image_url varchar(100),
	description varchar(1000),
	duration int not null,
	genre_id bigint ,
	CONSTRAINT fk_genre
      FOREIGN KEY(genre_id)
        REFERENCES genre(id)
);

create table hall(
	id bigint not null PRIMARY KEY,
	"name" varchar(50) not null
);

create table film_seance(
	id bigint not null PRIMARY KEY,
	"date" date not null,
	"time" time not null,
	price int not null,
	film_id bigint not null,
	hall_id bigint not null,
	CONSTRAINT fk_film
      FOREIGN KEY(film_id)
        REFERENCES film(id),

    CONSTRAINT fk_hall
      FOREIGN KEY(hall_id)
        REFERENCES hall(id)
)




