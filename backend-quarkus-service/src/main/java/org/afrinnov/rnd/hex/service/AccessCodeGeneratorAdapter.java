package org.afrinnov.rnd.hex.service;

import org.afrinnov.rnd.hex.dto.AccessCodeDto;
import org.afrinnov.rnd.hex.dto.UserIdentity;
import org.afrinnov.rnd.hex.port.AccessCodeGenerator;
import org.apache.commons.lang3.RandomStringUtils;

import javax.enterprise.context.ApplicationScoped;
import java.time.LocalDateTime;

@ApplicationScoped
public class AccessCodeGeneratorAdapter implements AccessCodeGenerator {

    @Override
    public AccessCodeDto create(UserIdentity userIdentity) {
        String code = generate() + "-" + generate();
        return AccessCodeDto.builder()
                .withCode(code)
                .withExpiredTime(LocalDateTime.now().plusMinutes(5))
                .build();
    }

    private String generate() {
        return RandomStringUtils.randomNumeric(3);
    }
}
