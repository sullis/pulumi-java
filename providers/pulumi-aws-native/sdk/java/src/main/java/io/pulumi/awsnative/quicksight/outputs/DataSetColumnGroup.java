// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.awsnative.quicksight.outputs.DataSetGeoSpatialColumnGroup;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataSetColumnGroup {
    private final @Nullable DataSetGeoSpatialColumnGroup geoSpatialColumnGroup;

    @OutputCustomType.Constructor({"geoSpatialColumnGroup"})
    private DataSetColumnGroup(@Nullable DataSetGeoSpatialColumnGroup geoSpatialColumnGroup) {
        this.geoSpatialColumnGroup = geoSpatialColumnGroup;
    }

    public Optional<DataSetGeoSpatialColumnGroup> getGeoSpatialColumnGroup() {
        return Optional.ofNullable(this.geoSpatialColumnGroup);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSetColumnGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DataSetGeoSpatialColumnGroup geoSpatialColumnGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSetColumnGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.geoSpatialColumnGroup = defaults.geoSpatialColumnGroup;
        }

        public Builder setGeoSpatialColumnGroup(@Nullable DataSetGeoSpatialColumnGroup geoSpatialColumnGroup) {
            this.geoSpatialColumnGroup = geoSpatialColumnGroup;
            return this;
        }

        public DataSetColumnGroup build() {
            return new DataSetColumnGroup(geoSpatialColumnGroup);
        }
    }
}
