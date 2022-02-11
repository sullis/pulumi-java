// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.awsnative.quicksight.inputs.DataSetGeoSpatialColumnGroupArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSetColumnGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSetColumnGroupArgs Empty = new DataSetColumnGroupArgs();

    @InputImport(name="geoSpatialColumnGroup")
    private final @Nullable Input<DataSetGeoSpatialColumnGroupArgs> geoSpatialColumnGroup;

    public Input<DataSetGeoSpatialColumnGroupArgs> getGeoSpatialColumnGroup() {
        return this.geoSpatialColumnGroup == null ? Input.empty() : this.geoSpatialColumnGroup;
    }

    public DataSetColumnGroupArgs(@Nullable Input<DataSetGeoSpatialColumnGroupArgs> geoSpatialColumnGroup) {
        this.geoSpatialColumnGroup = geoSpatialColumnGroup;
    }

    private DataSetColumnGroupArgs() {
        this.geoSpatialColumnGroup = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSetColumnGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DataSetGeoSpatialColumnGroupArgs> geoSpatialColumnGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSetColumnGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.geoSpatialColumnGroup = defaults.geoSpatialColumnGroup;
        }

        public Builder setGeoSpatialColumnGroup(@Nullable Input<DataSetGeoSpatialColumnGroupArgs> geoSpatialColumnGroup) {
            this.geoSpatialColumnGroup = geoSpatialColumnGroup;
            return this;
        }

        public Builder setGeoSpatialColumnGroup(@Nullable DataSetGeoSpatialColumnGroupArgs geoSpatialColumnGroup) {
            this.geoSpatialColumnGroup = Input.ofNullable(geoSpatialColumnGroup);
            return this;
        }

        public DataSetColumnGroupArgs build() {
            return new DataSetColumnGroupArgs(geoSpatialColumnGroup);
        }
    }
}
