# study-jpa-jpashop 저장소입니다.

## 인프런 강의명 : [실전! 스프링 부트와 JPA 활용1 - 웹 애플리케이션 개발](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-JPA-%ED%99%9C%EC%9A%A9-1)

## 목차
1. 프로젝트 환경설정
    - 프로젝트 생성
        - 프로젝트 선택
           - Project : Gradle Project
           - Language : Java
           - Spring Boot : 2.6.x
        - Project Metadata
           - Group : jpabook
           - Artifact : jpashop
           - Package name : jpabook.jpashop
           - Packaging : Jar
           - Java : 11
     - 라이브러리 살펴보기
    - View 환경 설정
    - H2 데이터베이스 설치
    - JPA와 DB 설정, 동작 확인
2. 도메인 분석 설계
    - 요구사항 분석
    - 도메인 모델과 테이블 설계
    - 엔티티 클래스 개발1
    - 엔티티 클래스 개발2
    - 엔티티 설계시 주의점
3. 애플리케이션 구현 준비
    - 구현 요구사항
    - 애플리케이션 아키텍처
4. 회원 도메인 개발
    - 회원 리포지토리 개발
    - 회원 서비스 개발
    - 회원 기능 테스트
5. 상품 도메인 개발
    - 상품 엔티티 개발(비즈니스 로직 추가)
    - 상품 리포지토리 개발
    - 상품 서비스 개발
6. 주문 도메인 개발
    - 주문, 주문상품 엔티티 개발
    - 주문 리포지토리 개발
    - 주문 서비스 개발
    - 주문 기능 테스트
    - 주문 검색 기능 개발
7. 웹 계층 개발
    - 홈 화면과 레이아웃
    - 회원 등록
    - 회원 목록 조회
    - 상품 등록
    - 상품 목록
    - 상품 수정
    - 변경 감지와 병합(merge)
    - 상품 주문
    - 주문 목록 검색, 취소

## 인프런 강의명 : [실전! 스프링 부트와 JPA 활용2 - API 개발과 성능 최적화](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-JPA-API%EA%B0%9C%EB%B0%9C-%EC%84%B1%EB%8A%A5%EC%B5%9C%EC%A0%81%ED%99%94)

## 목차
1. API 개발 기본
    - 회원 등록 API
    - 회원 수정 API
    - 회원 조회 API
2. API 개발 고급 - 준비
    - 소개
    - 조회용 샘픔 데이터 입력
3. API 개발 고급 - 지연 로딩과 조회 성능 최적화
    - 간단한 주문 조회 V1 : 엔티티를 직접 노출
    - 간단한 주문 조회 V2 : 엔티티를 DTO로 변환
    - 간단한 주문 조회 V3 : 엔티티를 DTO로 변환 - 페치 조인 최적화
    - 간단한 주문 조회 V4 : JPA에서 DTO로 바로 조회
4. API 개발 고급 - 컬렉션 조회 최적화
    - 주문 조회 V1 : 엔티티 직접 노출
    - 주문 조회 V2 : 엔티티를 DTO로 변환
    - 주문 조회 V3 : 엔티티를 DTO로 변환 - 페치 조인 최적화
    - 주문 조회 V3.1 : 엔티티를 DTO로 변환 - 페이징과 한계 돌파
    - 주문 조회 V4 : JPA에서 DTO 직접 조회
    - 주문 조회 V5 : JPA에서 DTO 직접 조회 - 컬렉션 조회 최적화
    - 주문 조회 V6 : JPA에서 DTO로 직접 조회, 플랫 데이터 최적화
    - API 개발 고급 정리
5. API 개발 고급 - 실무 필수 최적화
    - OSIV와 성능 최적화
   
[[이전으로]](https://github.com/heechul90/study-jpa-jpql) [[다음으로]](https://github.com/heechul90/study-jpa-springdata-jpa.git)

[[복습하기/적용하기]](https://github.com/heechul90/project-hellcoding)
