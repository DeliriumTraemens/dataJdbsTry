package org.mykola.dataJdbsTry.repository;

import org.mykola.dataJdbsTry.domain.BlockedSite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockedSitesRepository extends JpaRepository<BlockedSite, Integer> {
}
