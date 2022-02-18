// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.projects.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


public final class OrganizationPolicyRestorePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final OrganizationPolicyRestorePolicyArgs Empty = new OrganizationPolicyRestorePolicyArgs();

    /**
     * May only be set to true. If set, then the default Policy is restored.
     * 
     */
    @InputImport(name="default", required=true)
    private final Input<Boolean> $default;

    public Input<Boolean> get$default() {
        return this.$default;
    }

    public OrganizationPolicyRestorePolicyArgs(Input<Boolean> $default) {
        this.$default = Objects.requireNonNull($default, "expected parameter '$default' to be non-null");
    }

    private OrganizationPolicyRestorePolicyArgs() {
        this.$default = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationPolicyRestorePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> $default;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationPolicyRestorePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.$default = defaults.$default;
        }

        public Builder set$default(Input<Boolean> $default) {
            this.$default = Objects.requireNonNull($default);
            return this;
        }

        public Builder set$default(Boolean $default) {
            this.$default = Input.of(Objects.requireNonNull($default));
            return this;
        }

        public OrganizationPolicyRestorePolicyArgs build() {
            return new OrganizationPolicyRestorePolicyArgs($default);
        }
    }
}
