import com.juaracoding.fauziujian1jf.ujian2.ATM;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ATMTest {

    private ATM atm;

    @BeforeMethod
    public void setUp() {
        atm = new ATM(1000); // Inisialisasi ATM dengan saldo awal 1000 sebelum setiap metode pengujian
    }

    @Test
    public void testLihatSaldo() {  // Metode Pengujian Lihat Saldo
        double saldoExpected = 1000;
        double saldoActual = atm.lihatSaldo();
        Assert.assertEquals(saldoActual, saldoExpected);
    }

    @Test
    public void testSetorUang() {  // Metode Pengujian Setor Uang
        atm.setorUang(500);
        double saldoExpected = 1500;
        double saldoActual = atm.lihatSaldo();
        Assert.assertEquals(saldoActual, saldoExpected);
    }

    @Test(expectedExceptions = IllegalArgumentException.class) // Metedo Dengan Test Setor Uang Dengan Nilai Negatif
    public void testSetorUangNegatif() {
        atm.setorUang(-100);
    }

    @Test
    public void testTarikUang() {  // Metode Pengujian
        atm.ambilUang(500);
        double saldoExpected = 500;
        double saldoActual = atm.lihatSaldo();
        Assert.assertEquals(saldoActual, saldoExpected);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTarikUangLebihDariSaldo() {
        atm.ambilUang(1500); // Metode Pengujian Tarik Uang Lebih Dari Saldo
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTarikUangNegatif() {
        atm.ambilUang(-100); // Metode Pengujian Tarik Uang Dengan Nilai Negatif
    }

}
