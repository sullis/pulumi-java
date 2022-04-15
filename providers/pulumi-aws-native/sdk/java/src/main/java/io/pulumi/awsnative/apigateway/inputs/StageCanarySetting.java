// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies settings for the canary deployment in this stage.
 * 
 */
public final class StageCanarySetting extends io.pulumi.resources.InvokeArgs {

    public static final StageCanarySetting Empty = new StageCanarySetting();

    /**
     * The identifier of the deployment that the stage points to.
     * 
     */
    @Import(name="deploymentId")
      private final @Nullable String deploymentId;

    public Optional<String> deploymentId() {
        return this.deploymentId == null ? Optional.empty() : Optional.ofNullable(this.deploymentId);
    }

    /**
     * The percentage (0-100) of traffic diverted to a canary deployment.
     * 
     */
    @Import(name="percentTraffic")
      private final @Nullable Double percentTraffic;

    public Optional<Double> percentTraffic() {
        return this.percentTraffic == null ? Optional.empty() : Optional.ofNullable(this.percentTraffic);
    }

    /**
     * Stage variables overridden for a canary release deployment, including new stage variables introduced in the canary. These stage variables are represented as a string-to-string map between stage variable names and their values.
     * 
     */
    @Import(name="stageVariableOverrides")
      private final @Nullable Object stageVariableOverrides;

    public Optional<Object> stageVariableOverrides() {
        return this.stageVariableOverrides == null ? Optional.empty() : Optional.ofNullable(this.stageVariableOverrides);
    }

    /**
     * Whether the canary deployment uses the stage cache or not.
     * 
     */
    @Import(name="useStageCache")
      private final @Nullable Boolean useStageCache;

    public Optional<Boolean> useStageCache() {
        return this.useStageCache == null ? Optional.empty() : Optional.ofNullable(this.useStageCache);
    }

    public StageCanarySetting(
        @Nullable String deploymentId,
        @Nullable Double percentTraffic,
        @Nullable Object stageVariableOverrides,
        @Nullable Boolean useStageCache) {
        this.deploymentId = deploymentId;
        this.percentTraffic = percentTraffic;
        this.stageVariableOverrides = stageVariableOverrides;
        this.useStageCache = useStageCache;
    }

    private StageCanarySetting() {
        this.deploymentId = null;
        this.percentTraffic = null;
        this.stageVariableOverrides = null;
        this.useStageCache = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StageCanarySetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String deploymentId;
        private @Nullable Double percentTraffic;
        private @Nullable Object stageVariableOverrides;
        private @Nullable Boolean useStageCache;

        public Builder() {
    	      // Empty
        }

        public Builder(StageCanarySetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentId = defaults.deploymentId;
    	      this.percentTraffic = defaults.percentTraffic;
    	      this.stageVariableOverrides = defaults.stageVariableOverrides;
    	      this.useStageCache = defaults.useStageCache;
        }

        public Builder deploymentId(@Nullable String deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }
        public Builder percentTraffic(@Nullable Double percentTraffic) {
            this.percentTraffic = percentTraffic;
            return this;
        }
        public Builder stageVariableOverrides(@Nullable Object stageVariableOverrides) {
            this.stageVariableOverrides = stageVariableOverrides;
            return this;
        }
        public Builder useStageCache(@Nullable Boolean useStageCache) {
            this.useStageCache = useStageCache;
            return this;
        }        public StageCanarySetting build() {
            return new StageCanarySetting(deploymentId, percentTraffic, stageVariableOverrides, useStageCache);
        }
    }
}
