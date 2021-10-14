def upload(Map stageParams = [awsRegion: "us-east-1"]) {
    withAWS(region: stageParams.awsRegion, credentials:"${AWS_CRED}") {
        awsIdentity()
        s3Upload( 
            includePathPattern: stageParams.stackFileName,
            bucket: stageParams.s3Bucket
        )
    }
}