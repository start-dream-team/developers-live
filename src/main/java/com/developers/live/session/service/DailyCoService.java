package com.developers.live.session.service;

import com.developers.live.session.dto.dailyco.DailyCoCreateRequest;
import com.developers.live.session.dto.dailyco.DailyCoDeleteRequest;
import com.developers.live.session.dto.dailyco.DailyCoRequest;
import com.developers.live.session.dto.dailyco.DailyCoResponse;

public interface DailyCoService {
    DailyCoResponse create(DailyCoRequest request);
    DailyCoResponse delete(DailyCoDeleteRequest request);
}
