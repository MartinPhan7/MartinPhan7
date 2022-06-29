public class Maillon <T>{
    private T info;
    private Maillon<T> suiv;

    public Maillon(T o){
        this(o,null);
    }

    public Maillon(T o,Maillon<T> suivant){
        setInfo(o);
        setSuiv(suivant);
    }


    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public Maillon<T> getSuiv() {
        return suiv;
    }

    public void setSuiv(Maillon<T> suivant) {
        this.suiv = suivant;
    }
}
