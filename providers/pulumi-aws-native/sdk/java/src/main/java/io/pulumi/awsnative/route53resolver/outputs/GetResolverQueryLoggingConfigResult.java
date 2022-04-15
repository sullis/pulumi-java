// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53resolver.outputs;

import io.pulumi.awsnative.route53resolver.enums.ResolverQueryLoggingConfigShareStatus;
import io.pulumi.awsnative.route53resolver.enums.ResolverQueryLoggingConfigStatus;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetResolverQueryLoggingConfigResult {
    /**
     * Arn
     * 
     */
    private final @Nullable String arn;
    /**
     * Count
     * 
     */
    private final @Nullable Integer associationCount;
    /**
     * Rfc3339TimeString
     * 
     */
    private final @Nullable String creationTime;
    /**
     * The id of the creator request.
     * 
     */
    private final @Nullable String creatorRequestId;
    /**
     * ResourceId
     * 
     */
    private final @Nullable String id;
    /**
     * AccountId
     * 
     */
    private final @Nullable String ownerId;
    /**
     * ShareStatus, possible values are NOT_SHARED, SHARED_WITH_ME, SHARED_BY_ME.
     * 
     */
    private final @Nullable ResolverQueryLoggingConfigShareStatus shareStatus;
    /**
     * ResolverQueryLogConfigStatus, possible values are CREATING, CREATED, DELETED AND FAILED.
     * 
     */
    private final @Nullable ResolverQueryLoggingConfigStatus status;

    @CustomType.Constructor
    private GetResolverQueryLoggingConfigResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("associationCount") @Nullable Integer associationCount,
        @CustomType.Parameter("creationTime") @Nullable String creationTime,
        @CustomType.Parameter("creatorRequestId") @Nullable String creatorRequestId,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("ownerId") @Nullable String ownerId,
        @CustomType.Parameter("shareStatus") @Nullable ResolverQueryLoggingConfigShareStatus shareStatus,
        @CustomType.Parameter("status") @Nullable ResolverQueryLoggingConfigStatus status) {
        this.arn = arn;
        this.associationCount = associationCount;
        this.creationTime = creationTime;
        this.creatorRequestId = creatorRequestId;
        this.id = id;
        this.ownerId = ownerId;
        this.shareStatus = shareStatus;
        this.status = status;
    }

    /**
     * Arn
     * 
    */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * Count
     * 
    */
    public Optional<Integer> associationCount() {
        return Optional.ofNullable(this.associationCount);
    }
    /**
     * Rfc3339TimeString
     * 
    */
    public Optional<String> creationTime() {
        return Optional.ofNullable(this.creationTime);
    }
    /**
     * The id of the creator request.
     * 
    */
    public Optional<String> creatorRequestId() {
        return Optional.ofNullable(this.creatorRequestId);
    }
    /**
     * ResourceId
     * 
    */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * AccountId
     * 
    */
    public Optional<String> ownerId() {
        return Optional.ofNullable(this.ownerId);
    }
    /**
     * ShareStatus, possible values are NOT_SHARED, SHARED_WITH_ME, SHARED_BY_ME.
     * 
    */
    public Optional<ResolverQueryLoggingConfigShareStatus> shareStatus() {
        return Optional.ofNullable(this.shareStatus);
    }
    /**
     * ResolverQueryLogConfigStatus, possible values are CREATING, CREATED, DELETED AND FAILED.
     * 
    */
    public Optional<ResolverQueryLoggingConfigStatus> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResolverQueryLoggingConfigResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable Integer associationCount;
        private @Nullable String creationTime;
        private @Nullable String creatorRequestId;
        private @Nullable String id;
        private @Nullable String ownerId;
        private @Nullable ResolverQueryLoggingConfigShareStatus shareStatus;
        private @Nullable ResolverQueryLoggingConfigStatus status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResolverQueryLoggingConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.associationCount = defaults.associationCount;
    	      this.creationTime = defaults.creationTime;
    	      this.creatorRequestId = defaults.creatorRequestId;
    	      this.id = defaults.id;
    	      this.ownerId = defaults.ownerId;
    	      this.shareStatus = defaults.shareStatus;
    	      this.status = defaults.status;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder associationCount(@Nullable Integer associationCount) {
            this.associationCount = associationCount;
            return this;
        }
        public Builder creationTime(@Nullable String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Builder creatorRequestId(@Nullable String creatorRequestId) {
            this.creatorRequestId = creatorRequestId;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder ownerId(@Nullable String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Builder shareStatus(@Nullable ResolverQueryLoggingConfigShareStatus shareStatus) {
            this.shareStatus = shareStatus;
            return this;
        }
        public Builder status(@Nullable ResolverQueryLoggingConfigStatus status) {
            this.status = status;
            return this;
        }        public GetResolverQueryLoggingConfigResult build() {
            return new GetResolverQueryLoggingConfigResult(arn, associationCount, creationTime, creatorRequestId, id, ownerId, shareStatus, status);
        }
    }
}
