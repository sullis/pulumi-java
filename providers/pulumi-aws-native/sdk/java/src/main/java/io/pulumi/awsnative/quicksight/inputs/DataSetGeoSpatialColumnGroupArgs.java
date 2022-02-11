// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.awsnative.quicksight.enums.DataSetGeoSpatialCountryCode;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSetGeoSpatialColumnGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSetGeoSpatialColumnGroupArgs Empty = new DataSetGeoSpatialColumnGroupArgs();

    @InputImport(name="columns", required=true)
    private final Input<List<String>> columns;

    public Input<List<String>> getColumns() {
        return this.columns;
    }

    @InputImport(name="countryCode")
    private final @Nullable Input<DataSetGeoSpatialCountryCode> countryCode;

    public Input<DataSetGeoSpatialCountryCode> getCountryCode() {
        return this.countryCode == null ? Input.empty() : this.countryCode;
    }

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public DataSetGeoSpatialColumnGroupArgs(
        Input<List<String>> columns,
        @Nullable Input<DataSetGeoSpatialCountryCode> countryCode,
        Input<String> name) {
        this.columns = Objects.requireNonNull(columns, "expected parameter 'columns' to be non-null");
        this.countryCode = countryCode;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private DataSetGeoSpatialColumnGroupArgs() {
        this.columns = Input.empty();
        this.countryCode = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSetGeoSpatialColumnGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> columns;
        private @Nullable Input<DataSetGeoSpatialCountryCode> countryCode;
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSetGeoSpatialColumnGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columns = defaults.columns;
    	      this.countryCode = defaults.countryCode;
    	      this.name = defaults.name;
        }

        public Builder setColumns(Input<List<String>> columns) {
            this.columns = Objects.requireNonNull(columns);
            return this;
        }

        public Builder setColumns(List<String> columns) {
            this.columns = Input.of(Objects.requireNonNull(columns));
            return this;
        }

        public Builder setCountryCode(@Nullable Input<DataSetGeoSpatialCountryCode> countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        public Builder setCountryCode(@Nullable DataSetGeoSpatialCountryCode countryCode) {
            this.countryCode = Input.ofNullable(countryCode);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public DataSetGeoSpatialColumnGroupArgs build() {
            return new DataSetGeoSpatialColumnGroupArgs(columns, countryCode, name);
        }
    }
}
