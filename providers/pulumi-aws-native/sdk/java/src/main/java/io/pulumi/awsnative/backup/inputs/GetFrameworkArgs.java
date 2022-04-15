// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFrameworkArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFrameworkArgs Empty = new GetFrameworkArgs();

    /**
     * An Amazon Resource Name (ARN) that uniquely identifies Framework as a resource
     * 
     */
    @Import(name="frameworkArn", required=true)
      private final String frameworkArn;

    public String frameworkArn() {
        return this.frameworkArn;
    }

    public GetFrameworkArgs(String frameworkArn) {
        this.frameworkArn = Objects.requireNonNull(frameworkArn, "expected parameter 'frameworkArn' to be non-null");
    }

    private GetFrameworkArgs() {
        this.frameworkArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFrameworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String frameworkArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFrameworkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.frameworkArn = defaults.frameworkArn;
        }

        public Builder frameworkArn(String frameworkArn) {
            this.frameworkArn = Objects.requireNonNull(frameworkArn);
            return this;
        }        public GetFrameworkArgs build() {
            return new GetFrameworkArgs(frameworkArn);
        }
    }
}
