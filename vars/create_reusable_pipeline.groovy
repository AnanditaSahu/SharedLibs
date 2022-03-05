/**
 * Defines a pipeline template (as a sample with one job parameter 
 * that should be common for all pipelines)
 */
def call(Map templateParams) {   

    pipeline {
        agent any
        parameters {
            string(name: 'inputParam', description: 'Some pipeline parameters')
        }
        stages {
            stage('Stage one') {
                steps {
                    script {
                        echo "Parameter passed to pipeline: " + templateParams.someParam
                    }
                }
            }
            stage('Stage two') {
                steps {
                    script {
                        echo "Parameter defined in pipeline: " + params.inputParam
                    }
                }
            }
        }
    }
}
