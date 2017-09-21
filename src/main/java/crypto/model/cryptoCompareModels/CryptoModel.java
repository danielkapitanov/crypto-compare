package crypto.model.cryptoCompareModels;

/**
 * Created by aaron on 8/10/17.
 */
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by aaron on 8/8/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CryptoModel {

    String response;
    String message;
    Data data;
    int type;


    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
