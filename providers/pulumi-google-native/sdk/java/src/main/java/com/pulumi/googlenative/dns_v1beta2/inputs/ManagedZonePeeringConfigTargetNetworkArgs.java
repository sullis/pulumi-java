// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedZonePeeringConfigTargetNetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedZonePeeringConfigTargetNetworkArgs Empty = new ManagedZonePeeringConfigTargetNetworkArgs();

    /**
     * The time at which the zone was deactivated, in RFC 3339 date-time format. An empty string indicates that the peering connection is active. The producer network can deactivate a zone. The zone is automatically deactivated if the producer network that the zone targeted is deleted. Output only.
     * 
     */
    @Import(name="deactivateTime")
    private @Nullable Output<String> deactivateTime;

    /**
     * @return The time at which the zone was deactivated, in RFC 3339 date-time format. An empty string indicates that the peering connection is active. The producer network can deactivate a zone. The zone is automatically deactivated if the producer network that the zone targeted is deleted. Output only.
     * 
     */
    public Optional<Output<String>> deactivateTime() {
        return Optional.ofNullable(this.deactivateTime);
    }

    @Import(name="kind")
    private @Nullable Output<String> kind;

    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * The fully qualified URL of the VPC network to forward queries to. This should be formatted like https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network}
     * 
     */
    @Import(name="networkUrl")
    private @Nullable Output<String> networkUrl;

    /**
     * @return The fully qualified URL of the VPC network to forward queries to. This should be formatted like https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network}
     * 
     */
    public Optional<Output<String>> networkUrl() {
        return Optional.ofNullable(this.networkUrl);
    }

    private ManagedZonePeeringConfigTargetNetworkArgs() {}

    private ManagedZonePeeringConfigTargetNetworkArgs(ManagedZonePeeringConfigTargetNetworkArgs $) {
        this.deactivateTime = $.deactivateTime;
        this.kind = $.kind;
        this.networkUrl = $.networkUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedZonePeeringConfigTargetNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedZonePeeringConfigTargetNetworkArgs $;

        public Builder() {
            $ = new ManagedZonePeeringConfigTargetNetworkArgs();
        }

        public Builder(ManagedZonePeeringConfigTargetNetworkArgs defaults) {
            $ = new ManagedZonePeeringConfigTargetNetworkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deactivateTime The time at which the zone was deactivated, in RFC 3339 date-time format. An empty string indicates that the peering connection is active. The producer network can deactivate a zone. The zone is automatically deactivated if the producer network that the zone targeted is deleted. Output only.
         * 
         * @return builder
         * 
         */
        public Builder deactivateTime(@Nullable Output<String> deactivateTime) {
            $.deactivateTime = deactivateTime;
            return this;
        }

        /**
         * @param deactivateTime The time at which the zone was deactivated, in RFC 3339 date-time format. An empty string indicates that the peering connection is active. The producer network can deactivate a zone. The zone is automatically deactivated if the producer network that the zone targeted is deleted. Output only.
         * 
         * @return builder
         * 
         */
        public Builder deactivateTime(String deactivateTime) {
            return deactivateTime(Output.of(deactivateTime));
        }

        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param networkUrl The fully qualified URL of the VPC network to forward queries to. This should be formatted like https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network}
         * 
         * @return builder
         * 
         */
        public Builder networkUrl(@Nullable Output<String> networkUrl) {
            $.networkUrl = networkUrl;
            return this;
        }

        /**
         * @param networkUrl The fully qualified URL of the VPC network to forward queries to. This should be formatted like https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network}
         * 
         * @return builder
         * 
         */
        public Builder networkUrl(String networkUrl) {
            return networkUrl(Output.of(networkUrl));
        }

        public ManagedZonePeeringConfigTargetNetworkArgs build() {
            return $;
        }
    }

}
