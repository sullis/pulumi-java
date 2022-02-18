// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The data stored in Avro format.
 * 
 */
public final class AvroFormatResponse extends io.pulumi.resources.InvokeArgs {

    public static final AvroFormatResponse Empty = new AvroFormatResponse();

    /**
     * Deserializer. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="deserializer")
    private final @Nullable Object deserializer;

    public Optional<Object> getDeserializer() {
        return this.deserializer == null ? Optional.empty() : Optional.ofNullable(this.deserializer);
    }

    /**
     * Serializer. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="serializer")
    private final @Nullable Object serializer;

    public Optional<Object> getSerializer() {
        return this.serializer == null ? Optional.empty() : Optional.ofNullable(this.serializer);
    }

    /**
     * Type of dataset storage format.
     * Expected value is 'AvroFormat'.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public AvroFormatResponse(
        @Nullable Object deserializer,
        @Nullable Object serializer,
        String type) {
        this.deserializer = deserializer;
        this.serializer = serializer;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AvroFormatResponse() {
        this.deserializer = null;
        this.serializer = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AvroFormatResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object deserializer;
        private @Nullable Object serializer;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AvroFormatResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deserializer = defaults.deserializer;
    	      this.serializer = defaults.serializer;
    	      this.type = defaults.type;
        }

        public Builder setDeserializer(@Nullable Object deserializer) {
            this.deserializer = deserializer;
            return this;
        }

        public Builder setSerializer(@Nullable Object serializer) {
            this.serializer = serializer;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public AvroFormatResponse build() {
            return new AvroFormatResponse(deserializer, serializer, type);
        }
    }
}
