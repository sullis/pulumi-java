// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentCanarySettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentCanarySettingsArgs Empty = new DeploymentCanarySettingsArgs();

    /**
     * The percentage (0-100) of traffic diverted to a canary deployment.
     * 
     */
    @InputImport(name="percentTraffic")
    private final @Nullable Input<Double> percentTraffic;

    public Input<Double> getPercentTraffic() {
        return this.percentTraffic == null ? Input.empty() : this.percentTraffic;
    }

    /**
     * Stage variables overridden for a canary release deployment, including new stage variables introduced in the canary. These stage variables are represented as a string-to-string map between stage variable names and their values. Duplicates are not allowed.
     * 
     */
    @InputImport(name="stageVariableOverrides")
    private final @Nullable Input<Object> stageVariableOverrides;

    public Input<Object> getStageVariableOverrides() {
        return this.stageVariableOverrides == null ? Input.empty() : this.stageVariableOverrides;
    }

    /**
     * Whether the canary deployment uses the stage cache.
     * 
     */
    @InputImport(name="useStageCache")
    private final @Nullable Input<Boolean> useStageCache;

    public Input<Boolean> getUseStageCache() {
        return this.useStageCache == null ? Input.empty() : this.useStageCache;
    }

    public DeploymentCanarySettingsArgs(
        @Nullable Input<Double> percentTraffic,
        @Nullable Input<Object> stageVariableOverrides,
        @Nullable Input<Boolean> useStageCache) {
        this.percentTraffic = percentTraffic;
        this.stageVariableOverrides = stageVariableOverrides;
        this.useStageCache = useStageCache;
    }

    private DeploymentCanarySettingsArgs() {
        this.percentTraffic = Input.empty();
        this.stageVariableOverrides = Input.empty();
        this.useStageCache = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentCanarySettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> percentTraffic;
        private @Nullable Input<Object> stageVariableOverrides;
        private @Nullable Input<Boolean> useStageCache;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentCanarySettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.percentTraffic = defaults.percentTraffic;
    	      this.stageVariableOverrides = defaults.stageVariableOverrides;
    	      this.useStageCache = defaults.useStageCache;
        }

        public Builder setPercentTraffic(@Nullable Input<Double> percentTraffic) {
            this.percentTraffic = percentTraffic;
            return this;
        }

        public Builder setPercentTraffic(@Nullable Double percentTraffic) {
            this.percentTraffic = Input.ofNullable(percentTraffic);
            return this;
        }

        public Builder setStageVariableOverrides(@Nullable Input<Object> stageVariableOverrides) {
            this.stageVariableOverrides = stageVariableOverrides;
            return this;
        }

        public Builder setStageVariableOverrides(@Nullable Object stageVariableOverrides) {
            this.stageVariableOverrides = Input.ofNullable(stageVariableOverrides);
            return this;
        }

        public Builder setUseStageCache(@Nullable Input<Boolean> useStageCache) {
            this.useStageCache = useStageCache;
            return this;
        }

        public Builder setUseStageCache(@Nullable Boolean useStageCache) {
            this.useStageCache = Input.ofNullable(useStageCache);
            return this;
        }

        public DeploymentCanarySettingsArgs build() {
            return new DeploymentCanarySettingsArgs(percentTraffic, stageVariableOverrides, useStageCache);
        }
    }
}
