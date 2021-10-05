def build(){
  mvn package
}

// def buildImage(){
//   echo "Build image with tag: ${env.BUILD_ID}"
//   myapp = docker.build("alingavrila/ledger-service:${env.BUILD_ID}", "--build-arg VERSION='${env.BUILD_ID}' .")
// }

// def pushImage(){
//   script {
//     docker.withRegistry('https://registry.hub.docker.com', 'dockerhub') {
//       myapp.push("latest")
//       myapp.push("${env.BUILD_ID}")
//     }
//   }
// }

