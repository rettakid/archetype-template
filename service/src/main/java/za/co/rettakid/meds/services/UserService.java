package za.co.rettakid.meds.services;

import za.co.rettakid.meds.common.dto.*;

public interface UserService    {

    UserListDto getUsers();
    UserDto getUsers(Long userId);

    UserListDto getMatches(UserDto userDto);

    UserDto postUsers(UserDto userDto);
    void putUsers(UserDto userDto);
    void deleteUsers(Long userId);

}