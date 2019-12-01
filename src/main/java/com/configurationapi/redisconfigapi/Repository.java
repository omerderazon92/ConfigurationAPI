package com.configurationapi.redisconfigapi;

import java.util.Map;

public interface Repository {
    /**
     * Fetching all the configuration according to the project name
     * @param projectName
     * @return
     */
    Map findAll(String projectName);
}
