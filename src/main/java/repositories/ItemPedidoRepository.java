package repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.entities.pedido.ItemPedido;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, UUID>{

}
