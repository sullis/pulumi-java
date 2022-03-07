// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetPolicySetDefinitionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPolicySetDefinitionArgs Empty = new GetPolicySetDefinitionArgs();

    /**
     * The name of the policy set definition to get.
     * 
     */
    @InputImport(name="policySetDefinitionName", required=true)
      private final String policySetDefinitionName;

    public String getPolicySetDefinitionName() {
        return this.policySetDefinitionName;
    }

    public GetPolicySetDefinitionArgs(String policySetDefinitionName) {
        this.policySetDefinitionName = Objects.requireNonNull(policySetDefinitionName, "expected parameter 'policySetDefinitionName' to be non-null");
    }

    private GetPolicySetDefinitionArgs() {
        this.policySetDefinitionName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicySetDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String policySetDefinitionName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPolicySetDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policySetDefinitionName = defaults.policySetDefinitionName;
        }

        public Builder setPolicySetDefinitionName(String policySetDefinitionName) {
            this.policySetDefinitionName = Objects.requireNonNull(policySetDefinitionName);
            return this;
        }
        public GetPolicySetDefinitionArgs build() {
            return new GetPolicySetDefinitionArgs(policySetDefinitionName);
        }
    }
}