// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dataprotection.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ImmediateCopyOptionResponse {
    /**
     * @return Type of the specific object - used for deserializing
     * Expected value is &#39;ImmediateCopyOption&#39;.
     * 
     */
    private final String objectType;

    @CustomType.Constructor
    private ImmediateCopyOptionResponse(@CustomType.Parameter("objectType") String objectType) {
        this.objectType = objectType;
    }

    /**
     * @return Type of the specific object - used for deserializing
     * Expected value is &#39;ImmediateCopyOption&#39;.
     * 
     */
    public String objectType() {
        return this.objectType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImmediateCopyOptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String objectType;

        public Builder() {
    	      // Empty
        }

        public Builder(ImmediateCopyOptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectType = defaults.objectType;
        }

        public Builder objectType(String objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }        public ImmediateCopyOptionResponse build() {
            return new ImmediateCopyOptionResponse(objectType);
        }
    }
}
