// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.outputs;

import io.pulumi.awsnative.iotsitewise.enums.AssetModelTypeName;
import io.pulumi.awsnative.iotsitewise.outputs.AssetModelAttribute;
import io.pulumi.awsnative.iotsitewise.outputs.AssetModelMetric;
import io.pulumi.awsnative.iotsitewise.outputs.AssetModelTransform;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AssetModelPropertyType {
    private final @Nullable AssetModelAttribute attribute;
    private final @Nullable AssetModelMetric metric;
    private final @Nullable AssetModelTransform transform;
    private final AssetModelTypeName typeName;

    @OutputCustomType.Constructor({"attribute","metric","transform","typeName"})
    private AssetModelPropertyType(
        @Nullable AssetModelAttribute attribute,
        @Nullable AssetModelMetric metric,
        @Nullable AssetModelTransform transform,
        AssetModelTypeName typeName) {
        this.attribute = attribute;
        this.metric = metric;
        this.transform = transform;
        this.typeName = Objects.requireNonNull(typeName);
    }

    public Optional<AssetModelAttribute> getAttribute() {
        return Optional.ofNullable(this.attribute);
    }
    public Optional<AssetModelMetric> getMetric() {
        return Optional.ofNullable(this.metric);
    }
    public Optional<AssetModelTransform> getTransform() {
        return Optional.ofNullable(this.transform);
    }
    public AssetModelTypeName getTypeName() {
        return this.typeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetModelPropertyType defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AssetModelAttribute attribute;
        private @Nullable AssetModelMetric metric;
        private @Nullable AssetModelTransform transform;
        private AssetModelTypeName typeName;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetModelPropertyType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attribute = defaults.attribute;
    	      this.metric = defaults.metric;
    	      this.transform = defaults.transform;
    	      this.typeName = defaults.typeName;
        }

        public Builder setAttribute(@Nullable AssetModelAttribute attribute) {
            this.attribute = attribute;
            return this;
        }

        public Builder setMetric(@Nullable AssetModelMetric metric) {
            this.metric = metric;
            return this;
        }

        public Builder setTransform(@Nullable AssetModelTransform transform) {
            this.transform = transform;
            return this;
        }

        public Builder setTypeName(AssetModelTypeName typeName) {
            this.typeName = Objects.requireNonNull(typeName);
            return this;
        }

        public AssetModelPropertyType build() {
            return new AssetModelPropertyType(attribute, metric, transform, typeName);
        }
    }
}
