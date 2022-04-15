// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies settings for the canary deployment in this stage.
 * 
 */
public final class StageCanarySettingArgs extends io.pulumi.resources.ResourceArgs {

    public static final StageCanarySettingArgs Empty = new StageCanarySettingArgs();

    /**
     * The identifier of the deployment that the stage points to.
     * 
     */
    @Import(name="deploymentId")
      private final @Nullable Output<String> deploymentId;

    public Output<String> deploymentId() {
        return this.deploymentId == null ? Codegen.empty() : this.deploymentId;
    }

    /**
     * The percentage (0-100) of traffic diverted to a canary deployment.
     * 
     */
    @Import(name="percentTraffic")
      private final @Nullable Output<Double> percentTraffic;

    public Output<Double> percentTraffic() {
        return this.percentTraffic == null ? Codegen.empty() : this.percentTraffic;
    }

    /**
     * Stage variables overridden for a canary release deployment, including new stage variables introduced in the canary. These stage variables are represented as a string-to-string map between stage variable names and their values.
     * 
     */
    @Import(name="stageVariableOverrides")
      private final @Nullable Output<Object> stageVariableOverrides;

    public Output<Object> stageVariableOverrides() {
        return this.stageVariableOverrides == null ? Codegen.empty() : this.stageVariableOverrides;
    }

    /**
     * Whether the canary deployment uses the stage cache or not.
     * 
     */
    @Import(name="useStageCache")
      private final @Nullable Output<Boolean> useStageCache;

    public Output<Boolean> useStageCache() {
        return this.useStageCache == null ? Codegen.empty() : this.useStageCache;
    }

    public StageCanarySettingArgs(
        @Nullable Output<String> deploymentId,
        @Nullable Output<Double> percentTraffic,
        @Nullable Output<Object> stageVariableOverrides,
        @Nullable Output<Boolean> useStageCache) {
        this.deploymentId = deploymentId;
        this.percentTraffic = percentTraffic;
        this.stageVariableOverrides = stageVariableOverrides;
        this.useStageCache = useStageCache;
    }

    private StageCanarySettingArgs() {
        this.deploymentId = Codegen.empty();
        this.percentTraffic = Codegen.empty();
        this.stageVariableOverrides = Codegen.empty();
        this.useStageCache = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StageCanarySettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> deploymentId;
        private @Nullable Output<Double> percentTraffic;
        private @Nullable Output<Object> stageVariableOverrides;
        private @Nullable Output<Boolean> useStageCache;

        public Builder() {
    	      // Empty
        }

        public Builder(StageCanarySettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentId = defaults.deploymentId;
    	      this.percentTraffic = defaults.percentTraffic;
    	      this.stageVariableOverrides = defaults.stageVariableOverrides;
    	      this.useStageCache = defaults.useStageCache;
        }

        public Builder deploymentId(@Nullable Output<String> deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }
        public Builder deploymentId(@Nullable String deploymentId) {
            this.deploymentId = Codegen.ofNullable(deploymentId);
            return this;
        }
        public Builder percentTraffic(@Nullable Output<Double> percentTraffic) {
            this.percentTraffic = percentTraffic;
            return this;
        }
        public Builder percentTraffic(@Nullable Double percentTraffic) {
            this.percentTraffic = Codegen.ofNullable(percentTraffic);
            return this;
        }
        public Builder stageVariableOverrides(@Nullable Output<Object> stageVariableOverrides) {
            this.stageVariableOverrides = stageVariableOverrides;
            return this;
        }
        public Builder stageVariableOverrides(@Nullable Object stageVariableOverrides) {
            this.stageVariableOverrides = Codegen.ofNullable(stageVariableOverrides);
            return this;
        }
        public Builder useStageCache(@Nullable Output<Boolean> useStageCache) {
            this.useStageCache = useStageCache;
            return this;
        }
        public Builder useStageCache(@Nullable Boolean useStageCache) {
            this.useStageCache = Codegen.ofNullable(useStageCache);
            return this;
        }        public StageCanarySettingArgs build() {
            return new StageCanarySettingArgs(deploymentId, percentTraffic, stageVariableOverrides, useStageCache);
        }
    }
}
