package org.afrinnov.rnd.hex.port;

import org.afrinnov.rnd.hex.dto.AccessCodeDto;
import org.afrinnov.rnd.hex.dto.UserIdentity;

public interface ReadAccessCode {
    AccessCodeDto generate(UserIdentity userIdentity);
}
