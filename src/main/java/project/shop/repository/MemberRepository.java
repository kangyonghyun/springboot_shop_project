package project.shop.repository;

import project.shop.domain.member.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {

   Long save(Member member);

    Optional<Member> findById(Long id);

    List<Member> findByName(String name);

    Optional<Member> finByLoginId(String loginId);

    List<Member> findAll();
}
