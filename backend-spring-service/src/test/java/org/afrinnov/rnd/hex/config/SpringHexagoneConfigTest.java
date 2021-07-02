package org.afrinnov.rnd.hex.config;

import org.afrinnov.rnd.hex.GenerateProtectedAccessCode;
import org.afrinnov.rnd.hex.port.AccessCodeGenerator;
import org.afrinnov.rnd.hex.port.ReadAccessCode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class SpringHexagoneConfigTest {
    @InjectMocks
    private SpringHexagoneConfig config;
    @Mock
    private AccessCodeGenerator accessCodeGenerator;

    @Test
    void shouldCreateReadAccessCodeBean() {
        //Act
        ReadAccessCode readAccessCode = config.readAccessCode(accessCodeGenerator);

        //Then
        assertThat(readAccessCode).isInstanceOf(GenerateProtectedAccessCode.class);
    }
}