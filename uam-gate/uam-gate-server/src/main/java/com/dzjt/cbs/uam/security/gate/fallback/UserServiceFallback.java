package com.dzjt.cbs.uam.security.gate.fallback;

import com.dzjt.cbs.uam.security.api.vo.authority.PermissionInfo;
import com.dzjt.cbs.uam.security.api.vo.user.UserInfo;
import com.dzjt.cbs.uam.security.gate.feign.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author ace
 * @create 2018/3/7.
 */
@Service
@Slf4j
public class UserServiceFallback implements IUserService {
    @Override
    public List<PermissionInfo> getPermissionByUsername(@PathVariable("username") String username) {
        log.error("调用{}异常{}","getPermissionByUsername",username);
        return null;
    }

    @Override
    public List<PermissionInfo> getAllPermissionInfo() {
        log.error("调用{}异常","getPermissionByUsername");
        return null;
    }

    @Override
    public UserInfo findByUsername(@PathVariable("username") String username) {
        log.error("调用{}异常","findByUsername",username);
        return null;
    }
}
