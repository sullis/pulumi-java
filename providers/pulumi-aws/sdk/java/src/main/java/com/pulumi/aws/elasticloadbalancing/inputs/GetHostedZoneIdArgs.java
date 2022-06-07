// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticloadbalancing.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetHostedZoneIdArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHostedZoneIdArgs Empty = new GetHostedZoneIdArgs();

    /**
     * Name of the region whose AWS ELB HostedZoneId is desired.
     * Defaults to the region from the AWS provider configuration.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return Name of the region whose AWS ELB HostedZoneId is desired.
     * Defaults to the region from the AWS provider configuration.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    private GetHostedZoneIdArgs() {}

    private GetHostedZoneIdArgs(GetHostedZoneIdArgs $) {
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHostedZoneIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHostedZoneIdArgs $;

        public Builder() {
            $ = new GetHostedZoneIdArgs();
        }

        public Builder(GetHostedZoneIdArgs defaults) {
            $ = new GetHostedZoneIdArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param region Name of the region whose AWS ELB HostedZoneId is desired.
         * Defaults to the region from the AWS provider configuration.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region Name of the region whose AWS ELB HostedZoneId is desired.
         * Defaults to the region from the AWS provider configuration.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public GetHostedZoneIdArgs build() {
            return $;
        }
    }

}
