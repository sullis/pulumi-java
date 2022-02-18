// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.awsnative.quicksight.enums.DataSetGeoSpatialCountryCode;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataSetGeoSpatialColumnGroup {
    /**
     * <p>Columns in this hierarchy.</p>
     * 
     */
    private final List<String> columns;
    private final @Nullable DataSetGeoSpatialCountryCode countryCode;
    /**
     * <p>A display name for the hierarchy.</p>
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"columns","countryCode","name"})
    private DataSetGeoSpatialColumnGroup(
        List<String> columns,
        @Nullable DataSetGeoSpatialCountryCode countryCode,
        String name) {
        this.columns = Objects.requireNonNull(columns);
        this.countryCode = countryCode;
        this.name = Objects.requireNonNull(name);
    }

    /**
     * <p>Columns in this hierarchy.</p>
     * 
     */
    public List<String> getColumns() {
        return this.columns;
    }
    public Optional<DataSetGeoSpatialCountryCode> getCountryCode() {
        return Optional.ofNullable(this.countryCode);
    }
    /**
     * <p>A display name for the hierarchy.</p>
     * 
     */
    public String getName() {
        return this.name;
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
