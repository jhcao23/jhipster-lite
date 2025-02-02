package tech.jhipster.lite.generator.server.springboot.common.application;

import org.springframework.stereotype.Service;
import tech.jhipster.lite.generator.project.domain.Project;
import tech.jhipster.lite.generator.server.springboot.common.domain.Level;
import tech.jhipster.lite.generator.server.springboot.common.domain.SpringBootCommonService;

@Service
public class SpringBootCommonApplicationService {

  private final SpringBootCommonService springBootCommonService;

  public SpringBootCommonApplicationService(SpringBootCommonService springBootCommonService) {
    this.springBootCommonService = springBootCommonService;
  }

  public void addTestLogbackRecorder(Project project) {
    springBootCommonService.addTestLogbackRecorder(project);
  }

  public void addProperties(Project project, String key, Object value) {
    springBootCommonService.addProperties(project, key, value);
  }

  public void addPropertiesLocal(Project project, String key, Object value) {
    springBootCommonService.addPropertiesLocal(project, key, value);
  }

  public void addPropertiesTest(Project project, String key, Object value) {
    springBootCommonService.addPropertiesTest(project, key, value);
  }

  public void addPropertiesNewLine(Project project) {
    springBootCommonService.addPropertiesNewLine(project);
  }

  public void addPropertiesLocalNewLine(Project project) {
    springBootCommonService.addPropertiesLocalNewLine(project);
  }

  public void addPropertiesTestNewLine(Project project) {
    springBootCommonService.addPropertiesTestNewLine(project);
  }

  public void addPropertiesComment(Project project, String text) {
    springBootCommonService.addPropertiesComment(project, text);
  }

  public void addPropertiesLocalComment(Project project, String text) {
    springBootCommonService.addPropertiesLocalComment(project, text);
  }

  public void addPropertiesTestComment(Project project, String text) {
    springBootCommonService.addPropertiesTestComment(project, text);
  }

  public void addLogger(Project project, String packageName, Level level) {
    springBootCommonService.addLogger(project, packageName, level);
  }

  public void addLoggerTest(Project project, String packageName, Level level) {
    springBootCommonService.addLoggerTest(project, packageName, level);
  }
}
