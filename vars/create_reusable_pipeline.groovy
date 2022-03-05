/**
 * Defines a pipeline template (as a sample with one job parameter 
 * that should be common for all pipelines)
 */
def call(Map templateParams) {   

    pipeline {
        agent any
        parameters {
            string(name: 'input2', type: integer, defaultValue: 10)
        }
        stages {
            stage('Demo'){
                steps{
                    trial(templateParams.name)
                    script{
                        calculator.add(templateParams.input1, params.input2)
                        calculator.sub(templateParams.input1, params.input2)
                        calculator.mul(templateParams.input1, params.input2)
                        calculator.div(templateParams.input1, params.input2)
                    }
                }
            }
        }
    }
}
