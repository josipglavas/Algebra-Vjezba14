public class Polaznik implements Comparable<Polaznik> {
    private String ime;
    private String prezime;
    private String email;

    public Polaznik(String ime, String prezime, String email) {
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public int compareTo(Polaznik other) {
        if (email.equals(other.email)) {
            return 0;
        }
        int prezimeCompare = prezime.compareTo(other.prezime);
        if (prezimeCompare != 0) {
            return prezimeCompare;
        }
        int imeCompare = ime.compareTo(other.ime);
        if (imeCompare != 0) {
            return imeCompare;
        }
        return email.compareTo(other.email);
    }

    @Override
    public int hashCode() {
        return email.hashCode();
    }

    @Override
    public String toString() {
        return ime + " " + prezime + " (" + email + ")";
    }
}