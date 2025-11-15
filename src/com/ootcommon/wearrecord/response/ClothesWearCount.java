package com.ootcommon.wearrecord.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.querydsl.core.annotations.QueryProjection;
import lombok.Getter;

@Getter
public class ClothesWearCount {

    private final Long clothesId; // 옷 중복 방지
    private final String clothesDescription;
    private final Long wearCount; // 착용 횟수 카운트

    @JsonCreator
    @QueryProjection
    public ClothesWearCount(
            @JsonProperty("clothesId") Long clothesId,
            @JsonProperty("clothesDescription") String clothesDescription,
            @JsonProperty("wearCount") Long wearCount
    ) {
        this.clothesId = clothesId;
        this.clothesDescription = clothesDescription;
        this.wearCount = wearCount;
    }
}
