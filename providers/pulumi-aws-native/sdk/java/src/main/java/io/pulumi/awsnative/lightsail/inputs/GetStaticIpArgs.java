// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetStaticIpArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetStaticIpArgs Empty = new GetStaticIpArgs();

    /**
     * The name of the static IP address.
     * 
     */
    @InputImport(name="staticIpName", required=true)
    private final String staticIpName;

    public String getStaticIpName() {
        return this.staticIpName;
    }

    public GetStaticIpArgs(String staticIpName) {
        this.staticIpName = Objects.requireNonNull(staticIpName, "expected parameter 'staticIpName' to be non-null");
    }

    private GetStaticIpArgs() {
        this.staticIpName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStaticIpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String staticIpName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStaticIpArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.staticIpName = defaults.staticIpName;
        }

        public Builder setStaticIpName(String staticIpName) {
            this.staticIpName = Objects.requireNonNull(staticIpName);
            return this;
        }

        public GetStaticIpArgs build() {
            return new GetStaticIpArgs(staticIpName);
        }
    }
}
