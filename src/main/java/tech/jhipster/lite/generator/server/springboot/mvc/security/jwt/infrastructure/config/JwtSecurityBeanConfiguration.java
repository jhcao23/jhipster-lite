package tech.jhipster.lite.generator.server.springboot.mvc.security.jwt.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.jhipster.lite.generator.buildtool.generic.domain.BuildToolService;
import tech.jhipster.lite.generator.project.domain.ProjectRepository;
import tech.jhipster.lite.generator.server.springboot.common.domain.SpringBootCommonService;
import tech.jhipster.lite.generator.server.springboot.mvc.security.jwt.domain.JwtSecurityDomainService;
import tech.jhipster.lite.generator.server.springboot.mvc.security.jwt.domain.JwtSecurityService;

@Configuration
public class JwtSecurityBeanConfiguration {

  private final ProjectRepository projectRepository;
  private final BuildToolService buildToolService;
  private final SpringBootCommonService springBootCommonService;

  public JwtSecurityBeanConfiguration(
    ProjectRepository projectRepository,
    BuildToolService buildToolService,
    SpringBootCommonService springBootCommonService
  ) {
    this.projectRepository = projectRepository;
    this.buildToolService = buildToolService;
    this.springBootCommonService = springBootCommonService;
  }

  @Bean
  public JwtSecurityService jwtSecurityService() {
    return new JwtSecurityDomainService(projectRepository, buildToolService, springBootCommonService);
  }
}
