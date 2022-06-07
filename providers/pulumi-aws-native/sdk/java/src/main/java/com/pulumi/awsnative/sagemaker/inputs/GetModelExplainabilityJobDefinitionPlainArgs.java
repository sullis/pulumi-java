// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetModelExplainabilityJobDefinitionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetModelExplainabilityJobDefinitionPlainArgs Empty = new GetModelExplainabilityJobDefinitionPlainArgs();

    /**
     * The Amazon Resource Name (ARN) of job definition.
     * 
     */
    @Import(name="jobDefinitionArn", required=true)
    private String jobDefinitionArn;

    /**
     * @return The Amazon Resource Name (ARN) of job definition.
     * 
     */
    public String jobDefinitionArn() {
        return this.jobDefinitionArn;
    }

    private GetModelExplainabilityJobDefinitionPlainArgs() {}

    private GetModelExplainabilityJobDefinitionPlainArgs(GetModelExplainabilityJobDefinitionPlainArgs $) {
        this.jobDefinitionArn = $.jobDefinitionArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetModelExplainabilityJobDefinitionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetModelExplainabilityJobDefinitionPlainArgs $;

        public Builder() {
            $ = new GetModelExplainabilityJobDefinitionPlainArgs();
        }

        public Builder(GetModelExplainabilityJobDefinitionPlainArgs defaults) {
            $ = new GetModelExplainabilityJobDefinitionPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param jobDefinitionArn The Amazon Resource Name (ARN) of job definition.
         * 
         * @return builder
         * 
         */
        public Builder jobDefinitionArn(String jobDefinitionArn) {
            $.jobDefinitionArn = jobDefinitionArn;
            return this;
        }

        public GetModelExplainabilityJobDefinitionPlainArgs build() {
            $.jobDefinitionArn = Objects.requireNonNull($.jobDefinitionArn, "expected parameter 'jobDefinitionArn' to be non-null");
            return $;
        }
    }

}
