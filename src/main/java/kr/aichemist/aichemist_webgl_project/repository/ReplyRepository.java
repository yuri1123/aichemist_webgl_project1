package kr.aichemist.aichemist_webgl_project.repository;

import kr.aichemist.aichemist_webgl_project.domain.Reply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReplyRepository extends JpaRepository<Reply, Long> {

    @Query("select r from Reply r order by r.regTime desc")
    List<Reply> selectAll();


}
