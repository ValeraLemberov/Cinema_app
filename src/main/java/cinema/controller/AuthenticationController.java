package cinema.controller;

import cinema.dto.request.UserRequestDto;
import cinema.dto.response.UserResponseDto;
import cinema.model.Role;
import cinema.model.User;
import cinema.service.AuthenticationService;
import cinema.service.RoleService;
import cinema.service.mapper.ResponseDtoMapper;
import java.util.Set;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {
    private final AuthenticationService authService;
    private final ResponseDtoMapper<UserResponseDto, User> userDtoResponseMapper;
    private final RoleService roleService;

    public AuthenticationController(AuthenticationService authService,
                                    ResponseDtoMapper<UserResponseDto, User> userDtoResponseMapper,
                                    RoleService roleService) {
        this.authService = authService;
        this.userDtoResponseMapper = userDtoResponseMapper;
        this.roleService = roleService;
    }

    @PostMapping("/register")
    public UserResponseDto register(@RequestBody @Valid UserRequestDto requestDto) {
        Role defaultRole = roleService.getByName(Role.RoleName.USER);
        User user = authService.register(requestDto.getEmail(), requestDto.getPassword());
        user.setRoles(Set.of(defaultRole));
        return userDtoResponseMapper.mapToDto(user);
    }
}
