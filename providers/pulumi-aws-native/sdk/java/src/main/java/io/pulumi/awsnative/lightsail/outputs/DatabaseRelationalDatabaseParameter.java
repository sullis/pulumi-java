// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatabaseRelationalDatabaseParameter {
    /**
     * Specifies the valid range of values for the parameter.
     * 
     */
    private final @Nullable String allowedValues;
    /**
     * Indicates when parameter updates are applied. Can be immediate or pending-reboot.
     * 
     */
    private final @Nullable String applyMethod;
    /**
     * Specifies the engine-specific parameter type.
     * 
     */
    private final @Nullable String applyType;
    /**
     * Specifies the valid data type for the parameter.
     * 
     */
    private final @Nullable String dataType;
    /**
     * Provides a description of the parameter.
     * 
     */
    private final @Nullable String description;
    /**
     * A Boolean value indicating whether the parameter can be modified.
     * 
     */
    private final @Nullable Boolean isModifiable;
    /**
     * Specifies the name of the parameter.
     * 
     */
    private final @Nullable String parameterName;
    /**
     * Specifies the value of the parameter.
     * 
     */
    private final @Nullable String parameterValue;

    @OutputCustomType.Constructor({"allowedValues","applyMethod","applyType","dataType","description","isModifiable","parameterName","parameterValue"})
    private DatabaseRelationalDatabaseParameter(
        @Nullable String allowedValues,
        @Nullable String applyMethod,
        @Nullable String applyType,
        @Nullable String dataType,
        @Nullable String description,
        @Nullable Boolean isModifiable,
        @Nullable String parameterName,
        @Nullable String parameterValue) {
        this.allowedValues = allowedValues;
        this.applyMethod = applyMethod;
        this.applyType = applyType;
        this.dataType = dataType;
        this.description = description;
        this.isModifiable = isModifiable;
        this.parameterName = parameterName;
        this.parameterValue = parameterValue;
    }

    /**
     * Specifies the valid range of values for the parameter.
     * 
     */
    public Optional<String> getAllowedValues() {
        return Optional.ofNullable(this.allowedValues);
    }
    /**
     * Indicates when parameter updates are applied. Can be immediate or pending-reboot.
     * 
     */
    public Optional<String> getApplyMethod() {
        return Optional.ofNullable(this.applyMethod);
    }
    /**
     * Specifies the engine-specific parameter type.
     * 
     */
    public Optional<String> getApplyType() {
        return Optional.ofNullable(this.applyType);
    }
    /**
     * Specifies the valid data type for the parameter.
     * 
     */
    public Optional<String> getDataType() {
        return Optional.ofNullable(this.dataType);
    }
    /**
     * Provides a description of the parameter.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * A Boolean value indicating whether the parameter can be modified.
     * 
     */
    public Optional<Boolean> getIsModifiable() {
        return Optional.ofNullable(this.isModifiable);
    }
    /**
     * Specifies the name of the parameter.
     * 
     */
    public Optional<String> getParameterName() {
        return Optional.ofNullable(this.parameterName);
    }
    /**
     * Specifies the value of the parameter.
     * 
     */
    public Optional<String> getParameterValue() {
        return Optional.ofNullable(this.parameterValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseRelationalDatabaseParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String allowedValues;
        private @Nullable String applyMethod;
        private @Nullable String applyType;
        private @Nullable String dataType;
        private @Nullable String description;
        private @Nullable Boolean isModifiable;
        private @Nullable String parameterName;
        private @Nullable String parameterValue;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseRelationalDatabaseParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedValues = defaults.allowedValues;
    	      this.applyMethod = defaults.applyMethod;
    	      this.applyType = defaults.applyType;
    	      this.dataType = defaults.dataType;
    	      this.description = defaults.description;
    	      this.isModifiable = defaults.isModifiable;
    	      this.parameterName = defaults.parameterName;
    	      this.parameterValue = defaults.parameterValue;
        }

        public Builder setAllowedValues(@Nullable String allowedValues) {
            this.allowedValues = allowedValues;
            return this;
        }

        public Builder setApplyMethod(@Nullable String applyMethod) {
            this.applyMethod = applyMethod;
            return this;
        }

        public Builder setApplyType(@Nullable String applyType) {
            this.applyType = applyType;
            return this;
        }

        public Builder setDataType(@Nullable String dataType) {
            this.dataType = dataType;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setIsModifiable(@Nullable Boolean isModifiable) {
            this.isModifiable = isModifiable;
            return this;
        }

        public Builder setParameterName(@Nullable String parameterName) {
            this.parameterName = parameterName;
            return this;
        }

        public Builder setParameterValue(@Nullable String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }

        public DatabaseRelationalDatabaseParameter build() {
            return new DatabaseRelationalDatabaseParameter(allowedValues, applyMethod, applyType, dataType, description, isModifiable, parameterName, parameterValue);
        }
    }
}
