// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles.outputs;

import io.pulumi.awsnative.customerprofiles.outputs.DomainTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDomainResult {
    /**
     * The time of this integration got created
     * 
     */
    private final @Nullable String createdAt;
    /**
     * The URL of the SQS dead letter queue
     * 
     */
    private final @Nullable String deadLetterQueueUrl;
    /**
     * The default encryption key
     * 
     */
    private final @Nullable String defaultEncryptionKey;
    /**
     * The default number of days until the data within the domain expires.
     * 
     */
    private final @Nullable Integer defaultExpirationDays;
    /**
     * The time of this integration got last updated at
     * 
     */
    private final @Nullable String lastUpdatedAt;
    /**
     * The tags (keys and values) associated with the domain
     * 
     */
    private final @Nullable List<DomainTag> tags;

    @OutputCustomType.Constructor({"createdAt","deadLetterQueueUrl","defaultEncryptionKey","defaultExpirationDays","lastUpdatedAt","tags"})
    private GetDomainResult(
        @Nullable String createdAt,
        @Nullable String deadLetterQueueUrl,
        @Nullable String defaultEncryptionKey,
        @Nullable Integer defaultExpirationDays,
        @Nullable String lastUpdatedAt,
        @Nullable List<DomainTag> tags) {
        this.createdAt = createdAt;
        this.deadLetterQueueUrl = deadLetterQueueUrl;
        this.defaultEncryptionKey = defaultEncryptionKey;
        this.defaultExpirationDays = defaultExpirationDays;
        this.lastUpdatedAt = lastUpdatedAt;
        this.tags = tags;
    }

    /**
     * The time of this integration got created
     * 
     */
    public Optional<String> getCreatedAt() {
        return Optional.ofNullable(this.createdAt);
    }
    /**
     * The URL of the SQS dead letter queue
     * 
     */
    public Optional<String> getDeadLetterQueueUrl() {
        return Optional.ofNullable(this.deadLetterQueueUrl);
    }
    /**
     * The default encryption key
     * 
     */
    public Optional<String> getDefaultEncryptionKey() {
        return Optional.ofNullable(this.defaultEncryptionKey);
    }
    /**
     * The default number of days until the data within the domain expires.
     * 
     */
    public Optional<Integer> getDefaultExpirationDays() {
        return Optional.ofNullable(this.defaultExpirationDays);
    }
    /**
     * The time of this integration got last updated at
     * 
     */
    public Optional<String> getLastUpdatedAt() {
        return Optional.ofNullable(this.lastUpdatedAt);
    }
    /**
     * The tags (keys and values) associated with the domain
     * 
     */
    public List<DomainTag> getTags() {
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

        public Builder setCreatedAt(@Nullable String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setDeadLetterQueueUrl(@Nullable String deadLetterQueueUrl) {
            this.deadLetterQueueUrl = deadLetterQueueUrl;
            return this;
        }

        public Builder setDefaultEncryptionKey(@Nullable String defaultEncryptionKey) {
            this.defaultEncryptionKey = defaultEncryptionKey;
            return this;
        }

        public Builder setDefaultExpirationDays(@Nullable Integer defaultExpirationDays) {
            this.defaultExpirationDays = defaultExpirationDays;
            return this;
        }

        public Builder setLastUpdatedAt(@Nullable String lastUpdatedAt) {
            this.lastUpdatedAt = lastUpdatedAt;
            return this;
        }

        public Builder setTags(@Nullable List<DomainTag> tags) {
            this.tags = tags;
            return this;
        }

        public GetDomainResult build() {
            return new GetDomainResult(createdAt, deadLetterQueueUrl, defaultEncryptionKey, defaultExpirationDays, lastUpdatedAt, tags);
        }
    }
}
