package com.ngantcb.jmixpm.screen.project;

import io.jmix.ui.screen.*;
import com.ngantcb.jmixpm.entity.Project;

@UiController("Project.edit")
@UiDescriptor("project-edit.xml")
@EditedEntityContainer("projectDc")
public class ProjectEdit extends StandardEditor<Project> {
}