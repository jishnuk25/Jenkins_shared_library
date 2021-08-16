def call(String name = 'user') {
  pipeline {
    
    stages {
      stage('test-shared-libraries') {
        steps {
             echo "Welcome, ${name}."
        }
      }
    }
  }
}
