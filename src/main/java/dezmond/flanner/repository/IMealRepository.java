package dezmond.flanner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import dezmond.flanner.model.Meal;

@RepositoryRestResource()
public interface IMealRepository extends JpaRepository<Meal, Integer>, JpaSpecificationExecutor<Meal>, QuerydslPredicateExecutor<Meal> {}
