package com.han.cars.payload.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class PaginationResponse {
    private List<CarResponse> items;
    int page;
    int pageSize;
    long totalElements;

}
