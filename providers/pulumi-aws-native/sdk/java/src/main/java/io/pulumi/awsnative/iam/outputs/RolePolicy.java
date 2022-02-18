// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iam.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RolePolicy {
    /**
     * The policy document.
     * 
     */
    private final String policyDocument;
    /**
     * The friendly name (not ARN) identifying the policy.
     * 
     */
    private final String policyName;

    @OutputCustomType.Constructor({"policyDocument","policyName"})
    private RolePolicy(
        String policyDocument,
        String policyName) {
        this.policyDocument = Objects.requireNonNull(policyDocument);
        this.policyName = Objects.requireNonNull(policyName);
    }

    /**
     * The policy document.
     * 
     */
    public String getPolicyDocument() {
        return this.policyDocument;
    }
    /**
     * The friendly name (not ARN) identifying the policy.
     * 
     */
    public String getPolicyName() {
        return this.policyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RolePolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String policyDocument;
        private String policyName;

        public Builder() {
    	      // Empty
        }

        public Builder(RolePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyDocument = defaults.policyDocument;
    	      this.policyName = defaults.policyName;
        }

        public Builder setPolicyDocument(String policyDocument) {
            this.policyDocument = Objects.requireNonNull(policyDocument);
            return this;
        }

        public Builder setPolicyName(String policyName) {
            this.policyName = Objects.requireNonNull(policyName);
            return this;
        }

        public RolePolicy build() {
            return new RolePolicy(policyDocument, policyName);
        }
    }
}
