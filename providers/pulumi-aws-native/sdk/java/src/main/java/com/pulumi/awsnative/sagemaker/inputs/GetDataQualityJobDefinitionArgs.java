// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDataQualityJobDefinitionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDataQualityJobDefinitionArgs Empty = new GetDataQualityJobDefinitionArgs();

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

    private GetDataQualityJobDefinitionArgs() {}

    private GetDataQualityJobDefinitionArgs(GetDataQualityJobDefinitionArgs $) {
        this.jobDefinitionArn = $.jobDefinitionArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDataQualityJobDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDataQualityJobDefinitionArgs $;

        public Builder() {
            $ = new GetDataQualityJobDefinitionArgs();
        }

        public Builder(GetDataQualityJobDefinitionArgs defaults) {
            $ = new GetDataQualityJobDefinitionArgs(Objects.requireNonNull(defaults));
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

        public GetDataQualityJobDefinitionArgs build() {
            $.jobDefinitionArn = Objects.requireNonNull($.jobDefinitionArn, "expected parameter 'jobDefinitionArn' to be non-null");
            return $;
        }
    }

}
