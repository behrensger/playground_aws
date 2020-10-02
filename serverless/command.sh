#!/bin/sh

# create bucket if not exists
aws s3 mb s3://abehrens-sam-deployment-bucket

# package cloudformation
aws cloudformation package --s3-bucket abehrens-sam-deployment-bucket  --template-file template.yaml --output-template-file gen/template-generated.yaml

# deploy
aws cloudformation deploy --template-file gen/template-generated.yaml --stack-name serverless-lambda --capabilities CAPABILITY_IAM