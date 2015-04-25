SET SCHEMA baseball;

DROP TABLE TEAM IF EXISTS;

CREATE TABLE TEAM ( 
       ID                    INT GENERATED BY DEFAULT AS IDENTITY (START WITH 1 INCREMENT BY 1) PRIMARY KEY,
       CODE                  CHAR(3)       NOT NULL,
       ABBREVIATION          VARCHAR(30)   NOT NULL,
       NAME                  VARCHAR(30)   NOT NULL,
       CITY                  VARCHAR(30)   NOT NULL,
       STADIUM               VARCHAR(30)   NOT NULL,
       REC_VER_NUM           INT DEFAULT 1,
       CREATION_DT           DATE DEFAULT CURRENT_DATE NOT NULL,
       CREATED_BY            VARCHAR(30)  NOT NULL,
       LAST_UPDATE_DT        DATE,
       UPDATED_BY            VARCHAR(30)
);


CREATE TABLE GAME ( 
       ID                    INT PRIMARY KEY,
       GAME_ID               VARCHAR(30) NOT NULL,     
       REC_VER_NUM           INT DEFAULT 1,
       CREATION_DT           DATE DEFAULT CURRENT_DATE NOT NULL,
       CREATED_BY            VARCHAR(30)  NOT NULL,
       LAST_UPDATE_DT        DATE,
       UPDATED_BY            VARCHAR(30)
);
