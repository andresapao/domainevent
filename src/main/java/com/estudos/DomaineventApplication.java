package com.estudos;

import com.estudos.entities.pedido.ItemPedido;
import com.estudos.entities.pedido.Pedido;
import com.estudos.services.ItemPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.estudos.repositories.PedidoRepository;

import javax.annotation.PostConstruct;
import java.util.Date;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
public class DomaineventApplication {
	@Autowired
	private PedidoRepository pedidoRepo;
	@Autowired
	private ItemPedidoService itemPedidoService;

	public static void main(String[] args) {

		SpringApplication.run(DomaineventApplication.class, args);

	}
	@PostConstruct
	void iniciar()
	{
		Pedido pedido = Pedido.builder()
				.nomeDestinario("Dest1")
				.build();
		Pedido pedidoSalvo = pedidoRepo.save(pedido);
		ItemPedido item = ItemPedido.builder().pedidoId(pedidoSalvo.getPedidoId()).nomeProduto("Controle remoto").quantidade(2).build();
		itemPedidoService.cadastrar(item);
	}
}
