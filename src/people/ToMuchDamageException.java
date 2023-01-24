package people;

public class ToMuchDamageException extends RuntimeException{
    public ToMuchDamageException(String message) {
        super(message);
    }
}
