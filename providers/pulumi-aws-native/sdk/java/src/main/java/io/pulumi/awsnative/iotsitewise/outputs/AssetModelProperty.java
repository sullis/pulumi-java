// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.outputs;

import io.pulumi.awsnative.iotsitewise.enums.AssetModelDataType;
import io.pulumi.awsnative.iotsitewise.enums.AssetModelDataTypeSpec;
import io.pulumi.awsnative.iotsitewise.outputs.AssetModelPropertyType;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AssetModelProperty {
    /**
     * The data type of the asset model property.
     * 
     */
    private final AssetModelDataType dataType;
    /**
     * The data type of the structure for this property.
     * 
     */
    private final @Nullable AssetModelDataTypeSpec dataTypeSpec;
    /**
     * Customer provided ID for property.
     * 
     */
    private final String logicalId;
    /**
     * The name of the asset model property.
     * 
     */
    private final String name;
    /**
     * The property type
     * 
     */
    private final AssetModelPropertyType type;
    /**
     * The unit of the asset model property, such as Newtons or RPM.
     * 
     */
    private final @Nullable String unit;

    @OutputCustomType.Constructor({"dataType","dataTypeSpec","logicalId","name","type","unit"})
    private AssetModelProperty(
        AssetModelDataType dataType,
        @Nullable AssetModelDataTypeSpec dataTypeSpec,
        String logicalId,
        String name,
        AssetModelPropertyType type,
        @Nullable String unit) {
        this.dataType = Objects.requireNonNull(dataType);
        this.dataTypeSpec = dataTypeSpec;
        this.logicalId = Objects.requireNonNull(logicalId);
        this.name = Objects.requireNonNull(name);
        this.type = Objects.requireNonNull(type);
        this.unit = unit;
    }

    /**
     * The data type of the asset model property.
     * 
     */
    public AssetModelDataType getDataType() {
        return this.dataType;
    }
    /**
     * The data type of the structure for this property.
     * 
     */
    public Optional<AssetModelDataTypeSpec> getDataTypeSpec() {
        return Optional.ofNullable(this.dataTypeSpec);
    }
    /**
     * Customer provided ID for property.
     * 
     */
    public String getLogicalId() {
        return this.logicalId;
    }
    /**
     * The name of the asset model property.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The property type
     * 
     */
    public AssetModelPropertyType getType() {
        return this.type;
    }
    /**
     * The unit of the asset model property, such as Newtons or RPM.
     * 
     */
    public Optional<String> getUnit() {
        return Optional.ofNullable(this.unit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetModelProperty defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AssetModelDataType dataType;
        private @Nullable AssetModelDataTypeSpec dataTypeSpec;
        private String logicalId;
        private String name;
        private AssetModelPropertyType type;
        private @Nullable String unit;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetModelProperty defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataType = defaults.dataType;
    	      this.dataTypeSpec = defaults.dataTypeSpec;
    	      this.logicalId = defaults.logicalId;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.unit = defaults.unit;
        }

        public Builder setDataType(AssetModelDataType dataType) {
            this.dataType = Objects.requireNonNull(dataType);
            return this;
        }

        public Builder setDataTypeSpec(@Nullable AssetModelDataTypeSpec dataTypeSpec) {
            this.dataTypeSpec = dataTypeSpec;
            return this;
        }

        public Builder setLogicalId(String logicalId) {
            this.logicalId = Objects.requireNonNull(logicalId);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(AssetModelPropertyType type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUnit(@Nullable String unit) {
            this.unit = unit;
            return this;
        }

        public AssetModelProperty build() {
            return new AssetModelProperty(dataType, dataTypeSpec, logicalId, name, type, unit);
        }
    }
}
