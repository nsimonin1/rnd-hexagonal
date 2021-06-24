package org.afrinnov.rnd.hex;

import org.afrinnov.rnd.hex.dto.AccessCodeDto;
import org.afrinnov.rnd.hex.dto.UserIdentity;
import org.afrinnov.rnd.hex.port.AccessCodeGenerator;
import org.afrinnov.rnd.hex.port.ReadAccessCode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class GenerateProtectedAccessCodeTest {
    @Mock
    private AccessCodeGenerator accessCodeGenerator;

    @Test
    void shouldGenerateAccessCode() {
        //Given
        ReadAccessCode accessCode = new GenerateProtectedAccessCode(accessCodeGenerator);
        UserIdentity userIdentity = new UserIdentity("toto@afrinnov.org");
        //Act
        AccessCodeDto accessCodeDto = accessCode.generate(userIdentity);

        //Then
        verify(accessCodeGenerator).create(userIdentity);

    }
}