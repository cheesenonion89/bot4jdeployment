package bot4jdeployment.rest.cnn_server.model;

/**
 * Created by Markus on 20.04.2017.
 */
public class TrainingDataSendPayload {

    private Long id;
    private String message;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public TrainingDataSendPayload(Long id, String message){
        setId(id);
        setMessage(message);
    }
}
