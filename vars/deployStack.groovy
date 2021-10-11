def call(Map stageParams = [awsRegion: "us-east-1"]){
  withAWS(region: stageParams.awsRegion, credentials:"${AWS_CRED}") {
        awsIdentity()
        cfnCreateChangeSet(
          stack:'Stack', 
          changeSet:'my-change-set', 
          url:'https://mybucketname123321123.s3.amazonaws.com/ec2.yaml'
        )
        cfnExecuteChangeSet(
          stack:'Stack', 
          changeSet:'my-change-set'
        )
  }
}