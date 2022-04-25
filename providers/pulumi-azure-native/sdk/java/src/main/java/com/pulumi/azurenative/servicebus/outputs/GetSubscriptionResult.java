// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicebus.outputs;

import com.pulumi.azurenative.servicebus.outputs.MessageCountDetailsResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSubscriptionResult {
    /**
     * @return Last time there was a receive request to this subscription.
     * 
     */
    private final String accessedAt;
    /**
     * @return ISO 8061 timeSpan idle interval after which the topic is automatically deleted. The minimum duration is 5 minutes.
     * 
     */
    private final @Nullable String autoDeleteOnIdle;
    /**
     * @return Message count details
     * 
     */
    private final MessageCountDetailsResponse countDetails;
    /**
     * @return Exact time the message was created.
     * 
     */
    private final String createdAt;
    /**
     * @return Value that indicates whether a subscription has dead letter support on filter evaluation exceptions.
     * 
     */
    private final @Nullable Boolean deadLetteringOnFilterEvaluationExceptions;
    /**
     * @return Value that indicates whether a subscription has dead letter support when a message expires.
     * 
     */
    private final @Nullable Boolean deadLetteringOnMessageExpiration;
    /**
     * @return ISO 8061 Default message timespan to live value. This is the duration after which the message expires, starting from when the message is sent to Service Bus. This is the default value used when TimeToLive is not set on a message itself.
     * 
     */
    private final @Nullable String defaultMessageTimeToLive;
    /**
     * @return ISO 8601 timeSpan structure that defines the duration of the duplicate detection history. The default value is 10 minutes.
     * 
     */
    private final @Nullable String duplicateDetectionHistoryTimeWindow;
    /**
     * @return Value that indicates whether server-side batched operations are enabled.
     * 
     */
    private final @Nullable Boolean enableBatchedOperations;
    /**
     * @return Queue/Topic name to forward the Dead Letter message
     * 
     */
    private final @Nullable String forwardDeadLetteredMessagesTo;
    /**
     * @return Queue/Topic name to forward the messages
     * 
     */
    private final @Nullable String forwardTo;
    /**
     * @return Resource Id
     * 
     */
    private final String id;
    /**
     * @return ISO 8061 lock duration timespan for the subscription. The default value is 1 minute.
     * 
     */
    private final @Nullable String lockDuration;
    /**
     * @return Number of maximum deliveries.
     * 
     */
    private final @Nullable Integer maxDeliveryCount;
    /**
     * @return Number of messages.
     * 
     */
    private final Double messageCount;
    /**
     * @return Resource name
     * 
     */
    private final String name;
    /**
     * @return Value indicating if a subscription supports the concept of sessions.
     * 
     */
    private final @Nullable Boolean requiresSession;
    /**
     * @return Enumerates the possible values for the status of a messaging entity.
     * 
     */
    private final @Nullable String status;
    /**
     * @return Resource type
     * 
     */
    private final String type;
    /**
     * @return The exact time the message was updated.
     * 
     */
    private final String updatedAt;

    @CustomType.Constructor
    private GetSubscriptionResult(
        @CustomType.Parameter("accessedAt") String accessedAt,
        @CustomType.Parameter("autoDeleteOnIdle") @Nullable String autoDeleteOnIdle,
        @CustomType.Parameter("countDetails") MessageCountDetailsResponse countDetails,
        @CustomType.Parameter("createdAt") String createdAt,
        @CustomType.Parameter("deadLetteringOnFilterEvaluationExceptions") @Nullable Boolean deadLetteringOnFilterEvaluationExceptions,
        @CustomType.Parameter("deadLetteringOnMessageExpiration") @Nullable Boolean deadLetteringOnMessageExpiration,
        @CustomType.Parameter("defaultMessageTimeToLive") @Nullable String defaultMessageTimeToLive,
        @CustomType.Parameter("duplicateDetectionHistoryTimeWindow") @Nullable String duplicateDetectionHistoryTimeWindow,
        @CustomType.Parameter("enableBatchedOperations") @Nullable Boolean enableBatchedOperations,
        @CustomType.Parameter("forwardDeadLetteredMessagesTo") @Nullable String forwardDeadLetteredMessagesTo,
        @CustomType.Parameter("forwardTo") @Nullable String forwardTo,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("lockDuration") @Nullable String lockDuration,
        @CustomType.Parameter("maxDeliveryCount") @Nullable Integer maxDeliveryCount,
        @CustomType.Parameter("messageCount") Double messageCount,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("requiresSession") @Nullable Boolean requiresSession,
        @CustomType.Parameter("status") @Nullable String status,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("updatedAt") String updatedAt) {
        this.accessedAt = accessedAt;
        this.autoDeleteOnIdle = autoDeleteOnIdle;
        this.countDetails = countDetails;
        this.createdAt = createdAt;
        this.deadLetteringOnFilterEvaluationExceptions = deadLetteringOnFilterEvaluationExceptions;
        this.deadLetteringOnMessageExpiration = deadLetteringOnMessageExpiration;
        this.defaultMessageTimeToLive = defaultMessageTimeToLive;
        this.duplicateDetectionHistoryTimeWindow = duplicateDetectionHistoryTimeWindow;
        this.enableBatchedOperations = enableBatchedOperations;
        this.forwardDeadLetteredMessagesTo = forwardDeadLetteredMessagesTo;
        this.forwardTo = forwardTo;
        this.id = id;
        this.lockDuration = lockDuration;
        this.maxDeliveryCount = maxDeliveryCount;
        this.messageCount = messageCount;
        this.name = name;
        this.requiresSession = requiresSession;
        this.status = status;
        this.type = type;
        this.updatedAt = updatedAt;
    }

    /**
     * @return Last time there was a receive request to this subscription.
     * 
     */
    public String accessedAt() {
        return this.accessedAt;
    }
    /**
     * @return ISO 8061 timeSpan idle interval after which the topic is automatically deleted. The minimum duration is 5 minutes.
     * 
     */
    public Optional<String> autoDeleteOnIdle() {
        return Optional.ofNullable(this.autoDeleteOnIdle);
    }
    /**
     * @return Message count details
     * 
     */
    public MessageCountDetailsResponse countDetails() {
        return this.countDetails;
    }
    /**
     * @return Exact time the message was created.
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * @return Value that indicates whether a subscription has dead letter support on filter evaluation exceptions.
     * 
     */
    public Optional<Boolean> deadLetteringOnFilterEvaluationExceptions() {
        return Optional.ofNullable(this.deadLetteringOnFilterEvaluationExceptions);
    }
    /**
     * @return Value that indicates whether a subscription has dead letter support when a message expires.
     * 
     */
    public Optional<Boolean> deadLetteringOnMessageExpiration() {
        return Optional.ofNullable(this.deadLetteringOnMessageExpiration);
    }
    /**
     * @return ISO 8061 Default message timespan to live value. This is the duration after which the message expires, starting from when the message is sent to Service Bus. This is the default value used when TimeToLive is not set on a message itself.
     * 
     */
    public Optional<String> defaultMessageTimeToLive() {
        return Optional.ofNullable(this.defaultMessageTimeToLive);
    }
    /**
     * @return ISO 8601 timeSpan structure that defines the duration of the duplicate detection history. The default value is 10 minutes.
     * 
     */
    public Optional<String> duplicateDetectionHistoryTimeWindow() {
        return Optional.ofNullable(this.duplicateDetectionHistoryTimeWindow);
    }
    /**
     * @return Value that indicates whether server-side batched operations are enabled.
     * 
     */
    public Optional<Boolean> enableBatchedOperations() {
        return Optional.ofNullable(this.enableBatchedOperations);
    }
    /**
     * @return Queue/Topic name to forward the Dead Letter message
     * 
     */
    public Optional<String> forwardDeadLetteredMessagesTo() {
        return Optional.ofNullable(this.forwardDeadLetteredMessagesTo);
    }
    /**
     * @return Queue/Topic name to forward the messages
     * 
     */
    public Optional<String> forwardTo() {
        return Optional.ofNullable(this.forwardTo);
    }
    /**
     * @return Resource Id
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return ISO 8061 lock duration timespan for the subscription. The default value is 1 minute.
     * 
     */
    public Optional<String> lockDuration() {
        return Optional.ofNullable(this.lockDuration);
    }
    /**
     * @return Number of maximum deliveries.
     * 
     */
    public Optional<Integer> maxDeliveryCount() {
        return Optional.ofNullable(this.maxDeliveryCount);
    }
    /**
     * @return Number of messages.
     * 
     */
    public Double messageCount() {
        return this.messageCount;
    }
    /**
     * @return Resource name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Value indicating if a subscription supports the concept of sessions.
     * 
     */
    public Optional<Boolean> requiresSession() {
        return Optional.ofNullable(this.requiresSession);
    }
    /**
     * @return Enumerates the possible values for the status of a messaging entity.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return Resource type
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The exact time the message was updated.
     * 
     */
    public String updatedAt() {
        return this.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubscriptionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessedAt;
        private @Nullable String autoDeleteOnIdle;
        private MessageCountDetailsResponse countDetails;
        private String createdAt;
        private @Nullable Boolean deadLetteringOnFilterEvaluationExceptions;
        private @Nullable Boolean deadLetteringOnMessageExpiration;
        private @Nullable String defaultMessageTimeToLive;
        private @Nullable String duplicateDetectionHistoryTimeWindow;
        private @Nullable Boolean enableBatchedOperations;
        private @Nullable String forwardDeadLetteredMessagesTo;
        private @Nullable String forwardTo;
        private String id;
        private @Nullable String lockDuration;
        private @Nullable Integer maxDeliveryCount;
        private Double messageCount;
        private String name;
        private @Nullable Boolean requiresSession;
        private @Nullable String status;
        private String type;
        private String updatedAt;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSubscriptionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessedAt = defaults.accessedAt;
    	      this.autoDeleteOnIdle = defaults.autoDeleteOnIdle;
    	      this.countDetails = defaults.countDetails;
    	      this.createdAt = defaults.createdAt;
    	      this.deadLetteringOnFilterEvaluationExceptions = defaults.deadLetteringOnFilterEvaluationExceptions;
    	      this.deadLetteringOnMessageExpiration = defaults.deadLetteringOnMessageExpiration;
    	      this.defaultMessageTimeToLive = defaults.defaultMessageTimeToLive;
    	      this.duplicateDetectionHistoryTimeWindow = defaults.duplicateDetectionHistoryTimeWindow;
    	      this.enableBatchedOperations = defaults.enableBatchedOperations;
    	      this.forwardDeadLetteredMessagesTo = defaults.forwardDeadLetteredMessagesTo;
    	      this.forwardTo = defaults.forwardTo;
    	      this.id = defaults.id;
    	      this.lockDuration = defaults.lockDuration;
    	      this.maxDeliveryCount = defaults.maxDeliveryCount;
    	      this.messageCount = defaults.messageCount;
    	      this.name = defaults.name;
    	      this.requiresSession = defaults.requiresSession;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
    	      this.updatedAt = defaults.updatedAt;
        }

        public Builder accessedAt(String accessedAt) {
            this.accessedAt = Objects.requireNonNull(accessedAt);
            return this;
        }
        public Builder autoDeleteOnIdle(@Nullable String autoDeleteOnIdle) {
            this.autoDeleteOnIdle = autoDeleteOnIdle;
            return this;
        }
        public Builder countDetails(MessageCountDetailsResponse countDetails) {
            this.countDetails = Objects.requireNonNull(countDetails);
            return this;
        }
        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        public Builder deadLetteringOnFilterEvaluationExceptions(@Nullable Boolean deadLetteringOnFilterEvaluationExceptions) {
            this.deadLetteringOnFilterEvaluationExceptions = deadLetteringOnFilterEvaluationExceptions;
            return this;
        }
        public Builder deadLetteringOnMessageExpiration(@Nullable Boolean deadLetteringOnMessageExpiration) {
            this.deadLetteringOnMessageExpiration = deadLetteringOnMessageExpiration;
            return this;
        }
        public Builder defaultMessageTimeToLive(@Nullable String defaultMessageTimeToLive) {
            this.defaultMessageTimeToLive = defaultMessageTimeToLive;
            return this;
        }
        public Builder duplicateDetectionHistoryTimeWindow(@Nullable String duplicateDetectionHistoryTimeWindow) {
            this.duplicateDetectionHistoryTimeWindow = duplicateDetectionHistoryTimeWindow;
            return this;
        }
        public Builder enableBatchedOperations(@Nullable Boolean enableBatchedOperations) {
            this.enableBatchedOperations = enableBatchedOperations;
            return this;
        }
        public Builder forwardDeadLetteredMessagesTo(@Nullable String forwardDeadLetteredMessagesTo) {
            this.forwardDeadLetteredMessagesTo = forwardDeadLetteredMessagesTo;
            return this;
        }
        public Builder forwardTo(@Nullable String forwardTo) {
            this.forwardTo = forwardTo;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder lockDuration(@Nullable String lockDuration) {
            this.lockDuration = lockDuration;
            return this;
        }
        public Builder maxDeliveryCount(@Nullable Integer maxDeliveryCount) {
            this.maxDeliveryCount = maxDeliveryCount;
            return this;
        }
        public Builder messageCount(Double messageCount) {
            this.messageCount = Objects.requireNonNull(messageCount);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder requiresSession(@Nullable Boolean requiresSession) {
            this.requiresSession = requiresSession;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = Objects.requireNonNull(updatedAt);
            return this;
        }        public GetSubscriptionResult build() {
            return new GetSubscriptionResult(accessedAt, autoDeleteOnIdle, countDetails, createdAt, deadLetteringOnFilterEvaluationExceptions, deadLetteringOnMessageExpiration, defaultMessageTimeToLive, duplicateDetectionHistoryTimeWindow, enableBatchedOperations, forwardDeadLetteredMessagesTo, forwardTo, id, lockDuration, maxDeliveryCount, messageCount, name, requiresSession, status, type, updatedAt);
        }
    }
}
