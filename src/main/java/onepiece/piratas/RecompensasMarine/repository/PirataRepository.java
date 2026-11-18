package onepiece.piratas.RecompensasMarine.repository;
import org.springframework.data.jpa.repository.JpaRepository;

/*
Interface responsavel por se comunicar com o banco de dados.
Foi necessario mudar de class para interface
Foi necessario extender "JpaRepository" do Springboot
*/
public interface PirataRepository extends JpaRepository {
}
