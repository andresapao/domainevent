package repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.entities.pedido.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, UUID> {

}
