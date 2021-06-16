def call() {
 checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/DevOpsSolutionss/bookstore.git']]])
 }
