// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MetadataFilterLabelMatchResponse {
    /**
     * @return Name of metadata label. The name can have a maximum length of 1024 characters and must be at least 1 character long.
     * 
     */
    private final String name;
    /**
     * @return The value of the label must match the specified value. value can have a maximum length of 1024 characters.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private MetadataFilterLabelMatchResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("value") String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * @return Name of metadata label. The name can have a maximum length of 1024 characters and must be at least 1 character long.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The value of the label must match the specified value. value can have a maximum length of 1024 characters.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataFilterLabelMatchResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataFilterLabelMatchResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public MetadataFilterLabelMatchResponse build() {
            return new MetadataFilterLabelMatchResponse(name, value);
        }
    }
}
