package entites;

public class AdressePostale {
	public int numeroRue;
	public String libelleRue;
	public int codePostale;
	public String ville;




	public AdressePostale(int nvnumeroRue, String nvlibelleRue, int nvcodePostale,String nvville){
		numeroRue = nvnumeroRue;
		libelleRue = nvlibelleRue;
		codePostale = nvcodePostale;
		ville = nvville;

	}




	@Override
	public String toString() {
		return "AdressePostale [numeroRue=" + numeroRue + ", libelleRue=" + libelleRue + ", codePostale=" + codePostale
				+ ", ville=" + ville + "]";
	}
	
}