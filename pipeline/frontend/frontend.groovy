pipelineJob('orca/production/frontend') {
    definition {
        cps {
            script(readFileFromWorkspace('pipeline/frontend/production/Jenkinsfile'))
            sandbox()
        }
    }
}
pipelineJob('orca/staging/frontend') {
    definition {
        cps {
            script(readFileFromWorkspace('pipeline/frontend/staging/Jenkinsfile'))
            sandbox()
        }
    }
}
