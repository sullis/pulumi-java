// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.evidently.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LaunchGroupObject {
    private final @Nullable String description;
    private final String feature;
    private final String groupName;
    private final String variation;

    @CustomType.Constructor
    private LaunchGroupObject(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("feature") String feature,
        @CustomType.Parameter("groupName") String groupName,
        @CustomType.Parameter("variation") String variation) {
        this.description = description;
        this.feature = feature;
        this.groupName = groupName;
        this.variation = variation;
    }

    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    public String feature() {
        return this.feature;
    }
    public String groupName() {
        return this.groupName;
    }
    public String variation() {
        return this.variation;
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
