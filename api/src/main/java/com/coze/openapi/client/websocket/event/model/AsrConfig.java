package com.coze.openapi.client.websocket.event.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class AsrConfig {
  @JsonProperty("hot_words")
  private List<String> hotWords;

  @JsonProperty("context")
  private String context;

  @JsonProperty("user_language")
  @Builder.Default
  private String userLanguage = "common";

  @JsonProperty("enable_ddc")
  @Builder.Default
  private Boolean enableDdc = true;

  @JsonProperty("enable_itn")
  @Builder.Default
  private Boolean enableItn = true;

  @JsonProperty("enable_punc")
  @Builder.Default
  private Boolean enablePunc = true;
}
