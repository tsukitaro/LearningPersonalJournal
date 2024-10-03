package org.masumera.HTTPrequest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ApiResponse
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ApiResponse(
    @JsonProperty("status") String status,
    @JsonProperty("data") Data data
) {}

@JsonIgnoreProperties(ignoreUnknown = true)
record Data(
  @JsonProperty("content") String content,
  @JsonProperty("anime") AnimeData animedata
) {}

/**
 * Anime
 */
@JsonIgnoreProperties(ignoreUnknown = true)
record AnimeData(
  @JsonProperty("name") String name
) {}
