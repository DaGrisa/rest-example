package at.grisa.example.rest_example;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {
	List<Employee> findByLastNameIgnoreCase(@Param("lastName") String lastName);
}
