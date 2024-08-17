build image:
docker build -t auth-service:latest .
docker tag auth-service:latest ghcr.io/raviverma2695/auth-service:latest


export CR_PAT=github personal access token
echo $CR_PAT | docker login ghcr.io -u raviverma2695 --password-stdin


docker push ghcr.io/raviverma2695/auth-service:latest


docker pull ghcr.io/raviverma2695/auth-service:latest