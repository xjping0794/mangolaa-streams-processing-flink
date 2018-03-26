package com.adsizzler.mangolaa.streams.aggregations;

import com.adsizzler.mangolaa.streams.jackson.serializers.ZonedDateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Builder;
import lombok.Data;

import java.time.ZonedDateTime;

/**
 * Created by ankushsharma on 26/03/18.
 */
@Data
@Builder
public class AggregatedConversion {

    @JsonProperty(value = "advId", required = true)
    private final Integer advId;

    @JsonProperty(value = "clientId", required = true)
    private final Integer clientId;

    @JsonProperty(value = "sourceId", required = true)
    private final Integer sourceId;

    @JsonProperty(value = "campaignId", required = true)
    private final Integer campaignId;

    @JsonProperty(value = "creativeId", required = true)
    private final Integer creativeId;

    @JsonProperty(value = "count", required = true)
    private final Integer count;

    @JsonProperty(value = "timestamp", required = true)
    @JsonSerialize(using = ZonedDateTimeSerializer.class)
    private final ZonedDateTime timestamp;

    @JsonProperty(value = "eventCode", required = true)
    private final Integer eventCode;

}
