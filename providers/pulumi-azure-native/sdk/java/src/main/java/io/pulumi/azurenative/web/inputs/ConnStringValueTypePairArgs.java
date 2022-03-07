// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.enums.ConnectionStringType;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Database connection string value to type pair.
 * 
 */
public final class ConnStringValueTypePairArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnStringValueTypePairArgs Empty = new ConnStringValueTypePairArgs();

    /**
     * Type of database.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<ConnectionStringType> type;

    public Input<ConnectionStringType> getType() {
        return this.type;
    }

    /**
     * Value of pair.
     * 
     */
    @InputImport(name="value", required=true)
      private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public ConnStringValueTypePairArgs(
        Input<ConnectionStringType> type,
        Input<String> value) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private ConnStringValueTypePairArgs() {
        this.type = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnStringValueTypePairArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ConnectionStringType> type;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnStringValueTypePairArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setType(Input<ConnectionStringType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(ConnectionStringType type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setValue(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }
        public ConnStringValueTypePairArgs build() {
            return new ConnStringValueTypePairArgs(type, value);
        }
    }
}