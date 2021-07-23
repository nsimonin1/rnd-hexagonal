package org.afrinnov.rnd.hex;

import org.afrinnov.rnd.hex.dto.AccessCodeDto;
import org.afrinnov.rnd.hex.dto.UserIdentity;
import org.afrinnov.rnd.hex.port.AccessCodeGenerator;
import org.afrinnov.rnd.hex.port.ReadAccessCode;

public record GenerateProtectedAccessCode(
        AccessCodeGenerator accessCodeGenerator) implements ReadAccessCode {
    @Override
    public AccessCodeDto generate(UserIdentity userIdentity) {
        return accessCodeGenerator.create(userIdentity);
    }
}
