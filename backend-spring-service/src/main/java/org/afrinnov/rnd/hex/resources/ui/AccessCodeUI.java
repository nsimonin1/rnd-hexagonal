package org.afrinnov.rnd.hex.resources.ui;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.RequiredArgsConstructor;
import org.afrinnov.rnd.hex.dto.AccessCodeDto;

import java.time.LocalDateTime;

@RequiredArgsConstructor
public class AccessCodeUI {
    private final AccessCodeDto accessCode;

    public String getCode() {
        return accessCode.getCode();
    }

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm")
    public LocalDateTime getExpiredTime() {
        return accessCode.getExpiredTime();
    }

}
