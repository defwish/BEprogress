//package com.employee.repository;
//
//import com.employee.model.Employee;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface EmployeeRepository<T, ID> extends JpaRepository<T, ID> {
//    Page<T> findAll(Pageable pageable);
//}

package com.employee.repository;

import com.employee.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
   // Page<Employee> findAll(Pageable pageable);
}
