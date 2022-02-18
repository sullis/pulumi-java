// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.inputs;

import io.pulumi.azurenative.authorization.enums.ParameterType;
import io.pulumi.azurenative.authorization.inputs.ParameterDefinitionsValueMetadataArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The definition of a parameter that can be provided to the policy.
 * 
 */
public final class ParameterDefinitionsValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final ParameterDefinitionsValueArgs Empty = new ParameterDefinitionsValueArgs();

    /**
     * The allowed values for the parameter.
     * 
     */
    @InputImport(name="allowedValues")
    private final @Nullable Input<List<Object>> allowedValues;

    public Input<List<Object>> getAllowedValues() {
        return this.allowedValues == null ? Input.empty() : this.allowedValues;
    }

    /**
     * The default value for the parameter if no value is provided.
     * 
     */
    @InputImport(name="defaultValue")
    private final @Nullable Input<Object> defaultValue;

    public Input<Object> getDefaultValue() {
        return this.defaultValue == null ? Input.empty() : this.defaultValue;
    }

    /**
     * General metadata for the parameter.
     * 
     */
    @InputImport(name="metadata")
    private final @Nullable Input<ParameterDefinitionsValueMetadataArgs> metadata;

    public Input<ParameterDefinitionsValueMetadataArgs> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * The data type of the parameter.
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<Either<String,ParameterType>> type;

    public Input<Either<String,ParameterType>> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public ParameterDefinitionsValueArgs(
        @Nullable Input<List<Object>> allowedValues,
        @Nullable Input<Object> defaultValue,
        @Nullable Input<ParameterDefinitionsValueMetadataArgs> metadata,
        @Nullable Input<Either<String,ParameterType>> type) {
        this.allowedValues = allowedValues;
        this.defaultValue = defaultValue;
        this.metadata = metadata;
        this.type = type;
    }

    private ParameterDefinitionsValueArgs() {
        this.allowedValues = Input.empty();
        this.defaultValue = Input.empty();
        this.metadata = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParameterDefinitionsValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Object>> allowedValues;
        private @Nullable Input<Object> defaultValue;
        private @Nullable Input<ParameterDefinitionsValueMetadataArgs> metadata;
        private @Nullable Input<Either<String,ParameterType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ParameterDefinitionsValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedValues = defaults.allowedValues;
    	      this.defaultValue = defaults.defaultValue;
    	      this.metadata = defaults.metadata;
    	      this.type = defaults.type;
        }

        public Builder setAllowedValues(@Nullable Input<List<Object>> allowedValues) {
            this.allowedValues = allowedValues;
            return this;
        }

        public Builder setAllowedValues(@Nullable List<Object> allowedValues) {
            this.allowedValues = Input.ofNullable(allowedValues);
            return this;
        }

        public Builder setDefaultValue(@Nullable Input<Object> defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        public Builder setDefaultValue(@Nullable Object defaultValue) {
            this.defaultValue = Input.ofNullable(defaultValue);
            return this;
        }

        public Builder setMetadata(@Nullable Input<ParameterDefinitionsValueMetadataArgs> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable ParameterDefinitionsValueMetadataArgs metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setType(@Nullable Input<Either<String,ParameterType>> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable Either<String,ParameterType> type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public ParameterDefinitionsValueArgs build() {
            return new ParameterDefinitionsValueArgs(allowedValues, defaultValue, metadata, type);
        }
    }
}
