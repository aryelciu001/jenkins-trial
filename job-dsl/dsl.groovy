job('NodeJS example') {
    // software configuration management
    scm {
        git('https://github.com/aryelciu001/jenkins-trial.git') 
        {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('aryelciu001')
            node / gitConfigEmail('aryelciu001@gmail.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("npm install")
    }
}