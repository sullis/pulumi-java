// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apprunner.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetServiceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetServiceArgs Empty = new GetServiceArgs();

    /**
     * The Amazon Resource Name (ARN) of the AppRunner Service.
     * 
     */
    @InputImport(name="serviceArn", required=true)
    private final String serviceArn;

    public String getServiceArn() {
        return this.serviceArn;
    }

    public GetServiceArgs(String serviceArn) {
        this.serviceArn = Objects.requireNonNull(serviceArn, "expected parameter 'serviceArn' to be non-null");
    }

    private GetServiceArgs() {
        this.serviceArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String serviceArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serviceArn = defaults.serviceArn;
        }

        public Builder setServiceArn(String serviceArn) {
            this.serviceArn = Objects.requireNonNull(serviceArn);
            return this;
        }

        public GetServiceArgs build() {
            return new GetServiceArgs(serviceArn);
        }
    }
}
