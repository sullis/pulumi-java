// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class OsPolicyAssignmentOsPolicyResourceGroupResourcePkgYum {
    /**
     * Required. The name of the repository.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"name"})
    private OsPolicyAssignmentOsPolicyResourceGroupResourcePkgYum(String name) {
        this.name = Objects.requireNonNull(name);
    }

    /**
     * Required. The name of the repository.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgYum defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgYum defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public OsPolicyAssignmentOsPolicyResourceGroupResourcePkgYum build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupResourcePkgYum(name);
        }
    }
}