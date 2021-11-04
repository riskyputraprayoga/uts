public class App {
    public static void main(String[] args) throws Exception {
        // a. 1 instance yang hanya anggota (isikan nama dan noAnggota)
        Anggota ketut = new Anggota("Ketut", "01");
        ketut.display();
        System.out.println("#################################");
        // b. 1 instance ketua pengurus (isikan nama, noAnggota dan periode kepengurusan)
        Ketua ardhi = new Ketua("Ardhi", "02", "2019 / 2020");
        ardhi.display();
        
        System.out.println("#################################");
        // c. 1 instance ketua panitia (isikan nama, noAnggota dan periode kepengurusan)
        KetuaPanitia rendra = new KetuaPanitia("Rendra", "03", "2020 / 2021");
        rendra.display();
    }
}