package com.ootcommon.recommendation.dto;

import lombok.AccessLevel;
import lombok.Builder;

/**
 * 배치 서버용 추천 생성 응답 DTO
 * 메인 서버의 Recommendation 엔티티를 직접 참조하지 않고
 * 순수 문자열 기반으로 전달되는 공통 DTO
 */
@Builder(access = AccessLevel.PRIVATE)
public record RecommendationBatchCreateResponse(

        Long userId,
        Long clothesId,
        String type,
        String reason,
        String status
) {

    /**
     * 메인 서버에서 전달받은 데이터로 DTO 생성
     * Recommendation 엔티티를 의존하지 않도록 순수 파라미터 기반 팩토리 메서드로 구성
     */
    public static RecommendationBatchCreateResponse of(
            Long userId,
            Long clothesId,
            String type,
            String reason,
            String status
    ) {
        return RecommendationBatchCreateResponse.builder()
                .userId(userId)
                .clothesId(clothesId)
                .type(type)
                .reason(reason)
                .status(status)
                .build();
    }
}