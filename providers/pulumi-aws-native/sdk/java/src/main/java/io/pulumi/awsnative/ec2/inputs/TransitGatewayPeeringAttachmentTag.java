// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TransitGatewayPeeringAttachmentTag extends io.pulumi.resources.InvokeArgs {

    public static final TransitGatewayPeeringAttachmentTag Empty = new TransitGatewayPeeringAttachmentTag();

    /**
     * The key of the tag. Constraints: Tag keys are case-sensitive and accept a maximum of 127 Unicode characters. May not begin with aws:.
     * 
     */
    @InputImport(name="key")
      private final @Nullable String key;

    public Optional<String> getKey() {
        return this.key == null ? Optional.empty() : Optional.ofNullable(this.key);
    }

    /**
     * The value of the tag. Constraints: Tag values are case-sensitive and accept a maximum of 255 Unicode characters.
     * 
     */
    @InputImport(name="value")
      private final @Nullable String value;

    public Optional<String> getValue() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public TransitGatewayPeeringAttachmentTag(
        @Nullable String key,
        @Nullable String value) {
        this.key = key;
        this.value = value;
    }

    private TransitGatewayPeeringAttachmentTag() {
        this.key = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransitGatewayPeeringAttachmentTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String key;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(TransitGatewayPeeringAttachmentTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder setKey(@Nullable String key) {
            this.key = key;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }
        public TransitGatewayPeeringAttachmentTag build() {
            return new TransitGatewayPeeringAttachmentTag(key, value);
        }
    }
}