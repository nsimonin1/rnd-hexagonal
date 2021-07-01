package org.afrinnov.rnd.hex.param;

import javax.validation.constraints.NotEmpty;

public class UserIdentityParam {
    @NotEmpty
    private String email;
}
