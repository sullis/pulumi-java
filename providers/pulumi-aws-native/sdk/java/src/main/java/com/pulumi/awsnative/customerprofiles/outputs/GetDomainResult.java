// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.customerprofiles.outputs;

import com.pulumi.awsnative.customerprofiles.outputs.DomainTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDomainResult {
    /**
     * @return The time of this integration got created
     * 
     */
    private final @Nullable String createdAt;
    /**
     * @return The URL of the SQS dead letter queue
     * 
     */
    private final @Nullable String deadLetterQueueUrl;
    /**
     * @return The default encryption key
     * 
     */
    private final @Nullable String defaultEncryptionKey;
    /**
     * @return The default number of days until the data within the domain expires.
     * 
     */
    private final @Nullable Integer defaultExpirationDays;
    /**
     * @return The time of this integration got last updated at
     * 
     */
    private final @Nullable String lastUpdatedAt;
    /**
     * @return The tags (keys and values) associated with the domain
     * 
     */
    private final @Nullable List<DomainTag> tags;

    @CustomType.Constructor
    private GetDomainResult(
        @CustomType.Parameter("createdAt") @Nullable String createdAt,
        @CustomType.Parameter("deadLetterQueueUrl") @Nullable String deadLetterQueueUrl,
        @CustomType.Parameter("defaultEncryptionKey") @Nullable String defaultEncryptionKey,
        @CustomType.Parameter("defaultExpirationDays") @Nullable Integer defaultExpirationDays,
        @CustomType.Parameter("lastUpdatedAt") @Nullable String lastUpdatedAt,
        @CustomType.Parameter("tags") @Nullable List<DomainTag> tags) {
        this.createdAt = createdAt;
        this.deadLetterQueueUrl = deadLetterQueueUrl;
        this.defaultEncryptionKey = defaultEncryptionKey;
        this.defaultExpirationDays = defaultExpirationDays;
        this.lastUpdatedAt = lastUpdatedAt;
        this.tags = tags;
    }

    /**
     * @return The time of this integration got created
     * 
     */
    public Optional<String> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }
    /**
     * @return The URL of the SQS dead letter queue
     * 
     */
    public Optional<String> deadLetterQueueUrl() {
        return Optional.ofNullable(this.deadLetterQueueUrl);
    }
    /**
     * @return The default encryption key
     * 
     */
    public Optional<String> defaultEncryptionKey() {
        return Optional.ofNullable(this.defaultEncryptionKey);
    }
    /**
     * @return The default number of days until the data within the domain expires.
     * 
     */
    public Optional<Integer> defaultExpirationDays() {
        return Optional.ofNullable(this.defaultExpirationDays);
    }
    /**
     * @return The time of this integration got last updated at
     * 
     */
    public Optional<String> lastUpdatedAt() {
        return Optional.ofNullable(this.lastUpdatedAt);
    }
    /**
     * @return The tags (keys and values) associated with the domain
     * 
     */
    public List<DomainTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String createdAt;
        private @Nullable String deadLetterQueueUrl;
        private @Nullable String defaultEncryptionKey;
        private @Nullable Integer defaultExpirationDays;
        private @Nullable String lastUpdatedAt;
        private @Nullable List<DomainTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.deadLetterQueueUrl = defaults.deadLetterQueueUrl;
    	      this.defaultEncryptionKey = defaults.defaultEncryptionKey;
    	      this.defaultExpirationDays = defaults.defaultExpirationDays;
    	      this.lastUpdatedAt = defaults.lastUpdatedAt;
    	      this.tags = defaults.tags;
        }

        public Builder createdAt(@Nullable String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Builder deadLetterQueueUrl(@Nullable String deadLetterQueueUrl) {
            this.deadLetterQueueUrl = deadLetterQueueUrl;
            return this;
        }
        public Builder defaultEncryptionKey(@Nullable String defaultEncryptionKey) {
            this.defaultEncryptionKey = defaultEncryptionKey;
            return this;
        }
        public Builder defaultExpirationDays(@Nullable Integer defaultExpirationDays) {
            this.defaultExpirationDays = defaultExpirationDays;
            return this;
        }
        public Builder lastUpdatedAt(@Nullable String lastUpdatedAt) {
            this.lastUpdatedAt = lastUpdatedAt;
            return this;
        }
        public Builder tags(@Nullable List<DomainTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(DomainTag... tags) {
            return tags(List.of(tags));
        }        public GetDomainResult build() {
            return new GetDomainResult(createdAt, deadLetterQueueUrl, defaultEncryptionKey, defaultExpirationDays, lastUpdatedAt, tags);
        }
    }
}
