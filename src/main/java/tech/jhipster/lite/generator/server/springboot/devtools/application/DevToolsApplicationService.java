package tech.jhipster.lite.generator.server.springboot.devtools.application;

import org.springframework.stereotype.Service;
import tech.jhipster.lite.generator.project.domain.Project;
import tech.jhipster.lite.generator.server.springboot.devtools.domain.DevToolsService;

@Service
public class DevToolsApplicationService {

  private final DevToolsService devToolsService;

  public DevToolsApplicationService(DevToolsService devToolsService) {
    this.devToolsService = devToolsService;
  }

  public void init(Project project) {
    devToolsService.init(project);
  }

  public void addSpringBootDevTools(Project project) {
    devToolsService.addSpringBootDevTools(project);
  }

  public void addProperties(Project project) {
    devToolsService.addProperties(project);
  }
}
