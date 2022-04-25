// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apigateway;

import com.pulumi.awsnative.apigateway.inputs.DeploymentCanarySettingsArgs;
import com.pulumi.awsnative.apigateway.inputs.DeploymentStageDescriptionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeploymentArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentArgs Empty = new DeploymentArgs();

    /**
     * Specifies settings for the canary deployment.
     * 
     */
    @Import(name="deploymentCanarySettings")
    private @Nullable Output<DeploymentCanarySettingsArgs> deploymentCanarySettings;

    /**
     * @return Specifies settings for the canary deployment.
     * 
     */
    public Optional<Output<DeploymentCanarySettingsArgs>> deploymentCanarySettings() {
        return Optional.ofNullable(this.deploymentCanarySettings);
    }

    /**
     * A description of the purpose of the API Gateway deployment.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the purpose of the API Gateway deployment.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The ID of the RestApi resource to deploy.
     * 
     */
    @Import(name="restApiId", required=true)
    private Output<String> restApiId;

    /**
     * @return The ID of the RestApi resource to deploy.
     * 
     */
    public Output<String> restApiId() {
        return this.restApiId;
    }

    /**
     * Configures the stage that API Gateway creates with this deployment.
     * 
     */
    @Import(name="stageDescription")
    private @Nullable Output<DeploymentStageDescriptionArgs> stageDescription;

    /**
     * @return Configures the stage that API Gateway creates with this deployment.
     * 
     */
    public Optional<Output<DeploymentStageDescriptionArgs>> stageDescription() {
        return Optional.ofNullable(this.stageDescription);
    }

    /**
     * A name for the stage that API Gateway creates with this deployment. Use only alphanumeric characters.
     * 
     */
    @Import(name="stageName")
    private @Nullable Output<String> stageName;

    /**
     * @return A name for the stage that API Gateway creates with this deployment. Use only alphanumeric characters.
     * 
     */
    public Optional<Output<String>> stageName() {
        return Optional.ofNullable(this.stageName);
    }

    private DeploymentArgs() {}

    private DeploymentArgs(DeploymentArgs $) {
        this.deploymentCanarySettings = $.deploymentCanarySettings;
        this.description = $.description;
        this.restApiId = $.restApiId;
        this.stageDescription = $.stageDescription;
        this.stageName = $.stageName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentArgs $;

        public Builder() {
            $ = new DeploymentArgs();
        }

        public Builder(DeploymentArgs defaults) {
            $ = new DeploymentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deploymentCanarySettings Specifies settings for the canary deployment.
         * 
         * @return builder
         * 
         */
        public Builder deploymentCanarySettings(@Nullable Output<DeploymentCanarySettingsArgs> deploymentCanarySettings) {
            $.deploymentCanarySettings = deploymentCanarySettings;
            return this;
        }

        /**
         * @param deploymentCanarySettings Specifies settings for the canary deployment.
         * 
         * @return builder
         * 
         */
        public Builder deploymentCanarySettings(DeploymentCanarySettingsArgs deploymentCanarySettings) {
            return deploymentCanarySettings(Output.of(deploymentCanarySettings));
        }

        /**
         * @param description A description of the purpose of the API Gateway deployment.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the purpose of the API Gateway deployment.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param restApiId The ID of the RestApi resource to deploy.
         * 
         * @return builder
         * 
         */
        public Builder restApiId(Output<String> restApiId) {
            $.restApiId = restApiId;
            return this;
        }

        /**
         * @param restApiId The ID of the RestApi resource to deploy.
         * 
         * @return builder
         * 
         */
        public Builder restApiId(String restApiId) {
            return restApiId(Output.of(restApiId));
        }

        /**
         * @param stageDescription Configures the stage that API Gateway creates with this deployment.
         * 
         * @return builder
         * 
         */
        public Builder stageDescription(@Nullable Output<DeploymentStageDescriptionArgs> stageDescription) {
            $.stageDescription = stageDescription;
            return this;
        }

        /**
         * @param stageDescription Configures the stage that API Gateway creates with this deployment.
         * 
         * @return builder
         * 
         */
        public Builder stageDescription(DeploymentStageDescriptionArgs stageDescription) {
            return stageDescription(Output.of(stageDescription));
        }

        /**
         * @param stageName A name for the stage that API Gateway creates with this deployment. Use only alphanumeric characters.
         * 
         * @return builder
         * 
         */
        public Builder stageName(@Nullable Output<String> stageName) {
            $.stageName = stageName;
            return this;
        }

        /**
         * @param stageName A name for the stage that API Gateway creates with this deployment. Use only alphanumeric characters.
         * 
         * @return builder
         * 
         */
        public Builder stageName(String stageName) {
            return stageName(Output.of(stageName));
        }

        public DeploymentArgs build() {
            $.restApiId = Objects.requireNonNull($.restApiId, "expected parameter 'restApiId' to be non-null");
            return $;
        }
    }

}
