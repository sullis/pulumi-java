// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.outputs;

import io.pulumi.awsnative.lightsail.outputs.BucketAccessRules;
import io.pulumi.awsnative.lightsail.outputs.BucketTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetBucketResult {
    private final @Nullable Boolean ableToUpdateBundle;
    private final @Nullable BucketAccessRules accessRules;
    private final @Nullable String bucketArn;
    private final @Nullable String bundleId;
    private final @Nullable Boolean objectVersioning;
    private final @Nullable List<String> readOnlyAccessAccounts;
    private final @Nullable List<String> resourcesReceivingAccess;
    private final @Nullable List<BucketTag> tags;
    private final @Nullable String url;

    @OutputCustomType.Constructor({"ableToUpdateBundle","accessRules","bucketArn","bundleId","objectVersioning","readOnlyAccessAccounts","resourcesReceivingAccess","tags","url"})
    private GetBucketResult(
        @Nullable Boolean ableToUpdateBundle,
        @Nullable BucketAccessRules accessRules,
        @Nullable String bucketArn,
        @Nullable String bundleId,
        @Nullable Boolean objectVersioning,
        @Nullable List<String> readOnlyAccessAccounts,
        @Nullable List<String> resourcesReceivingAccess,
        @Nullable List<BucketTag> tags,
        @Nullable String url) {
        this.ableToUpdateBundle = ableToUpdateBundle;
        this.accessRules = accessRules;
        this.bucketArn = bucketArn;
        this.bundleId = bundleId;
        this.objectVersioning = objectVersioning;
        this.readOnlyAccessAccounts = readOnlyAccessAccounts;
        this.resourcesReceivingAccess = resourcesReceivingAccess;
        this.tags = tags;
        this.url = url;
    }

    public Optional<Boolean> getAbleToUpdateBundle() {
        return Optional.ofNullable(this.ableToUpdateBundle);
    }
    public Optional<BucketAccessRules> getAccessRules() {
        return Optional.ofNullable(this.accessRules);
    }
    public Optional<String> getBucketArn() {
        return Optional.ofNullable(this.bucketArn);
    }
    public Optional<String> getBundleId() {
        return Optional.ofNullable(this.bundleId);
    }
    public Optional<Boolean> getObjectVersioning() {
        return Optional.ofNullable(this.objectVersioning);
    }
    public List<String> getReadOnlyAccessAccounts() {
        return this.readOnlyAccessAccounts == null ? List.of() : this.readOnlyAccessAccounts;
    }
    public List<String> getResourcesReceivingAccess() {
        return this.resourcesReceivingAccess == null ? List.of() : this.resourcesReceivingAccess;
    }
    public List<BucketTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    public Optional<String> getUrl() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean ableToUpdateBundle;
        private @Nullable BucketAccessRules accessRules;
        private @Nullable String bucketArn;
        private @Nullable String bundleId;
        private @Nullable Boolean objectVersioning;
        private @Nullable List<String> readOnlyAccessAccounts;
        private @Nullable List<String> resourcesReceivingAccess;
        private @Nullable List<BucketTag> tags;
        private @Nullable String url;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBucketResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ableToUpdateBundle = defaults.ableToUpdateBundle;
    	      this.accessRules = defaults.accessRules;
    	      this.bucketArn = defaults.bucketArn;
    	      this.bundleId = defaults.bundleId;
    	      this.objectVersioning = defaults.objectVersioning;
    	      this.readOnlyAccessAccounts = defaults.readOnlyAccessAccounts;
    	      this.resourcesReceivingAccess = defaults.resourcesReceivingAccess;
    	      this.tags = defaults.tags;
    	      this.url = defaults.url;
        }

        public Builder setAbleToUpdateBundle(@Nullable Boolean ableToUpdateBundle) {
            this.ableToUpdateBundle = ableToUpdateBundle;
            return this;
        }

        public Builder setAccessRules(@Nullable BucketAccessRules accessRules) {
            this.accessRules = accessRules;
            return this;
        }

        public Builder setBucketArn(@Nullable String bucketArn) {
            this.bucketArn = bucketArn;
            return this;
        }

        public Builder setBundleId(@Nullable String bundleId) {
            this.bundleId = bundleId;
            return this;
        }

        public Builder setObjectVersioning(@Nullable Boolean objectVersioning) {
            this.objectVersioning = objectVersioning;
            return this;
        }

        public Builder setReadOnlyAccessAccounts(@Nullable List<String> readOnlyAccessAccounts) {
            this.readOnlyAccessAccounts = readOnlyAccessAccounts;
            return this;
        }

        public Builder setResourcesReceivingAccess(@Nullable List<String> resourcesReceivingAccess) {
            this.resourcesReceivingAccess = resourcesReceivingAccess;
            return this;
        }

        public Builder setTags(@Nullable List<BucketTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = url;
            return this;
        }

        public GetBucketResult build() {
            return new GetBucketResult(ableToUpdateBundle, accessRules, bucketArn, bundleId, objectVersioning, readOnlyAccessAccounts, resourcesReceivingAccess, tags, url);
        }
    }
}
