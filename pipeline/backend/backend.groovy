pipelineJob('orca/backend/production') {
    definition {
        cps {
            script(readFileFromWorkspace('pipeline/backend/production/Jenkinsfile'))
            sandbox()
        }
    }
}
pipelineJob('orca/backend/staging') {
    definition {
        cps {
            script(readFileFromWorkspace('pipeline/backend/staging/Jenkinsfile'))
            sandbox()
        }
    }
}
