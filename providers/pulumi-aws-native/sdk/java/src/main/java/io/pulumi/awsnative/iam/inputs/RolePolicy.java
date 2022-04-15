// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iam.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The inline policy document that is embedded in the specified IAM role.
 * 
 */
public final class RolePolicy extends io.pulumi.resources.InvokeArgs {

    public static final RolePolicy Empty = new RolePolicy();

    /**
     * The policy document.
     * 
     */
    @Import(name="policyDocument", required=true)
      private final String policyDocument;

    public String policyDocument() {
        return this.policyDocument;
    }

    /**
     * The friendly name (not ARN) identifying the policy.
     * 
     */
    @Import(name="policyName", required=true)
      private final String policyName;

    public String policyName() {
        return this.policyName;
    }

    public RolePolicy(
        String policyDocument,
        String policyName) {
        this.policyDocument = Objects.requireNonNull(policyDocument, "expected parameter 'policyDocument' to be non-null");
        this.policyName = Objects.requireNonNull(policyName, "expected parameter 'policyName' to be non-null");
    }

    private RolePolicy() {
        this.policyDocument = null;
        this.policyName = null;
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

        public Builder policyDocument(String policyDocument) {
            this.policyDocument = Objects.requireNonNull(policyDocument);
            return this;
        }
        public Builder policyName(String policyName) {
            this.policyName = Objects.requireNonNull(policyName);
            return this;
        }        public RolePolicy build() {
            return new RolePolicy(policyDocument, policyName);
        }
    }
}
