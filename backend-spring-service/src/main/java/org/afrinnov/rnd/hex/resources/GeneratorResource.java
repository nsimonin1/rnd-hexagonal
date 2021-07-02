package org.afrinnov.rnd.hex.resources;

import lombok.RequiredArgsConstructor;
import org.afrinnov.rnd.hex.dto.UserIdentity;
import org.afrinnov.rnd.hex.port.ReadAccessCode;
import org.afrinnov.rnd.hex.resources.ui.AccessCodeUI;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/generator")
@RequiredArgsConstructor
public class GeneratorResource {
    private final ReadAccessCode readAccessCode;

    @GetMapping
    public AccessCodeUI generator(@RequestParam String email) {
        return new AccessCodeUI(readAccessCode.generate(new UserIdentity(email)));
    }
}
