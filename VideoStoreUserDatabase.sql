create database users;
use users;
create Table Accounts(
UserEmail Char(20) NOT NULL ,
UserPassword Char(20) NOT NULL
);
Alter table accounts change UserEamil UserEmail char(20);
Alter table accounts change Password UserPassword char(20);
show columns from Accounts;

/*select UserEmail from Accounts;*/
/*create database movies;*/
CREATE TABLE Regular (
Title CHAR(100) NOT NULL
);

INSERT INTO Regular (Title) VALUES ('Gladiator');
INSERT INTO Regular (Title) VALUES ('Casino');
INSERT INTO Regular (Title) VALUES ('Salt');
INSERT INTO Regular (Title) VALUES ('Saw');
INSERT INTO Regular (Title) VALUES ('Batman');
INSERT INTO Regular (Title) VALUES ('Superman');

create table Children(
Title CHAR(100) NOT NULL
);

INSERT INTO Children (Title) VALUES ('Aladdin');
INSERT INTO Children (Title) VALUES ('Toy Story');
INSERT INTO Children (Title) VALUES ('Care Bears');
INSERT INTO Children (Title) VALUES ('Lion King');
INSERT INTO Children (Title) VALUES ('Spy Kids');
INSERT INTO Children (Title) VALUES ('Alice in Wonderland');

create table NewReleases(
Title CHAR(100) NOT NULL
);

INSERT INTO NewReleases (Title) VALUES ('Beauty and the Beast');
INSERT INTO NewReleases (Title) VALUES ('Logan');
INSERT INTO NewReleases (Title) VALUES ('Spiderman');
INSERT INTO NewReleases (Title) VALUES ('Kong');
INSERT INTO NewReleases (Title) VALUES ('Dunkirk');
INSERT INTO NewReleases (Title) VALUES ('Thor 3');
