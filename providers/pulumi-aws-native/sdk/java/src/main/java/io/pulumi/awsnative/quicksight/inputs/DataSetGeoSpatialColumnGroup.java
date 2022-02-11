// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.awsnative.quicksight.enums.DataSetGeoSpatialCountryCode;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSetGeoSpatialColumnGroup extends io.pulumi.resources.InvokeArgs {

    public static final DataSetGeoSpatialColumnGroup Empty = new DataSetGeoSpatialColumnGroup();

    @InputImport(name="columns", required=true)
    private final List<String> columns;

    public List<String> getColumns() {
        return this.columns;
    }

    @InputImport(name="countryCode")
    private final @Nullable DataSetGeoSpatialCountryCode countryCode;

    public Optional<DataSetGeoSpatialCountryCode> getCountryCode() {
        return this.countryCode == null ? Optional.empty() : Optional.ofNullable(this.countryCode);
    }

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    public DataSetGeoSpatialColumnGroup(
        List<String> columns,
        @Nullable DataSetGeoSpatialCountryCode countryCode,
        String name) {
        this.columns = Objects.requireNonNull(columns, "expected parameter 'columns' to be non-null");
        this.countryCode = countryCode;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private DataSetGeoSpatialColumnGroup() {
        this.columns = List.of();
        this.countryCode = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSetGeoSpatialColumnGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> columns;
        private @Nullable DataSetGeoSpatialCountryCode countryCode;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSetGeoSpatialColumnGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columns = defaults.columns;
    	      this.countryCode = defaults.countryCode;
    	      this.name = defaults.name;
        }

        public Builder setColumns(List<String> columns) {
            this.columns = Objects.requireNonNull(columns);
            return this;
        }

        public Builder setCountryCode(@Nullable DataSetGeoSpatialCountryCode countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public DataSetGeoSpatialColumnGroup build() {
            return new DataSetGeoSpatialColumnGroup(columns, countryCode, name);
        }
    }
}
