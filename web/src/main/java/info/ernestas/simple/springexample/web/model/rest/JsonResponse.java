package info.ernestas.simple.springexample.web.model.rest;

import java.util.ArrayList;
import java.util.List;

public class JsonResponse<T> {

    private ResponseStatus status;

    private List<T> results;

    public JsonResponse(T result) {
        this.results = new ArrayList<>();
        results.add(result);
        this.status = ResponseStatus.SUCCESS;
    }

    public JsonResponse(List<T> results) {
        this(ResponseStatus.SUCCESS, results);
    }

    public JsonResponse(ResponseStatus status, List<T> results) {
        this.status = status;
        this.results = results;
    }

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    public List<T> getResults() {
        return results;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }
}
