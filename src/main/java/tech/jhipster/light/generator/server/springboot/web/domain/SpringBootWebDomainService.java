package tech.jhipster.light.generator.server.springboot.web.domain;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tech.jhipster.light.error.domain.UnauthorizedValueException;
import tech.jhipster.light.generator.buildtool.generic.domain.BuildToolService;
import tech.jhipster.light.generator.buildtool.generic.domain.Dependency;
import tech.jhipster.light.generator.project.domain.Project;
import tech.jhipster.light.generator.server.springboot.properties.domain.SpringBootPropertiesService;

public class SpringBootWebDomainService implements SpringBootWebService {

  private final Logger log = LoggerFactory.getLogger(SpringBootWebDomainService.class);

  public final BuildToolService buildToolService;
  public final SpringBootPropertiesService springBootPropertiesService;

  public SpringBootWebDomainService(BuildToolService buildToolService, SpringBootPropertiesService springBootPropertiesService) {
    this.buildToolService = buildToolService;
    this.springBootPropertiesService = springBootPropertiesService;
  }

  @Override
  public void init(Project project) {
    addSpringBootWeb(project);
  }

  @Override
  public void addSpringBootWeb(Project project) {
    Dependency dependency = Dependency.builder().groupId("org.springframework.boot").artifactId("spring-boot-starter-web").build();
    buildToolService.addDependency(project, dependency);
    addServerPort(project);
    addServerPortInTest(project);
  }

  @Override
  public void addSpringBootUndertow(Project project) {
    Dependency dependency = Dependency.builder().groupId("org.springframework.boot").artifactId("spring-boot-starter-web").build();
    Dependency tomcat = Dependency.builder().groupId("org.springframework.boot").artifactId("spring-boot-starter-tomcat").build();
    Dependency undertow = Dependency.builder().groupId("org.springframework.boot").artifactId("spring-boot-starter-undertow").build();

    buildToolService.addDependency(project, dependency, List.of(tomcat));
    buildToolService.addDependency(project, undertow);
    addServerPort(project);
    addServerPortInTest(project);
  }

  private void addServerPort(Project project) {
    springBootPropertiesService.addProperties(project, "server.port", getServerPort(project));
  }

  private void addServerPortInTest(Project project) {
    springBootPropertiesService.addPropertiesTest(project, "server.port", 0);
  }

  private int getServerPort(Project project) {
    int serverPort;
    try {
      serverPort = project.getIntegerConfig("serverPort").orElse(8080);
    } catch (UnauthorizedValueException e) {
      log.warn("The serverPort config is not valid");
      serverPort = 8080;
    }
    return serverPort;
  }
}