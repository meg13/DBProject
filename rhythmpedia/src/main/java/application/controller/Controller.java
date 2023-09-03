package application.controller;

import application.model.QueryManager;

public abstract class Controller {
    private final QueryManager queryManager= new QueryManager();

    public QueryManager getQueryManager() {
        return queryManager;
    }
}
