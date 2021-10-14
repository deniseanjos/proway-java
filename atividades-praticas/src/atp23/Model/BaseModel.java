import java.util.UUID;

public abstract class BaseModel {

    private UUID id;

    public BaseModel(){
        this.id = UUID.randomUUID();
    }

    public String getId() {
        return id.toString();
    }
}
