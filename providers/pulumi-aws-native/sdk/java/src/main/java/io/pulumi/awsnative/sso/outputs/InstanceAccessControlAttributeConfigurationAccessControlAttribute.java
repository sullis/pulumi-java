// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sso.outputs;

import io.pulumi.awsnative.sso.outputs.InstanceAccessControlAttributeConfigurationAccessControlAttributeValue;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class InstanceAccessControlAttributeConfigurationAccessControlAttribute {
    private final String key;
    private final InstanceAccessControlAttributeConfigurationAccessControlAttributeValue value;

    @OutputCustomType.Constructor({"key","value"})
    private InstanceAccessControlAttributeConfigurationAccessControlAttribute(
        String key,
        InstanceAccessControlAttributeConfigurationAccessControlAttributeValue value) {
        this.key = Objects.requireNonNull(key);
        this.value = Objects.requireNonNull(value);
    }

    public String getKey() {
        return this.key;
    }
    public InstanceAccessControlAttributeConfigurationAccessControlAttributeValue getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceAccessControlAttributeConfigurationAccessControlAttribute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private InstanceAccessControlAttributeConfigurationAccessControlAttributeValue value;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceAccessControlAttributeConfigurationAccessControlAttribute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setValue(InstanceAccessControlAttributeConfigurationAccessControlAttributeValue value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public InstanceAccessControlAttributeConfigurationAccessControlAttribute build() {
            return new InstanceAccessControlAttributeConfigurationAccessControlAttribute(key, value);
        }
    }
}