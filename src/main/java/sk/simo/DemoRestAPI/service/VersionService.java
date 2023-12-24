package sk.simo.DemoRestAPI.service;

import org.springframework.stereotype.Service;
import sk.simo.DemoRestAPI.domain.Version;

import java.time.LocalDateTime;

@Service
public class VersionService {
    public Version getVersion() {
        Version version = new Version("Demo Spring app", LocalDateTime.now(), "1.0.0");
        return version;
    }
}
