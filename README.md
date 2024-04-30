# AN-OPEN-NETRA-INFRA

this repo contains infrastructure related using for 5G Telco Cloud project.

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
The Jenkins Configuration as Code (JCasC) feature defines Jenkins configuration parameters in a human-readable YAML file that can be stored as source code. This essentially captures the configuration parameters and values that are used when configuring Jenkins from the web UI.