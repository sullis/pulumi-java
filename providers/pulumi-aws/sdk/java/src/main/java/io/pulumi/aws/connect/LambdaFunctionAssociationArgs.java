// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class LambdaFunctionAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final LambdaFunctionAssociationArgs Empty = new LambdaFunctionAssociationArgs();

    /**
     * Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.
     * 
     */
    @Import(name="functionArn", required=true)
      private final Output<String> functionArn;

    public Output<String> getFunctionArn() {
        return this.functionArn;
    }

    /**
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * 
     */
    @Import(name="instanceId", required=true)
      private final Output<String> instanceId;

    public Output<String> getInstanceId() {
        return this.instanceId;
    }

    public LambdaFunctionAssociationArgs(
        Output<String> functionArn,
        Output<String> instanceId) {
        this.functionArn = Objects.requireNonNull(functionArn, "expected parameter 'functionArn' to be non-null");
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
    }

    private LambdaFunctionAssociationArgs() {
        this.functionArn = Output.empty();
        this.instanceId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LambdaFunctionAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> functionArn;
        private Output<String> instanceId;

        public Builder() {
    	      // Empty
        }

        public Builder(LambdaFunctionAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionArn = defaults.functionArn;
    	      this.instanceId = defaults.instanceId;
        }

        public Builder functionArn(Output<String> functionArn) {
            this.functionArn = Objects.requireNonNull(functionArn);
            return this;
        }
        public Builder functionArn(String functionArn) {
            this.functionArn = Output.of(Objects.requireNonNull(functionArn));
            return this;
        }
        public Builder instanceId(Output<String> instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Output.of(Objects.requireNonNull(instanceId));
            return this;
        }        public LambdaFunctionAssociationArgs build() {
            return new LambdaFunctionAssociationArgs(functionArn, instanceId);
        }
    }
}
