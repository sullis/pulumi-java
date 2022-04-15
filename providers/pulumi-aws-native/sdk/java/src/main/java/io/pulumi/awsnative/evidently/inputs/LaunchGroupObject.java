// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.evidently.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LaunchGroupObject extends io.pulumi.resources.InvokeArgs {

    public static final LaunchGroupObject Empty = new LaunchGroupObject();

    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    @Import(name="feature", required=true)
      private final String feature;

    public String feature() {
        return this.feature;
    }

    @Import(name="groupName", required=true)
      private final String groupName;

    public String groupName() {
        return this.groupName;
    }

    @Import(name="variation", required=true)
      private final String variation;

    public String variation() {
        return this.variation;
    }

    public LaunchGroupObject(
        @Nullable String description,
        String feature,
        String groupName,
        String variation) {
        this.description = description;
        this.feature = Objects.requireNonNull(feature, "expected parameter 'feature' to be non-null");
        this.groupName = Objects.requireNonNull(groupName, "expected parameter 'groupName' to be non-null");
        this.variation = Objects.requireNonNull(variation, "expected parameter 'variation' to be non-null");
    }

    private LaunchGroupObject() {
        this.description = null;
        this.feature = null;
        this.groupName = null;
        this.variation = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchGroupObject defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private String feature;
        private String groupName;
        private String variation;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchGroupObject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.feature = defaults.feature;
    	      this.groupName = defaults.groupName;
    	      this.variation = defaults.variation;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder feature(String feature) {
            this.feature = Objects.requireNonNull(feature);
            return this;
        }
        public Builder groupName(String groupName) {
            this.groupName = Objects.requireNonNull(groupName);
            return this;
        }
        public Builder variation(String variation) {
            this.variation = Objects.requireNonNull(variation);
            return this;
        }        public LaunchGroupObject build() {
            return new LaunchGroupObject(description, feature, groupName, variation);
        }
    }
}
