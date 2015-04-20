SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS TWEET;
DROP TABLE IF EXISTS USER;




/* Create Tables */

CREATE TABLE TWEET
(
	TWEET_ID bigint NOT NULL AUTO_INCREMENT,
	USER_ID bigint NOT NULL,
	BODY varchar(256) NOT NULL,
	INS_TRACE varchar(256) NOT NULL,
	INS_DATETIME datetime NOT NULL,
	UPD_TRACE varchar(256) NOT NULL,
	UPD_DATETIME datetime NOT NULL,
	PRIMARY KEY (TWEET_ID)
);


CREATE TABLE USER
(
	USER_ID bigint NOT NULL AUTO_INCREMENT,
	E_MAIL varchar(256) NOT NULL,
	INS_TRACE varchar(256) NOT NULL,
	INS_DATETIME datetime NOT NULL,
	UPD_TRACE varchar(256) NOT NULL,
	UPD_DATETIME datetime NOT NULL,
	PRIMARY KEY (USER_ID),
	UNIQUE (E_MAIL)
);



/* Create Foreign Keys */

ALTER TABLE TWEET
	ADD FOREIGN KEY (USER_ID)
	REFERENCES USER (USER_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


