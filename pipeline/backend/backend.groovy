pipelineJob('orca/production/backend') {
    definition {
        cps {
            script(readFileFromWorkspace('pipeline/backend/production/Jenkinsfile'))
            sandbox()
        }
    }
}
pipelineJob('orca/staging/backend') {
    definition {
        cps {
            script(readFileFromWorkspace('pipeline/backend/staging/Jenkinsfile'))
            sandbox()
        }
    }
}
