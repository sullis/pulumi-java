// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.globalaccelerator.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetListenerArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetListenerArgs Empty = new GetListenerArgs();

    @InputImport(name="listenerArn", required=true)
    private final String listenerArn;

    public String getListenerArn() {
        return this.listenerArn;
    }

    public GetListenerArgs(String listenerArn) {
        this.listenerArn = Objects.requireNonNull(listenerArn, "expected parameter 'listenerArn' to be non-null");
    }

    private GetListenerArgs() {
        this.listenerArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetListenerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String listenerArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetListenerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.listenerArn = defaults.listenerArn;
        }

        public Builder setListenerArn(String listenerArn) {
            this.listenerArn = Objects.requireNonNull(listenerArn);
            return this;
        }

        public GetListenerArgs build() {
            return new GetListenerArgs(listenerArn);
        }
    }
}
