package ma.sii.workshop.libs.response;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PositiveResponse extends Response {
    public PositiveResponse(Object result) {
        super(result);
    }
}
