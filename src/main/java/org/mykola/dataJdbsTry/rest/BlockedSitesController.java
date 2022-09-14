package org.mykola.dataJdbsTry.rest;

import org.mykola.dataJdbsTry.domain.BlockedSite;
import org.mykola.dataJdbsTry.repository.BlockedSitesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BlockedSitesController {
    private final Logger logger = LoggerFactory.getLogger(BlockedSitesController.class);

    private final BlockedSitesRepository repository;

    public BlockedSitesController(BlockedSitesRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/blocked-sites")
    public List<BlockedSite> blockedSites() {
        logger.info("Root Request has been performed");
        return repository.findAll();
    }

}
