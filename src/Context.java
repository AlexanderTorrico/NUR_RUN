import Data.ManagerData;
import Services.EstudianteIntercambioService;
import Services.EstudianteService;

public class Context {
    private ManagerData managerData;
    private EstudianteService estudianteService;
    private EstudianteIntercambioService estudianteIntercambioService;


    public Context(ManagerData managerData) {
        this.managerData = managerData;
        // Estudiante
        estudianteService = new EstudianteService(this.managerData);
        estudianteIntercambioService = new EstudianteIntercambioService(this.managerData);

    }

    public ManagerData getManagerData() {
        return managerData;
    }

    public void setManagerData(ManagerData managerData) {
        this.managerData = managerData;
    }

    public EstudianteService getEstudianteService() {
        return estudianteService;
    }

    public void setEstudianteService(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }

    public EstudianteIntercambioService getEstudianteIntercambioService() {
        return estudianteIntercambioService;
    }

    public void setEstudianteIntercambioService(EstudianteIntercambioService estudianteIntercambioService) {
        this.estudianteIntercambioService = estudianteIntercambioService;
    }
}
