// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.redshift;

import io.pulumi.awsnative.redshift.enums.EventSubscriptionEventCategoriesItem;
import io.pulumi.awsnative.redshift.enums.EventSubscriptionSeverity;
import io.pulumi.awsnative.redshift.enums.EventSubscriptionSourceType;
import io.pulumi.awsnative.redshift.inputs.EventSubscriptionTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventSubscriptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventSubscriptionArgs Empty = new EventSubscriptionArgs();

    /**
     * A boolean value; set to true to activate the subscription, and set to false to create the subscription but not activate it.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    /**
     * Specifies the Amazon Redshift event categories to be published by the event notification subscription.
     * 
     */
    @Import(name="eventCategories")
      private final @Nullable Output<List<EventSubscriptionEventCategoriesItem>> eventCategories;

    public Output<List<EventSubscriptionEventCategoriesItem>> eventCategories() {
        return this.eventCategories == null ? Codegen.empty() : this.eventCategories;
    }

    /**
     * Specifies the Amazon Redshift event severity to be published by the event notification subscription.
     * 
     */
    @Import(name="severity")
      private final @Nullable Output<EventSubscriptionSeverity> severity;

    public Output<EventSubscriptionSeverity> severity() {
        return this.severity == null ? Codegen.empty() : this.severity;
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic used to transmit the event notifications.
     * 
     */
    @Import(name="snsTopicArn")
      private final @Nullable Output<String> snsTopicArn;

    public Output<String> snsTopicArn() {
        return this.snsTopicArn == null ? Codegen.empty() : this.snsTopicArn;
    }

    /**
     * A list of one or more identifiers of Amazon Redshift source objects.
     * 
     */
    @Import(name="sourceIds")
      private final @Nullable Output<List<String>> sourceIds;

    public Output<List<String>> sourceIds() {
        return this.sourceIds == null ? Codegen.empty() : this.sourceIds;
    }

    /**
     * The type of source that will be generating the events.
     * 
     */
    @Import(name="sourceType")
      private final @Nullable Output<EventSubscriptionSourceType> sourceType;

    public Output<EventSubscriptionSourceType> sourceType() {
        return this.sourceType == null ? Codegen.empty() : this.sourceType;
    }

    /**
     * The name of the Amazon Redshift event notification subscription
     * 
     */
    @Import(name="subscriptionName", required=true)
      private final Output<String> subscriptionName;

    public Output<String> subscriptionName() {
        return this.subscriptionName;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<EventSubscriptionTagArgs>> tags;

    public Output<List<EventSubscriptionTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public EventSubscriptionArgs(
        @Nullable Output<Boolean> enabled,
        @Nullable Output<List<EventSubscriptionEventCategoriesItem>> eventCategories,
        @Nullable Output<EventSubscriptionSeverity> severity,
        @Nullable Output<String> snsTopicArn,
        @Nullable Output<List<String>> sourceIds,
        @Nullable Output<EventSubscriptionSourceType> sourceType,
        Output<String> subscriptionName,
        @Nullable Output<List<EventSubscriptionTagArgs>> tags) {
        this.enabled = enabled;
        this.eventCategories = eventCategories;
        this.severity = severity;
        this.snsTopicArn = snsTopicArn;
        this.sourceIds = sourceIds;
        this.sourceType = sourceType;
        this.subscriptionName = Objects.requireNonNull(subscriptionName, "expected parameter 'subscriptionName' to be non-null");
        this.tags = tags;
    }

    private EventSubscriptionArgs() {
        this.enabled = Codegen.empty();
        this.eventCategories = Codegen.empty();
        this.severity = Codegen.empty();
        this.snsTopicArn = Codegen.empty();
        this.sourceIds = Codegen.empty();
        this.sourceType = Codegen.empty();
        this.subscriptionName = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<List<EventSubscriptionEventCategoriesItem>> eventCategories;
        private @Nullable Output<EventSubscriptionSeverity> severity;
        private @Nullable Output<String> snsTopicArn;
        private @Nullable Output<List<String>> sourceIds;
        private @Nullable Output<EventSubscriptionSourceType> sourceType;
        private Output<String> subscriptionName;
        private @Nullable Output<List<EventSubscriptionTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSubscriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.eventCategories = defaults.eventCategories;
    	      this.severity = defaults.severity;
    	      this.snsTopicArn = defaults.snsTopicArn;
    	      this.sourceIds = defaults.sourceIds;
    	      this.sourceType = defaults.sourceType;
    	      this.subscriptionName = defaults.subscriptionName;
    	      this.tags = defaults.tags;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }
        public Builder eventCategories(@Nullable Output<List<EventSubscriptionEventCategoriesItem>> eventCategories) {
            this.eventCategories = eventCategories;
            return this;
        }
        public Builder eventCategories(@Nullable List<EventSubscriptionEventCategoriesItem> eventCategories) {
            this.eventCategories = Codegen.ofNullable(eventCategories);
            return this;
        }
        public Builder eventCategories(EventSubscriptionEventCategoriesItem... eventCategories) {
            return eventCategories(List.of(eventCategories));
        }
        public Builder severity(@Nullable Output<EventSubscriptionSeverity> severity) {
            this.severity = severity;
            return this;
        }
        public Builder severity(@Nullable EventSubscriptionSeverity severity) {
            this.severity = Codegen.ofNullable(severity);
            return this;
        }
        public Builder snsTopicArn(@Nullable Output<String> snsTopicArn) {
            this.snsTopicArn = snsTopicArn;
            return this;
        }
        public Builder snsTopicArn(@Nullable String snsTopicArn) {
            this.snsTopicArn = Codegen.ofNullable(snsTopicArn);
            return this;
        }
        public Builder sourceIds(@Nullable Output<List<String>> sourceIds) {
            this.sourceIds = sourceIds;
            return this;
        }
        public Builder sourceIds(@Nullable List<String> sourceIds) {
            this.sourceIds = Codegen.ofNullable(sourceIds);
            return this;
        }
        public Builder sourceIds(String... sourceIds) {
            return sourceIds(List.of(sourceIds));
        }
        public Builder sourceType(@Nullable Output<EventSubscriptionSourceType> sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public Builder sourceType(@Nullable EventSubscriptionSourceType sourceType) {
            this.sourceType = Codegen.ofNullable(sourceType);
            return this;
        }
        public Builder subscriptionName(Output<String> subscriptionName) {
            this.subscriptionName = Objects.requireNonNull(subscriptionName);
            return this;
        }
        public Builder subscriptionName(String subscriptionName) {
            this.subscriptionName = Output.of(Objects.requireNonNull(subscriptionName));
            return this;
        }
        public Builder tags(@Nullable Output<List<EventSubscriptionTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<EventSubscriptionTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(EventSubscriptionTagArgs... tags) {
            return tags(List.of(tags));
        }        public EventSubscriptionArgs build() {
            return new EventSubscriptionArgs(enabled, eventCategories, severity, snsTopicArn, sourceIds, sourceType, subscriptionName, tags);
        }
    }
}
