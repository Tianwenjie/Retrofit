package com.example.tianwenjie.retrofit;

public class Sls {
    private boolean error;
    private SlsResults[] results;

    public boolean getError() {
        return this.error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public SlsResults[] getResults() {
        return this.results;
    }

    public void setResults(SlsResults[] results) {
        this.results = results;
    }
}
