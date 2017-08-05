create database movies;

CREATE TABLE Regular (
Title CHAR(100) NOT NULL
);

INSERT INTO Regular (Title) VALUES ('Gladiator', 'Goodfellas', 'Casino',
'Salt', 'Saw', 'Caddy Shack', 'Batman', 'Superman', 'Funny People', 'Billy Madison',
'Happy Gilmore', 'Troy', 'The Godfather', 'Pulp Fiction', 'Fight Club', 'The Green Mile');

create table Children(
Title CHAR(100) NOT NULL
  );

INSERT INTO Children (Title) VALUES ('Aladdin', 'Toy Story', 'Toy Story 2',
'Finding Nemo', 'Finding Dory', 'Alice in Wonderland', 'Care Bears', 'Spy Kids', 'The Lion King', 'E.T',
'The Goonies', 'Home Alone');

create table NewReleases(
Title CHAR(100) NOT NULL
);

INSERT INTO Children (Title) VALUES ('Beauty and the Beast', 'Logan', 'Dunkirk',
'Austin Found', 'Spiderman', 'A Ghost Story', 'Lady Macbeth', 'War for the Planet of the Apes', 
'The Lovers', 'Kong');

