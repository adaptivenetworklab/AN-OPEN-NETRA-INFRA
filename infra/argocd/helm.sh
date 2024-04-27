git clone https://github.com/argoproj/argo-helm.git

cd argo-helm/charts/argo-cd/
# change server.insecure = true in values.yaml
helm dependency up

helm install argocd . -f values.yaml -n argocd