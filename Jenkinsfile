node {

   stage('GitHub Checkout'){
    	echo 'Clone repo'
		git 'https://github.com/apesconsole/testbech.git'
   }
   
   stage('Mvn Package'){
	   echo 'Build using maven'
		withMaven(
			maven: 'maven'
		)
	    sh 'mvn clean install'
   }
   
}