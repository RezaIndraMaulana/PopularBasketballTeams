package com.example.popularbasketballteams;

import java.util.ArrayList;

public class ClubData {
    private static String [] clubName = {
            "Lakeres",
            "Celtics",
            "Knicks",
            "Rockets",
            "Bulls",
            "Heat",
            "Suns",
            "Spurs",
            "Mavericks",
            "Raptors"
    };

    private static String [] clubDescription = {
            "Waralaba Lakers dimulai pada tahun 1947 setelah mengakuisisi Detroit Gems yang dibubarkan dengan harga sekitar $15.000. Di musim liga pertama mereka, mereka memimpin liga dengan 43-17.",
            "Tim Celtics dibentuk pada tahun 1946 oleh Presiden Boston Garden-Arena Corporation Walter Brown. Tim ini dikenal sebagai salah satu tim yang paling dominan di pertengahan 1950-an-60-an.",
            "Knicks, demikian tim ini secara populer disebut, didirikan pada tahun 1946 dan merupakan salah satu anggota pendiri Asosiasi Bola Basket Amerika (sekarang bagian dari NBA).",
            "Houston Rockets didirikan pada tahun 1967, dan mereka bermain di San Diego dalam empat tahun pertama mereka sebelum pindah ke Houston. Tim itu sebelumnya bernama San Diego Rockets, tetapi ketika mereka pindah ke Houston, mereka menciptakan nama mereka saat ini.",
            "Chicago Bulls didirikan pada tahun 1966 oleh Dick Klein, yang merupakan satu-satunya pemilik tim yang pernah bermain bola basket. Musim NBA pertama mereka adalah musim 1966-67, dan dalam dua musim pertama mereka, mereka mencatat rekor 57 kemenangan dan 25 kekalahan. Tim menetapkan rekor NBA 72 kemenangan selama musim 1995-96 dan menjadi satu-satunya tim yang memenangkan 70+ pertandingan dalam satu musim.",
            "Miami Heat didirikan pada tahun 1988 dan berhasil mencapai babak playoff hanya dua kali dalam delapan musim pertama mereka. Namun, di musim 1996-97, tim mengalami pergantian keberuntungan besar, dan memegang rekor terbaik kedua dalam sejarah tim 61-21.",
            "The Suns didirikan pada tahun 1968 dan merupakan satu-satunya tim di Wilayah Barat yang tidak berbasis di California. Persentase kemenangan tim dari 55 persen pertandingan adalah persentase kemenangan terbaik keempat sepanjang masa.",
            "Spurs bergabung dengan liga NBA pada tahun 1976; namun, mereka didirikan pada tahun 1967. Tim ini memiliki persentase kemenangan yang luar biasa dan menempati urutan ketiga dalam waralaba aktif untuk persentase kemenangan tertinggi.",
            "The Mavs (seperti yang sering disebut) didirikan pada tahun 1980. Itu adalah satu-satunya tim di Dallas setelah Dallas Chaparrals pindah ke San Antonio dan menjadi San Antonio Spurs. Pertandingan pembuka mereka melawan Spurs, dan Mavs menang dengan skor 103-92.",
            "Toronto Raptors didirikan pada tahun 1995 dan menjadi tim NBA pertama yang berbasis di Kanada sejak Toronto Huskins pada tahun 1946-47. Di musim awal mereka, rekor menang-kalah mereka adalah 21-61. "
    };

    private static int[] clubImage = {
            R.drawable.lakersssss,
            R.drawable.celticsssss,
            R.drawable.kniksssss,
            R.drawable.rocketsssss,
            R.drawable.bullsssss,
            R.drawable.heattttt,
            R.drawable.sunsssss,
            R.drawable.spursssss,
            R.drawable.mavericksssss,
            R.drawable.raptorsssss
    };

    static ArrayList<Club> getListData(){
        ArrayList<Club> list = new ArrayList<>();
        for (int position = 0; position <clubName.length; position++){
            Club club = new Club();
            club.setName(clubName[position]);
            club.setDescription(clubDescription[position]);
            club.setPhoto(clubImage[position]);
            list.add(club);
        }
        return list;
    }
}
