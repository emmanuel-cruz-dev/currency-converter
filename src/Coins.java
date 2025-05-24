import com.google.gson.annotations.SerializedName;

public class Coins {
    @SerializedName("conversion_result")
    private String result;

    public Coins(String result){
        this.result = result;
    }

    @Override
    public String toString() {
        return result;
    }
}
