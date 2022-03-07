// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Database connection string value to type pair.
 * 
 */
public final class ConnStringValueTypePairResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConnStringValueTypePairResponse Empty = new ConnStringValueTypePairResponse();

    /**
     * Type of database.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * Value of pair.
     * 
     */
    @InputImport(name="value", required=true)
      private final String value;

    public String getValue() {
        return this.value;
    }

    public ConnStringValueTypePairResponse(
        String type,
        String value) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private ConnStringValueTypePairResponse() {
        this.type = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnStringValueTypePairResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnStringValueTypePairResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public ConnStringValueTypePairResponse build() {
            return new ConnStringValueTypePairResponse(type, value);
        }
    }
}