// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.awsnative.ec2.enums.SpotFleetTagSpecificationResourceType;
import io.pulumi.awsnative.ec2.outputs.SpotFleetTag;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SpotFleetTagSpecification {
    private final @Nullable SpotFleetTagSpecificationResourceType resourceType;
    private final @Nullable List<SpotFleetTag> tags;

    @CustomType.Constructor
    private SpotFleetTagSpecification(
        @CustomType.Parameter("resourceType") @Nullable SpotFleetTagSpecificationResourceType resourceType,
        @CustomType.Parameter("tags") @Nullable List<SpotFleetTag> tags) {
        this.resourceType = resourceType;
        this.tags = tags;
    }

    public Optional<SpotFleetTagSpecificationResourceType> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }
    public List<SpotFleetTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetTagSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SpotFleetTagSpecificationResourceType resourceType;
        private @Nullable List<SpotFleetTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetTagSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceType = defaults.resourceType;
    	      this.tags = defaults.tags;
        }

        public Builder resourceType(@Nullable SpotFleetTagSpecificationResourceType resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public Builder tags(@Nullable List<SpotFleetTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(SpotFleetTag... tags) {
            return tags(List.of(tags));
        }        public SpotFleetTagSpecification build() {
            return new SpotFleetTagSpecification(resourceType, tags);
        }
    }
}
