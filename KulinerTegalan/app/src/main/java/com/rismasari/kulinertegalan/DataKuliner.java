package com.rismasari.kulinertegalan;

import java.util.ArrayList;

public class DataKuliner {
    private static String[] kulinerNames = {
            "Tahu Aci",
            "Kupat Glabed",
            "Nasi Lengko",
            "Rujak Teplak",
            "Soto Sedap Malam",
            "Nasi Ponggol",
            "Glotak",
            "Es Lontrong",
            "Nasi Bogana",
            "Blendung"
    };

    private static String[] kulinerDetails = {
            "Tahu Aci merupakan makanan khas Tegal. Tahu kuning yang dipadukan dengan aci yang membentuk segitiga ini rasanya tak kalah enak dibandingkan makanan khas tegal lain nya.",
            "Nasi Lengko atau hidangan yang lebih akrab disebut sego lengko ini berisi nasi dengan banyak sekali lauk. Khas dari nasi lengko ini adalah bumbu kacangnya. Kurang lengkap jika menyantapnya tanpa ditambah dengan sambal.",
            "Kupat Glabed bisa banget membuat perutmu kenyang. Lidah juga sudah pasti puas sekali. Kamu bisa mencoba potongan ketupat yang disajikan bersama tempa dan disiram dengan kuah glabed. Semakin lezat apabila disantap dengan sate ayam atau kerang.",
            "Rujak Teplak ini, terbuat dari beberapa jenis sayur mayur seperti kangkung, lembayung, daun ubi jalar, daun pepaya, daun singkong, tauge, jantung pisang, pare, dan timun yang direbus. Sebenarnya Rujak Teplak lebih mirip pecel daripada rujak. Ini karena bahan utama yang digunakan adalah aneka jenis sayur-sayuran.",
            "Soto Sedap Malam merupakan soto dengan bumbu tauco yang menyumbang kelezatan tiada tara. Dalam satu mangkuk soto, isiannya melimpah ruah. Mulai dari daging ayam, daging sapi, jeroan seperti usus dan babat. Serta masih banyak lainnya.",
            "Nasi Ponggol ini biasa dijadikan menu sarapan pagi oleh masyarakat Tegal. Isiannya ada nasi dengan beberapa lauk seperti sambal goreng tempe. Kemudian dibungkus dengan daun pisang dalam porsi yang tidak begitu banyak.",
            "Glotak memiliki rasa yang lezat, bahan dasar pembuatannya adalah gembus, bahan semacam oncom yang dimasak dengan berbagai macam bumbu. Untuk menambah kelezatannya, maka diberi kaldu dari rebusan tulang sapi atau ayam.",
            "Es lontrong merupakan minuman legendaris di Tegal, berisi kacang hijau dan cincau. Kemudian juga ditambah dengan gula merah dan santan.",
            "Nasi Bogana juga hadir dalam porsi kecil  yang pas untuk sarapan. Namun yang membedakan adalah lauknya. Ada telur yang disandingkan dengan olahan tempe dan sambal khas.",
            "Blendung umumnya dijual di pasar tradisional. Terbuat dari jagung yang direbus hingga lunak lalu diberi sedikit bumbu dan parutan kelapa. Rasanya gurih dan sedikit ada rasa asinnya. Selain itu, manisnya jagung juga menambah kelezatannya."
    };

    private static int[] kulinerImages = {
            R.drawable.tahu_aci,
            R.drawable.nasi_lengko,
            R.drawable.kupat_glabed,
            R.drawable.rujak_teplak,
            R.drawable.soto_sedapmalam,
            R.drawable.nasi_ponggol,
            R.drawable.glotak,
            R.drawable.es_lontrong,
            R.drawable.nasi_bogana,
            R.drawable.blendung
    };

    private static String[] kulinerHarga={
            "Rp. 1.200 /biji",
            "Rp. 5.000 /porsi",
            "Rp. 8.000 /porsi",
            "Rp. 3.000 /porsi",
            "Rp. 20.000 /porsi",
            "Rp. 5.000 /porsi",
            "Rp. 4.000 /porsi",
            "Rp. 8.000 /porsi",
            "Rp. 10.0000 /porsi",
            "Rp. 3.000 /porsi"
    };

    private static String[] kulinerAlamat={
            "Toko Tahu Murni Putra. Jalan P Diponegoro, Kota Tegal. Toko ini tak jauh dari alun-alun kota atau hanya berjarak sekitar 100 meter.",
            "Warung Makan Pi'an. Jalan  Kol. Sudiarto No. 25, Slerok, Tegal, Jawa Tengah.",
            "Biasanya Ketupat Glabed dijual keliling menggunakan gerobak, ada juga yang menjualnya di warung kaki lima. Seperti di Randugunting, Kec. Tegal Sel., Kota Tegal, Jawa Tengah",
            "Kuliner yang satu ini bisa Anda jumpai di daerah Tegal-Slawi dan sekitarnya.",
            "Warung Soto Sedap Malam. Jalan Raya Talang no. 320 RT 9 / RW 2, Tegal Indonesia",
            "Nasi Ponggol Berkah Bu Ria, Regane Murah, Harga asli Tegal murah meriah. Jalan Sriti No.1.A, Randugunting, Kec. Tegal Sel., Kota Tegal, Jawa Tengah",
            "Warung Glotak yu Iyah. Jalan Hangtuah Tegal (arah Jalingkut)",
            "Gang untuk menikmati Es Lontrong ini berjarak sekira 50 meter dari Ruko Slawi, Jalan AIP KS Tubun ke arah timur.",
            "Warung Makan Ny Pan. Jalan Veteran, Gang Kong Kwan no. 38, Tegal.",
            "Blendung tersedia di pasar tradisional, tetapi sudah banyak penjual keliling atau kaki lima di sekitar Tegal - Slawi."
    };

    static ArrayList<Kuliner> getListData() {
        ArrayList<Kuliner> list = new ArrayList<>();
        for (int position = 0; position < kulinerNames.length; position++) {
            Kuliner kuliner = new Kuliner();
            kuliner.setName(kulinerNames[position]);
            kuliner.setDetail(kulinerDetails[position]);
            kuliner.setPhoto(kulinerImages[position]);
            kuliner.setHarga(kulinerHarga[position]);
            kuliner.setAlamat(kulinerAlamat[position]);
            list.add(kuliner);
        }
        return list;
    }
}

