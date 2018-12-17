package MataUang;

public class MataUang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		import javax.swing.JOptionPane;
		public class MataUang {
		public static void main (String args []){
			double rupiah;
        String r =javax.swing.JOptionPane.showInputDialog("Masukkan nilai Dollar ");//Digunakan untuk menampilkan pop up Masukkan nilai Dollar
        double r1 = Double.parseDouble(r); //perintah konversi dari string ke double
        rupiah=r1*14000;//digunakan untuk eksekusi nilai dollar ke rupiah.

        JOptionPane.showMessageDialog(null, "Hasil konversi Mata Uang: \n dollar " +r+" = "+rupiah+" rupiah ");

	}
	}
}
}
