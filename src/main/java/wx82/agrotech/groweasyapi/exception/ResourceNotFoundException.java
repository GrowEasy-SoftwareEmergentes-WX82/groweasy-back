package wx82.agrotech.groweasyapi.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }

  public ResourceNotFoundException(String resource, Long id) {
    super(String.format("%s not found with ID: %d", resource, id));
  }
}