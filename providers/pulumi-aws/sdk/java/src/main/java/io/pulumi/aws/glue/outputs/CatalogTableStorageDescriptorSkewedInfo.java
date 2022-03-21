// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class CatalogTableStorageDescriptorSkewedInfo {
    /**
     * List of names of columns that contain skewed values.
     * 
     */
    private final @Nullable List<String> skewedColumnNames;
    /**
     * List of values that appear so frequently as to be considered skewed.
     * 
     */
    private final @Nullable Map<String,String> skewedColumnValueLocationMaps;
    /**
     * Map of skewed values to the columns that contain them.
     * 
     */
    private final @Nullable List<String> skewedColumnValues;

    @CustomType.Constructor
    private CatalogTableStorageDescriptorSkewedInfo(
        @CustomType.Parameter("skewedColumnNames") @Nullable List<String> skewedColumnNames,
        @CustomType.Parameter("skewedColumnValueLocationMaps") @Nullable Map<String,String> skewedColumnValueLocationMaps,
        @CustomType.Parameter("skewedColumnValues") @Nullable List<String> skewedColumnValues) {
        this.skewedColumnNames = skewedColumnNames;
        this.skewedColumnValueLocationMaps = skewedColumnValueLocationMaps;
        this.skewedColumnValues = skewedColumnValues;
    }

    /**
     * List of names of columns that contain skewed values.
     * 
    */
    public List<String> getSkewedColumnNames() {
        return this.skewedColumnNames == null ? List.of() : this.skewedColumnNames;
    }
    /**
     * List of values that appear so frequently as to be considered skewed.
     * 
    */
    public Map<String,String> getSkewedColumnValueLocationMaps() {
        return this.skewedColumnValueLocationMaps == null ? Map.of() : this.skewedColumnValueLocationMaps;
    }
    /**
     * Map of skewed values to the columns that contain them.
     * 
    */
    public List<String> getSkewedColumnValues() {
        return this.skewedColumnValues == null ? List.of() : this.skewedColumnValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CatalogTableStorageDescriptorSkewedInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> skewedColumnNames;
        private @Nullable Map<String,String> skewedColumnValueLocationMaps;
        private @Nullable List<String> skewedColumnValues;

        public Builder() {
    	      // Empty
        }

        public Builder(CatalogTableStorageDescriptorSkewedInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.skewedColumnNames = defaults.skewedColumnNames;
    	      this.skewedColumnValueLocationMaps = defaults.skewedColumnValueLocationMaps;
    	      this.skewedColumnValues = defaults.skewedColumnValues;
        }

        public Builder skewedColumnNames(@Nullable List<String> skewedColumnNames) {
            this.skewedColumnNames = skewedColumnNames;
            return this;
        }
        public Builder skewedColumnNames(String... skewedColumnNames) {
            return skewedColumnNames(List.of(skewedColumnNames));
        }
        public Builder skewedColumnValueLocationMaps(@Nullable Map<String,String> skewedColumnValueLocationMaps) {
            this.skewedColumnValueLocationMaps = skewedColumnValueLocationMaps;
            return this;
        }
        public Builder skewedColumnValues(@Nullable List<String> skewedColumnValues) {
            this.skewedColumnValues = skewedColumnValues;
            return this;
        }
        public Builder skewedColumnValues(String... skewedColumnValues) {
            return skewedColumnValues(List.of(skewedColumnValues));
        }        public CatalogTableStorageDescriptorSkewedInfo build() {
            return new CatalogTableStorageDescriptorSkewedInfo(skewedColumnNames, skewedColumnValueLocationMaps, skewedColumnValues);
        }
    }
}
