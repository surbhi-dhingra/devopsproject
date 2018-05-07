package com.sdg;
	
def notifyStarted() {
emailext (
      subject: "STARTED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
      body: """<p>STARTED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]':</p>
      <p>Check console output at &QUOT;<a href='${env.BUILD_URL}'>${env.JOB_NAME} [${env.BUILD_NUMBER}]</a>&QUOT;</p>""",
      to: 'surbhi.dhingra@sdgc.com manoj.singh@sdgc.com anuj.gupta@sdgc.com'
    )
}
def notifySuccessful() {
emailext (
      subject: "SUCCESSFUL: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
      body: """<p>SUCCESSFUL: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]':</p>
      <p>Check console output at &QUOT;<a href='${env.BUILD_URL}'>${env.JOB_NAME} [${env.BUILD_NUMBER}]</a>&QUOT;</p>""",
	  to: 'surbhi.dhingra@sdgc.com manoj.singh@sdgc.com anuj.gupta@sdgc.com'
      
    )
}
def notifyFailed() {
emailext (
      subject: "FAILED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
      body: """<p>FAILED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]':</p>
      <p>Check console output at &QUOT;<a href='${env.BUILD_URL}'>${env.JOB_NAME} [${env.BUILD_NUMBER}]</a>&QUOT;</p>""",
      recipientProviders: [[$class: 'DevelopersRecipientProvider'],[$class: 'CulpritsRecipientProvider']]
    )
}
def notifydowntime() {
emailext (
      subject: "TruOps on 10.26.0.45 is going down: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
      body: """<p>Check the job running here: '${env.JOB_NAME} [${env.BUILD_NUMBER}]':</p>
      <p>Check console output at &QUOT;<a href='${env.BUILD_URL}'>${env.JOB_NAME} [${env.BUILD_NUMBER}]</a>&QUOT;</p>""",
      to: 'surbhi.dhingra@sdgc.com manoj.singh@sdgc.com anuj.gupta@sdgc.com'
    )
}
