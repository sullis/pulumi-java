// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.codestarconnections.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetConnectionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetConnectionArgs Empty = new GetConnectionArgs();

    @InputImport(name="connectionArn", required=true)
    private final String connectionArn;

    public String getConnectionArn() {
        return this.connectionArn;
    }

    public GetConnectionArgs(String connectionArn) {
        this.connectionArn = Objects.requireNonNull(connectionArn, "expected parameter 'connectionArn' to be non-null");
    }

    private GetConnectionArgs() {
        this.connectionArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String connectionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionArn = defaults.connectionArn;
        }

        public Builder setConnectionArn(String connectionArn) {
            this.connectionArn = Objects.requireNonNull(connectionArn);
            return this;
        }

        public GetConnectionArgs build() {
            return new GetConnectionArgs(connectionArn);
        }
    }
}
