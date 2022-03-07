// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.location.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetGeofenceCollectionResult {
    private final @Nullable String arn;
    private final @Nullable String collectionArn;
    private final @Nullable String createTime;
    private final @Nullable String kmsKeyId;
    private final @Nullable String updateTime;

    @OutputCustomType.Constructor({"arn","collectionArn","createTime","kmsKeyId","updateTime"})
    private GetGeofenceCollectionResult(
        @Nullable String arn,
        @Nullable String collectionArn,
        @Nullable String createTime,
        @Nullable String kmsKeyId,
        @Nullable String updateTime) {
        this.arn = arn;
        this.collectionArn = collectionArn;
        this.createTime = createTime;
        this.kmsKeyId = kmsKeyId;
        this.updateTime = updateTime;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<String> getCollectionArn() {
        return Optional.ofNullable(this.collectionArn);
    }
    public Optional<String> getCreateTime() {
        return Optional.ofNullable(this.createTime);
    }
    public Optional<String> getKmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }
    public Optional<String> getUpdateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGeofenceCollectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String collectionArn;
        private @Nullable String createTime;
        private @Nullable String kmsKeyId;
        private @Nullable String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGeofenceCollectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.collectionArn = defaults.collectionArn;
    	      this.createTime = defaults.createTime;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setCollectionArn(@Nullable String collectionArn) {
            this.collectionArn = collectionArn;
            return this;
        }

        public Builder setCreateTime(@Nullable String createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder setUpdateTime(@Nullable String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public GetGeofenceCollectionResult build() {
            return new GetGeofenceCollectionResult(arn, collectionArn, createTime, kmsKeyId, updateTime);
        }
    }
}