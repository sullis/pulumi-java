// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.logs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class ResourcePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyArgs Empty = new ResourcePolicyArgs();

    /**
     * The policy document
     * 
     */
    @Import(name="policyDocument", required=true)
      private final Output<String> policyDocument;

    public Output<String> policyDocument() {
        return this.policyDocument;
    }

    /**
     * A name for resource policy
     * 
     */
    @Import(name="policyName", required=true)
      private final Output<String> policyName;

    public Output<String> policyName() {
        return this.policyName;
    }

    public ResourcePolicyArgs(
        Output<String> policyDocument,
        Output<String> policyName) {
        this.policyDocument = Objects.requireNonNull(policyDocument, "expected parameter 'policyDocument' to be non-null");
        this.policyName = Objects.requireNonNull(policyName, "expected parameter 'policyName' to be non-null");
    }

    private ResourcePolicyArgs() {
        this.policyDocument = Codegen.empty();
        this.policyName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> policyDocument;
        private Output<String> policyName;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyDocument = defaults.policyDocument;
    	      this.policyName = defaults.policyName;
        }

        public Builder policyDocument(Output<String> policyDocument) {
            this.policyDocument = Objects.requireNonNull(policyDocument);
            return this;
        }
        public Builder policyDocument(String policyDocument) {
            this.policyDocument = Output.of(Objects.requireNonNull(policyDocument));
            return this;
        }
        public Builder policyName(Output<String> policyName) {
            this.policyName = Objects.requireNonNull(policyName);
            return this;
        }
        public Builder policyName(String policyName) {
            this.policyName = Output.of(Objects.requireNonNull(policyName));
            return this;
        }        public ResourcePolicyArgs build() {
            return new ResourcePolicyArgs(policyDocument, policyName);
        }
    }
}
