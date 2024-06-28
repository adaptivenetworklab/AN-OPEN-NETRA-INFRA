pipelineJob('orca/frontend/production') {
    definition {
        cps {
            script(readFileFromWorkspace('pipeline/frontend/production/Jenkinsfile'))
            sandbox()
        }
    }
}
pipelineJob('orca/frontend/staging') {
    definition {
        cps {
            script(readFileFromWorkspace('pipeline/frontend/staging/Jenkinsfile'))
            sandbox()
        }
    }
}
