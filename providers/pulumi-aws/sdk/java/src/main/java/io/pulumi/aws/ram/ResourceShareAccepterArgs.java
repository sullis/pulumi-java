// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ram;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class ResourceShareAccepterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceShareAccepterArgs Empty = new ResourceShareAccepterArgs();

    /**
     * The ARN of the resource share.
     * 
     */
    @Import(name="shareArn", required=true)
      private final Output<String> shareArn;

    public Output<String> shareArn() {
        return this.shareArn;
    }

    public ResourceShareAccepterArgs(Output<String> shareArn) {
        this.shareArn = Objects.requireNonNull(shareArn, "expected parameter 'shareArn' to be non-null");
    }

    private ResourceShareAccepterArgs() {
        this.shareArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceShareAccepterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> shareArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceShareAccepterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.shareArn = defaults.shareArn;
        }

        public Builder shareArn(Output<String> shareArn) {
            this.shareArn = Objects.requireNonNull(shareArn);
            return this;
        }
        public Builder shareArn(String shareArn) {
            this.shareArn = Output.of(Objects.requireNonNull(shareArn));
            return this;
        }        public ResourceShareAccepterArgs build() {
            return new ResourceShareAccepterArgs(shareArn);
        }
    }
}
