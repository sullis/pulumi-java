// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.advisor;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SuppressionArgs extends io.pulumi.resources.ResourceArgs {

    public static final SuppressionArgs Empty = new SuppressionArgs();

    /**
     * The name of the suppression.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The recommendation ID.
     * 
     */
    @InputImport(name="recommendationId", required=true)
      private final Input<String> recommendationId;

    public Input<String> getRecommendationId() {
        return this.recommendationId;
    }

    /**
     * The fully qualified Azure Resource Manager identifier of the resource to which the recommendation applies.
     * 
     */
    @InputImport(name="resourceUri", required=true)
      private final Input<String> resourceUri;

    public Input<String> getResourceUri() {
        return this.resourceUri;
    }

    /**
     * The GUID of the suppression.
     * 
     */
    @InputImport(name="suppressionId")
      private final @Nullable Input<String> suppressionId;

    public Input<String> getSuppressionId() {
        return this.suppressionId == null ? Input.empty() : this.suppressionId;
    }

    /**
     * The duration for which the suppression is valid.
     * 
     */
    @InputImport(name="ttl")
      private final @Nullable Input<String> ttl;

    public Input<String> getTtl() {
        return this.ttl == null ? Input.empty() : this.ttl;
    }

    public SuppressionArgs(
        @Nullable Input<String> name,
        Input<String> recommendationId,
        Input<String> resourceUri,
        @Nullable Input<String> suppressionId,
        @Nullable Input<String> ttl) {
        this.name = name;
        this.recommendationId = Objects.requireNonNull(recommendationId, "expected parameter 'recommendationId' to be non-null");
        this.resourceUri = Objects.requireNonNull(resourceUri, "expected parameter 'resourceUri' to be non-null");
        this.suppressionId = suppressionId;
        this.ttl = ttl;
    }

    private SuppressionArgs() {
        this.name = Input.empty();
        this.recommendationId = Input.empty();
        this.resourceUri = Input.empty();
        this.suppressionId = Input.empty();
        this.ttl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SuppressionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private Input<String> recommendationId;
        private Input<String> resourceUri;
        private @Nullable Input<String> suppressionId;
        private @Nullable Input<String> ttl;

        public Builder() {
    	      // Empty
        }

        public Builder(SuppressionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.recommendationId = defaults.recommendationId;
    	      this.resourceUri = defaults.resourceUri;
    	      this.suppressionId = defaults.suppressionId;
    	      this.ttl = defaults.ttl;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRecommendationId(Input<String> recommendationId) {
            this.recommendationId = Objects.requireNonNull(recommendationId);
            return this;
        }

        public Builder setRecommendationId(String recommendationId) {
            this.recommendationId = Input.of(Objects.requireNonNull(recommendationId));
            return this;
        }

        public Builder setResourceUri(Input<String> resourceUri) {
            this.resourceUri = Objects.requireNonNull(resourceUri);
            return this;
        }

        public Builder setResourceUri(String resourceUri) {
            this.resourceUri = Input.of(Objects.requireNonNull(resourceUri));
            return this;
        }

        public Builder setSuppressionId(@Nullable Input<String> suppressionId) {
            this.suppressionId = suppressionId;
            return this;
        }

        public Builder setSuppressionId(@Nullable String suppressionId) {
            this.suppressionId = Input.ofNullable(suppressionId);
            return this;
        }

        public Builder setTtl(@Nullable Input<String> ttl) {
            this.ttl = ttl;
            return this;
        }

        public Builder setTtl(@Nullable String ttl) {
            this.ttl = Input.ofNullable(ttl);
            return this;
        }
        public SuppressionArgs build() {
            return new SuppressionArgs(name, recommendationId, resourceUri, suppressionId, ttl);
        }
    }
}