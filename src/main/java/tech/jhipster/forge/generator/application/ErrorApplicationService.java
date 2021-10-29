package tech.jhipster.forge.generator.application;

import org.springframework.stereotype.Service;
import tech.jhipster.forge.generator.domain.core.Project;
import tech.jhipster.forge.generator.domain.server.tool.error.ErrorService;

@Service
public class ErrorApplicationService {

  private final ErrorService errorService;

  public ErrorApplicationService(ErrorService errorService) {
    this.errorService = errorService;
  }

  public void init(Project project) {
    errorService.init(project);
  }
}