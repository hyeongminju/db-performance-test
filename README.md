
1. 설계 내용
 : Java 를 활용한 Springboot 의 webflux+r2dbc 를 활용한 web application 을 개발하여 각 DB 를 연결했을때 성능 테스트를 수행함
 
2. 설계의 이유
 : 단순 DB I/O의 경우 IO 트랜잭션 타임에 소모되는 시간이 많기 때문에 NON BLOCKING IO 를 활용하여 개발함
 : WEBFLUX 를 사용하더라도 WEB 만 NON BLOCKING IO 이기 때문에 NON BLOCKING IO 지원하는 R2DBC 를 사용하여 구현함
 
*활용기술
 : java + springboot(2.7.1-SNAPSHOT) + r2dbc를 활용하여 Application 을 구현함
