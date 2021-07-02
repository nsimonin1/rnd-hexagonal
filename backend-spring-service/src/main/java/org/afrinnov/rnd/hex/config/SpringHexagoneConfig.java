package org.afrinnov.rnd.hex.config;

import org.afrinnov.rnd.hex.GenerateProtectedAccessCode;
import org.afrinnov.rnd.hex.port.AccessCodeGenerator;
import org.afrinnov.rnd.hex.port.ReadAccessCode;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringHexagoneConfig {

    @Bean
    public ReadAccessCode readAccessCode(AccessCodeGenerator accessCodeGenerator) {
        return new GenerateProtectedAccessCode(accessCodeGenerator);
    }
}
