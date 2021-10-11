def call(Map stageParams) {
    withAWS(region: stageParams.awsRegion, credentials:'AWS_Lambda') {
        awsIdentity()
        s3Upload( 
            workingDir: "build",
            includePathPattern: "**/*",
            bucket: stageParams.s3Bucket,
            path: stageParams.s3Path
        )
    }
}

def call(Map stageParams = [Region: "us-east-1",  s3Bucket: "test-bucket-2221", s3Path: "/"]) {

    withAWS(region: stageParams.Region, credentials:'awscredentials') {
        awsIdentity()
        s3Upload( 
            workingDir: workingDir,
            includePathPattern: path,
            bucket: s3Bucket,
            path: s3Path
        )
    }
}