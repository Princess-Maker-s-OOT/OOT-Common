package com.ootcommon.dashboard.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ootcommon.wearrecord.response.ClothesWearCount;
import com.ootcommon.wearrecord.response.NotWornOverPeriod;
import lombok.Getter;

import java.util.List;

@Getter
public class DashboardUserWearStatisticsResponse {

    private final List<ClothesWearCount> wornThisWeek;// 이번주 착용 빈도 높은 옷
    private final List<ClothesWearCount> topWornClothes; // 자주 입은 옷
    private final List<ClothesWearCount> leastWornClothes; // 자주 입지 않은 옷
    private final List<NotWornOverPeriod> notWornOverPeriod; // 옷 미착용 기간

    @JsonCreator
    public DashboardUserWearStatisticsResponse(
            @JsonProperty("wornThisWeek") List<ClothesWearCount> wornThisWeek,
            @JsonProperty("topWornClothes") List<ClothesWearCount> topWornClothes,
            @JsonProperty("leastWornClothes") List<ClothesWearCount> leastWornClothes,
            @JsonProperty("notWornOverPeriod") List<NotWornOverPeriod> notWornOverPeriod
    ) {
        this.wornThisWeek = wornThisWeek;
        this.topWornClothes = topWornClothes;
        this.leastWornClothes = leastWornClothes;
        this.notWornOverPeriod = notWornOverPeriod;
    }
}
