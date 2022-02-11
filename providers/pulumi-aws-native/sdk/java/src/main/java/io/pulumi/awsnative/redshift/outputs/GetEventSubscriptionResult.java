// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.redshift.outputs;

import io.pulumi.awsnative.redshift.enums.EventSubscriptionEventCategoriesItem;
import io.pulumi.awsnative.redshift.enums.EventSubscriptionSeverity;
import io.pulumi.awsnative.redshift.enums.EventSubscriptionSourceType;
import io.pulumi.awsnative.redshift.enums.EventSubscriptionStatus;
import io.pulumi.awsnative.redshift.outputs.EventSubscriptionTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetEventSubscriptionResult {
    private final @Nullable String custSubscriptionId;
    private final @Nullable String customerAwsId;
    private final @Nullable Boolean enabled;
    private final @Nullable List<EventSubscriptionEventCategoriesItem> eventCategories;
    private final @Nullable List<String> eventCategoriesList;
    private final @Nullable EventSubscriptionSeverity severity;
    private final @Nullable String snsTopicArn;
    private final @Nullable List<String> sourceIds;
    private final @Nullable List<String> sourceIdsList;
    private final @Nullable EventSubscriptionSourceType sourceType;
    private final @Nullable EventSubscriptionStatus status;
    private final @Nullable String subscriptionCreationTime;
    private final @Nullable List<EventSubscriptionTag> tags;

    @OutputCustomType.Constructor({"custSubscriptionId","customerAwsId","enabled","eventCategories","eventCategoriesList","severity","snsTopicArn","sourceIds","sourceIdsList","sourceType","status","subscriptionCreationTime","tags"})
    private GetEventSubscriptionResult(
        @Nullable String custSubscriptionId,
        @Nullable String customerAwsId,
        @Nullable Boolean enabled,
        @Nullable List<EventSubscriptionEventCategoriesItem> eventCategories,
        @Nullable List<String> eventCategoriesList,
        @Nullable EventSubscriptionSeverity severity,
        @Nullable String snsTopicArn,
        @Nullable List<String> sourceIds,
        @Nullable List<String> sourceIdsList,
        @Nullable EventSubscriptionSourceType sourceType,
        @Nullable EventSubscriptionStatus status,
        @Nullable String subscriptionCreationTime,
        @Nullable List<EventSubscriptionTag> tags) {
        this.custSubscriptionId = custSubscriptionId;
        this.customerAwsId = customerAwsId;
        this.enabled = enabled;
        this.eventCategories = eventCategories;
        this.eventCategoriesList = eventCategoriesList;
        this.severity = severity;
        this.snsTopicArn = snsTopicArn;
        this.sourceIds = sourceIds;
        this.sourceIdsList = sourceIdsList;
        this.sourceType = sourceType;
        this.status = status;
        this.subscriptionCreationTime = subscriptionCreationTime;
        this.tags = tags;
    }

    public Optional<String> getCustSubscriptionId() {
        return Optional.ofNullable(this.custSubscriptionId);
    }
    public Optional<String> getCustomerAwsId() {
        return Optional.ofNullable(this.customerAwsId);
    }
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    public List<EventSubscriptionEventCategoriesItem> getEventCategories() {
        return this.eventCategories == null ? List.of() : this.eventCategories;
    }
    public List<String> getEventCategoriesList() {
        return this.eventCategoriesList == null ? List.of() : this.eventCategoriesList;
    }
    public Optional<EventSubscriptionSeverity> getSeverity() {
        return Optional.ofNullable(this.severity);
    }
    public Optional<String> getSnsTopicArn() {
        return Optional.ofNullable(this.snsTopicArn);
    }
    public List<String> getSourceIds() {
        return this.sourceIds == null ? List.of() : this.sourceIds;
    }
    public List<String> getSourceIdsList() {
        return this.sourceIdsList == null ? List.of() : this.sourceIdsList;
    }
    public Optional<EventSubscriptionSourceType> getSourceType() {
        return Optional.ofNullable(this.sourceType);
    }
    public Optional<EventSubscriptionStatus> getStatus() {
        return Optional.ofNullable(this.status);
    }
    public Optional<String> getSubscriptionCreationTime() {
        return Optional.ofNullable(this.subscriptionCreationTime);
    }
    public List<EventSubscriptionTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEventSubscriptionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String custSubscriptionId;
        private @Nullable String customerAwsId;
        private @Nullable Boolean enabled;
        private @Nullable List<EventSubscriptionEventCategoriesItem> eventCategories;
        private @Nullable List<String> eventCategoriesList;
        private @Nullable EventSubscriptionSeverity severity;
        private @Nullable String snsTopicArn;
        private @Nullable List<String> sourceIds;
        private @Nullable List<String> sourceIdsList;
        private @Nullable EventSubscriptionSourceType sourceType;
        private @Nullable EventSubscriptionStatus status;
        private @Nullable String subscriptionCreationTime;
        private @Nullable List<EventSubscriptionTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEventSubscriptionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.custSubscriptionId = defaults.custSubscriptionId;
    	      this.customerAwsId = defaults.customerAwsId;
    	      this.enabled = defaults.enabled;
    	      this.eventCategories = defaults.eventCategories;
    	      this.eventCategoriesList = defaults.eventCategoriesList;
    	      this.severity = defaults.severity;
    	      this.snsTopicArn = defaults.snsTopicArn;
    	      this.sourceIds = defaults.sourceIds;
    	      this.sourceIdsList = defaults.sourceIdsList;
    	      this.sourceType = defaults.sourceType;
    	      this.status = defaults.status;
    	      this.subscriptionCreationTime = defaults.subscriptionCreationTime;
    	      this.tags = defaults.tags;
        }

        public Builder setCustSubscriptionId(@Nullable String custSubscriptionId) {
            this.custSubscriptionId = custSubscriptionId;
            return this;
        }

        public Builder setCustomerAwsId(@Nullable String customerAwsId) {
            this.customerAwsId = customerAwsId;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEventCategories(@Nullable List<EventSubscriptionEventCategoriesItem> eventCategories) {
            this.eventCategories = eventCategories;
            return this;
        }

        public Builder setEventCategoriesList(@Nullable List<String> eventCategoriesList) {
            this.eventCategoriesList = eventCategoriesList;
            return this;
        }

        public Builder setSeverity(@Nullable EventSubscriptionSeverity severity) {
            this.severity = severity;
            return this;
        }

        public Builder setSnsTopicArn(@Nullable String snsTopicArn) {
            this.snsTopicArn = snsTopicArn;
            return this;
        }

        public Builder setSourceIds(@Nullable List<String> sourceIds) {
            this.sourceIds = sourceIds;
            return this;
        }

        public Builder setSourceIdsList(@Nullable List<String> sourceIdsList) {
            this.sourceIdsList = sourceIdsList;
            return this;
        }

        public Builder setSourceType(@Nullable EventSubscriptionSourceType sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        public Builder setStatus(@Nullable EventSubscriptionStatus status) {
            this.status = status;
            return this;
        }

        public Builder setSubscriptionCreationTime(@Nullable String subscriptionCreationTime) {
            this.subscriptionCreationTime = subscriptionCreationTime;
            return this;
        }

        public Builder setTags(@Nullable List<EventSubscriptionTag> tags) {
            this.tags = tags;
            return this;
        }

        public GetEventSubscriptionResult build() {
            return new GetEventSubscriptionResult(custSubscriptionId, customerAwsId, enabled, eventCategories, eventCategoriesList, severity, snsTopicArn, sourceIds, sourceIdsList, sourceType, status, subscriptionCreationTime, tags);
        }
    }
}
