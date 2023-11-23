CREATE TABLE IF NOT EXISTS PERSON
(
    id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY
);

CREATE SEQUENCE person_seq
    START WITH 1
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 9999999999
    CYCLE;