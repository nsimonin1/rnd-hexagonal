package org.afrinnov.rnd.hex.resources.param;

import javax.validation.constraints.NotEmpty;

public class UserIdentityParam {
    @NotEmpty
    private String email;
}
