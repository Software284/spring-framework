package com.lamichhane.course.apis.autherws.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends CrudRepository<UserRoleEntity, Integer> {

    UserEntity findByUserEntity(UserEntity userEntity);
}
