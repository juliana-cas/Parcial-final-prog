import java.io.IOException;
import java.util.List;

    public interface IPeluqueria {
        Peluqueria encontrarId(int id);

        List<Peluqueria> ListarTodos() throws IOException, ClassNotFoundException;

        void guardar(Peluqueria peluqueria) throws IOException, ClassNotFoundException;

        void consultar(Peluqueria peluqueria) throws IOException, ClassNotFoundException;

        void actualizar(Peluqueria peluqueria) throws IOException, ClassNotFoundException;

        void modificar(Peluqueria peluqueria) throws IOException, ClassNotFoundException;

        void borrar(Peluqueria peluqueria) throws IOException, ClassNotFoundException;

    }
