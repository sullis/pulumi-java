// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sso.outputs;

import com.pulumi.awsnative.sso.outputs.InstanceAccessControlAttributeConfigurationAccessControlAttribute;
import com.pulumi.awsnative.sso.outputs.InstanceAccessControlAttributeConfigurationProperties;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInstanceAccessControlAttributeConfigurationResult {
    private final @Nullable List<InstanceAccessControlAttributeConfigurationAccessControlAttribute> accessControlAttributes;
    /**
     * @return The InstanceAccessControlAttributeConfiguration property has been deprecated but is still supported for backwards compatibility purposes. We recomend that you use  AccessControlAttributes property instead.
     * 
     */
    private final @Nullable InstanceAccessControlAttributeConfigurationProperties instanceAccessControlAttributeConfiguration;

    @CustomType.Constructor
    private GetInstanceAccessControlAttributeConfigurationResult(
        @CustomType.Parameter("accessControlAttributes") @Nullable List<InstanceAccessControlAttributeConfigurationAccessControlAttribute> accessControlAttributes,
        @CustomType.Parameter("instanceAccessControlAttributeConfiguration") @Nullable InstanceAccessControlAttributeConfigurationProperties instanceAccessControlAttributeConfiguration) {
        this.accessControlAttributes = accessControlAttributes;
        this.instanceAccessControlAttributeConfiguration = instanceAccessControlAttributeConfiguration;
    }

    public List<InstanceAccessControlAttributeConfigurationAccessControlAttribute> accessControlAttributes() {
        return this.accessControlAttributes == null ? List.of() : this.accessControlAttributes;
    }
    /**
     * @return The InstanceAccessControlAttributeConfiguration property has been deprecated but is still supported for backwards compatibility purposes. We recomend that you use  AccessControlAttributes property instead.
     * 
     */
    public Optional<InstanceAccessControlAttributeConfigurationProperties> instanceAccessControlAttributeConfiguration() {
        return Optional.ofNullable(this.instanceAccessControlAttributeConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceAccessControlAttributeConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<InstanceAccessControlAttributeConfigurationAccessControlAttribute> accessControlAttributes;
        private @Nullable InstanceAccessControlAttributeConfigurationProperties instanceAccessControlAttributeConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceAccessControlAttributeConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessControlAttributes = defaults.accessControlAttributes;
    	      this.instanceAccessControlAttributeConfiguration = defaults.instanceAccessControlAttributeConfiguration;
        }

        public Builder accessControlAttributes(@Nullable List<InstanceAccessControlAttributeConfigurationAccessControlAttribute> accessControlAttributes) {
            this.accessControlAttributes = accessControlAttributes;
            return this;
        }
        public Builder accessControlAttributes(InstanceAccessControlAttributeConfigurationAccessControlAttribute... accessControlAttributes) {
            return accessControlAttributes(List.of(accessControlAttributes));
        }
        public Builder instanceAccessControlAttributeConfiguration(@Nullable InstanceAccessControlAttributeConfigurationProperties instanceAccessControlAttributeConfiguration) {
            this.instanceAccessControlAttributeConfiguration = instanceAccessControlAttributeConfiguration;
            return this;
        }        public GetInstanceAccessControlAttributeConfigurationResult build() {
            return new GetInstanceAccessControlAttributeConfigurationResult(accessControlAttributes, instanceAccessControlAttributeConfiguration);
        }
    }
}
