def call() {
    sh 'trivy image Panda21298/youtube:latest > trivyimage.txt'
}