import com.corhuila.Parcial.Entitity.Estudiante;
import com.corhuila.Parcial.IService.IEstudianteService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/usuario")
public class EstudianteController extends ABaseController<Estudiante, IEstudianteService> {
    public EstudianteController(IEstudianteService service) {
        super(service, "usuario");
    }
}
