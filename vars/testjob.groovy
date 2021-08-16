def call(String name = 'user') {
  pipeline {
    agent any
    stages {
      stage("test-shared-libraries") {
        steps {
             echo "Welcome, ${name}."
        }
      }
    }
  }
}
