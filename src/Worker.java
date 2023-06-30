public class Worker {
    private OnTaskDoneListener callback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    private OnTaskErrorListener errorCallback;


    public void start() {
        for (int i = 1; i < 100; i++) {
            if (i == 33) {
                errorCallback.onError("Task " + i + " is failed");
            }
            callback.onDone("Task " + i + " is done");
        }
    }
}
