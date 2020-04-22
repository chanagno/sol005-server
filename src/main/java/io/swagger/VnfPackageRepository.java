package io.swagger;

import io.swagger.model.VnfPackagesVnfPkgInfo;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface VnfPackageRepository extends JpaRepository<VnfPackagesVnfPkgInfo,String>  {
	
	Optional<VnfPackagesVnfPkgInfo> findById(String id);
	
	List<VnfPackagesVnfPkgInfo> findAll();

	void delete(VnfPackagesVnfPkgInfo vnf);

	

	


}
