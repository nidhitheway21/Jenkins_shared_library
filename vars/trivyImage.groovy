def call() {
    sh 'trivy image panda21298/youtube:latest > trivyimage.txt'
}