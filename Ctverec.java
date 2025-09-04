public class Ctverec extends Tvar {
        public double delka;
        public double sirka;
        public String Ctverec (double A,double B) {
            if(delka < 0 || sirka < 0 ){
                System.out.println( "chybaaaa");
                delka = 1.0;
            } else

                this.delka = A;
            this.sirka = B;
            A=B;
            return null;
        }

    @Override
    public String CoJsemZac() {
        return ("Já jsem čtverec");
    }

    @Override
    public double spocitejObovd() {
        return delka * 4 ;
    }

    @Override
    public double spocitejPlochu() {
        return delka * delka;
    }
}
