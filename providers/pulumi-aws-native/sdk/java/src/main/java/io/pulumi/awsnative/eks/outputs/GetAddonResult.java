// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.eks.outputs;

import io.pulumi.awsnative.eks.outputs.AddonTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAddonResult {
    /**
     * Version of Addon
     * 
     */
    private final @Nullable String addonVersion;
    /**
     * Amazon Resource Name (ARN) of the add-on
     * 
     */
    private final @Nullable String arn;
    /**
     * IAM role to bind to the add-on's service account
     * 
     */
    private final @Nullable String serviceAccountRoleArn;
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    private final @Nullable List<AddonTag> tags;

    @OutputCustomType.Constructor({"addonVersion","arn","serviceAccountRoleArn","tags"})
    private GetAddonResult(
        @Nullable String addonVersion,
        @Nullable String arn,
        @Nullable String serviceAccountRoleArn,
        @Nullable List<AddonTag> tags) {
        this.addonVersion = addonVersion;
        this.arn = arn;
        this.serviceAccountRoleArn = serviceAccountRoleArn;
        this.tags = tags;
    }

    /**
     * Version of Addon
     * 
     */
    public Optional<String> getAddonVersion() {
        return Optional.ofNullable(this.addonVersion);
    }
    /**
     * Amazon Resource Name (ARN) of the add-on
     * 
     */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * IAM role to bind to the add-on's service account
     * 
     */
    public Optional<String> getServiceAccountRoleArn() {
        return Optional.ofNullable(this.serviceAccountRoleArn);
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    public List<AddonTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAddonResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String addonVersion;
        private @Nullable String arn;
        private @Nullable String serviceAccountRoleArn;
        private @Nullable List<AddonTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAddonResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addonVersion = defaults.addonVersion;
    	      this.arn = defaults.arn;
    	      this.serviceAccountRoleArn = defaults.serviceAccountRoleArn;
    	      this.tags = defaults.tags;
        }

        public Builder setAddonVersion(@Nullable String addonVersion) {
            this.addonVersion = addonVersion;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setServiceAccountRoleArn(@Nullable String serviceAccountRoleArn) {
            this.serviceAccountRoleArn = serviceAccountRoleArn;
            return this;
        }

        public Builder setTags(@Nullable List<AddonTag> tags) {
            this.tags = tags;
            return this;
        }

        public GetAddonResult build() {
            return new GetAddonResult(addonVersion, arn, serviceAccountRoleArn, tags);
        }
    }
}
