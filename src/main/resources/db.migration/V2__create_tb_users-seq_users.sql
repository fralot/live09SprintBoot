CREATE SEQUENCE SEQ_USERS
    START WITH 1
    INCREMENT BY 1
    NOCACHE
    NOCYCLE;

CREATE TABLE TB_USERS(
                         USER_ID             INTEGER DEFAULT SEQ_USERS.nextval NOT NULL,
                         EMAIL               VARCHAR2(255) NOT NULL,
                         PASSWORD            VARCHAR2(255) NOT NULL,
                         "ROLE"              VARCHAR2(255) DEFAULT USER NULL,
                         CONSTRAINT          TB_USERS_PK PRIMARY KEY (USER_ID),
                         CONSTRAINT          TB_USERS_UNIQUE UNIQUE (EMAIL)
);