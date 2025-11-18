# OOT-Common

**OOT-Common은 OOT 서비스의 개발 서버와 배치 서버 모두에서 공통으로 사용하는 클래스를 관리하는 레포지토리입니다. DTO, 상수, Enum 등 서비스 내에서 공유가 필요한 데이터 타입을 집중적으로 제공합니다.**

---

## 주요 목적

- OOT-Batch(배치 서버), OOT-Dev(개발 서버) 양쪽에서 공통적으로 필요한 클래스 및 데이터 타입 관리
- DTO, Enum, 상수 등 코드 중복 제거 및 효율적인 유지보수 지원
- 서비스 내 타입/구조의 일관성 유지 및 배포 편의성 제공

---

## 프로젝트 구조

````
src
└── com
    └── ootcommon
        ├── category
        │   └── response
        │       └── CategoryStat.java
        ├── clothes
        │   ├── enums
        │   │   ├── ClothesColor.java
        │   │   └── ClothesSize.java
        │   └── response
        │       ├── ClothesColorCount.java
        │       └── ClothesSizeCount.java
        ├── dashboard
        │   ├── constant
        │   │   ├── DashboardAdminCacheNames.java
        │   │   └── DashboardUserCacheNames.java
        │   └── response
        │       ├── AdminClothesStatisticsResponse.java
        │       ├── AdminSalePostStatisticsResponse.java
        │       ├── AdminTopCategoryStatisticsResponse.java
        │       ├── AdminUserStatisticsResponse.java
        │       ├── DashboardUserSummaryResponse.java
        │       └── DashboardUserWearStatisticsResponse.java
        ├── recommendation
        │   ├── dto
        │   │   └── RecommendationBatchCreateResponse.java
        │   ├── entity
        │   │   └── RecommendationBatchHistory.java
        │   ├── status
        │   │   ├── BatchStatus.java
        │   │   └── RecommendationStatus.java
        │   └── type
        │       └── RecommendationType.java
        ├── salepost
        │   ├── enums
        │   │   └── SaleStatus.java
        │   └── response
        │       ├── NewSalePost.java
        │       └── SaleStatusCount.java
        ├── user
        │   └── response
        │       └── NewUsers.java
        └── wearrecord
            └── response
                ├── ClothesWearCount.java
                └── NotWornOverPeriod.java
````

---

## 주요 클래스 예시

- **DTO 클래스**
    - 서비스 내 데이터 전달을 위한 객체
- **Enum 타입**
    - 공통 사용 Enum 정의
- **상수 클래스**
    - 서비스 전역에서 사용되는 값 및 키 정의

---

## 사용 방법

1. OOT-Common을 dependency로 각 모듈(OOT-Batch, OOT-Dev 등)에 추가합니다.
2. 필요한 DTO/Enum/상수를 import하여 활용합니다.
3. 신규 공통 타입/데이터가 필요하면 Pull Request로 기여해주세요.

---

## 버전 관리 및 배포

- 중요한 변경 사항 release 태그로 관리
- 각 서버(OOT-Batch, OOT-Dev)에서 버전 맞춰 대응 가능

---

> 각 서버(Batch, Dev)에서 공통 소스가 필요할 때 이 레포에서 import하여 사용하세요. 추가/수정은 Issue 또는 PR로 요청해주시면 됩니다.

