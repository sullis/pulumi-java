// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mypkg.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SsisVariableResponse {
    /**
     * @return Variable type.
     * 
     */
    private @Nullable String dataType;
    /**
     * @return Variable description.
     * 
     */
    private @Nullable String description;
    /**
     * @return Variable id.
     * 
     */
    private @Nullable Double id;
    /**
     * @return Variable name.
     * 
     */
    private @Nullable String name;
    /**
     * @return Whether variable is sensitive.
     * 
     */
    private @Nullable Boolean sensitive;
    /**
     * @return Variable sensitive value.
     * 
     */
    private @Nullable String sensitiveValue;
    /**
     * @return Variable value.
     * 
     */
    private @Nullable String value;

    private SsisVariableResponse() {}
    /**
     * @return Variable type.
     * 
     */
    public Optional<String> dataType() {
        return Optional.ofNullable(this.dataType);
    }
    /**
     * @return Variable description.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Variable id.
     * 
     */
    public Optional<Double> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Variable name.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Whether variable is sensitive.
     * 
     */
    public Optional<Boolean> sensitive() {
        return Optional.ofNullable(this.sensitive);
    }
    /**
     * @return Variable sensitive value.
     * 
     */
    public Optional<String> sensitiveValue() {
        return Optional.ofNullable(this.sensitiveValue);
    }
    /**
     * @return Variable value.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SsisVariableResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String dataType;
        private @Nullable String description;
        private @Nullable Double id;
        private @Nullable String name;
        private @Nullable Boolean sensitive;
        private @Nullable String sensitiveValue;
        private @Nullable String value;
        public Builder() {}
        public Builder(SsisVariableResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataType = defaults.dataType;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.sensitive = defaults.sensitive;
    	      this.sensitiveValue = defaults.sensitiveValue;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder dataType(@Nullable String dataType) {

            this.dataType = dataType;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable Double id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder sensitive(@Nullable Boolean sensitive) {

            this.sensitive = sensitive;
            return this;
        }
        @CustomType.Setter
        public Builder sensitiveValue(@Nullable String sensitiveValue) {

            this.sensitiveValue = sensitiveValue;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {

            this.value = value;
            return this;
        }
        public SsisVariableResponse build() {
            final var _resultValue = new SsisVariableResponse();
            _resultValue.dataType = dataType;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.sensitive = sensitive;
            _resultValue.sensitiveValue = sensitiveValue;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
