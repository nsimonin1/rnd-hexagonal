package org.afrinnov.rnd.hex;

import org.afrinnov.rnd.hex.dto.AccessCodeCheckedDto;
import org.afrinnov.rnd.hex.dto.CheckAccessCodeDto;
import org.afrinnov.rnd.hex.port.AccessCodeValidator;
import org.afrinnov.rnd.hex.port.CheckAccessCode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class ValidateProtectedAccessCodeTest {
    @Mock
    private AccessCodeValidator accessCodeValidator;

    @Test
    void shouldValidateAccessCode() {
        //Given
        CheckAccessCode validateAccessCode = new ValidateProtectedAccessCode(accessCodeValidator);
        CheckAccessCodeDto checkAccessCode = new CheckAccessCodeDto();
        //Act
        AccessCodeCheckedDto codeChecked = validateAccessCode.check(checkAccessCode);

        //Then
        verify(accessCodeValidator).validate(checkAccessCode);
    }
}