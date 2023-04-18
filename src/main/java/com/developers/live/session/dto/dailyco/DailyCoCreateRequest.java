package com.developers.live.session.dto.dailyco;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DailyCoCreateRequest {
    @NotNull
    private String privacy;
    private DailyCoCreateRequestProperties properties;
}
