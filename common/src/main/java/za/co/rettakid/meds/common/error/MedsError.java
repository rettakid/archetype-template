package za.co.rettakid.meds.common.error;

/**
 * Created by Lwazi Prusent on 2015/10/31.
 */
public enum MedsError {

    /*login exceptions*/
    LOGIN_DOES_NOT_EXIST(101,"The login detail provided do not match any of the existing users"),
    USER_ALREADY_EXIST(102,"The system already contains a user with that email address");

    private Integer code;
    private String error;

    MedsError(Integer code, String error) {
        this.code = code;
        this.error = error;
    }

    public Integer getCode() {
        return code;
    }

    public String getError() {
        return error;
    }

}
