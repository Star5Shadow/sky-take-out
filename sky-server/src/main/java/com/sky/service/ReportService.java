package com.sky.service;

import com.sky.vo.TurnoverReportVO;

import java.time.LocalDate;

public interface ReportService {
    /**
     * 统计时间区间内的营业额
     * @param begin
     * @param end
     * @return
     */
    TurnoverReportVO getTrunoverStatistics(LocalDate begin,LocalDate end);
}
