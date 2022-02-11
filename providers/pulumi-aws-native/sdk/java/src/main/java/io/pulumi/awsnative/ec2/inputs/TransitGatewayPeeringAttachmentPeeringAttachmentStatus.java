// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TransitGatewayPeeringAttachmentPeeringAttachmentStatus extends io.pulumi.resources.InvokeArgs {

    public static final TransitGatewayPeeringAttachmentPeeringAttachmentStatus Empty = new TransitGatewayPeeringAttachmentPeeringAttachmentStatus();

    @InputImport(name="code")
    private final @Nullable String code;

    public Optional<String> getCode() {
        return this.code == null ? Optional.empty() : Optional.ofNullable(this.code);
    }

    @InputImport(name="message")
    private final @Nullable String message;

    public Optional<String> getMessage() {
        return this.message == null ? Optional.empty() : Optional.ofNullable(this.message);
    }

    public TransitGatewayPeeringAttachmentPeeringAttachmentStatus(
        @Nullable String code,
        @Nullable String message) {
        this.code = code;
        this.message = message;
    }

    private TransitGatewayPeeringAttachmentPeeringAttachmentStatus() {
        this.code = null;
        this.message = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransitGatewayPeeringAttachmentPeeringAttachmentStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String code;
        private @Nullable String message;

        public Builder() {
    	      // Empty
        }

        public Builder(TransitGatewayPeeringAttachmentPeeringAttachmentStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.message = defaults.message;
        }

        public Builder setCode(@Nullable String code) {
            this.code = code;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public TransitGatewayPeeringAttachmentPeeringAttachmentStatus build() {
            return new TransitGatewayPeeringAttachmentPeeringAttachmentStatus(code, message);
        }
    }
}
