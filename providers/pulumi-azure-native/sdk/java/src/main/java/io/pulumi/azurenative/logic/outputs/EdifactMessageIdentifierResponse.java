// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class EdifactMessageIdentifierResponse {
    /**
     * The message id on which this envelope settings has to be applied.
     * 
     */
    private final String messageId;

    @OutputCustomType.Constructor({"messageId"})
    private EdifactMessageIdentifierResponse(String messageId) {
        this.messageId = Objects.requireNonNull(messageId);
    }

    /**
     * The message id on which this envelope settings has to be applied.
     * 
    */
    public String getMessageId() {
        return this.messageId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdifactMessageIdentifierResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String messageId;

        public Builder() {
    	      // Empty
        }

        public Builder(EdifactMessageIdentifierResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageId = defaults.messageId;
        }

        public Builder setMessageId(String messageId) {
            this.messageId = Objects.requireNonNull(messageId);
            return this;
        }
        public EdifactMessageIdentifierResponse build() {
            return new EdifactMessageIdentifierResponse(messageId);
        }
    }
}