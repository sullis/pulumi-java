// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.devicefarm.inputs;

import io.pulumi.awsnative.devicefarm.enums.DevicePoolRuleAttribute;
import io.pulumi.awsnative.devicefarm.enums.DevicePoolRuleOperator;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DevicePoolRule extends io.pulumi.resources.InvokeArgs {

    public static final DevicePoolRule Empty = new DevicePoolRule();

    @InputImport(name="attribute")
    private final @Nullable DevicePoolRuleAttribute attribute;

    public Optional<DevicePoolRuleAttribute> getAttribute() {
        return this.attribute == null ? Optional.empty() : Optional.ofNullable(this.attribute);
    }

    @InputImport(name="operator")
    private final @Nullable DevicePoolRuleOperator operator;

    public Optional<DevicePoolRuleOperator> getOperator() {
        return this.operator == null ? Optional.empty() : Optional.ofNullable(this.operator);
    }

    @InputImport(name="value")
    private final @Nullable String value;

    public Optional<String> getValue() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public DevicePoolRule(
        @Nullable DevicePoolRuleAttribute attribute,
        @Nullable DevicePoolRuleOperator operator,
        @Nullable String value) {
        this.attribute = attribute;
        this.operator = operator;
        this.value = value;
    }

    private DevicePoolRule() {
        this.attribute = null;
        this.operator = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DevicePoolRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DevicePoolRuleAttribute attribute;
        private @Nullable DevicePoolRuleOperator operator;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(DevicePoolRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attribute = defaults.attribute;
    	      this.operator = defaults.operator;
    	      this.value = defaults.value;
        }

        public Builder setAttribute(@Nullable DevicePoolRuleAttribute attribute) {
            this.attribute = attribute;
            return this;
        }

        public Builder setOperator(@Nullable DevicePoolRuleOperator operator) {
            this.operator = operator;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }

        public DevicePoolRule build() {
            return new DevicePoolRule(attribute, operator, value);
        }
    }
}
