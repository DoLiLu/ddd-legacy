# 키친포스

## 요구 사항

- 간단한 식당 관리 앱을 구현한다.

- **상품**
    - [ ] 상품 등록
        - [ ] 상품은 식별자와 이름, 가격을 가진다.
        - [ ] 상품의 가격은 빈 값이 아니고, 0원 이상이어야 한다.
        - [ ] 상품의 이름은 빈 값이거나 비속어가 아니어야한다.
    - [ ] 상품 가격 변경
        - [ ] 상품 식별자와 가격으로 등록된 상품의 가격을 변경한다. 
        - [ ] 변경하려는 가격은 0원 이상이어야한다.
        - [ ] 상품에 속한 메뉴의 가격에 이상이 있을 경우 메뉴를 노출하지 않는다.
    - [ ] 상품 조회
        - [ ] 전체 상품을 조회할 수 있다.

- **메뉴 그룹**
    - [ ] 메뉴 그룹 생성
        - [ ] 메뉴 그룹은 식별자와 이름을 가진다.
        - [ ] 메뉴 이름은 빈 값이 아니어야한다.
    - [ ] 메뉴 그룹 조회
        - [ ] 전체 메뉴 그룹을 조회할 수 있다.

- **메뉴**
    - [ ] 메뉴 등록
        - [ ] 메뉴는 식별자와 이름, 가격, 메뉴 상품들을 가진다.
        - [ ] 가격은 빈 값이 아니고, 0원 이상이어야 한다.
        - [ ] 메뉴 상품은 식별자와 소속된 상품 정보, 수량을 가진다.
        - [ ] 한 가지 이상의 메뉴 상품이 필요하고, 모두 상품에 등록되어있어야한다.
        - [ ] 메뉴의 가격은 메뉴 상품들의 가격 총합(상품별 가격*수량의 합)을 넘을 수 없다.
        - [ ] 메뉴 상품들의 수량은 0보다 작을 수 없다.
        - [ ] 이름은 빈 값이거나 비속어가 아니어야한다.
    - [ ] 메뉴 상태/값 변경
        - 메뉴 식별자로 등록된 메뉴의 상태 혹은 값을 변경한다.
        - [ ] 메뉴 가격 변경
          - [ ] 0원 이상이고 메뉴 상품들의 가격 총합을 넘지 않는 가격으로 변경할 수 있다.
        - [ ] 메뉴 노출/숨기기
            - [ ] 메뉴는 상태에 따라 노출하거나 숨길 수 있다.
            - [ ] 메뉴를 노출할 때는 가격이 메뉴 상품들의 총합보다 커서는 안된다.
    - [ ] 메뉴 조회
        - [ ] 전체 메뉴를 조회할 수 있다.


- **주문 매장 테이블**
    - [ ] 테이블 생성
        - [ ] 테이블은 식별자, 이름, 인원수를 가진다.
        - [ ] 이름은 비어있을 수 없다.
        - [ ] 테이블을 만들면 비어있고 인원수도 0명인 상태이다.
    - [ ] 테이블 상태/값 변경
        - 테이블 식별자로 등록된 테이블의 상태 혹은 값을 변경한다.      
        - [ ] 앉기
            - [ ] 빈 테이블에는 앉을 수 있으며, 앉으면 테이블은 비어있지 않게 된다.
        - [ ] 정리하기
            - [ ] 해당 테이블에서 식사가 완료되었으면 테이블을 비우고 인원수를 0명으로 초기화할 수 있다.
        - [ ] 인원수 변경
            - [ ] 비어있지 않은 테이블에 0명 이상의 인원수를 전달하여 채워넣을 수 있다.
    - [ ] 테이블 조회
        - [ ] 전체 테이블 목록을 조회할 수 있다.

- **주문**
    - [ ] 주문하기
        - [ ] 주문은 매장 식사, 포장, 배달 세 가지 방법을 선택해야만 한다.
        - [ ] 한 가지 이상의 비어있지 않은 주문 항목을 가져야한다.
        - [ ] 주문 항목은 식별자와 메뉴, 수량, 가격을 지닌다.
        - [ ] 매장 식사는 주문 항목의 수량이 0보다 커야한다.
        - [ ] 주문 항목의 메뉴는 모두 등록되어 얐어야하고, 노출상태여야하며, 항목의 가격과 메뉴의 가격이 동일해야한다.
        - [ ] 주문하면 현재 주문 시각이 설정되고, 대기 상태가 된다.
        - [ ] 배달 주문시 반드시 비어있지 않은 배달 주소를 포함해야한다.
        - [ ] 매장 식사시 반드시 등록된 테이블의 식별자를 포함해야하며, 빈 테이블이어야한다.
    - [ ] 주문 상태 변경
        - 주문 식별자로 등록된 주문의 상태를 변경한다.
        - [ ] 주문 수락
            - [ ] 대기 상태의 주문만 수락할 수 있다.
            - [ ] 배달 주문은 배달 기사에게 주문번호와 주문 항목 총금액, 배달 주소를 보내어 콜을 요청한다.
            - [ ] 수락 상태로 변경한다.
        - [ ] 주문 메뉴 제공
            - [ ] 수락 상태의 주문만 제공할 수 있다.
            - [ ] 메뉴 제공 상태로 변경한다.
        - [ ] 배달 시작
            - [ ] 주문 메뉴 제공 상태인 배달주문만 배달을 시작할 수 있다.
            - [ ] 배달 중인 상태로 변경한다.
        - [ ] 배달 완료
            - [ ] 배달 중인 배달 주문만 배달을 완료할 수 있다.
            - [ ] 배달완료 상태로 변경한다.
        - [ ] 주문 해결
            - [ ] 배달 주문시 배달 완료상태여야한다.
            - [ ] 포장 및 매장 식사 주문시 주문 메뉴가 제공된 상태여야한다.
            - [ ] 매장 식사시 해당 해당 테이블을 정리한다.
    - [ ] 주문 조회
        - [ ] 전체 주문 목록을 조회할 수 있다.

    
## 용어 사전

| 한글명 | 영문명 | 설명 |
| --- | --- | --- |
|  |  |  |

## 모델링
