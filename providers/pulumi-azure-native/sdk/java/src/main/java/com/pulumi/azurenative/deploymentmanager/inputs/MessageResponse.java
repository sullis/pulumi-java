// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.deploymentmanager.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Supplementary contextual messages during a rollout.
 * 
 */
public final class MessageResponse extends com.pulumi.resources.InvokeArgs {

    public static final MessageResponse Empty = new MessageResponse();

    /**
     * The actual message text.
     * 
     */
    @Import(name="message", required=true)
    private String message;

    /**
     * @return The actual message text.
     * 
     */
    public String message() {
        return this.message;
    }

    /**
     * Time in UTC this message was provided.
     * 
     */
    @Import(name="timeStamp", required=true)
    private String timeStamp;

    /**
     * @return Time in UTC this message was provided.
     * 
     */
    public String timeStamp() {
        return this.timeStamp;
    }

    private MessageResponse() {}

    private MessageResponse(MessageResponse $) {
        this.message = $.message;
        this.timeStamp = $.timeStamp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MessageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MessageResponse $;

        public Builder() {
            $ = new MessageResponse();
        }

        public Builder(MessageResponse defaults) {
            $ = new MessageResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param message The actual message text.
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            $.message = message;
            return this;
        }

        /**
         * @param timeStamp Time in UTC this message was provided.
         * 
         * @return builder
         * 
         */
        public Builder timeStamp(String timeStamp) {
            $.timeStamp = timeStamp;
            return this;
        }

        public MessageResponse build() {
            $.message = Objects.requireNonNull($.message, "expected parameter 'message' to be non-null");
            $.timeStamp = Objects.requireNonNull($.timeStamp, "expected parameter 'timeStamp' to be non-null");
            return $;
        }
    }

}
