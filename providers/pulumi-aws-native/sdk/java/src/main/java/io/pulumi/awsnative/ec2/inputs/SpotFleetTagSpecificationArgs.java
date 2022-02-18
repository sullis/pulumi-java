// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.enums.SpotFleetTagSpecificationResourceType;
import io.pulumi.awsnative.ec2.inputs.SpotFleetTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SpotFleetTagSpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpotFleetTagSpecificationArgs Empty = new SpotFleetTagSpecificationArgs();

    @InputImport(name="resourceType")
    private final @Nullable Input<SpotFleetTagSpecificationResourceType> resourceType;

    public Input<SpotFleetTagSpecificationResourceType> getPropResourceType() {
        return this.resourceType == null ? Input.empty() : this.resourceType;
    }

    @InputImport(name="tags")
    private final @Nullable Input<List<SpotFleetTagArgs>> tags;

    public Input<List<SpotFleetTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public SpotFleetTagSpecificationArgs(
        @Nullable Input<SpotFleetTagSpecificationResourceType> resourceType,
        @Nullable Input<List<SpotFleetTagArgs>> tags) {
        this.resourceType = resourceType;
        this.tags = tags;
    }

    private SpotFleetTagSpecificationArgs() {
        this.resourceType = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetTagSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SpotFleetTagSpecificationResourceType> resourceType;
        private @Nullable Input<List<SpotFleetTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetTagSpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceType = defaults.resourceType;
    	      this.tags = defaults.tags;
        }

        public Builder setResourceType(@Nullable Input<SpotFleetTagSpecificationResourceType> resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public Builder setResourceType(@Nullable SpotFleetTagSpecificationResourceType resourceType) {
            this.resourceType = Input.ofNullable(resourceType);
            return this;
        }

        public Builder setTags(@Nullable Input<List<SpotFleetTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<SpotFleetTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public SpotFleetTagSpecificationArgs build() {
            return new SpotFleetTagSpecificationArgs(resourceType, tags);
        }
    }
}
