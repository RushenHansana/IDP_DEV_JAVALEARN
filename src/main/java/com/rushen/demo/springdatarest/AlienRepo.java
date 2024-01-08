package com.rushen.demo.springdatarest;

import com.rushen.demo.springdatarest.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel ="aliens",path="aliens")
public interface AlienRepo extends JpaRepository<Alien, Integer>
{
}
