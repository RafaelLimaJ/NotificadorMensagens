import com.sistemanotificaçao.entitys.EmailNotificador;
import com.sistemanotificaçao.entitys.UsuarioService;
import com.sistemanotificaçao.entitys.WhatsappNotificador;

public class SistemaNotificacoes {
        public static void main(String[] args) {

            // Testando com E-mail
            UsuarioService servicoEmail = new UsuarioService(new EmailNotificador());
            servicoEmail.registrar("João");

            System.out.println("-------------------------");

            // Testando com WhatsApp
            UsuarioService servicoWhats = new UsuarioService(new WhatsappNotificador());
            servicoWhats.registrar("Maria");
        }
}
