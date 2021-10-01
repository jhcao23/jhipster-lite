package tech.jhipster.forge.generator.springboot.application;

import org.springframework.stereotype.Component;
import tech.jhipster.forge.common.domain.Project;
import tech.jhipster.forge.generator.springboot.domain.SpringBootService;

@Component
public class SpringBootApplicationService {

  private final SpringBootService springBootService;

  public SpringBootApplicationService(SpringBootService springBootService) {
    this.springBootService = springBootService;
  }

  public void addSpringBoot(Project project) {
    springBootService.addSpringBoot(project);
  }

  public void addSpringBootParent(Project project) {
    springBootService.addSpringBootParent(project);
  }

  public void addSpringBootDependencies(Project project) {
    springBootService.addSpringBootDependencies(project);
  }

  public void addSpringBootMavenPlugin(Project project) {
    springBootService.addSpringBootMavenPlugin(project);
  }

  public void addMainApp(Project project) {
    springBootService.addMainApp(project);
  }

  public void addApplicationProperties(Project project) {
    springBootService.addApplicationProperties(project);
  }

  public void addProperties(Project project, String key, Object value) {
    springBootService.addProperties(project, key, value);
  }

  public void addProperties(Project project, String key, boolean value) {
    springBootService.addProperties(project, key, value);
  }
}
