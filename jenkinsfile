node{
    def props = readProperties  file:'/var/lib/jenkins/jobs/test.properties'
    stage('Checkout')
    {
      checkout([$class: 'SubversionSCM', additionalCredentials: [], excludedCommitMessages: '', excludedRegions: '', excludedRevprop: '', excludedUsers: '', filterChangelog: false, ignoreDirPropChanges: false, includedRegions: '', locations: [[cancelProcessOnExternalsFail: true, credentialsId: 'c8493e6d-27a9-488a-afe2-cb7ec1f22e07', depthOption: 'infinity', ignoreExternalsOption: true, local: '.', remote: props['URL']]], quietOperation: true, workspaceUpdater: [$class: 'UpdateUpdater']])
      
    } 
    
    stage('Build')
    {
        sh'''
	echo 'Build Completed'
    '''    
    }
	stage ('Archive')
	{
		echo 'Now Archiving..'
		archiveArtifacts artifacts: 'TruOps/target/TruOps.war'
		
}
	
	
}

node('WS45')
{
    stage('Deployment'){
        copyArtifacts fingerprintArtifacts: true, projectName: 'pipeline', selector: lastSuccessful(), target: 'D:/test/test1'
        bat 'D:\\test\\deploy.bat'

    }
}
