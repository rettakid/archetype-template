package za.co.rettakid.meds.common.error;

import org.apache.log4j.Logger;

import javax.management.RuntimeErrorException;

/**
 * Created by Lwazi Prusent on 2015/10/31.
 */
public class MedsErrorException extends RuntimeException {

    private static final Logger LOGGER = Logger.getLogger(MedsErrorException.class);
    private MedsError medsError;

    public MedsErrorException(MedsError medsError) {
        super(medsError.getError());
        this.medsError = medsError;
        LOGGER.error(medsError.getError());
    }

    public MedsErrorException(MedsError medsError,Throwable throwable) {
        super(medsError.getError(),throwable);
        this.medsError = medsError;
        LOGGER.error(medsError.getError(), throwable);
    }

    public MedsErrorException(MedsError medsError,Throwable throwable, String message) {
        super(medsError.getError(),throwable);
        this.medsError = medsError;
        LOGGER.error(message, throwable);
    }

    public MedsError getMedsError() {
        return medsError;
    }
}
