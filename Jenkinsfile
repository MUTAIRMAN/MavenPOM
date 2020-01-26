node {
  stage('SCM Checkout'){
  git 'https://github.com/MUTAIRMAN/MavenPOM'
  }
  stage('Compile-Package'){
  def mvnhome=tool name: 'MAVEN_HOME', type: 'maven'
  sh "${mvnhome}/bin/mvn package"
  }
}
