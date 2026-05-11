import java.util.ArrayList;

public class Equipo {
    private ArrayList<Jugador> equipo;

    public Equipo()
    {
        equipo=new ArrayList<>();
        predefinir();
    }
    public void predefinir()
    {
        equipo.add(new Jugador("Mesi", "Delantero",
                10f, 350f, 36));
        equipo.add(new Jugador("Modric", "Mediocampista",
                8.9f, 100f, 38));
        equipo.add(new Jugador("Haaland", "Delantero",
                9.5f, 180f, 23));
        equipo.add(new Jugador("Van Dijk", "Defensa",
                8.7f, 400f, 32));
    }
    public float valorTolar()
    {
        //primera invocacion
        if(equipo.isEmpty())
            return 0;
        return valorTotal(0); //indice inicial

    }

    private float valorTotal(int indice)
    {
        if(indice==equipo.size()) //estamos fuera de los indices
        {
            //caso base
            return 0;
        }else{
            return equipo.get(indice).getPrecioMercado()+valorTotal(indice+1);
        }
        }
    public Jugador getJugador(int indice)
    {
        if(indice>=0 && indice<equipo.size())
        {
            return equipo.get(indice);

        }
        throw new IllegalArgumentException("Indice fuera de rango");
    }

    public int size(){
        return equipo.size();
    }

}
