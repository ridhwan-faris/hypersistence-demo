package com.ridhwan.hypersistencedemo.dao.repository;

import com.ridhwan.hypersistencedemo.dao.entity.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchantRepository extends JpaRepository<Merchant, Long> {
}
