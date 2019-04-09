package com.kakaopay.platform.api_server.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TokenInfoResponse {

    private String accessToken;
    private String refreshToken;
}
