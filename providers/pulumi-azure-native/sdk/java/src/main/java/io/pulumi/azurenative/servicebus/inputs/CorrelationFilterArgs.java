// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents the correlation filter expression.
 * 
 */
public final class CorrelationFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final CorrelationFilterArgs Empty = new CorrelationFilterArgs();

    /**
     * Content type of the message.
     * 
     */
    @InputImport(name="contentType")
    private final @Nullable Input<String> contentType;

    public Input<String> getContentType() {
        return this.contentType == null ? Input.empty() : this.contentType;
    }

    /**
     * Identifier of the correlation.
     * 
     */
    @InputImport(name="correlationId")
    private final @Nullable Input<String> correlationId;

    public Input<String> getCorrelationId() {
        return this.correlationId == null ? Input.empty() : this.correlationId;
    }

    /**
     * Application specific label.
     * 
     */
    @InputImport(name="label")
    private final @Nullable Input<String> label;

    public Input<String> getLabel() {
        return this.label == null ? Input.empty() : this.label;
    }

    /**
     * Identifier of the message.
     * 
     */
    @InputImport(name="messageId")
    private final @Nullable Input<String> messageId;

    public Input<String> getMessageId() {
        return this.messageId == null ? Input.empty() : this.messageId;
    }

    /**
     * dictionary object for custom filters
     * 
     */
    @InputImport(name="properties")
    private final @Nullable Input<Map<String,String>> properties;

    public Input<Map<String,String>> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * Address of the queue to reply to.
     * 
     */
    @InputImport(name="replyTo")
    private final @Nullable Input<String> replyTo;

    public Input<String> getReplyTo() {
        return this.replyTo == null ? Input.empty() : this.replyTo;
    }

    /**
     * Session identifier to reply to.
     * 
     */
    @InputImport(name="replyToSessionId")
    private final @Nullable Input<String> replyToSessionId;

    public Input<String> getReplyToSessionId() {
        return this.replyToSessionId == null ? Input.empty() : this.replyToSessionId;
    }

    /**
     * Value that indicates whether the rule action requires preprocessing.
     * 
     */
    @InputImport(name="requiresPreprocessing")
    private final @Nullable Input<Boolean> requiresPreprocessing;

    public Input<Boolean> getRequiresPreprocessing() {
        return this.requiresPreprocessing == null ? Input.empty() : this.requiresPreprocessing;
    }

    /**
     * Session identifier.
     * 
     */
    @InputImport(name="sessionId")
    private final @Nullable Input<String> sessionId;

    public Input<String> getSessionId() {
        return this.sessionId == null ? Input.empty() : this.sessionId;
    }

    /**
     * Address to send to.
     * 
     */
    @InputImport(name="to")
    private final @Nullable Input<String> to;

    public Input<String> getTo() {
        return this.to == null ? Input.empty() : this.to;
    }

    public CorrelationFilterArgs(
        @Nullable Input<String> contentType,
        @Nullable Input<String> correlationId,
        @Nullable Input<String> label,
        @Nullable Input<String> messageId,
        @Nullable Input<Map<String,String>> properties,
        @Nullable Input<String> replyTo,
        @Nullable Input<String> replyToSessionId,
        @Nullable Input<Boolean> requiresPreprocessing,
        @Nullable Input<String> sessionId,
        @Nullable Input<String> to) {
        this.contentType = contentType;
        this.correlationId = correlationId;
        this.label = label;
        this.messageId = messageId;
        this.properties = properties;
        this.replyTo = replyTo;
        this.replyToSessionId = replyToSessionId;
        this.requiresPreprocessing = requiresPreprocessing == null ? Input.ofNullable(true) : requiresPreprocessing;
        this.sessionId = sessionId;
        this.to = to;
    }

    private CorrelationFilterArgs() {
        this.contentType = Input.empty();
        this.correlationId = Input.empty();
        this.label = Input.empty();
        this.messageId = Input.empty();
        this.properties = Input.empty();
        this.replyTo = Input.empty();
        this.replyToSessionId = Input.empty();
        this.requiresPreprocessing = Input.empty();
        this.sessionId = Input.empty();
        this.to = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CorrelationFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> contentType;
        private @Nullable Input<String> correlationId;
        private @Nullable Input<String> label;
        private @Nullable Input<String> messageId;
        private @Nullable Input<Map<String,String>> properties;
        private @Nullable Input<String> replyTo;
        private @Nullable Input<String> replyToSessionId;
        private @Nullable Input<Boolean> requiresPreprocessing;
        private @Nullable Input<String> sessionId;
        private @Nullable Input<String> to;

        public Builder() {
    	      // Empty
        }

        public Builder(CorrelationFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.correlationId = defaults.correlationId;
    	      this.label = defaults.label;
    	      this.messageId = defaults.messageId;
    	      this.properties = defaults.properties;
    	      this.replyTo = defaults.replyTo;
    	      this.replyToSessionId = defaults.replyToSessionId;
    	      this.requiresPreprocessing = defaults.requiresPreprocessing;
    	      this.sessionId = defaults.sessionId;
    	      this.to = defaults.to;
        }

        public Builder setContentType(@Nullable Input<String> contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder setContentType(@Nullable String contentType) {
            this.contentType = Input.ofNullable(contentType);
            return this;
        }

        public Builder setCorrelationId(@Nullable Input<String> correlationId) {
            this.correlationId = correlationId;
            return this;
        }

        public Builder setCorrelationId(@Nullable String correlationId) {
            this.correlationId = Input.ofNullable(correlationId);
            return this;
        }

        public Builder setLabel(@Nullable Input<String> label) {
            this.label = label;
            return this;
        }

        public Builder setLabel(@Nullable String label) {
            this.label = Input.ofNullable(label);
            return this;
        }

        public Builder setMessageId(@Nullable Input<String> messageId) {
            this.messageId = messageId;
            return this;
        }

        public Builder setMessageId(@Nullable String messageId) {
            this.messageId = Input.ofNullable(messageId);
            return this;
        }

        public Builder setProperties(@Nullable Input<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setReplyTo(@Nullable Input<String> replyTo) {
            this.replyTo = replyTo;
            return this;
        }

        public Builder setReplyTo(@Nullable String replyTo) {
            this.replyTo = Input.ofNullable(replyTo);
            return this;
        }

        public Builder setReplyToSessionId(@Nullable Input<String> replyToSessionId) {
            this.replyToSessionId = replyToSessionId;
            return this;
        }

        public Builder setReplyToSessionId(@Nullable String replyToSessionId) {
            this.replyToSessionId = Input.ofNullable(replyToSessionId);
            return this;
        }

        public Builder setRequiresPreprocessing(@Nullable Input<Boolean> requiresPreprocessing) {
            this.requiresPreprocessing = requiresPreprocessing;
            return this;
        }

        public Builder setRequiresPreprocessing(@Nullable Boolean requiresPreprocessing) {
            this.requiresPreprocessing = Input.ofNullable(requiresPreprocessing);
            return this;
        }

        public Builder setSessionId(@Nullable Input<String> sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        public Builder setSessionId(@Nullable String sessionId) {
            this.sessionId = Input.ofNullable(sessionId);
            return this;
        }

        public Builder setTo(@Nullable Input<String> to) {
            this.to = to;
            return this;
        }

        public Builder setTo(@Nullable String to) {
            this.to = Input.ofNullable(to);
            return this;
        }

        public CorrelationFilterArgs build() {
            return new CorrelationFilterArgs(contentType, correlationId, label, messageId, properties, replyTo, replyToSessionId, requiresPreprocessing, sessionId, to);
        }
    }
}
