package com.typhoone.rrts.repository.actionsRepository;

import com.typhoone.rrts.entity.actions.Complain;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ComplainRepository extends JpaRepository<Complain, Long> {
}
