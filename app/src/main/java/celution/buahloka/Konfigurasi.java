package celution.buahloka;

public class Konfigurasi {
    //Dibawah ini merupakan Pengalamatan dimana Lokasi Skrip CRUD PHP disimpan
    //Pada tutorial Kali ini, karena kita membuat localhost maka alamatnya tertuju ke IP komputer
    //dimana File PHP tersebut berada
    //PENTING! JANGAN LUPA GANTI IP SESUAI DENGAN IP KOMPUTER DIMANA DATA PHP BERADA
    public static final String URL_ADD="https://wwwhanevotk.000webhostapp.com/insert.php";
    public static final String URL_GET_ALL = "https://wwwhanevotk.000webhostapp.com/select.php";
    public static final String URL_GET_USR = "https://wwwhanevotk.000webhostapp.com/selectsatu.php?id=";
    public static final String URL_UPDATE_USR = "https://wwwhanevotk.000webhostapp.com/update.php";
    public static final String URL_DELETE_USR = "https://wwwhanevotk.000webhostapp.com/delete.php?id=";

    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
    public static final String KEY_USR_ID = "id";
    public static final String KEY_USR_EMAIL = "email";
    public static final String KEY_USR_PASS = "pass"; //desg itu variabel untuk posisi
    public static final String KEY_USR_NAMA = "nama"; //salary itu variabel untuk gajih
    public static final String KEY_USR_ALAMAT = "alamat";
    public static final String KEY_USR_KOTA = "kota";
    public static final String KEY_USR_PROV = "prov";
    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_USR_ID = "id";
    public static final String TAG_USR_EMAIL = "email";
    public static final String TAG_USR_PASS = "pass";
    public static final String TAG_USR_NAMA = "nama";
    public static final String TAG_USR_ALAMAT = "alamat";
    public static final String TAG_USR_KOTA = "kota";
    public static final String TAG_USR_PROV = "prov";

    //ID karyawan
    //emp itu singkatan dari Employee
    public static final String USR_ID = "usr_id";
}
