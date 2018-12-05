package uk.ac.belfastmet.dwarfs.repository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.dwarfs.domain.Dwarf;

public interface DwarfRepository extends CrudRepository<Dwarf, Integer> {
    Iterable<Dwarf> findByAuthor(String author);
    Object findByDwarfId(Integer dwarfId);
    Iterable<Dwarf> findByName(String name);
	Object findByNameAndAuthor(String name, String author);
	Object findByAuthorAndDwarfId(Integer dwarfId, String author);
	

}
