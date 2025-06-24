import core.basesyntax.model.*;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Smile smile1 = new Smile();
        Smile smile2 = new Smile();
        smileDao.create(smile1);
        smileDao.create(smile2);

        Comment comment = new Comment();
        comment.setContent("Hello world!");
        comment.setSmiles(List.of(smile1, smile2));
        commentDao.create(comment);

        User user = new User();
        user.setUsername("User");
        comment.setUser(user);
        user.setComments(List.of(comment));
        userDao.create(user);

        Message message = new Message();
        message.setContent("Alert!");

        MessageDetails messageDetails = new MessageDetails();
        messageDetails.setSender("System");
        messageDetails.setSentTime(LocalDateTime.now());
        message.setMessageDetails(messageDetails);
        messageDao.create(message);
    }
}
