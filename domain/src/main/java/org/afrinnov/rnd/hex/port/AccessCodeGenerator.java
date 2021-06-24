package org.afrinnov.rnd.hex.port;

import org.afrinnov.rnd.hex.dto.AccessCodeDto;
import org.afrinnov.rnd.hex.dto.UserIdentity;

public interface AccessCodeGenerator {
    AccessCodeDto create(UserIdentity userIdentity);
}
