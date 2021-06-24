package org.afrinnov.rnd.hex.port;

import org.afrinnov.rnd.hex.dto.AccessCodeCheckedDto;
import org.afrinnov.rnd.hex.dto.CheckAccessCodeDto;

public interface AccessCodeValidator {
    AccessCodeCheckedDto validate(CheckAccessCodeDto checkAccessCode);
}
