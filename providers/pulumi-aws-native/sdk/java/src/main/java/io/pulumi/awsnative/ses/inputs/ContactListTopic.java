// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ses.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContactListTopic extends io.pulumi.resources.InvokeArgs {

    public static final ContactListTopic Empty = new ContactListTopic();

    @InputImport(name="defaultSubscriptionStatus", required=true)
    private final String defaultSubscriptionStatus;

    public String getDefaultSubscriptionStatus() {
        return this.defaultSubscriptionStatus;
    }

    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    @InputImport(name="displayName", required=true)
    private final String displayName;

    public String getDisplayName() {
        return this.displayName;
    }

    @InputImport(name="topicName", required=true)
    private final String topicName;

    public String getTopicName() {
        return this.topicName;
    }

    public ContactListTopic(
        String defaultSubscriptionStatus,
        @Nullable String description,
        String displayName,
        String topicName) {
        this.defaultSubscriptionStatus = Objects.requireNonNull(defaultSubscriptionStatus, "expected parameter 'defaultSubscriptionStatus' to be non-null");
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.topicName = Objects.requireNonNull(topicName, "expected parameter 'topicName' to be non-null");
    }

    private ContactListTopic() {
        this.defaultSubscriptionStatus = null;
        this.description = null;
        this.displayName = null;
        this.topicName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactListTopic defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String defaultSubscriptionStatus;
        private @Nullable String description;
        private String displayName;
        private String topicName;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactListTopic defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultSubscriptionStatus = defaults.defaultSubscriptionStatus;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.topicName = defaults.topicName;
        }

        public Builder setDefaultSubscriptionStatus(String defaultSubscriptionStatus) {
            this.defaultSubscriptionStatus = Objects.requireNonNull(defaultSubscriptionStatus);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setTopicName(String topicName) {
            this.topicName = Objects.requireNonNull(topicName);
            return this;
        }

        public ContactListTopic build() {
            return new ContactListTopic(defaultSubscriptionStatus, description, displayName, topicName);
        }
    }
}
