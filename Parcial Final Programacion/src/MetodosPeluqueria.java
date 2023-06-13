import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


abstract class MetodosPeluqueria implements IPeluqueria{

    public List<Peluqueria> PeluqueriaList;

    public MetodosPeluqueria() {
        this.PeluqueriaList = new ArrayList<>();
    }


    @Override
    public Peluqueria encontrarId(int id) {
        return PeluqueriaList.stream()
                .filter(Peluqueria -> Peluqueria.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Peluqueria> ListarTodos() throws IOException, ClassNotFoundException {
        return null;
    }

    @Override
    public void guardar(Peluqueria peluqueria) throws IOException, ClassNotFoundException {
        PeluqueriaList.add(peluqueria);
        ObjectSerializable.writeObjectToFile(PeluqueriaList,"Guardar.ax");


    }

    @Override
    public void consultar(Peluqueria peluqueria) throws IOException, ClassNotFoundException {
        PeluqueriaList = (List<Peluqueria>) ObjectSerializable.readObjectFromFile("Guardar.ax");

    }

    @Override
    public void modificar(Peluqueria peluqueria) throws IOException, ClassNotFoundException {
        Peluqueria ViejaPeluqueria = encontrarId(peluqueria.getId());
        if (ViejaPeluqueria != null){
            PeluqueriaList.remove(ViejaPeluqueria);
            PeluqueriaList.add(peluqueria);
        }

    }

    @Override
    public void borrar(Peluqueria peluqueria) throws IOException, ClassNotFoundException {
        PeluqueriaList.remove(peluqueria);
        ObjectSerializable.writeObjectToFile(PeluqueriaList, "Guardar.ax");

    }

    }
