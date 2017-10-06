package lib.bluetoothwrapper.exceptions;

import android.os.Handler;

import lib.bluetoothwrapper.interfaces.BTReachable;
import lib.bluetoothwrapper.core.BTExplorer;

/**
 * This is a runtime exception which occurs whenever the developer
 * tries to pass a null {@link android.os.Handler} to the
 * {@link BTExplorer#getInstance(BTReachable, Handler)}
 *
 * @author Georgios Goniotakis
 */
public class NotValidHandlerException extends RuntimeException {

    public NotValidHandlerException() {
        super("Message handler cannot be null");
    }
}
