# springdata

6. JPA 프로그래밍 프로젝트 세팅
- docker ps -- 컨테이너 확인
- docker ps -a 
- docker start postgres_boot
- docker exec -i -t postgres_boot bash
- su - postgres
- psql --username suran --dbname springdata


자동 설정 : Hibernate.JpaAutoConfiguration

7. 엔티티 타입 맵핑 Account.java 에 설명

8. Value 타입 맵핑
엔티티
-> 식별자가 존재, 독립적 존재 
Value type
-> 다른 엔티티에 종속적

* 다른 엔티티에 종속적인 Value Type 을 만들 때
@Embedable
-> 클래스 상단에 명시

@Column은 생략 가능하다.

엔티티 타입에서 Composite Value 타입을 매핑할 때
@Embeded
-> 클래스 내 Value Type 명시 