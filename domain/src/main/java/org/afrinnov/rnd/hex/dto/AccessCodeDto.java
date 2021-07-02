package org.afrinnov.rnd.hex.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder(setterPrefix = "with")
public class AccessCodeDto {

    private String code;
    private LocalDateTime expiredTime;
}
