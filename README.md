# AN-OPEN-NETRA-INFRA

this repo contains infrastructure related using for 5G Telco Cloud project

#### Structure
```
├── README.md
├── infra
│   ├── argocd
│   │   ├── argocd.yaml
│   │   └── helm.sh
│   ├── ingress
│   │   ├── kubeview.yaml
│   │   └── longhorn.yaml
│   └── jenkins
│       ├── deployment.yaml
│       ├── jenkins.yaml
│       └── pvc.yaml
└── jcasc
    ├── backend
    │   ├── production
    │   │   └── Jenkinsfile
    │   └── staging
    │       └── Jenkinsfile
    └── frontend
        ├── production
        │   └── Jenkinsfile
        └── staging
            └── Jenkinsfile
```