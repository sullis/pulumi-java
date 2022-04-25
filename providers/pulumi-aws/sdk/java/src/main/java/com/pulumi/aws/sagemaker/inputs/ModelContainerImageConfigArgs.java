// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ModelContainerImageConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModelContainerImageConfigArgs Empty = new ModelContainerImageConfigArgs();

    /**
     * Specifies whether the model container is in Amazon ECR or a private Docker registry accessible from your Amazon Virtual Private Cloud (VPC). Allowed values are: `Platform` and `Vpc`.
     * 
     */
    @Import(name="repositoryAccessMode", required=true)
    private Output<String> repositoryAccessMode;

    /**
     * @return Specifies whether the model container is in Amazon ECR or a private Docker registry accessible from your Amazon Virtual Private Cloud (VPC). Allowed values are: `Platform` and `Vpc`.
     * 
     */
    public Output<String> repositoryAccessMode() {
        return this.repositoryAccessMode;
    }

    private ModelContainerImageConfigArgs() {}

    private ModelContainerImageConfigArgs(ModelContainerImageConfigArgs $) {
        this.repositoryAccessMode = $.repositoryAccessMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelContainerImageConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelContainerImageConfigArgs $;

        public Builder() {
            $ = new ModelContainerImageConfigArgs();
        }

        public Builder(ModelContainerImageConfigArgs defaults) {
            $ = new ModelContainerImageConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param repositoryAccessMode Specifies whether the model container is in Amazon ECR or a private Docker registry accessible from your Amazon Virtual Private Cloud (VPC). Allowed values are: `Platform` and `Vpc`.
         * 
         * @return builder
         * 
         */
        public Builder repositoryAccessMode(Output<String> repositoryAccessMode) {
            $.repositoryAccessMode = repositoryAccessMode;
            return this;
        }

        /**
         * @param repositoryAccessMode Specifies whether the model container is in Amazon ECR or a private Docker registry accessible from your Amazon Virtual Private Cloud (VPC). Allowed values are: `Platform` and `Vpc`.
         * 
         * @return builder
         * 
         */
        public Builder repositoryAccessMode(String repositoryAccessMode) {
            return repositoryAccessMode(Output.of(repositoryAccessMode));
        }

        public ModelContainerImageConfigArgs build() {
            $.repositoryAccessMode = Objects.requireNonNull($.repositoryAccessMode, "expected parameter 'repositoryAccessMode' to be non-null");
            return $;
        }
    }

}
