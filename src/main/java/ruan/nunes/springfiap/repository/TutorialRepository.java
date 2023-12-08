package ruan.nunes.springfiap.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import ruan.nunes.springfiap.model.Tutorial;


public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
  List<Tutorial> findByPublished(boolean published);

  List<Tutorial> findByTitleContainingIgnoreCase(String title);
}
