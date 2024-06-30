package api_rest_backend.bancoA.repository;

import api_rest_backend.bancoA.model.Cliente;
import api_rest_backend.bancoA.model.Movimiento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovimientoRepository extends JpaRepository<Movimiento, Long> {
    List<Movimiento> findByCliente(Cliente cliente);
}
