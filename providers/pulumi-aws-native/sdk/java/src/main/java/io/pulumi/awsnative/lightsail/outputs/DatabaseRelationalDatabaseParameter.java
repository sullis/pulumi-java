// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
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

    @CustomType.Constructor
    private DatabaseRelationalDatabaseParameter(
        @CustomType.Parameter("allowedValues") @Nullable String allowedValues,
        @CustomType.Parameter("applyMethod") @Nullable String applyMethod,
        @CustomType.Parameter("applyType") @Nullable String applyType,
        @CustomType.Parameter("dataType") @Nullable String dataType,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("isModifiable") @Nullable Boolean isModifiable,
        @CustomType.Parameter("parameterName") @Nullable String parameterName,
        @CustomType.Parameter("parameterValue") @Nullable String parameterValue) {
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
    public Optional<String> allowedValues() {
        return Optional.ofNullable(this.allowedValues);
    }
    /**
     * Indicates when parameter updates are applied. Can be immediate or pending-reboot.
     * 
    */
    public Optional<String> applyMethod() {
        return Optional.ofNullable(this.applyMethod);
    }
    /**
     * Specifies the engine-specific parameter type.
     * 
    */
    public Optional<String> applyType() {
        return Optional.ofNullable(this.applyType);
    }
    /**
     * Specifies the valid data type for the parameter.
     * 
    */
    public Optional<String> dataType() {
        return Optional.ofNullable(this.dataType);
    }
    /**
     * Provides a description of the parameter.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * A Boolean value indicating whether the parameter can be modified.
     * 
    */
    public Optional<Boolean> isModifiable() {
        return Optional.ofNullable(this.isModifiable);
    }
    /**
     * Specifies the name of the parameter.
     * 
    */
    public Optional<String> parameterName() {
        return Optional.ofNullable(this.parameterName);
    }
    /**
     * Specifies the value of the parameter.
     * 
    */
    public Optional<String> parameterValue() {
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

        public Builder allowedValues(@Nullable String allowedValues) {
            this.allowedValues = allowedValues;
            return this;
        }
        public Builder applyMethod(@Nullable String applyMethod) {
            this.applyMethod = applyMethod;
            return this;
        }
        public Builder applyType(@Nullable String applyType) {
            this.applyType = applyType;
            return this;
        }
        public Builder dataType(@Nullable String dataType) {
            this.dataType = dataType;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder isModifiable(@Nullable Boolean isModifiable) {
            this.isModifiable = isModifiable;
            return this;
        }
        public Builder parameterName(@Nullable String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public Builder parameterValue(@Nullable String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }        public DatabaseRelationalDatabaseParameter build() {
            return new DatabaseRelationalDatabaseParameter(allowedValues, applyMethod, applyType, dataType, description, isModifiable, parameterName, parameterValue);
        }
    }
}
