package com.github.iliaisakhin.intellijikotlinplugin.services

import com.intellij.openapi.project.Project
import com.github.iliaisakhin.intellijikotlinplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
