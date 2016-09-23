node {
  stage 'Checkout'
  git url: 'https://github.com/Lazzaretti/pingwebsitemvn.git'
  def mvnHome = tool 'M3'
  //env.PATH = "${mvnHome}/bin:${env.PATH}"
  //sh 'mvn -B verify'
  stage 'Build & Test'
  bat "${mvnHome}\\bin\\mvn -B verify"//<- Windows
}
