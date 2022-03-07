// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Dynamic delivery attribute mapping details.
 * 
 */
public final class DynamicDeliveryAttributeMappingResponse extends io.pulumi.resources.InvokeArgs {

    public static final DynamicDeliveryAttributeMappingResponse Empty = new DynamicDeliveryAttributeMappingResponse();

    /**
     * Name of the delivery attribute or header.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * JSON path in the event which contains attribute value.
     * 
     */
    @InputImport(name="sourceField")
      private final @Nullable String sourceField;

    public Optional<String> getSourceField() {
        return this.sourceField == null ? Optional.empty() : Optional.ofNullable(this.sourceField);
    }

    /**
     * Type of the delivery attribute or header name.
     * Expected value is 'Dynamic'.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public DynamicDeliveryAttributeMappingResponse(
        @Nullable String name,
        @Nullable String sourceField,
        String type) {
        this.name = name;
        this.sourceField = sourceField;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private DynamicDeliveryAttributeMappingResponse() {
        this.name = null;
        this.sourceField = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DynamicDeliveryAttributeMappingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String sourceField;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DynamicDeliveryAttributeMappingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.sourceField = defaults.sourceField;
    	      this.type = defaults.type;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setSourceField(@Nullable String sourceField) {
            this.sourceField = sourceField;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public DynamicDeliveryAttributeMappingResponse build() {
            return new DynamicDeliveryAttributeMappingResponse(name, sourceField, type);
        }
    }
}