// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HostedZoneDnsSecState extends io.pulumi.resources.ResourceArgs {

    public static final HostedZoneDnsSecState Empty = new HostedZoneDnsSecState();

    /**
     * Identifier of the Route 53 Hosted Zone.
     * 
     */
    @InputImport(name="hostedZoneId")
      private final @Nullable Input<String> hostedZoneId;

    public Input<String> getHostedZoneId() {
        return this.hostedZoneId == null ? Input.empty() : this.hostedZoneId;
    }

    /**
     * Hosted Zone signing status. Valid values: `SIGNING`, `NOT_SIGNING`. Defaults to `SIGNING`.
     * 
     */
    @InputImport(name="signingStatus")
      private final @Nullable Input<String> signingStatus;

    public Input<String> getSigningStatus() {
        return this.signingStatus == null ? Input.empty() : this.signingStatus;
    }

    public HostedZoneDnsSecState(
        @Nullable Input<String> hostedZoneId,
        @Nullable Input<String> signingStatus) {
        this.hostedZoneId = hostedZoneId;
        this.signingStatus = signingStatus;
    }

    private HostedZoneDnsSecState() {
        this.hostedZoneId = Input.empty();
        this.signingStatus = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostedZoneDnsSecState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> hostedZoneId;
        private @Nullable Input<String> signingStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(HostedZoneDnsSecState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostedZoneId = defaults.hostedZoneId;
    	      this.signingStatus = defaults.signingStatus;
        }

        public Builder setHostedZoneId(@Nullable Input<String> hostedZoneId) {
            this.hostedZoneId = hostedZoneId;
            return this;
        }

        public Builder setHostedZoneId(@Nullable String hostedZoneId) {
            this.hostedZoneId = Input.ofNullable(hostedZoneId);
            return this;
        }

        public Builder setSigningStatus(@Nullable Input<String> signingStatus) {
            this.signingStatus = signingStatus;
            return this;
        }

        public Builder setSigningStatus(@Nullable String signingStatus) {
            this.signingStatus = Input.ofNullable(signingStatus);
            return this;
        }
        public HostedZoneDnsSecState build() {
            return new HostedZoneDnsSecState(hostedZoneId, signingStatus);
        }
    }
}