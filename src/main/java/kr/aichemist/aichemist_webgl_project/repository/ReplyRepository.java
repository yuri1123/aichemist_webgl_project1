package kr.aichemist.aichemist_webgl_project.repository;

import kr.aichemist.aichemist_webgl_project.Domain.Reply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ReplyRepository extends JpaRepository<Reply, Long> {



}