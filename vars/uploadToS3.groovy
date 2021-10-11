def upload(Map stageParams = [awsRegion: "us-east-1", s3Bucket: "mybucketname123321123"]) {
    withAWS(region: stageParams.awsRegion, credentials:"${AWS_CRED}") {
        awsIdentity()
        s3Upload( 
            includePathPattern: "*.yaml",
            bucket: stageParams.s3Bucket
        )
    }
}