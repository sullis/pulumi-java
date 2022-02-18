// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lambda.inputs;

import io.pulumi.awsnative.lambda.enums.CodeSigningConfigCodeSigningPoliciesUntrustedArtifactOnDeployment;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


/**
 * Policies to control how to act if a signature is invalid
 * 
 */
public final class CodeSigningConfigCodeSigningPolicies extends io.pulumi.resources.InvokeArgs {

    public static final CodeSigningConfigCodeSigningPolicies Empty = new CodeSigningConfigCodeSigningPolicies();

    /**
     * Indicates how Lambda operations involve updating the code artifact will operate. Default to Warn if not provided
     * 
     */
    @InputImport(name="untrustedArtifactOnDeployment", required=true)
    private final CodeSigningConfigCodeSigningPoliciesUntrustedArtifactOnDeployment untrustedArtifactOnDeployment;

    public CodeSigningConfigCodeSigningPoliciesUntrustedArtifactOnDeployment getUntrustedArtifactOnDeployment() {
        return this.untrustedArtifactOnDeployment;
    }

    public CodeSigningConfigCodeSigningPolicies(CodeSigningConfigCodeSigningPoliciesUntrustedArtifactOnDeployment untrustedArtifactOnDeployment) {
        this.untrustedArtifactOnDeployment = Objects.requireNonNull(untrustedArtifactOnDeployment, "expected parameter 'untrustedArtifactOnDeployment' to be non-null");
    }

    private CodeSigningConfigCodeSigningPolicies() {
        this.untrustedArtifactOnDeployment = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CodeSigningConfigCodeSigningPolicies defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CodeSigningConfigCodeSigningPoliciesUntrustedArtifactOnDeployment untrustedArtifactOnDeployment;

        public Builder() {
    	      // Empty
        }

        public Builder(CodeSigningConfigCodeSigningPolicies defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.untrustedArtifactOnDeployment = defaults.untrustedArtifactOnDeployment;
        }

        public Builder setUntrustedArtifactOnDeployment(CodeSigningConfigCodeSigningPoliciesUntrustedArtifactOnDeployment untrustedArtifactOnDeployment) {
            this.untrustedArtifactOnDeployment = Objects.requireNonNull(untrustedArtifactOnDeployment);
            return this;
        }

        public CodeSigningConfigCodeSigningPolicies build() {
            return new CodeSigningConfigCodeSigningPolicies(untrustedArtifactOnDeployment);
        }
    }
}
