folder('infra') {
    description('this folder contains all infrastructure related jobs')
}

folder('infra/argocd') {
    description('this folder contains all nginx related jobs')
}

folder('infra/jenkins') {
    description('this folder contains all prometheus related jobs')
}

folder('infra/nginx') {
    description('this folder contains all DNS adaptivenetlab.site related jobs')
}

folder('infra/longhorn') {
    description('this folder contains all DNS adaptivenetworklab.org related jobs')
}

folder('orca') {
    description('this folder contains all website related jobs')
}

folder('orca/production') {
    description('website production jobs')
}

folder('orca/staging') {
    description('website staging jobs')
}

folder('5gcore') {
    description('this folder contains all gaboot related jobs')
}