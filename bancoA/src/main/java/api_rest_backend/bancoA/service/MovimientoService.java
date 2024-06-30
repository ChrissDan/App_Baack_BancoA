package api_rest_backend.bancoA.service;

import api_rest_backend.bancoA.model.Cliente;
import api_rest_backend.bancoA.model.Movimiento;
import api_rest_backend.bancoA.repository.MovimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovimientoService {

    @Autowired
    private MovimientoRepository movimientoRepository;

    public List<Movimiento> getMovimientosByCliente(Cliente cliente) {
        return movimientoRepository.findByCliente(cliente);
    }
}
