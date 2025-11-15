package com.ootcommon.dashboard.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ootcommon.category.response.CategoryStat;
import lombok.Getter;

import java.util.List;

@Getter
public class DashboardUserSummaryResponse {

    private final int totalClothes; // 등록된 옷 전체 수
    private final List<CategoryStat> categoryStat; // 카테고리별 옷 개수 limit 10

    @JsonCreator
    public DashboardUserSummaryResponse(
            @JsonProperty("totalClothes") int totalClothes,
            @JsonProperty("categoryStat") List<CategoryStat> categoryStat
    ) {
        this.totalClothes = totalClothes;
        this.categoryStat = categoryStat;
    }
}
