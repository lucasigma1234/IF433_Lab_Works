package oop_00000135292_lucas.week06

class Mahasiswa(
    override val namaOrganisasi: String,
    override val budgetRapat: Int,
    override val nilaiMK: Int,
    override val jumlahOrang: Int, override val namaMK: String
): Organisasi, KelasMK {
    override fun rapat() {
        println("sedang rapat di $namaOrganisasi");
        println("biaya konsum rapat: ${super.biayaKonsumsi}");
    }

    override fun penilaian() {
        println("nilai $namaMK adalah $nilaiMK")
    }
    override fun keaktifan() {
        super<KelasMK>.keaktifan();
        super<Organisasi>.keaktifan();
    }
}