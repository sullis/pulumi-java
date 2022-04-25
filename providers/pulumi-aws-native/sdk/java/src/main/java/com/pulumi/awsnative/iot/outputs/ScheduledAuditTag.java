// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ScheduledAuditTag {
    /**
     * @return The tag&#39;s key.
     * 
     */
    private final String key;
    /**
     * @return The tag&#39;s value.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private ScheduledAuditTag(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("value") String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * @return The tag&#39;s key.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return The tag&#39;s value.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledAuditTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledAuditTag defaults) {
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
        }        public ScheduledAuditTag build() {
            return new ScheduledAuditTag(key, value);
        }
    }
}
