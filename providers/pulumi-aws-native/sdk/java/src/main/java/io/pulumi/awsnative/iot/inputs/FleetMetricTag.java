// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A key-value pair to associate with a resource
 * 
 */
public final class FleetMetricTag extends io.pulumi.resources.InvokeArgs {

    public static final FleetMetricTag Empty = new FleetMetricTag();

    /**
     * The tag's key
     * 
     */
    @Import(name="key", required=true)
      private final String key;

    public String key() {
        return this.key;
    }

    /**
     * The tag's value
     * 
     */
    @Import(name="value", required=true)
      private final String value;

    public String value() {
        return this.value;
    }

    public FleetMetricTag(
        String key,
        String value) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private FleetMetricTag() {
        this.key = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetMetricTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetMetricTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public FleetMetricTag build() {
            return new FleetMetricTag(key, value);
        }
    }
}
