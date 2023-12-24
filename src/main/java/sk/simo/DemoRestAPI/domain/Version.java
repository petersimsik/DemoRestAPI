package sk.simo.DemoRestAPI.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
public class Version {
    private String appName;
    private LocalDateTime releaseDate;
    private String version;
}
