// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.azurenative.batch.inputs.AutoScaleSettingsArgs;
import io.pulumi.azurenative.batch.inputs.FixedScaleSettingsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the desired size of the pool. This can either be 'fixedScale' where the requested targetDedicatedNodes is specified, or 'autoScale' which defines a formula which is periodically reevaluated. If this property is not specified, the pool will have a fixed scale with 0 targetDedicatedNodes.
 * 
 */
public final class ScaleSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScaleSettingsArgs Empty = new ScaleSettingsArgs();

    /**
     * This property and fixedScale are mutually exclusive and one of the properties must be specified.
     * 
     */
    @InputImport(name="autoScale")
      private final @Nullable Input<AutoScaleSettingsArgs> autoScale;

    public Input<AutoScaleSettingsArgs> getAutoScale() {
        return this.autoScale == null ? Input.empty() : this.autoScale;
    }

    /**
     * This property and autoScale are mutually exclusive and one of the properties must be specified.
     * 
     */
    @InputImport(name="fixedScale")
      private final @Nullable Input<FixedScaleSettingsArgs> fixedScale;

    public Input<FixedScaleSettingsArgs> getFixedScale() {
        return this.fixedScale == null ? Input.empty() : this.fixedScale;
    }

    public ScaleSettingsArgs(
        @Nullable Input<AutoScaleSettingsArgs> autoScale,
        @Nullable Input<FixedScaleSettingsArgs> fixedScale) {
        this.autoScale = autoScale;
        this.fixedScale = fixedScale;
    }

    private ScaleSettingsArgs() {
        this.autoScale = Input.empty();
        this.fixedScale = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AutoScaleSettingsArgs> autoScale;
        private @Nullable Input<FixedScaleSettingsArgs> fixedScale;

        public Builder() {
    	      // Empty
        }

        public Builder(ScaleSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoScale = defaults.autoScale;
    	      this.fixedScale = defaults.fixedScale;
        }

        public Builder setAutoScale(@Nullable Input<AutoScaleSettingsArgs> autoScale) {
            this.autoScale = autoScale;
            return this;
        }

        public Builder setAutoScale(@Nullable AutoScaleSettingsArgs autoScale) {
            this.autoScale = Input.ofNullable(autoScale);
            return this;
        }

        public Builder setFixedScale(@Nullable Input<FixedScaleSettingsArgs> fixedScale) {
            this.fixedScale = fixedScale;
            return this;
        }

        public Builder setFixedScale(@Nullable FixedScaleSettingsArgs fixedScale) {
            this.fixedScale = Input.ofNullable(fixedScale);
            return this;
        }
        public ScaleSettingsArgs build() {
            return new ScaleSettingsArgs(autoScale, fixedScale);
        }
    }
}