// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.connect.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetQuickConnectArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetQuickConnectArgs Empty = new GetQuickConnectArgs();

    /**
     * The Amazon Resource Name (ARN) for the quick connect.
     * 
     */
    @Import(name="quickConnectArn", required=true)
      private final String quickConnectArn;

    public String quickConnectArn() {
        return this.quickConnectArn;
    }

    public GetQuickConnectArgs(String quickConnectArn) {
        this.quickConnectArn = Objects.requireNonNull(quickConnectArn, "expected parameter 'quickConnectArn' to be non-null");
    }

    private GetQuickConnectArgs() {
        this.quickConnectArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQuickConnectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String quickConnectArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetQuickConnectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.quickConnectArn = defaults.quickConnectArn;
        }

        public Builder quickConnectArn(String quickConnectArn) {
            this.quickConnectArn = Objects.requireNonNull(quickConnectArn);
            return this;
        }        public GetQuickConnectArgs build() {
            return new GetQuickConnectArgs(quickConnectArn);
        }
    }
}
