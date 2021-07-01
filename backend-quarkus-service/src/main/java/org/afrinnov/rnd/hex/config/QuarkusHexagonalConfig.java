package org.afrinnov.rnd.hex.config;

import org.afrinnov.rnd.hex.GenerateProtectedAccessCode;
import org.afrinnov.rnd.hex.port.AccessCodeGenerator;
import org.afrinnov.rnd.hex.port.ReadAccessCode;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

@Dependent
public class QuarkusHexagonalConfig {

    @Produces
    @Inject
    public ReadAccessCode readAccessCode(AccessCodeGenerator accessCodeGenerator) {
        return new GenerateProtectedAccessCode(accessCodeGenerator);
    }
}
