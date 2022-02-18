// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles.outputs;

import io.pulumi.awsnative.customerprofiles.enums.IntegrationTriggerType;
import io.pulumi.awsnative.customerprofiles.outputs.IntegrationTriggerProperties;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IntegrationTriggerConfig {
    private final @Nullable IntegrationTriggerProperties triggerProperties;
    private final IntegrationTriggerType triggerType;

    @OutputCustomType.Constructor({"triggerProperties","triggerType"})
    private IntegrationTriggerConfig(
        @Nullable IntegrationTriggerProperties triggerProperties,
        IntegrationTriggerType triggerType) {
        this.triggerProperties = triggerProperties;
        this.triggerType = Objects.requireNonNull(triggerType);
    }

    public Optional<IntegrationTriggerProperties> getTriggerProperties() {
        return Optional.ofNullable(this.triggerProperties);
    }
    public IntegrationTriggerType getTriggerType() {
        return this.triggerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationTriggerConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable IntegrationTriggerProperties triggerProperties;
        private IntegrationTriggerType triggerType;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationTriggerConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.triggerProperties = defaults.triggerProperties;
    	      this.triggerType = defaults.triggerType;
        }

        public Builder setTriggerProperties(@Nullable IntegrationTriggerProperties triggerProperties) {
            this.triggerProperties = triggerProperties;
            return this;
        }

        public Builder setTriggerType(IntegrationTriggerType triggerType) {
            this.triggerType = Objects.requireNonNull(triggerType);
            return this;
        }

        public IntegrationTriggerConfig build() {
            return new IntegrationTriggerConfig(triggerProperties, triggerType);
        }
    }
}
