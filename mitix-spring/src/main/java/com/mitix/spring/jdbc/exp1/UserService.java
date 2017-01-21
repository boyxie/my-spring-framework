/*
 * Copyright (c) 2010
 * 
 * @date 2017
 * 
 * @author oldflame-Jm
 * 
 * Apache License Version 2.0 http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.mitix.spring.jdbc.exp1;

import java.util.List;

/**
 * @version 1.0.0
 * @author oldflame-Jm TODO
 */
public interface UserService {
  public void save(User user);

  public List<User> getUsers();
}
