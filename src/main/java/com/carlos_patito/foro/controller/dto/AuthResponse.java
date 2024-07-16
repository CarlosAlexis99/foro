package com.carlos_patito.foro.controller.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"token", "type"})
public record AuthResponse(
                           String token,
                           String type) {
}
