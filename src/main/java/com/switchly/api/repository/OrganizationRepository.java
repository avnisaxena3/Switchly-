package com.switchly.api.repository;

import com.switchly.api.model.Organization;
import java.util.UUID;
import java.util.List;

import java.util.Optional;

public interface OrganizationRepository {
    Organization save(Organization organization);

    Optional<Organization> findById(UUID id);

    List<Organization> findAll();

}
