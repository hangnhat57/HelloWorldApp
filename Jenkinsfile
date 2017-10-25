pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        build(propagate: true, job: 'build')
      }
    }
    stage('test') {
      steps {
        build(job: 'test', propagate: true)
      }
    }
  }
}