package org.afrinnov.rnd.hex;

import lombok.RequiredArgsConstructor;
import org.afrinnov.rnd.hex.dto.AccessCodeDto;
import org.afrinnov.rnd.hex.dto.UserIdentity;
import org.afrinnov.rnd.hex.port.AccessCodeGenerator;
import org.afrinnov.rnd.hex.port.ReadAccessCode;

@RequiredArgsConstructor
public class GenerateProtectedAccessCode implements ReadAccessCode {
    private final AccessCodeGenerator accessCodeGenerator;


    @Override
    public AccessCodeDto generate(UserIdentity userIdentity) {
        return accessCodeGenerator.create(userIdentity);
    }
}
