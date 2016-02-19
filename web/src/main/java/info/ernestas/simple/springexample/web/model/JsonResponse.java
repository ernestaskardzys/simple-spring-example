package info.ernestas.simple.springexample.web.model;

public class JsonResponse<T> {

    private ResponseStatus status;

    private T data;

    public JsonResponse(T data) {
        this(ResponseStatus.SUCCESS, data);
    }

    public JsonResponse(ResponseStatus status, T data) {
        this.status = status;
        this.data = data;
    }

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
