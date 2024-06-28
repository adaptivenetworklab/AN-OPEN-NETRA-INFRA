folder('infra') {
    description('this folder contains all infrastructure related jobs')
}

folder('infra/argocd') {
    description('this folder contains all argocd related jobs')
}

folder('infra/jenkins') {
    description('this folder contains all jenkins related jobs')
}

folder('infra/nginx') {
    description('this folder contains all nginx ingress related jobs')
}

folder('infra/longhorn') {
    description('this folder contains all longhorn related jobs')
}

folder('orca') {
    description('this folder contains all website related jobs')
}

folder('orca/backend') {
    description('website backend jobs')
}

folder('orca/frontend') {
    description('website frontend jobs')
}

folder('5gcore') {
    description('this folder contains all 5gcore related jobs')
}