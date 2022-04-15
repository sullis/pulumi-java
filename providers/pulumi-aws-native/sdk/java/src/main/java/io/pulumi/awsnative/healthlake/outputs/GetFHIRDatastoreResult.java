// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.healthlake.outputs;

import io.pulumi.awsnative.healthlake.enums.FHIRDatastoreDatastoreStatus;
import io.pulumi.awsnative.healthlake.outputs.FHIRDatastoreCreatedAt;
import io.pulumi.awsnative.healthlake.outputs.FHIRDatastoreTag;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetFHIRDatastoreResult {
    private final @Nullable FHIRDatastoreCreatedAt createdAt;
    private final @Nullable String datastoreArn;
    private final @Nullable String datastoreEndpoint;
    private final @Nullable String datastoreId;
    private final @Nullable FHIRDatastoreDatastoreStatus datastoreStatus;
    private final @Nullable List<FHIRDatastoreTag> tags;

    @CustomType.Constructor
    private GetFHIRDatastoreResult(
        @CustomType.Parameter("createdAt") @Nullable FHIRDatastoreCreatedAt createdAt,
        @CustomType.Parameter("datastoreArn") @Nullable String datastoreArn,
        @CustomType.Parameter("datastoreEndpoint") @Nullable String datastoreEndpoint,
        @CustomType.Parameter("datastoreId") @Nullable String datastoreId,
        @CustomType.Parameter("datastoreStatus") @Nullable FHIRDatastoreDatastoreStatus datastoreStatus,
        @CustomType.Parameter("tags") @Nullable List<FHIRDatastoreTag> tags) {
        this.createdAt = createdAt;
        this.datastoreArn = datastoreArn;
        this.datastoreEndpoint = datastoreEndpoint;
        this.datastoreId = datastoreId;
        this.datastoreStatus = datastoreStatus;
        this.tags = tags;
    }

    public Optional<FHIRDatastoreCreatedAt> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }
    public Optional<String> datastoreArn() {
        return Optional.ofNullable(this.datastoreArn);
    }
    public Optional<String> datastoreEndpoint() {
        return Optional.ofNullable(this.datastoreEndpoint);
    }
    public Optional<String> datastoreId() {
        return Optional.ofNullable(this.datastoreId);
    }
    public Optional<FHIRDatastoreDatastoreStatus> datastoreStatus() {
        return Optional.ofNullable(this.datastoreStatus);
    }
    public List<FHIRDatastoreTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFHIRDatastoreResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FHIRDatastoreCreatedAt createdAt;
        private @Nullable String datastoreArn;
        private @Nullable String datastoreEndpoint;
        private @Nullable String datastoreId;
        private @Nullable FHIRDatastoreDatastoreStatus datastoreStatus;
        private @Nullable List<FHIRDatastoreTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFHIRDatastoreResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.datastoreArn = defaults.datastoreArn;
    	      this.datastoreEndpoint = defaults.datastoreEndpoint;
    	      this.datastoreId = defaults.datastoreId;
    	      this.datastoreStatus = defaults.datastoreStatus;
    	      this.tags = defaults.tags;
        }

        public Builder createdAt(@Nullable FHIRDatastoreCreatedAt createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Builder datastoreArn(@Nullable String datastoreArn) {
            this.datastoreArn = datastoreArn;
            return this;
        }
        public Builder datastoreEndpoint(@Nullable String datastoreEndpoint) {
            this.datastoreEndpoint = datastoreEndpoint;
            return this;
        }
        public Builder datastoreId(@Nullable String datastoreId) {
            this.datastoreId = datastoreId;
            return this;
        }
        public Builder datastoreStatus(@Nullable FHIRDatastoreDatastoreStatus datastoreStatus) {
            this.datastoreStatus = datastoreStatus;
            return this;
        }
        public Builder tags(@Nullable List<FHIRDatastoreTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(FHIRDatastoreTag... tags) {
            return tags(List.of(tags));
        }        public GetFHIRDatastoreResult build() {
            return new GetFHIRDatastoreResult(createdAt, datastoreArn, datastoreEndpoint, datastoreId, datastoreStatus, tags);
        }
    }
}
