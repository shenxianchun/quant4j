
package com.quant.common.indicator;


import org.ta4j.core.TimeSeries;
import org.ta4j.core.indicators.RSIIndicator;
import org.ta4j.core.indicators.helpers.ClosePriceIndicator;


/**
 * Rsi指标计算
 */
public class RsiIndicatorAdapter extends IndicatorAdapter {


    public RsiIndicatorAdapter(TimeSeries timeSeries, int barCount) {
        super(timeSeries, barCount);
    }

    /**
     * 计算并返回Indicator
     *
     * @return
     */
    @Override
    public org.ta4j.core.Indicator strategCalculation() {
        ClosePriceIndicator closePrice = new ClosePriceIndicator(timeSeries);
        return new RSIIndicator(closePrice, barCount);
    }
}
