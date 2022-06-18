package com.ventas.bill.service.Impl;

import com.ventas.bill.domain.Edible;
import com.ventas.bill.dto.request.EdibleRequest;
import com.ventas.bill.dto.request.update.EdibleUpdateRequest;
import com.ventas.bill.repository.EdibleRepository;
import com.ventas.bill.service.EdibleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;


@AllArgsConstructor
@Service
@CrossOrigin
public class EdibleServiceImpl implements EdibleService {

    public final EdibleRepository edibleRepository;

    @Override
    public List<Edible> findAll() throws Exception {
        return edibleRepository.findAllEdible();
    }

    @Override
    public Edible save(EdibleRequest edibleRequest) throws Exception {
        return edibleRepository.save(Edible
                .builder()
                .name(edibleRequest.getName())
                .category(edibleRequest.getCategory())
                .unitPrice(edibleRequest.getUnitPrice())
                .state(true)
                .build());
    }

    @Override
    public Edible update(EdibleUpdateRequest edibleUpdateRequest) throws Exception {
        Optional<Edible> edible = edibleRepository.findById(edibleUpdateRequest.getId());

        if (edible.isPresent())
            return edibleRepository.save(Edible
                .builder()
                .id(edibleUpdateRequest.getId())
                .name(edibleUpdateRequest.getName())
                .category(edibleUpdateRequest.getCategory())
                .unitPrice(edibleUpdateRequest.getUnitPrice())
                .state(edibleUpdateRequest.getState())
                .build());

        return null;
    }

    @Override
    public Edible findById(Long id) throws Exception {
        Optional<Edible> edible = edibleRepository.findById(id);
        if (edible.isPresent())
            return edible.get();
        return null;
    }

    @Override
    public Edible delete(Long id) throws Exception {
        Optional<Edible> edible = edibleRepository.findById(id);
        if (edible.isPresent()) {
            edible.get().setState(false);
            return edibleRepository.save(edible.get());
        }
        return null;
    }
}
