import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;


public class SILab2Test {

    User user_master = new User("master", "password!123", "master_123@test.com");
    User user_nitro = new User("nitro", "easyPassword$35", "nitro_special@test.com");
    List<User> allUsers = new ArrayList<>(Arrays.asList(user_master, user_nitro));


    @org.junit.jupiter.api.Test
    public void test_Every_Branch () {
        User test1 = new User(null, null, null );
        User test2 = new User(null, "password#123", "master_123@test.com");
        User test3 = new User ("master", "master", "master_official@test.com");
        User test4 = new User ("dontcare", "password 123", "whatevertest.com");
        User test5 = new User ("nitro", "password421", "nitro_master@test.com");
        assertThrows(RuntimeException.class, () -> SILab2.function(test1, allUsers));
        assertFalse(SILab2.function(test2, allUsers));
        assertFalse(SILab2.function(test3, allUsers));
        assertFalse(SILab2.function(test4, allUsers));
        assertFalse(SILab2.function(test5, allUsers));
    }

    @org.junit.jupiter.api.Test
    public  void test_Multiple_Condition_ln36 () {
        User test1 = null;
        User test2 = new User ("test2", null , "dsd@sk.com");
        User test3 = new User ("false", "false123", null);
        User test4 = new User ("tene", "passcode321", "atene@test.com");
        assertThrows(RuntimeException.class, () -> SILab2.function(test1, allUsers));
        assertThrows(RuntimeException.class, () -> SILab2.function(test2, allUsers));
        assertThrows(RuntimeException.class, () -> SILab2.function(test3, allUsers));
        assertFalse(SILab2.function(test4, allUsers));

    }

}




