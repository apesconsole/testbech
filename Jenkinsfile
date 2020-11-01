node {

   stage('SCM Checkout'){
    echo 'Clone repo'
	git 'https://github.com/apesconsole/testbech.git'
   
   }
   
   stage('Mvn Package'){
	   echo 'Build using maven'
	
	   sh 'mvn package'
   }
   
}