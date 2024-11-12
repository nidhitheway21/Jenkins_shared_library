def call(String dockerHubUsername, String imageName) {
    sh "sudo docker build --build-arg REACT_APP_RAPID_API_KEY=3a8bcc0c2amsh4bbce8fcefb6557p14adcfjsn708f4a8909f -t ${imageName} ."
    
    sh "docker tag ${imageName} ${dockerHubUsername}/${imageName}:latest"
    
    withDockerRegistry([url: 'https://index.docker.io/v1/', credentialsId: 'docker']) {
        sh "docker push ${dockerHubUsername}/${imageName}:latest"
    }
}