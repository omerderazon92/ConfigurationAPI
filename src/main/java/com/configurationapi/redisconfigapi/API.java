package com.configurationapi.redisconfigapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/baseUrl")
public class API {

    private Repository repository;

    public API(Repository repository) {
        this.repository = repository;
    }

    /**
     * Remote configuration endpoint
     * @param projectName
     * @return
     */
    @GetMapping("/getConfigList/{projectName}")
    public Map<String, String> getConfiguration(@PathVariable("projectName") final String projectName) {
        Map<String, String> all = repository.findAll(projectName);
        return all;
    }
}
