package filemanipulation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class UserFileManager {

    private List<User> users = new ArrayList<>();

    public void readUsersFromFile(Path path) {
        List<String> lines ;
        try {
            lines = Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can't read file!", ioe);
        }
        addUser(lines);
    }

    private void addUser(List<String > lines) {
        for (String actual : lines) {
            String[] temp = actual.split(" ");
            users.add(new User(temp[0], temp[2]));
        }
    }

    private List<String> getUsersNameWithSameEmail(){
        return users
                .stream()
                .filter(this::checkUserNameAndEmailIsSame)
                .map(User::getUserName)
                .toList();
    }
    public void writeMaleHumansToFile(Path path) {
            try {
                Files.write(path,getUsersNameWithSameEmail());
            }catch (IOException ioe){
                throw new IllegalStateException("Path is invalid",ioe);
            }
    }

    private boolean checkUserNameAndEmailIsSame(User user){
        return user.getEmail().toLowerCase().startsWith(user.getUserName().toLowerCase());

    }

    public List<User> getUsers() {
        return new ArrayList<>(users);
    }

}
