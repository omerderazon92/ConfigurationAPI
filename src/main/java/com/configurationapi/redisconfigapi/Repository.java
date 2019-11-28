package com.configurationapi.redisconfigapi;

import java.util.Map;

public interface Repository {
    Map findAll(String projectName);
}
