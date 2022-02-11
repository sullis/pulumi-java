// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53resolver.outputs;

import io.pulumi.awsnative.route53resolver.enums.ResolverQueryLoggingConfigAssociationError;
import io.pulumi.awsnative.route53resolver.enums.ResolverQueryLoggingConfigAssociationStatus;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetResolverQueryLoggingConfigAssociationResult {
    private final @Nullable String creationTime;
    private final @Nullable ResolverQueryLoggingConfigAssociationError error;
    private final @Nullable String errorMessage;
    private final @Nullable String id;
    private final @Nullable ResolverQueryLoggingConfigAssociationStatus status;

    @OutputCustomType.Constructor({"creationTime","error","errorMessage","id","status"})
    private GetResolverQueryLoggingConfigAssociationResult(
        @Nullable String creationTime,
        @Nullable ResolverQueryLoggingConfigAssociationError error,
        @Nullable String errorMessage,
        @Nullable String id,
        @Nullable ResolverQueryLoggingConfigAssociationStatus status) {
        this.creationTime = creationTime;
        this.error = error;
        this.errorMessage = errorMessage;
        this.id = id;
        this.status = status;
    }

    public Optional<String> getCreationTime() {
        return Optional.ofNullable(this.creationTime);
    }
    public Optional<ResolverQueryLoggingConfigAssociationError> getError() {
        return Optional.ofNullable(this.error);
    }
    public Optional<String> getErrorMessage() {
        return Optional.ofNullable(this.errorMessage);
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<ResolverQueryLoggingConfigAssociationStatus> getStatus() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResolverQueryLoggingConfigAssociationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String creationTime;
        private @Nullable ResolverQueryLoggingConfigAssociationError error;
        private @Nullable String errorMessage;
        private @Nullable String id;
        private @Nullable ResolverQueryLoggingConfigAssociationStatus status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResolverQueryLoggingConfigAssociationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.error = defaults.error;
    	      this.errorMessage = defaults.errorMessage;
    	      this.id = defaults.id;
    	      this.status = defaults.status;
        }

        public Builder setCreationTime(@Nullable String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        public Builder setError(@Nullable ResolverQueryLoggingConfigAssociationError error) {
            this.error = error;
            return this;
        }

        public Builder setErrorMessage(@Nullable String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setStatus(@Nullable ResolverQueryLoggingConfigAssociationStatus status) {
            this.status = status;
            return this;
        }

        public GetResolverQueryLoggingConfigAssociationResult build() {
            return new GetResolverQueryLoggingConfigAssociationResult(creationTime, error, errorMessage, id, status);
        }
    }
}
