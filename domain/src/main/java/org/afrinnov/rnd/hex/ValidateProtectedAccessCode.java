package org.afrinnov.rnd.hex;

import lombok.RequiredArgsConstructor;
import org.afrinnov.rnd.hex.dto.AccessCodeCheckedDto;
import org.afrinnov.rnd.hex.dto.CheckAccessCodeDto;
import org.afrinnov.rnd.hex.port.AccessCodeValidator;
import org.afrinnov.rnd.hex.port.CheckAccessCode;

@RequiredArgsConstructor
public class ValidateProtectedAccessCode implements CheckAccessCode {
    private final AccessCodeValidator accessCodeValidator;

    @Override
    public AccessCodeCheckedDto check(CheckAccessCodeDto checkAccessCode) {
        return accessCodeValidator.validate(checkAccessCode);
    }
}
