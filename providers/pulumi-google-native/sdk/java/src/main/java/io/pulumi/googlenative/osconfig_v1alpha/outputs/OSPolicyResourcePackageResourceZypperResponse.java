// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class OSPolicyResourcePackageResourceZypperResponse {
    /**
     * Package name.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private OSPolicyResourcePackageResourceZypperResponse(@CustomType.Parameter("name") String name) {
        this.name = name;
    }

    /**
     * Package name.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourcePackageResourceZypperResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourcePackageResourceZypperResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public OSPolicyResourcePackageResourceZypperResponse build() {
            return new OSPolicyResourcePackageResourceZypperResponse(name);
        }
    }
}
