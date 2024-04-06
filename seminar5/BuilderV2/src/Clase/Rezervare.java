package Clase;

public class Rezervare implements AbstractBuilder {
    private boolean areMancare;
    private boolean areScaunErgonomic;
    private boolean areMuzica;
    private boolean areBautura;
    private String genMuzical;

    protected Rezervare(boolean areMancare, boolean areScaunErgonomic, boolean areMuzica, boolean areBautura, String genMuzical) {
        this.areMancare = areMancare;
        this.areScaunErgonomic = areScaunErgonomic;
        this.areMuzica = areMuzica;
        this.areBautura = areBautura;
        this.genMuzical = genMuzical;
    }

    protected boolean isAreMancare() {
        return areMancare;
    }

    protected void setAreMancare(boolean areMancare) {
        this.areMancare = areMancare;
    }

    protected boolean isAreScaunErgonomic() {
        return areScaunErgonomic;
    }

    protected void setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
    }

    protected boolean isAreMuzica() {
        return areMuzica;
    }

    protected void setAreMuzica(boolean areMuzica) {
        this.areMuzica = areMuzica;
    }

    protected boolean isAreBautura() {
        return areBautura;
    }

    protected void setAreBautura(boolean areBautura) {
        this.areBautura = areBautura;
    }

    public static class BuilderRezervare implements AbstractBuilder {
        private boolean areMancare;
        private boolean areScaunErgonomic;
        private boolean areMuzica;
        private boolean areBautura;
        private String genMuzical;


        public BuilderRezervare() {
            this.areMancare = false;
            this.areScaunErgonomic = false;
            this.areMuzica = false;
            this.areBautura = false;
            this.genMuzical = null;
        }
        @Override
        public Rezervare build() {
            Rezervare rezervare = new Rezervare(this.areMancare, this.areScaunErgonomic, this.areMuzica, this.areBautura, this.genMuzical);
            this.areMancare = false;
            this.areScaunErgonomic = false;
            this.areMuzica = false;
            this.areBautura = false;
            this.genMuzical = null;
            return rezervare;
        }

        @Override
        public BuilderRezervare adaugaMancare() {
            this.areMancare = true;
            return this;
        }

        @Override
        public BuilderRezervare adaugaBautura() {
            this.areBautura = true;
            return this;
        }

        @Override
        public BuilderRezervare adaugaMuzica() {
            this.areMuzica = true;
            return this;
        }

        @Override
        public BuilderRezervare adaugaGenMuzical(String genMuzical) {
            this.genMuzical = genMuzical;
            return this;
        }

        @Override
        public BuilderRezervare adaugaScaunErgonomic() {
            this.areScaunErgonomic = true;
            return this;
        }
    }

    public String getGenMuzical() {
        return genMuzical;
    }

    public void setGenMuzical(String genMuzical) {
        this.genMuzical = genMuzical;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "areMancare=" + areMancare +
                ", areScaunErgonomic=" + areScaunErgonomic +
                ", areMuzica=" + areMuzica +
                ", areBautura=" + areBautura +
                ", genMuzical='" + genMuzical + '\'' +
                '}';
    }

    protected Rezervare() {
        this.areMancare = false;
        this.areScaunErgonomic = false;
        this.areMuzica = false;
        this.areBautura = false;
        this.genMuzical = null;
    }

    @Override
    public Rezervare build() {
        Rezervare rezervare = new Rezervare(this.areMancare, this.areScaunErgonomic, this.areMuzica, this.areBautura, this.genMuzical);
        this.areMancare = false;
        this.areScaunErgonomic = false;
        this.areMuzica = false;
        this.areBautura = false;
        this.genMuzical = null;
        return rezervare;
    }

    public BuilderRezervare adaugaMancare() {
        this.areMancare = true;
        return new BuilderRezervare();
    }

    @Override
    public BuilderRezervare adaugaBautura() {
        this.areBautura = true;
        return new BuilderRezervare();
    }

    @Override
    public BuilderRezervare adaugaMuzica() {
        this.areMuzica = true;
        return new BuilderRezervare();
    }

    @Override
    public BuilderRezervare adaugaGenMuzical(String genMuzical) {
        this.genMuzical = genMuzical;
        return new BuilderRezervare();
    }

    @Override
    public BuilderRezervare adaugaScaunErgonomic() {
        this.areScaunErgonomic = true;
        return new BuilderRezervare();
    }
}
