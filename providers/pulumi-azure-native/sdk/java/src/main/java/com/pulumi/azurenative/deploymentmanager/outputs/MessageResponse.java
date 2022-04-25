// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.deploymentmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MessageResponse {
    /**
     * @return The actual message text.
     * 
     */
    private final String message;
    /**
     * @return Time in UTC this message was provided.
     * 
     */
    private final String timeStamp;

    @CustomType.Constructor
    private MessageResponse(
        @CustomType.Parameter("message") String message,
        @CustomType.Parameter("timeStamp") String timeStamp) {
        this.message = message;
        this.timeStamp = timeStamp;
    }

    /**
     * @return The actual message text.
     * 
     */
    public String message() {
        return this.message;
    }
    /**
     * @return Time in UTC this message was provided.
     * 
     */
    public String timeStamp() {
        return this.timeStamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MessageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String message;
        private String timeStamp;

        public Builder() {
    	      // Empty
        }

        public Builder(MessageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.timeStamp = defaults.timeStamp;
        }

        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public Builder timeStamp(String timeStamp) {
            this.timeStamp = Objects.requireNonNull(timeStamp);
            return this;
        }        public MessageResponse build() {
            return new MessageResponse(message, timeStamp);
        }
    }
}
