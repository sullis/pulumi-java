// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPublicTypeVersionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPublicTypeVersionArgs Empty = new GetPublicTypeVersionArgs();

    /**
     * The Amazon Resource Number (ARN) assigned to the public extension upon publication
     * 
     */
    @Import(name="publicTypeArn", required=true)
      private final String publicTypeArn;

    public String publicTypeArn() {
        return this.publicTypeArn;
    }

    public GetPublicTypeVersionArgs(String publicTypeArn) {
        this.publicTypeArn = Objects.requireNonNull(publicTypeArn, "expected parameter 'publicTypeArn' to be non-null");
    }

    private GetPublicTypeVersionArgs() {
        this.publicTypeArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPublicTypeVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String publicTypeArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPublicTypeVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicTypeArn = defaults.publicTypeArn;
        }

        public Builder publicTypeArn(String publicTypeArn) {
            this.publicTypeArn = Objects.requireNonNull(publicTypeArn);
            return this;
        }        public GetPublicTypeVersionArgs build() {
            return new GetPublicTypeVersionArgs(publicTypeArn);
        }
    }
}
