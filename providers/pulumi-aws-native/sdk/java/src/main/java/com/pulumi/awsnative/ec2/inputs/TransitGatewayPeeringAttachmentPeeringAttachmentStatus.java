// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TransitGatewayPeeringAttachmentPeeringAttachmentStatus extends com.pulumi.resources.InvokeArgs {

    public static final TransitGatewayPeeringAttachmentPeeringAttachmentStatus Empty = new TransitGatewayPeeringAttachmentPeeringAttachmentStatus();

    /**
     * The status code.
     * 
     */
    @Import(name="code")
    private @Nullable String code;

    /**
     * @return The status code.
     * 
     */
    public Optional<String> code() {
        return Optional.ofNullable(this.code);
    }

    /**
     * The status message, if applicable.
     * 
     */
    @Import(name="message")
    private @Nullable String message;

    /**
     * @return The status message, if applicable.
     * 
     */
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }

    private TransitGatewayPeeringAttachmentPeeringAttachmentStatus() {}

    private TransitGatewayPeeringAttachmentPeeringAttachmentStatus(TransitGatewayPeeringAttachmentPeeringAttachmentStatus $) {
        this.code = $.code;
        this.message = $.message;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransitGatewayPeeringAttachmentPeeringAttachmentStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransitGatewayPeeringAttachmentPeeringAttachmentStatus $;

        public Builder() {
            $ = new TransitGatewayPeeringAttachmentPeeringAttachmentStatus();
        }

        public Builder(TransitGatewayPeeringAttachmentPeeringAttachmentStatus defaults) {
            $ = new TransitGatewayPeeringAttachmentPeeringAttachmentStatus(Objects.requireNonNull(defaults));
        }

        /**
         * @param code The status code.
         * 
         * @return builder
         * 
         */
        public Builder code(@Nullable String code) {
            $.code = code;
            return this;
        }

        /**
         * @param message The status message, if applicable.
         * 
         * @return builder
         * 
         */
        public Builder message(@Nullable String message) {
            $.message = message;
            return this;
        }

        public TransitGatewayPeeringAttachmentPeeringAttachmentStatus build() {
            return $;
        }
    }

}
