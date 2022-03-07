// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AvroSerializationResponse {
    /**
     * Indicates the type of serialization that the input or output uses. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Avro'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"type"})
    private AvroSerializationResponse(String type) {
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Indicates the type of serialization that the input or output uses. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Avro'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AvroSerializationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AvroSerializationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public AvroSerializationResponse build() {
            return new AvroSerializationResponse(type);
        }
    }
}