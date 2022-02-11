// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DNSSECArgs extends io.pulumi.resources.ResourceArgs {

    public static final DNSSECArgs Empty = new DNSSECArgs();

    @InputImport(name="hostedZoneId", required=true)
    private final Input<String> hostedZoneId;

    public Input<String> getHostedZoneId() {
        return this.hostedZoneId;
    }

    public DNSSECArgs(Input<String> hostedZoneId) {
        this.hostedZoneId = Objects.requireNonNull(hostedZoneId, "expected parameter 'hostedZoneId' to be non-null");
    }

    private DNSSECArgs() {
        this.hostedZoneId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DNSSECArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> hostedZoneId;

        public Builder() {
    	      // Empty
        }

        public Builder(DNSSECArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostedZoneId = defaults.hostedZoneId;
        }

        public Builder setHostedZoneId(Input<String> hostedZoneId) {
            this.hostedZoneId = Objects.requireNonNull(hostedZoneId);
            return this;
        }

        public Builder setHostedZoneId(String hostedZoneId) {
            this.hostedZoneId = Input.of(Objects.requireNonNull(hostedZoneId));
            return this;
        }

        public DNSSECArgs build() {
            return new DNSSECArgs(hostedZoneId);
        }
    }
}
