// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AssetModelVariableValue {
    private final @Nullable String hierarchyLogicalId;
    private final String propertyLogicalId;

    @OutputCustomType.Constructor({"hierarchyLogicalId","propertyLogicalId"})
    private AssetModelVariableValue(
        @Nullable String hierarchyLogicalId,
        String propertyLogicalId) {
        this.hierarchyLogicalId = hierarchyLogicalId;
        this.propertyLogicalId = Objects.requireNonNull(propertyLogicalId);
    }

    public Optional<String> getHierarchyLogicalId() {
        return Optional.ofNullable(this.hierarchyLogicalId);
    }
    public String getPropertyLogicalId() {
        return this.propertyLogicalId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetModelVariableValue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String hierarchyLogicalId;
        private String propertyLogicalId;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetModelVariableValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hierarchyLogicalId = defaults.hierarchyLogicalId;
    	      this.propertyLogicalId = defaults.propertyLogicalId;
        }

        public Builder setHierarchyLogicalId(@Nullable String hierarchyLogicalId) {
            this.hierarchyLogicalId = hierarchyLogicalId;
            return this;
        }

        public Builder setPropertyLogicalId(String propertyLogicalId) {
            this.propertyLogicalId = Objects.requireNonNull(propertyLogicalId);
            return this;
        }

        public AssetModelVariableValue build() {
            return new AssetModelVariableValue(hierarchyLogicalId, propertyLogicalId);
        }
    }
}
