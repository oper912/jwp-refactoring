package kitchenpos.table.exception;

public class DuplicateOrderTableException extends RuntimeException {

    public DuplicateOrderTableException() {
    }

    public DuplicateOrderTableException(String message) {
        super(message);
    }
}
