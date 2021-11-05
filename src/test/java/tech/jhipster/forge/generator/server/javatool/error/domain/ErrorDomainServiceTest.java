package tech.jhipster.forge.generator.server.javatool.error.domain;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static tech.jhipster.forge.TestUtils.tmpProject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import tech.jhipster.forge.UnitTest;
import tech.jhipster.forge.generator.project.domain.Project;
import tech.jhipster.forge.generator.project.domain.ProjectRepository;
import tech.jhipster.forge.generator.server.javatool.error.domain.ErrorDomainService;

@UnitTest
@ExtendWith(MockitoExtension.class)
class ErrorDomainServiceTest {

  @Mock
  ProjectRepository projectRepository;

  ErrorDomainService errorDomainService;

  @BeforeEach
  void setUp() {
    errorDomainService = new ErrorDomainService(projectRepository);
  }

  @Test
  void shouldInit() {
    Project project = tmpProject();

    errorDomainService.init(project);

    verify(projectRepository, times(6)).template(any(Project.class), anyString(), anyString(), anyString());
  }
}