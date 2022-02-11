// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.outputs;

import io.pulumi.awsnative.iotsitewise.outputs.AssetModelProperty;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AssetModelCompositeModel {
    private final @Nullable List<AssetModelProperty> compositeModelProperties;
    private final @Nullable String description;
    private final String name;
    private final String type;

    @OutputCustomType.Constructor({"compositeModelProperties","description","name","type"})
    private AssetModelCompositeModel(
        @Nullable List<AssetModelProperty> compositeModelProperties,
        @Nullable String description,
        String name,
        String type) {
        this.compositeModelProperties = compositeModelProperties;
        this.description = description;
        this.name = Objects.requireNonNull(name);
        this.type = Objects.requireNonNull(type);
    }

    public List<AssetModelProperty> getCompositeModelProperties() {
        return this.compositeModelProperties == null ? List.of() : this.compositeModelProperties;
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public String getName() {
        return this.name;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetModelCompositeModel defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AssetModelProperty> compositeModelProperties;
        private @Nullable String description;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetModelCompositeModel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compositeModelProperties = defaults.compositeModelProperties;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setCompositeModelProperties(@Nullable List<AssetModelProperty> compositeModelProperties) {
            this.compositeModelProperties = compositeModelProperties;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public AssetModelCompositeModel build() {
            return new AssetModelCompositeModel(compositeModelProperties, description, name, type);
        }
    }
}
