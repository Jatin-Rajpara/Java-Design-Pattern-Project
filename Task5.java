public class PlaylistDAO {

    public void saveSong(String song) {
        System.out.println("Saving song to database: " + song);
    }
}

public class Controller {

    PlaylistDAO dao = new PlaylistDAO();

    public void addSong(String song) {

        dao.saveSong(song);

        System.out.println("Song added: " + song);
    }
}

public class Task5 {

    public static void main(String[] args) {

        Controller cont = new Controller();

        con.addSong("Perfect...");
    }
}