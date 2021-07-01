package org.afrinnov.rnd.hex;

import org.afrinnov.rnd.hex.port.AccessCodeGenerator;
import org.afrinnov.rnd.hex.port.ReadAccessCode;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HexagoneConfig {

    @Bean
    public ReadAccessCode readAccessCode(AccessCodeGenerator accessCodeGenerator) {
        return new GenerateProtectedAccessCode(accessCodeGenerator);
    }
}
