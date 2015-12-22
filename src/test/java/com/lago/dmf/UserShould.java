package com.lago.dmf;

import com.lago.dmf.domain.User;
import com.lago.dmf.exceptions.FacebookLoginException;
import org.junit.Test;

/**
 * Created by lago on 12/22/15.
 */
public class UserShould {

    @Test(expected = FacebookLoginException.class)
    public void notInstantiateWithNullFBToken() throws FacebookLoginException{
        User user = new User("jsmith@fake.net", null);
    }

    @Test(expected = FacebookLoginException.class)
    public void notInstantiateWithEmptyFBToken() throws FacebookLoginException{
        User user = new User("jsmith@fake.net", "");
    }
}
