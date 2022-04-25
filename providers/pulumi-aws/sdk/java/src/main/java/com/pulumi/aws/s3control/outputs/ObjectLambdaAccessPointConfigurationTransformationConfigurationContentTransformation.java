// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3control.outputs;

import com.pulumi.aws.s3control.outputs.ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation {
    /**
     * @return Configuration for an AWS Lambda function. See AWS Lambda below for more details.
     * 
     */
    private final ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda awsLambda;

    @CustomType.Constructor
    private ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation(@CustomType.Parameter("awsLambda") ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda awsLambda) {
        this.awsLambda = awsLambda;
    }

    /**
     * @return Configuration for an AWS Lambda function. See AWS Lambda below for more details.
     * 
     */
    public ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda awsLambda() {
        return this.awsLambda;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda awsLambda;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsLambda = defaults.awsLambda;
        }

        public Builder awsLambda(ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda awsLambda) {
            this.awsLambda = Objects.requireNonNull(awsLambda);
            return this;
        }        public ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation build() {
            return new ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation(awsLambda);
        }
    }
}
