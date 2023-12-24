package sk.simo.DemoRestAPI.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import sk.simo.DemoRestAPI.domain.Version;

import static org.junit.jupiter.api.Assertions.*;

class VersionServiceTest {


    private final VersionService versionService = new VersionService();

    @Test
    void versionServiceCreatesCorrectVersionObjectTest() {
        Version version = versionService.getVersion();
        assertNotNull(version);
        assertTrue("Demo Spring app".equals(version.getAppName()));
    }
}