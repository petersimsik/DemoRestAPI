package sk.simo.DemoRestAPI.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.simo.DemoRestAPI.domain.Version;
import sk.simo.DemoRestAPI.service.VersionService;

import java.time.LocalDateTime;

@RestController
@RequestMapping("api")
@Slf4j
public class VersionController {

    private final VersionService versionService;

    public VersionController(VersionService versionService) {
        this.versionService = versionService;
    }

    @GetMapping("/version")
    public ResponseEntity<Version> getVersion() {
       log.info("Endpoint /version GET request");
       Version version = versionService.getVersion();
       return ResponseEntity.status(HttpStatus.OK).body(version);
    }
}
