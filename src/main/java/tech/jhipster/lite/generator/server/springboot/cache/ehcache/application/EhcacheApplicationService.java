package tech.jhipster.lite.generator.server.springboot.cache.ehcache.application;

import org.springframework.stereotype.Service;
import tech.jhipster.lite.generator.project.domain.Project;
import tech.jhipster.lite.generator.server.springboot.cache.ehcache.domain.EhcacheService;

@Service
public class EhcacheApplicationService {

  private final EhcacheService ehcacheService;

  public EhcacheApplicationService(EhcacheService ehcacheService) {
    this.ehcacheService = ehcacheService;
  }

  public void initXmlConfiguration(Project project) {
    ehcacheService.initXmlConfiguration(project);
  }

  public void initJavaConfiguration(Project project) {
    ehcacheService.initJavaConfiguration(project);
  }

  public void addDependencies(Project project) {
    ehcacheService.addDependencies(project);
  }

  public void addXmlDependencies(Project project) {
    ehcacheService.addXmlDependencies(project);
  }

  public void addEnableCaching(Project project) {
    ehcacheService.addEnableCaching(project);
  }

  public void addJavaConfig(Project project) {
    ehcacheService.addJavaConfig(project);
  }

  public void addJavaProperties(Project project) {
    ehcacheService.addJavaProperties(project);
  }

  public void addEhcacheXml(Project project) {
    ehcacheService.addEhcacheXml(project);
  }

  public void addXmlProperty(Project project) {
    ehcacheService.addXmlProperty(project);
  }
}
