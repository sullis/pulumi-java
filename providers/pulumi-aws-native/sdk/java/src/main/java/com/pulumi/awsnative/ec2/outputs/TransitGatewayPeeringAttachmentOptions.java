// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TransitGatewayPeeringAttachmentOptions {
    /**
     * @return Whether to enable dynamic routing. (enable/disable)
     * 
     */
    private final @Nullable String dynamicRouting;

    @CustomType.Constructor
    private TransitGatewayPeeringAttachmentOptions(@CustomType.Parameter("dynamicRouting") @Nullable String dynamicRouting) {
        this.dynamicRouting = dynamicRouting;
    }

    /**
     * @return Whether to enable dynamic routing. (enable/disable)
     * 
     */
    public Optional<String> dynamicRouting() {
        return Optional.ofNullable(this.dynamicRouting);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransitGatewayPeeringAttachmentOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dynamicRouting;

        public Builder() {
    	      // Empty
        }

        public Builder(TransitGatewayPeeringAttachmentOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dynamicRouting = defaults.dynamicRouting;
        }

        public Builder dynamicRouting(@Nullable String dynamicRouting) {
            this.dynamicRouting = dynamicRouting;
            return this;
        }        public TransitGatewayPeeringAttachmentOptions build() {
            return new TransitGatewayPeeringAttachmentOptions(dynamicRouting);
        }
    }
}
