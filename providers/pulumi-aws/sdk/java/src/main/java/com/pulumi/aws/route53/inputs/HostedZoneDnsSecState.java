// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HostedZoneDnsSecState extends com.pulumi.resources.ResourceArgs {

    public static final HostedZoneDnsSecState Empty = new HostedZoneDnsSecState();

    /**
     * Identifier of the Route 53 Hosted Zone.
     * 
     */
    @Import(name="hostedZoneId")
    private @Nullable Output<String> hostedZoneId;

    /**
     * @return Identifier of the Route 53 Hosted Zone.
     * 
     */
    public Optional<Output<String>> hostedZoneId() {
        return Optional.ofNullable(this.hostedZoneId);
    }

    /**
     * Hosted Zone signing status. Valid values: `SIGNING`, `NOT_SIGNING`. Defaults to `SIGNING`.
     * 
     */
    @Import(name="signingStatus")
    private @Nullable Output<String> signingStatus;

    /**
     * @return Hosted Zone signing status. Valid values: `SIGNING`, `NOT_SIGNING`. Defaults to `SIGNING`.
     * 
     */
    public Optional<Output<String>> signingStatus() {
        return Optional.ofNullable(this.signingStatus);
    }

    private HostedZoneDnsSecState() {}

    private HostedZoneDnsSecState(HostedZoneDnsSecState $) {
        this.hostedZoneId = $.hostedZoneId;
        this.signingStatus = $.signingStatus;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostedZoneDnsSecState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostedZoneDnsSecState $;

        public Builder() {
            $ = new HostedZoneDnsSecState();
        }

        public Builder(HostedZoneDnsSecState defaults) {
            $ = new HostedZoneDnsSecState(Objects.requireNonNull(defaults));
        }

        /**
         * @param hostedZoneId Identifier of the Route 53 Hosted Zone.
         * 
         * @return builder
         * 
         */
        public Builder hostedZoneId(@Nullable Output<String> hostedZoneId) {
            $.hostedZoneId = hostedZoneId;
            return this;
        }

        /**
         * @param hostedZoneId Identifier of the Route 53 Hosted Zone.
         * 
         * @return builder
         * 
         */
        public Builder hostedZoneId(String hostedZoneId) {
            return hostedZoneId(Output.of(hostedZoneId));
        }

        /**
         * @param signingStatus Hosted Zone signing status. Valid values: `SIGNING`, `NOT_SIGNING`. Defaults to `SIGNING`.
         * 
         * @return builder
         * 
         */
        public Builder signingStatus(@Nullable Output<String> signingStatus) {
            $.signingStatus = signingStatus;
            return this;
        }

        /**
         * @param signingStatus Hosted Zone signing status. Valid values: `SIGNING`, `NOT_SIGNING`. Defaults to `SIGNING`.
         * 
         * @return builder
         * 
         */
        public Builder signingStatus(String signingStatus) {
            return signingStatus(Output.of(signingStatus));
        }

        public HostedZoneDnsSecState build() {
            return $;
        }
    }

}
