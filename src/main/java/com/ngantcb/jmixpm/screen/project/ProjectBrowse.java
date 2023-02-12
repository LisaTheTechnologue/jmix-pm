package com.ngantcb.jmixpm.screen.project;

import io.jmix.ui.screen.*;
import com.ngantcb.jmixpm.entity.Project;

@UiController("Project.browse")
@UiDescriptor("project-browse.xml")
@LookupComponent("projectsTable")
public class ProjectBrowse extends StandardLookup<Project> {
}