// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDataQualityJobDefinitionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDataQualityJobDefinitionArgs Empty = new GetDataQualityJobDefinitionArgs();

    /**
     * The Amazon Resource Name (ARN) of job definition.
     * 
     */
    @Import(name="jobDefinitionArn", required=true)
      private final String jobDefinitionArn;

    public String jobDefinitionArn() {
        return this.jobDefinitionArn;
    }

    public GetDataQualityJobDefinitionArgs(String jobDefinitionArn) {
        this.jobDefinitionArn = Objects.requireNonNull(jobDefinitionArn, "expected parameter 'jobDefinitionArn' to be non-null");
    }

    private GetDataQualityJobDefinitionArgs() {
        this.jobDefinitionArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataQualityJobDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String jobDefinitionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataQualityJobDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobDefinitionArn = defaults.jobDefinitionArn;
        }

        public Builder jobDefinitionArn(String jobDefinitionArn) {
            this.jobDefinitionArn = Objects.requireNonNull(jobDefinitionArn);
            return this;
        }        public GetDataQualityJobDefinitionArgs build() {
            return new GetDataQualityJobDefinitionArgs(jobDefinitionArn);
        }
    }
}
