package org.afrinnov.rnd.hex.service;

import org.afrinnov.rnd.hex.dto.AccessCodeDto;
import org.afrinnov.rnd.hex.dto.UserIdentity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class AccessCodeGeneratorAdapterTest {
    @InjectMocks
    private AccessCodeGeneratorAdapter accessCodeGeneratorAdapter;


    @Test
    void shouldGenerateAccessCode() {
        //Arrange
        UserIdentity userIdentity = new UserIdentity("toto@sysbio.net");

        //Act
        AccessCodeDto accessCode = accessCodeGeneratorAdapter.create(userIdentity);

        //Then
        assertThat(accessCode).isNotNull();
        assertThat(accessCode.getCode()).isNotEmpty();
        assertThat(accessCode.getExpiredTime()).isAfter(LocalDateTime.now());

    }
}