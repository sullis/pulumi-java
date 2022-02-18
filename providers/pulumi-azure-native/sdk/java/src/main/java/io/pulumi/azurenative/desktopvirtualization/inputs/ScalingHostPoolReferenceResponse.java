// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.desktopvirtualization.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Scaling plan reference to hostpool.
 * 
 */
public final class ScalingHostPoolReferenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final ScalingHostPoolReferenceResponse Empty = new ScalingHostPoolReferenceResponse();

    /**
     * Arm path of referenced hostpool.
     * 
     */
    @InputImport(name="hostPoolArmPath")
    private final @Nullable String hostPoolArmPath;

    public Optional<String> getHostPoolArmPath() {
        return this.hostPoolArmPath == null ? Optional.empty() : Optional.ofNullable(this.hostPoolArmPath);
    }

    /**
     * Is the scaling plan enabled for this hostpool.
     * 
     */
    @InputImport(name="scalingPlanEnabled")
    private final @Nullable Boolean scalingPlanEnabled;

    public Optional<Boolean> getScalingPlanEnabled() {
        return this.scalingPlanEnabled == null ? Optional.empty() : Optional.ofNullable(this.scalingPlanEnabled);
    }

    public ScalingHostPoolReferenceResponse(
        @Nullable String hostPoolArmPath,
        @Nullable Boolean scalingPlanEnabled) {
        this.hostPoolArmPath = hostPoolArmPath;
        this.scalingPlanEnabled = scalingPlanEnabled;
    }

    private ScalingHostPoolReferenceResponse() {
        this.hostPoolArmPath = null;
        this.scalingPlanEnabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScalingHostPoolReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String hostPoolArmPath;
        private @Nullable Boolean scalingPlanEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ScalingHostPoolReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostPoolArmPath = defaults.hostPoolArmPath;
    	      this.scalingPlanEnabled = defaults.scalingPlanEnabled;
        }

        public Builder setHostPoolArmPath(@Nullable String hostPoolArmPath) {
            this.hostPoolArmPath = hostPoolArmPath;
            return this;
        }

        public Builder setScalingPlanEnabled(@Nullable Boolean scalingPlanEnabled) {
            this.scalingPlanEnabled = scalingPlanEnabled;
            return this;
        }

        public ScalingHostPoolReferenceResponse build() {
            return new ScalingHostPoolReferenceResponse(hostPoolArmPath, scalingPlanEnabled);
        }
    }
}
