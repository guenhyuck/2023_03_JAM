#DB 생성

DROP DATABASE IF EXISTS `JAM`;

CREATE DATABASE `JAM`;

USE `JAM`;
#article 테이블 생성
CREATE TABLE article (
    id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    regDate DATETIME NOT NULL,
    updateDate DATETIME NOT NULL,
    title CHAR(100) NOT NULL,
    `body` TEXT NOT NULL
);

#member 테이블 생성
CREATE TABLE `member` (
    id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    regDate DATETIME NOT NULL,
    updateDate DATETIME NOT NULL,
    loginId CHAR(20) UNIQUE NOT NULL,
    loginPw CHAR(200) NOT NULL,
    `name` CHAR(100) NOT NULL
);

DROP TABLE article;

SHOW TABLES;
DESC article;


#article 테스트 데이터 생성
INSERT INTO article
SET regDate = NOW(),
updateDate = NOW(),
title = CONCAT('제목',RAND()),
`body` =CONCAT('내용',RAND());

#member 테스트 데이터 생성
INSERT INTO `member`
SET regDate = NOW(),
updateDate = NOW(),
loginId = CONCAT('Testid',RAND()),
loginPw = CONCAT('TestPw',RAND()),
`name` = CONCAT('Testid',RAND());

SELECT *
FROM `member`;

SELECT *
FROM article;

INSERT INTO `member`
SET regDate = NOW(),
updateDate = NOW(),
loginId = 'Test1',
loginPw = 'Test1',
`name` = 'Test1';

SELECT *
FROM `member`
WHERE loginId = 'test1';

SELECT COUNT(*) >= 1
FROM `member`
WHERE loginId = 'test1';

SELECT COUNT(*) > 0
FROM `member`
WHERE loginId = 'test1';

SELECT COUNT(*) > 0
FROM `member`
WHERE loginId = 'test2';




