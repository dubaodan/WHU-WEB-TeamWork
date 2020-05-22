//package com.example.demo.ServiceImpl;
//
//import com.example.demo.dao.UserDao;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.convert.converter.Converter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import javax.annotation.Resource;
//
//@Service("userDetailsService")
//public class UserDetailsServiceImpl implements UserDetailsService {
//
//
//    @Resource
//    private UserDao userRepository;
//
//    @Autowired
//    private Converter<User, UserDetails> userToUserDetailsConverter;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        return userToUserDetailsConverter.convert(userRepository.getUserByName(username).orElseThrow(() -> new UsernameNotFoundException("username not found")));
//    }
//
//}
