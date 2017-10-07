package ADO_II;

/**
 *
 * @author Monteiro
 */
public class Tv {

    private boolean ligado;
    private int canal;
    private int volume;

    public Tv() {
        this.ligado = false;
        this.canal = 2;
        this.volume = 10;
    }

    public void setVolume(int i) {
        if (i == 0) {
            this.volume--;
            if (this.volume < 0) {
                this.volume = 0;
            }
        } else if (i == 1) {
            this.volume++;
            if (this.volume > 20) {
                this.volume = 20;
            }
        }
    }

    public void setCanal(boolean ligado, int canal) {
        if (!ligado) {
            System.out.println("\nLigue a TV");
        } else {
            this.canal = canal;
        }
    }

    public void setLiga(boolean estado) {
        if (estado) {
            this.ligado = false; //Se estiver ligado, então desliga
        } else {
            this.ligado = true; //Se estiver desligado então liga
        }
    }

    public boolean getLiga() {
        return this.ligado;
    }

    public int getVolume() {
        return this.volume;
    }

    public int getCanal() {
        return this.canal;
    }

}
