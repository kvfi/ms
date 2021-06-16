package ma.sii.workshop.ms.account.presentation.exception.exceptions;

public class PersonNotFoundException extends RuntimeException {
    public PersonNotFoundException() {}

    public PersonNotFoundException(String msg) {
        super(msg);
    }
}
