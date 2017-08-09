package net.dzale.diezel.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A generic exception for the Diezel application, used as a catch-all for more specific errors.
 *
 * @author dzale
 */
public class DiezelException extends Exception {
    private static final Logger log = LoggerFactory.getLogger(DiezelException.class);

    public DiezelException(String message) {
        super(message);
    }

    public DiezelException(Throwable ex) {
        super(ex);
    }

    public DiezelException(String message, Throwable ex) {
        super(message, ex);
    }

}
