package com.laily.newproject.quiz_utills;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.laily.newproject.Model.Questions;
import com.laily.newproject.quiz_utills.QuizContract.*;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class QuizDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "Quiz.db";
    private static final int DATBASE_VERSION = 1;
    private SQLiteDatabase db;

    public QuizDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATBASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;

        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuestionTable.TABLE_NAME + " ( " +
                QuestionTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionTable.COLUMN_QUESTION + " TEXT, " +
                QuestionTable.COLUMN_OPTION1 + " TEXT, " +
                QuestionTable.COLUMN_OPTION2 + " TEXT, " +
                QuestionTable.COLUMN_OPTION3 + " TEXT, " +
                QuestionTable.COLUMN_OPTION4 + " TEXT, " +
                QuestionTable.COLUMN_OPTION5 + " TEXT, " +
                QuestionTable.COLUMN_ANSWER_NR + " INTEGER, " +
                QuestionTable.COLUMN_CATEGORY + " TEXT" +
                ")";

        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionsTable();

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + QuestionTable.TABLE_NAME);
        onCreate(db);
    }
    private void fillQuestionsTable() {

        // QUESTION KD 1
        Questions q1 = new Questions("KD1 : SOSIOLOGI SEBAGAI ILMU PENGETAHUAN \n" + "Sosiologi lahir sebagai ilmu yang mempelajari tentang masyarakat. Istilah \n" +
                "sosiologi berasal dari bahasa Yunani socius yang b23ierarti kawan dan logos yang \n" +
                "artinya... .", "hubungan sosial", "ilmu atau pikiran", "kehidupan bersama", "hubungan antarindividu", "hubungan antar kelompok",
                1,
                Questions.CATEGORY_QUIZ1);
        addQuestions(q1);

        Questions q2 = new Questions("KD1 : SOSIOLOGI SEBAGAI ILMU PENGETAHUAN \n" + "Seorang sosiolog merintis upaya penelitian terhadap masyarakat yang selama \n" +
                "berabad-abad sebelumnya dianggap mustahil dan mulai memperkenalkan istilah \n" +
                "sosiologi. Istilah sosiologi pertama kali dikemukakan oleh... .",
                "Max Weber", "Ibnu Kaldun", "Ralp Lonton", "Auguste Comte", "Aristoteles", 4,
                Questions.CATEGORY_QUIZ1);
        addQuestions(q2);

        Questions q3 = new Questions("\"KD1 : SOSIOLOGI SEBAGAI ILMU PENGETAHUAN \n" + "Ruang lingkup sosiologi adalah… .?",
                "sama dengan ilmu-ilmu sosial yang lain", "lebih sempit dibandingkan ilmu sosial yang lain", " lebih luas daripada ilmu sosial yang lain", "kadang lebih luas kadang sempit", "bergantung subjek yang dibahas", 4,
                Questions.CATEGORY_QUIZ1);
        addQuestions(q3);

        Questions q4 = new Questions("KD1 : SOSIOLOGI SEBAGAI ILMU PENGETAHUAN \n " + "Tokoh dari Prancis yang dijuluki sebagai “Bapak \n" +
                "Sosiologi” adalah… .?", "Auguste Comte", " Selo Soemardjan", "Pitirim A. Sorokin", "Roucek Warren", " Emile Durkheim", 1,
                Questions.CATEGORY_QUIZ1);addQuestions(q4);

        Questions q5 = new Questions("KD1 : SOSIOLOGI SEBAGAI ILMU PENGETAHUAN \n" + "Perhatikan pernyataan berikut ini!\n" +
                "(1) Hasil pengamatan terhadap realitas sosial yang tidak asal-asalan\n" +
                "(2) Senantiasa berusaha menyusun abstraksi dari hasil pengamatan menjadi \n" +
                "(3) Teori yang dibangun berdiri sendiri tanpa berkaitan dengan teori sebelumnya\n" +
                "(4) Realitas sosial dianalisis tanpa mempersoalkan baik-buruknya fakta\n" +
                "(5) Mempelajari masyarakat secara keseluruhan dan hubungan antarmanusia teori",
                " (1), (2), dan (3)", "(1), (2), dan (4)", " (1), (3), dan (5)", " (2), (4), dan (5) ", "(3), (4), dan (5)", 2, Questions.CATEGORY_QUIZ1);addQuestions(q5);

        Questions q6 = new Questions("KD1 : SOSIOLOGI SEBAGAI ILMU PENGETAHUAN \n" + "Sosiologi sebagai ilmu didasarkan pada hasil observasi,tidak spekulatif dan \n" +
                "menggunakan akal sehat. Hal ini menunjukaan bahwa sosiologi bersifat",
                " teoritis", "empiris", " kumulatif", "nonetis", "dinamis",
                2, Questions.CATEGORY_QUIZ1);addQuestions(q6);

        Questions q7 = new Questions("KD1 : SOSIOLOGI SEBAGAI ILMU PENGETAHUAN \n" + "Dalam sebuah ilmu pengetahuan, teori merupakan konsep yang penting. \n" +
                "Begitu pula dengan ilmu sosiologi. Beberapa teori sosiologi disusun \n" +
                "berdasarkan teori yang sudah ada. Kemudian teori tersebut mengalami \n" +
                "perbaikan, perluasan, dan penguatan sesuai kondisi/fakta terbaru dalam \n" +
                "masyarakat. Uraian tersebut merupakan karakteristik dari sosiologi yang \n" +
                "bersifat… .",
                "empiris", "nonetis", "kumulatif", "teoretis", "sistematis", 3, Questions.CATEGORY_QUIZ1);addQuestions(q7);

        Questions q8 = new Questions("KD1 : SOSIOLOGI SEBAGAI ILMU PENGETAHUAN \n" + "Gejala sosial pada dasarnya merupakan sebuah kajian ilmu yang dipelajari dalam \n" +
                "sosiologi, yang diartikan sebagai peristiwa-peristiwa yang terjadi dalam… .\n",
                "keluarga", "kelompok bermain", "sekolah", "organisasi", "masyarakat", 5, Questions.CATEGORY_QUIZ1);addQuestions(q8);

        Questions q9 = new Questions("KD1 : SOSIOLOGI SEBAGAI ILMU PENGETAHUAN \n" + "Suatu keadaan dimana seseorang tidak bisa menjamin hidupnya sendiri, seperti \n" +
                "orang lain pada umumnya disebut… .",
                "Pengangguran", "Gejala sosial", "Penyimpangan sosial", " Ketidakteraturan sosial", "Kemiskinan", 4,
                Questions.CATEGORY_QUIZ1);addQuestions(q9);

        Questions q10 = new Questions("KD1 : SOSIOLOGI SEBAGAI ILMU PENGETAHUAN \n" + "Berikut ini yang bukan sifat dan hakikat ilmu sosiologi adalah... .",
                "rumpun ilmu-imu sosial menyangkut gejala-gejala kemasyarakatan dan bersifat empiris", "pengetahuan abstrak dan bukan konkret", "pengetahuan empiris dan rasional", "pengetahuan yang bersifat terapan", "mempelajari gejala-gejala umum setiap interaksi masyarakat",
                4, Questions.CATEGORY_QUIZ1);addQuestions(q10);

        //QUIZ KD 1 LANJUTAN
        Questions q11 = new Questions("KD1 : SOSIOLOGI SEBAGAI ILMU PENGETAHUAN \n" + "Aspek utama yang dipelajari oleh sosiologi adalah interaksi antara",
                "manusia dengan lingkungan", "rakyat dengan penguasa", "masyarakat dengan budayanya", "kelas-kelas sosial di masyarakat", "manusia dengan manusia atau kelompok", 5, Questions.CATEGORY_QUIZ2);
        addQuestions(q11);
        Questions q12 = new Questions("KD1 : SOSIOLOGI SEBAGAI ILMU PENGETAHUAN \n" + "Berikut yang mendapat sebutan Bapak Sosiologi ialah",
                "Pitrim A. Sorokon", "Auguste Comte", "Herbert Spencer", "Max Weber", "Karl Marx", 2, Questions.CATEGORY_QUIZ2);addQuestions(q12);
        Questions q13 = new Questions("KD1 : SOSIOLOGI SEBAGAI ILMU PENGETAHUAN \n" + "Disuatu daerah, masyarakatya memiliki kebiasaan tidak baik. Sampah dibuang \n" +
                "sembarangan,saluran air tersumbat,sering banjir, dan terkesan kumuh. \n" +
                "Pemerintah daerah setempat meminta peneliti untuk melakukan kajian \n" +
                "bagaimana strategi yang harus ditempuh agar masyarakat memiliki kesadaran \n" +
                "dalam menjaga kebersihan lingkungan. Strategi ini akan dituangkan dalam \n" +
                "priotritas program kerja pemerintah daerah. Fungsi sosiologi dalam menangani \n" +
                "masalah tersebut adalah… .",
                "membantu pemerintah melakukan pembangunan sosial", "mengevaluasi proses pembangunan sosial masyarakat", "membantu dalam perencanaan pembangunan sosial", "memberikan data orang yang berperilaku tidak baik", "menjaga kebersihan dan kenyamanan lingkungan", 3, Questions.CATEGORY_QUIZ2);addQuestions(q13);
        Questions q14 = new Questions("KD1 : SOSIOLOGI SEBAGAI ILMU PENGETAHUAN \n" + "Pemerintah menjadi mediator dalam kinlfik. Dalam penyelesaian pertikaian \n" +
                "tersebut, pemerintah menggunakan metode sesuai ilmu sosiologi. Berdasarkan \n" +
                "hal ini, sosiologi memiliki kegunaan sebagai... .",
                "pembangunan sosial", "solusi masalah sosial", "pembuatan keputusan", "penengah masalah sosial", "bahan perencanaan sosial",
                2, Questions.CATEGORY_QUIZ2);
        addQuestions(q14);
        Questions q15 = new Questions("KD1 : SOSIOLOGI SEBAGAI ILMU PENGETAHUAN \n" + "Masalah kemiskinan berkaitan dengan berbagai aspek sosial, untuk mengkaji \n" +
                "sebab-sebab terjadinya kemiskinan. Ilmu sosiologi dapat memberikan \n" +
                "sumbangan dalam bentuk... ",
                "Benda dan jasa",
                "Barang dan konsumsi",
                "Kegiatan produksi",
                "Data dan informasi",
                "Tenaga kerja terampil",
                4, Questions.CATEGORY_QUIZ2);
        addQuestions(q15);
        Questions q16 = new Questions("KD1 : SOSIOLOGI SEBAGAI ILMU PENGETAHUAN \n" + "Tomi merupakan siswa SMA yang telah kecanduan narkoba. Perbuatan Tomi \n" +
                "yang berlawanan dengan norma dan nilai-nilai sosial termasuk dalam gejala \n" +
                "sosial yang menjadi objek kajian sosiologi yaitu...",
                "kemiskinan", "kebodohan", "kenakalan remaja", "kesenjangan sosial", "disorganisasi keluarga", 3, Questions.CATEGORY_QUIZ2);
        addQuestions(q16);
        Questions q17 = new Questions("KD1 : SOSIOLOGI SEBAGAI ILMU PENGETAHUAN \n" + "Gejala sosial dapat dikenali dalam bentuk tindakan sosial. Tindakan dari individu \n" +
                "dapat dikategorikan sebagai bentuk adanya gejala sosial karena... .?",
                "bermanfaat bagi dirinya sendiri",
                "mendapat respons dari orang lain",
                "tidak dipahami dan dimaknai oleh orang lain",
                "dilakukan secara spontan dan tanpa perencanaan",
                "diarahkan secara tidak terorganisasi pada suatu fenomena",
                4, Questions.CATEGORY_QUIZ2);
        addQuestions(q17);
        Questions q18 = new Questions("KD1 : SOSIOLOGI SEBAGAI ILMU PENGETAHUAN \n" + " Sosiologi mengkaji perubahan sosial budaya yang terus menerus berlangsung \n" +
                "yang disebabkan oleh faktor-faktor internal maupun eksternal. Gambar transaksi di pasar \n" +
                "menunjukkan adanya peranan sosiologi dalam bidang... .?",
                "sosial", "militer", "politik", "ekonomi", "pembangunan",
                4, Questions.CATEGORY_QUIZ2);
        addQuestions(q18);
        Questions q19 = new Questions("KD1 : SOSIOLOGI SEBAGAI ILMU PENGETAHUAN \n" + "Dalam memenuhi kebutuhan hidupnya, manusia membutuhkan orang lain. Suatu \n" +
                "bentuk interaksi sosial yang lebih luas, yang diatur oleh norma-norma sosial, \n" +
                "antara dua orang atau lebih yang memiliki posisi dan peran sosial menunjukkan \n" +
                "adanya... .",
                "fakta sosial", "gejala sosial", "realitas sosial", " hubungan sosial", " fenomena sosial", 2, Questions.CATEGORY_QUIZ2);
        addQuestions(q19);
        Questions q20 = new Questions("KD1 : SOSIOLOGI SEBAGAI ILMU PENGETAHUAN \n" + "Sebagai ilmu pengetahuan, sosiologi tentunya mempunyai tujuan dalam \n" +
                "mempelajarinya. Tujuan mempelajari sosiologi kaitannya sebagai ilmu terapan adalah..",
                "alat penyaluran aspirasi rakyat dalam pembangunan", "membandingkan kebijakan atau program pemerintah", "sebagai sarana penyalur komunikasi antar suku bangsa", "masalah perkembangan, persebaran, dan terjadinya aneka warna \n" +
                "kebudayaan manusia di seluruh dunia", " meningkatkan pemahaman tentang hubungan antarmanusia dan dinamika kehidupan sosial masyarakat.", 5, Questions.CATEGORY_QUIZ2);
        addQuestions(q20);

        //QUIZ KD 2

        Questions q21 = new Questions("KD2 : HUBUNGAN SOSIAL \n" + "Tindakan sosial yang dilakukan seseorang berdasar pertimbangan dan pilihan sadar\n" +
                "yang berhubungan dengan tindakan itu dan ketersediaan alat yang digunakan untuk\n" +
                "mencapainya adalah pengertian",
                "rasionalitas eksperimen", "rasionalitas berorientasi nilai", "rasionalitas elemen", "rasionalitas parlemen", "rasionalitas instrument", 5, Questions.CATEGORY_QUIZ3);addQuestions(q21);

        Questions q22 = new Questions("KD2 : HUBUNGAN SOSIAL\n" + "Setiap umat beragama akan menjalankan ibadah sesuai dengan ajaran agamya. Ibadah\n" +
                "agama yang dilakukan umat beragama merupakan contoh tindakan",
                "afektif", "rasionalitas berorientasi nilai", "tradisonal ", "rasionalitas parlemen", "rasionalitas instrumental", 2, Questions.CATEGORY_QUIZ3);
        addQuestions(q22);

        Questions q23 = new Questions("KD2 : HUBUNGAN SOSIAL\n" + "Penolakan, keengganan, perlawanan, perbuatan menghalang-halangi, protes,\n" +
                "gangguan-gangguan, perbuatan kekerasan, dan mengacaukan rencana pihak lain\n" +
                "merupakan contoh-contoh kontravensi",
                "umum", "sederhana", "intensif", "rahasia", "statis", 1, Questions.CATEGORY_QUIZ3);
        addQuestions(q23);

        Questions q24 = new Questions("KD2 : HUBUNGAN SOSIAL\n " + "Bentuk akomodasi bermacam-macam. Salah satu bentuk akomodasi berupa usaha\n" +
                "untuk mempertemukan keinginan-keinginan dari pihak-pihak yang berselisih demi\n" +
                "tercapainya persetujuan bersama disebut",
                "kompromi", "arbitrase", "mediasi", "konsiliasi", "toleransi", 4, Questions.CATEGORY_QUIZ3);
        addQuestions(q24);


        Questions q25 = new Questions("KD2 : HUBUNGAN SOSIAL\n" + "Adanya keseimbangan dalam interaksi antara orang per orang atau kelompokkelompok manusia dalam kaitannya dengan norma dan nilai sosial yang berlaku di\n" +
                "dalam masyarakat adalah dikenal dengan istilah ….",
                " kerja sama", "akomodasi", " asimilasi", " akulturasi", "difusi", 2, Questions.CATEGORY_QUIZ3);
        addQuestions(q25);

        Questions q26 = new Questions("KD2 : HUBUNGAN SOSIAL \n" + "Dalam penyelesaian dapat ditempuh berbagai cara. Suatu cara mencapai kompromi\n" +
                "karena pihak-pihak yang bertikai tidak dapat menyelesaikan sendiri pertentangan itu\n" +
                "disebut …",
                " konsiliasi", "kompromi", "arbitrase", "mediasi", "toleransi", 2, Questions.CATEGORY_QUIZ3);
        addQuestions(q26);


        Questions q27 = new Questions("KD2 : HUBUNGAN SOSIAL\n" + "Ketika terjadi konflik atau pertentangan harus dicari solusi untuk menyelesaikannya.\n" +
                "Suatu cara untuk menyelesaikan pertentangan tanpa menghancurkan pihak lawan\n" +
                "disebut …", "mediasi", "akomodasi", "kompromi", "arbitrase", "toleransi", 2, Questions.CATEGORY_QUIZ3);
        addQuestions(q27);

        Questions q28 = new Questions("KD2 : HUBUNGAN SOSIAL\n" + "Salah satu faktor yang mendasari interaksi sosial di mana seseorang berusaha\n" +
                "mengikuti orang lain dalam hal cara berpakaian, model rambut, gaya bicara, dan\n" +
                "bertingkah laku disebut\n",
                "imitasi", "sugesti", "identifkasi", "simpati", "empati", 1, Questions.CATEGORY_QUIZ3);
        addQuestions(q28);

        Questions q29 = new Questions("KD2 : HUBUNGAN SOSIAL\n" + " Pengaruh yang diberikan oleh pihak lain baik itu berupa pandangan, sikap, maupun\n" +
                "perilaku sehingga orang yang mendapat pengaruh tersebut akan mengikuti tanpa berpikir panjang disebut ….",
                "imitasi", "sugesti", "identifkasi", "simpati", "empati", 2, Questions.CATEGORY_QUIZ3);
        addQuestions(q29);

        Questions q30 = new Questions("KD2 : HUBUNGAN SOSIAL\n" + "Ghofar prihatin dengan kondisi yang dialami oleh warga Aceh yang terkena\n" +
                "bencana gempa bumi. Oleh karena itu, dia menyumbangkan semua tabungannya.\n" +
                "Tindakan yang dilakukan Ghofar merupakan wujud dari …",
                "simpati", "empati", "motivasi", "sugesti", "imitasi", 2, Questions.CATEGORY_QUIZ3);
        addQuestions(q30);

        //Quiz KD 2 LANJUTAN

        Questions q31 = new Questions("KD2 : HUBUNGAN SOSIAL \n" + "Sebagai mahluk sosial manusia harus melakukan interaksi demi memenuhi\n" +
                "kebutuhan hidupnya. Interaksi sosial dapat terjadi jika memenuhi dua syarat yaitu kontak dan",
                "perilaku", "motivasi", "komunikasi", "tindakan", "sosialisasi", 3, Questions.CATEGORY_QUIZ4);
        addQuestions(q31);

        Questions q32 = new Questions("KD2 : HUBUNGAN SOSIAL\n" + "Pemerintah Indonesia melakukan impor beras dari Thailand yang ditukar dengan\n" +
                "pesawat terbang produksi Indonesia. Bentuk kerjasama yang dilakukan dua negara tersebut disebut …",
                "bargaining", "joint venture", "kooptasi", "koalisi", "kerukunan", 1,
                Questions.CATEGORY_QUIZ4);
        addQuestions(q32);


        Questions q33 = new Questions("KD2 : HUBUNGAN SOSIAL\n" + "Beberapa partai politik bergabung membentuk sebuah kekuatan untuk menghadapi\n" +
                "pilkada.Bergabungnya beberapa partai politik tersebut merupakan perwujudan dari",
                "joint venture", "bargaining", "kooptasi", "kerukunan", "koalisi", 5,
                Questions.CATEGORY_QUIZ4);
        addQuestions(q33);


        Questions q34 = new Questions("KD2 : HUBUNGAN SOSIAL\n " + "Dengan adanya perkembangan teknologi yang semakin canggih, pihak manajemen\n" +
                "pada suatu perusahaan mengadopsi sistem baru dalam pengelolaan organisasi untuk memperbaiki kondisi organisasi. Usaha yang dilakukan pihak manajemen dinamakan …",
                "kerukunan", "koalisi", "bargaining", "joint venture", "kooptasi", 5, Questions.CATEGORY_QUIZ4);
        addQuestions(q34);

        Questions q35 = new Questions("KD2 : HUBUNGAN SOSIAL\n" + "Dalam melaksanakan proyek pekerjaan yang besar adakalanya dua atau beberapa\n" +
                "perusahaan melakukan kerjasama misalnya dalam proyek pengeboran minyak. Kerja sama antara dua perusahaan dalam proyek pengeboran minyak dinamakan ...",
                "joint venture", "koalisi", " kooptasi", "bargaining", "kerukunan", 1, Questions.CATEGORY_QUIZ4);
        addQuestions(q35);

        Questions q36 = new Questions("KD2 : HUBUNGAN SOSIAL \n" + "Jika sebuah konflik tidak dapat diselesaikan secara kekeluargaan, dapat ditempuh\n" +
                "jalan penyelesaian di pangadilan. Penyelesaian konflik melalui pengadilan dinamakan ",
                "arbitrasi", "toleransi ", "konsiliasi", "ajudikasi", "kompromi", 4,
                Questions.CATEGORY_QUIZ4);
        addQuestions(q36);

        Questions q37 = new Questions("KD2 : HUBUNGAN SOSIAL\n" + "Konflik yang terjadi di Ambon diselesaikan melalui cara mempertemukan pihak-pihak\n" +
                "yang bertikai untuk mencapai kesepakatan bersama. Akomodasi yang demikian dinamakan…",
                "Ajudikasi", "kompromi ", "konsiliasi", "arbitrasi", "mediasi", 2, Questions.CATEGORY_QUIZ4);
        addQuestions(q37);

        Questions q38 = new Questions("KD2 : HUBUNGAN SOSIAL\n" + "Penyelesaian konflik yang diselesaikan dengan paksaan dari pihak yang berkuasa\n" +
                "terhadap pihak yang lemah dinamakan …",
                "stalemate", "koersi", "ajudikasi", "konsiliasi", "toleransi", 2, Questions.CATEGORY_QUIZ4);
        addQuestions(q38);

        Questions q39 = new Questions("KD2 : HUBUNGAN SOSIAL\n" + "Penyelesaian perselisihan dimana iihak yang sedang bertikai berhenti pada titik tertentu karena kekuatan seimbang dinamakan …",
                "mediasi",
                "konsiliasi",
                "koersi",
                "toleransi",
                "stalemate",
                5,
                Questions.CATEGORY_QUIZ4);
        addQuestions(q39);

        Questions q40 = new Questions("KD2 : HUBUNGAN SOSIAL\n" + "jika penyelesaian masalah atau perselisihan dilakukan dengan cara pihak yang sedang\n" +
                "bertikai mengurangi tuntutan agar mencapai penyelesaian masalah., dinamakan… .",
                "mediasi", "kompromi", "koersi", "toleransi", "konsiliasi", 2, Questions.CATEGORY_QUIZ4);
        addQuestions(q40);
//quiz 5

        Questions q41 = new Questions("KD2 : HUBUNGAN SOSIAL\n" + "Berikut ini merupakan bentuk interaksi sosial yang bersifat disosiatif, kecuali …",
                "kontravensi", "persaingan", "kerja sama", "konflik", "pertikaian",
                3, Questions.CATEGORY_QUIZ5);
        addQuestions(q41);
        Questions q42 = new Questions("KD2 : HUBUNGAN SOSIAL\n" + "Untuk meningktkan kebersihan dan kerapian sekolah, pengurus OSIS melaksanakan \n" +
                "lomba kebersihan antar kelas dengan harapan semua kelas dapat tertata dengan baik. Kegiatan lomba antar kelas merupakan contoh dari adalah contoh dari ....",
                "kerja sama", "tawar menawar", "kontravensi", "akomodasi ", "persaingan", 5, Questions.CATEGORY_QUIZ5);
        addQuestions(q42);
        Questions q43 = new Questions("KD2 : HUBUNGAN SOSIAL\n" + "Jika sebuah kompetisi terjadi dengan tajam, dapat mengarah terjadinya konflik. Situasi \n" +
                "antara persaingan dengan konflik dinamakan ",
                "akomodasi", "mediasi", "kontravensi", "arbitrasi", "asimilasi",
                3, Questions.CATEGORY_QUIZ5);
        addQuestions(q43);
        Questions q44 = new Questions("KD2 : HUBUNGAN SOSIAL\n" + "Pertentangan antara orang kulit hitam dan kulit putih yang terjadi di AS merupakan \n" +
                "pertentangan ....",
                "agama", "pribadi", "politik", "rasial", "ekonomi", 4, Questions.CATEGORY_QUIZ5);
        addQuestions(q44);
        Questions q45 = new Questions("KD2 : HUBUNGAN SOSIAL\n" + "Karena berselisih paham Si A dan B terjadi konflik. Pertentangan antara A dan B \n" +
                "merupakan contoh pertentangan ...",
                "pribadi", "agama", "rasial", "ekonomi", "politik", 1, Questions.CATEGORY_QUIZ5);
        addQuestions(q45);
        Questions q46 = new Questions("KD2 : HUBUNGAN SOSIAL\n" + "Pertentangan dapat terjadi kapan saja dan di mana saja baik pada tingkatan yang rendah ataupun tinggi. Pertentangan yang terjadi antara majikan dan buruh termasuk pertentangan ....",
                "ekonomi", "antarkelas sosial ", "antarkelompok", "politik", "rasial",
                2, Questions.CATEGORY_QUIZ5);
        addQuestions(q46);
        Questions q47 = new Questions("KD2 : HUBUNGAN SOSIAL\n" + "Kesatuan hidup manusia yang melakukan interaksi menurut sistem adat-istiadat \n" +
                "tertentu dimana memiliki sifat kontinu serta terikat oleh rasa identitas bersama dinamakan …",
                "keluarga", "masyarakat", "lingkungan", "organisasi", "komunitas", 2, Questions.CATEGORY_QUIZ5);
        addQuestions(q47);
        Questions q48 = new Questions("KD2 : HUBUNGAN SOSIAL\n" + "Dalam kehidupan bermasyarakat banyak realitas sosial yang dapat kita lihat. Berikut \n" +
                "ini adalah contoh-contoh realitas sosial, kecuali ",
                "keluarga", "organisasi", "lingkungan", "komunitas", "masyarakat", 3, Questions.CATEGORY_QUIZ5);
        addQuestions(q48);
        Questions q49 = new Questions("KD2 : HUBUNGAN SOSIAL\n" + "Bentuk keluarga berdasarkan perkawinan tunggal yang terdiri dari suami, istri dan anak disebut dengan keluarga…",
                "inti", "besar", "sedang", "kecil", "tunggal", 1, Questions.CATEGORY_QUIZ5);
        addQuestions(q49);
        Questions q50 = new Questions("KD2 : HUBUNGAN SOSIAL\n" + "Keluarga berperan dalam membentuk kepribadian dan perilaku anak agar sesuai \n" +
                "dengan harapan orang tua maupun masyarakat. Fenomena tersebut menunjukkan, bahwa keluarga mempunyai fungsi …",
                "pengawasan", "sosialisasi", "proteksi", "afeksi", "ekonomi", 2, Questions.CATEGORY_QUIZ5);
        addQuestions(q50);

        //KD 3 QUIZ 1

        Questions q51 = new Questions("KD3 : RAGAM SOSIAL\n" + "Proses belajar seorang anggota masyarakat untuk menerima dan menyesuaikan \n" +
                "diri dengan unsur-unsur kebudayaan yang berupa cara-cara bersikap, bertindak, dan berinteraksi dalam masyarakat disebut dengan …",
                "motivasi ", "akomodasi ", "sosialiasasi ", "internaslisasi ", "budi pekerti",
                3, Questions.CATEGORY_QUIZ6);
        addQuestions(q51);
        Questions q52 = new Questions("KD3 : RAGAM SOSIAL\n" + "Media sosialisasi yang sering digunakan untuk mengukur, membentuk, dan memengaruhi pendapat umum adalah ….",
                "keluarga ", "kelompok bermain", "sekolah", "lingkungan kerja ", "media massa ",
                5, Questions.CATEGORY_QUIZ6);
        addQuestions(q52);
        Questions q53 = new Questions("KD3 : RAGAM SOSIAL\n" + "Kekuatan-kekuatan dari dalam diri individu yang menggerakkannya untuk berbuat sesuatu adalah pengertian … ",
                "motivasi", "dorongan", "kebutuhan", "Dukungan", "niat",
                1, Questions.CATEGORY_QUIZ6);
        addQuestions(q53);
        Questions q54 = new Questions("KD3 : RAGAM SOSIAL\n" + "Sosialisasi primer memiliki fungsi, yaitu....",
                "Membentuk manusia yang tahan menderita ", "membekali individu dengan berbagai keterampilan", "meletakkan dasar kepribadian bagi individu ", "melatih individu untuk menghadapi tantangan", "mendorong individu untuk selalu berusaha",
                3, Questions.CATEGORY_QUIZ6);
        addQuestions(q54);
        Questions q55 = new Questions("KD3 : RAGAM SOSIAL\n" + "Sebelum memulai pelajaran setiap siswa selalu hormat bendera, menyanyikan lagu \n" +
                "Indonesia Raya, kemudian berdoa sesuai dengan agama dan kepercayaan masing-masing. Unsur terciptanya keteraturan sosial pada ilustrasi tersebut adalah",
                "pola", "tertib sosial ", "order ", "keajegan", "keteraturan",
                4, Questions.CATEGORY_QUIZ6);
        addQuestions(q55);
        Questions q56 = new Questions("KD3: RAGAM SOSIAL\n" + "Keluarga mempunyai beberapa fungsi pokok sebagai berikut, kecuali …",
                "pemenuhan kebutuhan biologis ", "pemenuhan kebutuhan emosional ", "pemenuhan kebutuhan pendidikan", "pemenuhan kebutuhan sosialisasi ", "pemenuhan kebutuhan politik ",
                5, Questions.CATEGORY_QUIZ6);
        addQuestions(q56);
        Questions q57 = new Questions("KD3 : RAGAM SOSIAL\n" + "Sosialisasi dimulai sejak individu ...",
                "masih bayi ", "mulai belajar berbicara", "menginginkan pengetahuan tentang nilai dan norma", "memasuki tahap pra sekolah", "memasuki jenjang pendidikan dasar ", 1, Questions.CATEGORY_QUIZ6);
        addQuestions(q57);
        Questions q58 = new Questions("KD3 : RAGAM SOSIAL\n" + "Saat upacara bendera seluruh siswa berbaris dengan tertib tanpa ada yang \n" +
                "berbicara. Mereka mengikuti upacara bendera dengan khidmat. Faktor pembentuk keteraturan tersebut adalah ",
                "ketertiban",
                "keteraturan ",
                "sosialisasi",
                "keajegan",
                "kesadaran",
                1, Questions.CATEGORY_QUIZ6);
        addQuestions(q58);
        Questions q59 = new Questions("KD3 : RAGAM SOSIAL\n" + "Perhatikan hal-hal berikut.\n" +
                "1) Kebudayaan daerah\n" + "2) Lingkungan alam\n" + "3) Warisan biologis\n" + "4) Cara hidup\n" +
                "Unsur kebudayaan yang langsung memengaruhi kepribadian seorang individu pada umumnya adalah .",
                "1 dan 2", "1 dan 3", "1 dan 4", "2 dan 3", "2 dan 4",
                3, Questions.CATEGORY_QUIZ6);
        addQuestions(q59);
        Questions q60 = new Questions("KD3 : RAGAM SOSIAL\n" + "Sosialisasi primer berlangsung dalam lingkungan...",
                "keluarga",
                "teman bermain",
                "media massa",
                "masyarakat luas",
                "sekolah",
                1, Questions.CATEGORY_QUIZ6);
        addQuestions(q60);
//LANJUTAN KD 3 QUIZ 7
        Questions q61 = new Questions("KD3 : RAGAM SOSIAL\n" + "Di dalam kelas tidak dibedakan antara siswa yang berlatar belakang agama, suku dan kelas sosial yang berbeda-beda. Siswa diajarkan bahwa mereka berstatus sama \n" +
                "yaitu sebagai pelajar. Dalam hal ini, fungsi sekolah sebagai agen sosialisasi adalah \n" +
                "mengembangkan sikap dan nilai ...",
                "disiplin ilmu pengetahuan alam dan sosial ", "demokrasi dalam masyarakat majemuk  ", "keteraturan hidup di masyarakat  ", " keadilan di bidang ekonomi  ", "kerukunan bertetangga ", 2, Questions.CATEGORY_QUIZ7);
        addQuestions(q61);
        Questions q62 = new Questions("KD3 : RAGAM SOSIAL\n" + "Media massa sebagai agen sosialisasi membawa dampak positif dan negatif. Salah \n" +
                "satu dampak positifnya adalah ....",
                "maraknya pergaulan bebas ", "budaya konsumtif", "perilaku agresif", "maraknya kekerasan ", "menambah wawasan ", 5, Questions.CATEGORY_QUIZ7);
        addQuestions(q62);
        Questions q63 = new Questions("KD3 : RAGAM SOSIAL\n" + "Media sosialisasi harus berperan membentuk kepribadian individu sehingga tidak\n" +
                "berperilaku menyimpang. Oleh sebab itu, televisi atau media massa lain harus\n" +
                "bertanggung jawab dalam menjalankan fungsi ....",
                "memberikan ilmu pengetahuan", "menanamkan nilai dan norma sosial", "menyajikan hiburan populer/modern", "menjelaskan hasil pembangunan", "menyebarkan informasi mutakhir", 2, Questions.CATEGORY_QUIZ7);
        addQuestions(q63);
        Questions q64 = new Questions("KD3 : RAGAM SOSIAL\n" + "Perilaku yang diharapkan sebagai hasil proses sosialisasi mempunyai sifat ..",
                "dapat memenuhi kebutuhan hidup ", "selaras dengan harapan masyarakat", "mampu berperan sesuai kedudukan", "dapat hidup mandiri sesuai dengan keinginan\n", "dapat memanfaatkan sumber daya manusia\n", 2, Questions.CATEGORY_QUIZ7);
        addQuestions(q64);
        Questions q65 = new Questions("KD3 : RAGAM SOSIAL\n" + "Salah satu faktor yang memengaruhi pembentukan kepribadian seseorang \n" +
                "berkaitan dengan sifat turunan orang tua adalah ...",
                "lingkungan fisik", "ingkungan sosial ", "warisan biologis", "nilai adat-istiadat", "warisan budaya", 3, Questions.CATEGORY_QUIZ7);
        addQuestions(q65);
        Questions q66 = new Questions("KD3: RAGAM SOSIAL\n" + "Kepribadian yang terbentuk melalui proses sosialisasi, merupakan tingkatan ...",
                "sifat", "perilaku", "temperamen", "sikap", "stabilitas", 4, Questions.CATEGORY_QUIZ7);
        addQuestions(q66);
        Questions q67 = new Questions("KD3 : RAGAM SOSIAL\n" + "Kepribadian bersifat unik, artinya ..",
                "mencakup cara orang lain bereaksi", "mengacu pada organisasi yang dinamis", "merupakan perpaduan kerja antara aspek psikis dan fisik", "tidak ada orang yang mempunyai kepribadian identik", "menyesuaikan diri dengan kepribadian lingkungan ", 4, Questions.CATEGORY_QUIZ7);
        addQuestions(q67);
        Questions q68 = new Questions("KD3 : RAGAM SOSIAL\n" + "Suatu perilaku dianggap menyimpang bila tidak bersesuaian dengan ...",
                "nilai dan norma", "situasi dan kondisi ", "tuntutan dan ketersediaan", "keinginan dan kebutuhan", "pengetahuan dan pemahaman", 1, Questions.CATEGORY_QUIZ7);
        addQuestions(q68);
        Questions q69 = new Questions("KD3 : RAGAM SOSIAL\n" + "Nano adalah seorang anak yang baik, sopan, dan patuh pada orang tua. Saat belajar \n" +
                "di SMA, dia berteman dengan kelompok berandalan, dan mulai belajar merokok \n" +
                "bahkan berkenalan dengan narkoba. Saat ini, Nano menjadi perokok dan pecandu \n" +
                "narkoba. Perilaku menyimpang pada kasus tersebut terjadi karena adanya ..",
                "kemajuan lingkungan pergaulan", "sosialisasi sub kebudayaan menyimpang", "keinginan untuk dipuji dan gaya-gayaan", "pelampiasan rasa kecewa dan putus asa", "dorongan penyimpangan karena broken home", 2, Questions.CATEGORY_QUIZ7);
        addQuestions(q69);
        Questions q70 = new Questions("KD3 : RAGAM SOSIAL\n" + "Sepeninggal suaminya, Kembang Setaman harus membesarkan bayinya yang masih \n" +
                "berusia 3 bulan seorang diri. Tidak ada satu pun kerabat yang sudi membantunya. Sementara ia sama sekali tidak memiliki kemampuan dan keterampilan untuk bekerja. Di tengah himpitan hidup yang terasa menyesakkan, seorang kenalan \n" +
                "menawarinya pekerjaan sebagai pramuria pada sebuah tempat hiburan malam. Inilah awal mula Kembang Setaman berkenalan dengan dunia prostitusi. Yang \n" +
                "dapat disimpulkan dari uraian di atas adalah bahwa Kembang Setaman menyimpang karena..",
                "pergaulan yang berbedaan",
                "adanya cap atau stigma negati",
                "tekanan dari struktur sosial",
                "ketidakseimbangan distribusi kekuasaan",
                "kepribadian yang retak",
                3, Questions.CATEGORY_QUIZ7);
        addQuestions(q70);

        //KD3 QUIZ 8

        Questions q71 = new Questions("KD3 : RAGAM SOSIAL\n" + "Sejak bergabung dengan geng Lemah, Wawan yang semula rajin belajar dan aktif \n" +
                "dalam berbagai ekstrakurikuler di sekolah, mulai berubah. Ia lebih suka menghabiskan waktunya tanpa mengerjakan apapun. Acap kali, ia pun membolos \n" +
                "dan memilih bermalas-malasan di kedai kopi dekat sekolah. Dari uraian di atas, tampak bahwa penyebab penyimpangan Wawan ialah ....\n",
                "pergaulan yang berbeda", "adanya cap atau stigma negatif", "tekanan dari struktur masyarakat ", " ketidakseimbangan distribusi kekuasaan ", "kepribadian yang retak ",
                1, Questions.CATEGORY_QUIZ8);
        addQuestions(q71);
        Questions q72 = new Questions("KD3 : RAGAM SOSIAL\n" + "Perhatikan hal-hal di bawah ini.\n" +
                "1) Sifatnya sementara\n" +
                "2) Tidak berulang\n" +
                "Hal tersebut adalah ciri dari penyimpangan ...",
                "primer", "sekunder", "positif", " negatif", "normatif",
                1, Questions.CATEGORY_QUIZ8);
        addQuestions(q72);
        Questions q73 = new Questions("KD3 : RAGAM SOSIAL\n" + "Contoh perilaku menyimpang primer di antaranya ..",
                "melakukan pembunuhan berencana",
                "penipuan berkedok investasi berjangka",
                "terlambat masuk sekolah karena bangun kesiangan",
                "pemalsuan uang untuk memenuhi gaya hidup konsumtif",
                "melakukan kekerasan terhadap anak dan istri",
                3, Questions.CATEGORY_QUIZ8);
        addQuestions(q73);
        Questions q74 = new Questions("KD3 : RAGAM SOSIAL\n" + "Jumlah pengamen jalanan yang beroperasi di kota-kota besar di Indonesia, \n" +
                "semakin meningkat dan kondisinya mengkhawatirkan. Penertiban terhadap \n" +
                "pengamen sering dilakukan karena dianggap mengganggu arus lalu lintas dan \n" +
                "rentan kecelakaan. Berdasarkan kadar pelanggarannya, tindakan mengamen di \n" +
                "jalan tersebut termasuk jenis penyimpangan ...",
                "kelompok ", "individual", "primer", "massal", "sekunder", 3, Questions.CATEGORY_QUIZ8);
        addQuestions(q74);
        Questions q75 = new Questions("KD3 : RAGAM SOSIAL\n" + "Remaja yang sedang mengalami stres berat berupaya untuk menghilangkan \n" +
                "kekalutannya dengan mengonsumsi narkoba. Penyimpangan yang dilakukan remaja tersebut dapat diancam dengan sanksi berat karena termasuk penyimpangan ...",
                "primer", "sekunder", "positif", "negatif", "gaya hidup",
                3, Questions.CATEGORY_QUIZ8);
        addQuestions(q75);
        Questions q76 = new Questions("KD3: RAGAM SOSIAL\n" + "Berikut ini yang dapat dikategorikan sebagai penyimpangan yang bersifat positif adalah ..",
                "pembunuhan", "kiprah perempuan di sektor publik", "pelecehan seksual", "bullying", "menghukum anak dengan kekerasan",
                2, Questions.CATEGORY_QUIZ8);
        addQuestions(q76);
        Questions q77 = new Questions("KD3 : RAGAM SOSIAL\n" + "Salah satu bentuk penyimpangan sosial yang kerap terjadi seiring pesatnya kemajuan di bidang teknologi informasi adalah kejahatan dunia maya, contohnya ...",
                "terorisme", "trafficking", "bullying", "carding", "pedofilia",
                4, Questions.CATEGORY_QUIZ8);
        addQuestions(q77);
        Questions q78 = new Questions("KD3 : RAGAM SOSIAL\n" + "Perkelahian antarpelajar termasuk bentuk perilaku menyimpang karena tindakan itu ....",
                "dilarang oleh aparatur negara",
                "dapat merugikan orang lain",
                "membuang waktu dan energi",
                "tindakan itu tidak disenangi oleh orang tua dan guru",
                "dapat merugikan orang lain dan dirinya sendiri",
                5, Questions.CATEGORY_QUIZ8);
        addQuestions(q78);
        Questions q79 = new Questions("KD3 : RAGAM SOSIAL\n" + "Mulanya Tompel bukanlah seorang pembohong. Tapi, setiap kali berbicara dengan \n" +
                "kedua orang tuanya, mereka selalu saja tidak mempercayainya dan menuduhnya tidak jujur. Akhirnya Tompel pun memutuskan mulai berbohong. Tampak di sini bahwa Tompel menyimpang akibat ..",
                "pergaulan yang berbeda", "adanya cap atau stigma negatif", "tekanan dari struktur masyarakat", "ketidakseimbangan distribusi kekuasaan", "kepribadian yang retak", 2, Questions.CATEGORY_QUIZ8);
        addQuestions(q79);
        Questions q80 = new Questions("KD3 : RAGAM SOSIAL\n" + "Hal terpenting dalam upaya mencegah perilaku menyimpang yang berupa vandalisme adalah ..",
                "menghukum berat para pelakunya", "mengekang pergaulan remaja", "memberdayakan peran polisi", "memperkuat kesadaran akan norma sosial", " memperberat sanksi sosial bagi pelakunya", 4, Questions.CATEGORY_QUIZ8);
        addQuestions(q80);

        //KD 4 BAG 1 QUIZ 9
        Questions q81 = new Questions("KD4 : PENELITIAN SOSIAL\n" + "Berikut yang merupakan jenis penalaran dalam penelitian adalah...",
                "Induksi dan afiliasi", "Deduksi dan inklusi", "Afiliasi dan eksklusi", " Deduksi dan induksi", "Induksi dan eksklusi", 4, Questions.CATEGORY_QUIZ9);
        addQuestions(q81);

        Questions q82 = new Questions("KD4 : PENELITIAN SOSIAL\n" + "Cara berfikir:\n" +
                "(1) Apatis\n" + "(2) Skeptis\n" + "(3) Analitis\n" + "(4) Terbuka\n" + "(5) Manipulatif\n" + "Cara berpikir yang harus dimiliki seorang peneliti ditunjukkan nomor …",
                "(1), (2), dan (3)", "(1), (2), dan (4)", "(2), (3), dan (4)", "(2), (3), dan (5)", "(3), (4), dan (5)",
                3, Questions.CATEGORY_QUIZ9);
        addQuestions(q82);

        Questions q83 = new Questions("KD4 : PENELITIAN SOSIAL\n" + "Indah tertarik dengan topik penelitian mengenai pengamen jalanan. Awal \n" +
                "ketertarikannya dengan topik tersebut karena setiap pagi Indah menjumpai \n" +
                "beberapa pengamen yang tidur di teras toko ketika ia berangkat sekolah. Metode penelitian yang sesuai dengan penelitian yang dilakukan Indah adalah ..",
                "Historik", "Lapangan", "Eksperimen", "Laboratorium", "Perpustakaan",
                2, Questions.CATEGORY_QUIZ9);
        addQuestions(q83);

        Questions q84 = new Questions("KD4 : PENELITIAN SOSIAL\n" + "Jenis penelitian historik sesuai digunakan dalam contoh penelitian berikut ...",
                "Pengaruh gadget terhadap pretasi belajar ", "Masuknya agama Islam di Nusantara", "Tingkat kekerasan di perkotaan", "Fenomena rasisme di masyarakat", "Fenomena pergaulan bebas di kalangan remaja\n", 2, Questions.CATEGORY_QUIZ9);
        addQuestions(q84);

        Questions q85 = new Questions("KD4 : PENELITIAN SOSIAL\n" + "Seorang mahasiswa melakukan penelitian mengenai evaluasi sebuah program \n" +
                "beasiswa. Dari hasil penelitian tersebut diketahui bahwa implementasi beasiswa \n" +
                "kurang efektif. Jenis penelitian tersebut tergolong penelitian....",
                "Dasar",
                "Terapan",
                "Historik",
                "Kualitatif",
                "Kuantitati",
                2, Questions.CATEGORY_QUIZ9);
        addQuestions(q85);

        Questions q86 = new Questions("KD4 : PENELITIAN SOSIAL\n" + "Seorang peneliti mampu melakukan penelitian dengan menggunakan metode dan \n" +
                "teknik penelitian tertentu. Pernyataan tersebut merupakan definisi dari sikap yang \n" +
                "harus dimiliki seorang peneliti, yaitu ...",
                " Jujur ", "Faktual ", " Skeptis", "Objektif", "Kompeten", 5, Questions.CATEGORY_QUIZ9);
        addQuestions(q86);

        Questions q87 = new Questions("KD4 : PENELITIAN SOSIAL\n" + "Seorang peneliti hendak melakukan penelitian mengenai kemiskinan di Jakarta. \n" +
                "Namun, karena kesulitan mendapatkan data primer, peneliti tersebut memutuskan \n" +
                "untuk menggunakan data sekunder. Data sekunder yang tepat untuk digunakan \n" +
                "dalam contoh kasus tersebut adalah ...",
                " Survei", "Observasi", "Wawancara", "Studi Pustaka", "FGD (Focus Group Discussion)", 4, Questions.CATEGORY_QUIZ9);
        addQuestions(q87);

        Questions q88 = new Questions("KD4 : PENELITIAN SOSIAL\n" + "Peneliti mengumpulkan data yang dapat diukur dengan angka-angka Data di tersebut merupakan contoh penelitian yang menggunakan pendekatan. ....",
                "Kualitatif", "Kuantitatif", " analisis data", "Observasi lapangan", " data kualitatif", 2, Questions.CATEGORY_QUIZ9);
        addQuestions(q88);

        Questions q89 = new Questions("KD4 : PENELITIAN SOSIAL\n" + "Dalam sebuah penelitian, peneliti akan mengambil sampel 50 orang yang memiliki \n" +
                "berat badan lebih dari 60 kilogram. Setelah menentukan jumlah sampel, peneliti \n" +
                "mencari orang yang memiliki berat badan yang sudah ditentukan tersebut. Teknik penarikan sampel tersebut termasuk dalam jenis ....",
                "Quota sample", "Stratified sample", "Purposive sample", "Proportional sample", "Area probability sample", 3, Questions.CATEGORY_QUIZ9);
        addQuestions(q89);

        Questions q90 = new Questions("KD4 : PENELITIAN SOSIAL\n" + "Dalam penelitian kualitatif, peneliti sebisa mungkin harus menempatkan dirinya \n" +
                "sebagai peneliti. Hal ini harus dilakukan karena tidak jarang peneliti merasa empati \n" +
                "dengan informannya sehingga dikhawatirkan laporan penelitiannya bersifat ...",
                "Bias", " Objektif", "Up to date", "Representatif", "Mendekati kebenaran", 1, Questions.CATEGORY_QUIZ9);
        addQuestions(q90);

        //KD 4 BAG 2 QUIZ 10
        Questions q91 = new Questions("KD4 : PENELITIAN SOSIAL\n" + "Dalam penelitian kualitatif, jika peneliti menginginkan hasil penelitian yang baik \n" +
                "diperlukan wawancara mendalam. Namun untuk topik penelitian tertentu seperti \n" +
                "korban KDRT, terkadang sulit untuk menggali informasi secara mendalam. Maka dari itu peneliti perlu untuk melakukan ....",
                "Mengganti topik penelitian", "Menyiapkan banyak pertanyaan", " Mencari banyak informan cadangan", " Observasi mengenai lokasi penelitian", " Membangun kedekatan hubungan", 3, Questions.CATEGORY_QUIZ10);
        addQuestions(q91);

        Questions q92 = new Questions("KD4 : PENELITIAN SOSIAL\n" + "Ketika melakukan sebuah penelitian mengenai pengaruh penggunaan laptop \n" +
                "terhadap efektivitas belajar siswa, Rudi menggunakan sampel siswa sekolah A dan \n" +
                "B. Dari penjabaran tersebut Rudi ingin melakukan jenis penelitian ....",
                "Deskriptif", "Eksplorasi", "Komparasi", " Eksplanasi", "Eksperimen", 3, Questions.CATEGORY_QUIZ10);
        addQuestions(q92);

        Questions q93 = new Questions("KD4 : PENELITIAN SOSIAL\n" + "Sebuah penelitian mengenai mobilitas sosial menganggap bahwa pendidikan \n" +
                "sebagai social elevator seseorang mencapai kehidupan yang lebih baik. Pernyataan tersebut menunjukkan bahwa logika penelitian tersebut bersifat ...",
                "Holistik", "Inklusif", "Induktif", "Deduktif", "Ekslusif", 4, Questions.CATEGORY_QUIZ10);
        addQuestions(q93);

        Questions q94 = new Questions("KD4 : PENELITIAN SOSIAL\n" + "Berikut yang bukan merupakan sumber data untuk penelitian kepustakaan \n" +
                "adalah…",
                "Buku", "Koran", "Naskah", "Majalah", "Rekaman Wawancara", 5, Questions.CATEGORY_QUIZ10);
        addQuestions(q94);

        Questions q95 = new Questions("KD4 : PENELITIAN SOSIAL\n" + "Sebuah penelitian mendalami topik tentang tingginya intensitas penggunaan media \n" +
                "sosial di kalangan remaja. Media sosial kini menjadi bagian tak terpisahkan dari \n" +
                "gaya hidup remaja. Pada level tertentu, penggunaan media sosial dianggap \n" +
                "mengakibatkan kecanduan bagi sebagian penggunanya. Remaja menghabiskan \n" +
                "waktu hanya untuk bermain game dan menjadikan media sosial sebagai realitas \n" +
                "baru, seolah lebih penting dari realitas sesungguhnya dalam kehidupan nyata. \n" +
                " Rumusan masalah penelitian yang tepat sesuai ilustrasi di atas adalah ....",
                "Bagaimana pengaruh penggunaan media sosial dalam gaya hidup para remaja?",
                "Bagaimana pengaruh media sosial terhadap peningkatan prestasi belajar siswa?",
                "Apa peran orangtua dalam rangka membatasi penggunaan media sosial anaknya? ",
                "Siapa yang paling berperan untuk mengawasi remaja ketika menggunakan media sosial? ",
                "Bagaimana peraturan sekolah dalam mernbatasi penggunaan media sosial saat belajar? ",
                1, Questions.CATEGORY_QUIZ10);
        addQuestions(q95);

        Questions q96 = new Questions("KD4 : PENELITIAN SOSIAL\n" + "Seorang peneliti dalam melakukan tindakan penelitian selalu diawali adanya …",
                "masalah-masalah pribadi", "kebutuhan akan uang dari penyandang dana", "kepanikan", "kekecewaan terhadap problem hidup", "rasa ingin tahu (curiosity)",
                5, Questions.CATEGORY_QUIZ10);
        addQuestions(q96);

        Questions q97 = new Questions("KD4 : PENELITIAN SOSIAL\n" + " Perhatikan urutan dalam suatu penelitian berikut.\n" +
                "1) topik penelitian\n" + "2) merumuskan masalah\n" + "3) menentukan objek penelitian\n" + "4) sumber dan jenis data\n" + "5) pendekatan dalam penelitian.\n" + "Semua langkah-langkah tersebut merupakan persiapan menyusun ….",
                "isi laporan penelitian", "sistematika penelitian", "tujuan penelitian", "rancangan penelitian", "teknik pengumpulan data", 4, Questions.CATEGORY_QUIZ10);
        addQuestions(q97);

        Questions q98 = new Questions("KD4 : PENELITIAN SOSIAL\n" + "Seorang peneliti ingin mengetahui prestasi perolehan indeks kumulatif mahasiswa pada sebuah perguruan tinggi negeri di Yogyakarta tahun pembelajaran 2018–2019. Peneliti mengambil para mahasiswa tahun pembelajaran 2018–2019 secara acak untuk dijadikan sampel dalam penelitiannya. Cara pengambilan sampel tersebut dinamakan sampling …",
                "kelompok", "strata", "insidental", "kuota", "acak/random",
                5, Questions.CATEGORY_QUIZ10);
        addQuestions(q98);

        Questions q99 = new Questions("KD4 : PENELITIAN SOSIAL\n" + "Jika kamu mengambil sampel dengan jumlah tertentu pada suatu kelompok, misalnya kelas I: 300 orang, kelas II: 200 orang, kelas III: 100 orang, dengan alasan jumlah murid kelas I jauh lebih banyak daripada kelas II dan III, maka kamu telah menggunakan jenis sampel …",
                "random", "berstrata", "wilayah", "kelompok", "proporsional", 5, Questions.CATEGORY_QUIZ10);
        addQuestions(q99);

        Questions q100 = new Questions("KD4 : PENELITIAN SOSIAL\n" + "Hal-hal berikut ini yang perlu diperhatikan dalam pengumpulan data, kecuali …",
                "sumber data", "jenis data yang diperoleh", "jumlah data yang diperlukan", "berisi kesimpulan dan saran", "biaya yang diperlukan untuk mengumpulkan data", 4, Questions.CATEGORY_QUIZ10);
        addQuestions(q100);
    }

    private void addQuestions(Questions question) {
        ContentValues cv = new ContentValues();
        cv.put(QuestionTable.COLUMN_QUESTION, question.getQuestion());
        cv.put(QuestionTable.COLUMN_OPTION1, question.getOption1());
        cv.put(QuestionTable.COLUMN_OPTION2, question.getOption2());
        cv.put(QuestionTable.COLUMN_OPTION3, question.getOption3());
        cv.put(QuestionTable.COLUMN_OPTION4, question.getOption4());
        cv.put(QuestionTable.COLUMN_OPTION5, question.getOption5());
        cv.put(QuestionTable.COLUMN_ANSWER_NR, question.getAnswerNr());
        cv.put(QuestionTable.COLUMN_CATEGORY, question.getCategory());
        db.insert(QuestionTable.TABLE_NAME, null, cv);
    }
    public ArrayList<Questions> getAllQuestions() {

        ArrayList<Questions> questionList = new ArrayList<>();
        db = getReadableDatabase();

        String Projection[] = {

                QuestionTable._ID,
                QuestionTable.COLUMN_QUESTION,
                QuestionTable.COLUMN_OPTION1,
                QuestionTable.COLUMN_OPTION2,
                QuestionTable.COLUMN_OPTION3,
                QuestionTable.COLUMN_OPTION4,
                QuestionTable.COLUMN_OPTION5,
                QuestionTable.COLUMN_ANSWER_NR
        };
        Cursor c = db.query(QuestionTable.TABLE_NAME,
                Projection,
                null,
                null,
                null,
                null,
                null);

        if (c.moveToFirst()) {
            do {

                Questions question = new Questions();
                question.setQuestion(c.getString(c.getColumnIndex(QuestionTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION3)));
                question.setOption4(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION4)));
                question.setOption5(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION5)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuestionTable.COLUMN_ANSWER_NR)));

                questionList.add(question);

            } while (c.moveToNext());

        }
        c.close();
        return questionList;

    }
    public ArrayList<Questions> getAllQuestionsWithCategory(String category) {

        ArrayList<Questions> questionList = new ArrayList<>();
        db = getReadableDatabase();


        String Projection[] = {

                QuestionTable._ID,
                QuestionTable.COLUMN_QUESTION,
                QuestionTable.COLUMN_OPTION1,
                QuestionTable.COLUMN_OPTION2,
                QuestionTable.COLUMN_OPTION3,
                QuestionTable.COLUMN_OPTION4,
                QuestionTable.COLUMN_OPTION5,
                QuestionTable.COLUMN_ANSWER_NR,
                QuestionTable.COLUMN_CATEGORY
        };


        String selection = QuestionTable.COLUMN_CATEGORY + " = ? ";
        String selectionArgs[] = {category};


        Cursor c = db.query(QuestionTable.TABLE_NAME,
                Projection,
                selection,
                selectionArgs,
                null,
                null,
                null);

        if (c.moveToFirst()) {
            do {

                Questions question = new Questions();
                question.setQuestion(c.getString(c.getColumnIndex(QuestionTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION3)));
                question.setOption4(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION4)));
                question.setOption5(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION5)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuestionTable.COLUMN_ANSWER_NR)));
                question.setCategory(c.getString(c.getColumnIndex(QuestionTable.COLUMN_CATEGORY)));

                questionList.add(question);

            } while (c.moveToNext());

        }
        c.close();
        return questionList;
    }
}
