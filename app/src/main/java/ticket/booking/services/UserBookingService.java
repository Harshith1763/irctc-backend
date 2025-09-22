package ticket.booking.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ticket.booking.entities.User;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class UserBookingService {

    private User  user;
    private List<User> userList;

    private ObjectMapper objectMapper = new ObjectMapper();

    private  static  final  String USERS_PATH = "/home/hash/serious_projects/IRCTC/app/src/main/java/ticket/booking/localDB/users.json";




    public  UserBookingService(User user1) throws IOException
    {
        this.user  = user1 ;
        File users = new File(USERS_PATH);
        userList = ObjectMapper.readValue(users, new TypeReference<List<User>>() {});



    }
}
