// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.awsnative.appflow.enums.FlowTriggerType;
import io.pulumi.awsnative.appflow.inputs.FlowScheduledTriggerProperties;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Trigger settings of the flow.
 * 
 */
public final class FlowTriggerConfig extends io.pulumi.resources.InvokeArgs {

    public static final FlowTriggerConfig Empty = new FlowTriggerConfig();

    /**
     * Details required based on the type of trigger
     * 
     */
    @Import(name="triggerProperties")
      private final @Nullable FlowScheduledTriggerProperties triggerProperties;

    public Optional<FlowScheduledTriggerProperties> triggerProperties() {
        return this.triggerProperties == null ? Optional.empty() : Optional.ofNullable(this.triggerProperties);
    }

    /**
     * Trigger type of the flow
     * 
     */
    @Import(name="triggerType", required=true)
      private final FlowTriggerType triggerType;

    public FlowTriggerType triggerType() {
        return this.triggerType;
    }

    public FlowTriggerConfig(
        @Nullable FlowScheduledTriggerProperties triggerProperties,
        FlowTriggerType triggerType) {
        this.triggerProperties = triggerProperties;
        this.triggerType = Objects.requireNonNull(triggerType, "expected parameter 'triggerType' to be non-null");
    }

    private FlowTriggerConfig() {
        this.triggerProperties = null;
        this.triggerType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowTriggerConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FlowScheduledTriggerProperties triggerProperties;
        private FlowTriggerType triggerType;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowTriggerConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.triggerProperties = defaults.triggerProperties;
    	      this.triggerType = defaults.triggerType;
        }

        public Builder triggerProperties(@Nullable FlowScheduledTriggerProperties triggerProperties) {
            this.triggerProperties = triggerProperties;
            return this;
        }
        public Builder triggerType(FlowTriggerType triggerType) {
            this.triggerType = Objects.requireNonNull(triggerType);
            return this;
        }        public FlowTriggerConfig build() {
            return new FlowTriggerConfig(triggerProperties, triggerType);
        }
    }
}
